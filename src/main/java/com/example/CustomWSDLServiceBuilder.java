//package com.example;
//
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//import org.apache.ws.commons.schema.*;
//import org.codehaus.xfire.XFireFactory;
//import org.codehaus.xfire.XFireRuntimeException;
//import org.codehaus.xfire.service.*;
//import org.codehaus.xfire.service.Service;
//import org.codehaus.xfire.service.binding.BindingProvider;
//import org.codehaus.xfire.transport.TransportManager;
//import org.codehaus.xfire.util.ClassLoaderUtils;
//import org.codehaus.xfire.wsdl.SchemaType;
//import org.codehaus.xfire.wsdl11.ResolverWSDLLocator;
//import org.codehaus.xfire.wsdl11.parser.*;
//import org.w3c.dom.Element;
//import org.xml.sax.InputSource;
//
//import javax.wsdl.*;
//import javax.wsdl.extensions.ExtensibilityElement;
//import javax.wsdl.extensions.UnknownExtensibilityElement;
//import javax.wsdl.factory.WSDLFactory;
//import javax.xml.namespace.QName;
//import java.io.InputStream;
//import java.lang.reflect.Method;
//import java.net.URI;
//import java.net.URISyntaxException;
//import java.net.URL;
//import java.util.*;
//
//
//
//public class CustomWSDLServiceBuilder {
//    public static final String WRAPPED_TYPE = "wrapped.type";
//    private static final Log log;
//    private PortType portType;
//    private OperationInfo opInfo;
//    private XmlSchemaCollection schemas;
//    private boolean isWrapped;
//    private boolean forceBare;
//    private BindingProvider bindingProvider;
//    protected final Definition definition;
//    private List bindingAnnotators;
//    private Map portType2serviceInfo;
//    private Map wop2op;
//    private Map winput2msg;
//    private Map woutput2msg;
//    private Map wfault2msg;
//    private List schemaInfos;
//    private List definitions;
//    private List definitionPaths;
//    private List portTypes;
//    private Map types;
//    private List wsdlServices;
//    private Map xFireServices;
//    private List allServices;
//    private TransportManager transportManager;
//    private Service service;
//    private String systemId;
//
//    public CustomWSDLServiceBuilder(Definition definition) {
//        this.schemas = new XmlSchemaCollection();
//        this.isWrapped = false;
//        this.forceBare = false;
//        this.bindingAnnotators = new ArrayList();
//        this.portType2serviceInfo = new HashMap();
//        this.wop2op = new HashMap();
//        this.winput2msg = new HashMap();
//        this.woutput2msg = new HashMap();
//        this.wfault2msg = new HashMap();
//        this.schemaInfos = new ArrayList();
//        this.definitions = new ArrayList();
//        this.definitionPaths = new ArrayList();
//        this.portTypes = new ArrayList();
//        this.types = new HashMap();
//        this.wsdlServices = new ArrayList();
//        this.xFireServices = new HashMap();
//        this.allServices = new ArrayList();
//        this.transportManager = XFireFactory.newInstance().getXFire().getTransportManager();
//        this.definition = definition;
//        this.definitions.add(definition);
//        this.systemId = definition.getDocumentBaseURI();
//        this.bindingAnnotators.add(new SoapBindingAnnotator());
//        this.schemas.setSchemaResolver(new XmlSchemaURIResolver());
//    }
//
//    public CustomWSDLServiceBuilder(InputStream is) throws WSDLException {
//        this("", is);
//    }
//
//    public CustomWSDLServiceBuilder(String baseURI, InputStream is) throws WSDLException {
//        this(WSDLFactory.newInstance().newWSDLReader().readWSDL(new ResolverWSDLLocator(baseURI, new InputSource(is))));
//        this.definition.setDocumentBaseURI(baseURI);
//        this.systemId = baseURI;
//    }
//
//    public CustomWSDLServiceBuilder(String baseURI, InputSource source) throws WSDLException {
//        this(WSDLFactory.newInstance().newWSDLReader().readWSDL(baseURI, source));
//        this.definition.setDocumentBaseURI(baseURI);
//        this.systemId = source.getSystemId();
//    }
//
//    public BindingProvider getBindingProvider() {
//        if (this.bindingProvider == null) {
//            try {
//                this.bindingProvider = (BindingProvider) ClassLoaderUtils.loadClass("org.codehaus.xfire.aegis.AegisBindingProvider", this.getClass()).newInstance();
//            } catch (Exception var2) {
//                throw new XFireRuntimeException("Couldn't find a binding provider!", var2);
//            }
//        }
//
//        return this.bindingProvider;
//    }
//
//    public void setBindingProvider(BindingProvider bindingProvider) {
//        this.bindingProvider = bindingProvider;
//    }
//
//    public Definition getDefinition() {
//        return this.definition;
//    }
//
//    public List getDefinitions() {
//        return this.definitions;
//    }
//
//    public TransportManager getTransportManager() {
//        return this.transportManager;
//    }
//
//    public void setTransportManager(TransportManager transportManager) {
//        this.transportManager = transportManager;
//    }
//
//    public void build() throws Exception {
//        this.processImports(this.definition);
//        this.types.put(this.systemId, this.definition.getTypes());
//        Iterator iterator = this.types.entrySet().iterator();
//
//        while(iterator.hasNext()) {
//            Map.Entry entry = (Map.Entry)iterator.next();
//            this.visit((String)entry.getKey(), (Types)entry.getValue());
//        }
//
//        this.portTypes.addAll(this.definition.getPortTypes().values());
//        iterator = this.portTypes.iterator();
//
//        while(iterator.hasNext()) {
//            this.portType = (PortType)iterator.next();
//            this.visit(this.portType);
//        }
//
//        this.wsdlServices.addAll(this.definition.getServices().values());
//        iterator = this.wsdlServices.iterator();
//
//        while(iterator.hasNext()) {
//            javax.wsdl.Service wservice = (javax.wsdl.Service)iterator.next();
//            Map portType2Ports = this.getPortTypeToPortMap(wservice);
//            Iterator ptitr = portType2Ports.entrySet().iterator();
//
//            while(ptitr.hasNext()) {
//                Map.Entry entry = (Map.Entry)ptitr.next();
//                PortType portType = (PortType)entry.getKey();
//                Collection ports = (Collection)entry.getValue();
//                if (ports.size() != 0) {
//                    ServiceInfo serviceInfo = this.getServiceInfo(portType);
//                    WSDLServiceConfigurator config = new WSDLServiceConfigurator(serviceInfo, this.definition, wservice, portType, ports, this.bindingProvider, this.transportManager);
//                    config.configure();
//                    this.addService(config.getService());
//                }
//            }
//        }
//
//    }
//
//    protected void addService(Service s) {
//        List services = (List)this.xFireServices.get(s.getName());
//        if (services == null) {
//            services = new ArrayList();
//            this.xFireServices.put(s.getName(), services);
//        }
//
//        ((List)services).add(s);
//        this.allServices.add(s);
//    }
//
//    protected void processImports(Definition parent) {
//        Collection imports = parent.getImports().values();
//        Iterator iterator = imports.iterator();
//
//        while(iterator.hasNext()) {
//            List wsdlImports = (List)iterator.next();
//            Iterator importItr = wsdlImports.iterator();
//
//            while(importItr.hasNext()) {
//                Import i = (Import)importItr.next();
//                Definition iDef = i.getDefinition();
//                if (!this.definitionPaths.contains(i.getLocationURI())) {
//                    log.info("Adding wsdl definition " + i.getLocationURI() + " with baseURI of " + parent.getDocumentBaseURI());
//                    this.definitionPaths.add(i.getLocationURI());
//
//                    try {
//                        String baseURI = parent.getDocumentBaseURI();
//                        String resolvedLocation;
//                        if (baseURI == null) {
//                            resolvedLocation = (new URI(i.getLocationURI())).toString();
//                        } else {
//                            resolvedLocation = (new URI(parent.getDocumentBaseURI())).resolve(i.getLocationURI()).toString();
//                        }
//
//                        this.types.put(resolvedLocation, iDef.getTypes());
//                    } catch (URISyntaxException var10) {
//                        throw new XFireRuntimeException("Couldn't resolve location " + i.getLocationURI(), var10);
//                    }
//
//                    this.definitions.add(iDef);
//                    this.portTypes.addAll(iDef.getPortTypes().values());
//                    this.wsdlServices.addAll(iDef.getServices().values());
//                    this.processImports(iDef);
//                }
//            }
//        }
//
//    }
//
//    private Map getPortTypeToPortMap(javax.wsdl.Service wservice) {
//        Map pt2port = new HashMap();
//        Iterator itr = this.portTypes.iterator();
//
//        while(itr.hasNext()) {
//            PortType pt = (PortType)itr.next();
//            List ports = new ArrayList();
//            pt2port.put(pt, ports);
//            Iterator pitr = wservice.getPorts().values().iterator();
//
//            while(pitr.hasNext()) {
//                Port port = (Port)pitr.next();
//                if (port.getBinding().getPortType().equals(pt)) {
//                    ports.add(port);
//                }
//            }
//        }
//
//        return pt2port;
//    }
//
//    public Map getServices() {
//        return this.xFireServices;
//    }
//
//    public List getAllServices() {
//        return this.allServices;
//    }
//
//    protected void visit(String location, Types types) {
//        if (types != null) {
//            int schemaCount = 1;
//
//            for(Iterator itr = types.getExtensibilityElements().iterator(); itr.hasNext(); ++schemaCount) {
//                ExtensibilityElement ee = (ExtensibilityElement)itr.next();
//                Element el = null;
//                if (ee instanceof UnknownExtensibilityElement) {
//                    UnknownExtensibilityElement uee = (UnknownExtensibilityElement)ee;
//                    el = uee.getElement();
//                } else {
//                    try {
//                        Method mth = ee.getClass().getMethod("getElement");
//                        Object val = mth.invoke(ee);
//                        el = (Element)val;
//                    } catch (Exception var10) {
//                        var10.printStackTrace();
//                    }
//                }
//
//                String schemaSystemId = location + "#types?schema" + schemaCount++;
//                this.schemas.setBaseUri(this.definition.getDocumentBaseURI());
//                XmlSchema schema = this.schemas.read(el, schemaSystemId);
//                SchemaInfo schemaInfo = new SchemaInfo();
//                schemaInfo.setDefinition(this.definition);
//                schemaInfo.setSchema(schema);
//                schemaInfo.setSchemaElement(el);
//                if (this.systemId != null && !this.systemId.equals(location)) {
//                    schemaInfo.setImported(true);
//                }
//
//                this.schemaInfos.add(schemaInfo);
//            }
//
//        }
//    }
//
//    protected void visit(PortType portType) {
//        ServiceInfo serviceInfo = new ServiceInfo((QName)null, Object.class);
//        this.portType2serviceInfo.put(portType, serviceInfo);
//        serviceInfo.setPortType(portType.getQName());
//        Element documentation = portType.getDocumentationElement();
//        if (documentation != null) {
//            String docText = documentation.getNodeValue();
//            serviceInfo.setDocumentation(docText);
//        }
//
//        if (this.forceBare) {
//            this.isWrapped = false;
//        } else {
//            this.isWrapped = true;
//
//            Operation o;
//            for(Iterator itr = portType.getOperations().iterator(); this.isWrapped && itr.hasNext(); this.isWrapped = isWrapped(o, this.schemas)) {
//                o = (Operation)itr.next();
//            }
//        }
//
//        serviceInfo.setWrapped(this.isWrapped);
//        List operations = portType.getOperations();
//
//        for(int i = 0; i < operations.size(); ++i) {
//            Operation operation = (Operation)operations.get(i);
//            this.visit(operation);
//            Input input = operation.getInput();
//            this.visit(input);
//            Output output = operation.getOutput();
//            if (output != null) {
//                this.visit(output);
//            }
//
//            Collection faults = operation.getFaults().values();
//            Iterator iterator2 = faults.iterator();
//
//            while(iterator2.hasNext()) {
//                Fault fault = (Fault)iterator2.next();
//                this.visit(fault);
//            }
//        }
//
//    }
//
//    protected ServiceInfo getServiceInfo(PortType portType) {
//        return (ServiceInfo)this.portType2serviceInfo.get(portType);
//    }
//
//    protected void visit(Fault fault) {
//        FaultInfo faultInfo = this.opInfo.addFault(fault.getName());
//        faultInfo.setMessageName(fault.getMessage().getQName());
//        if (fault.getDocumentationElement() != null) {
//            faultInfo.setDocumentation(fault.getDocumentationElement().getNodeValue());
//        }
//
//        this.wfault2msg.put(fault, faultInfo);
//        this.createMessageParts((MessagePartContainer)faultInfo, (Message)fault.getMessage());
//    }
//
//    protected void visit(Input input) {
//        if (this.isWrapped) {
//            Part part = (Part)input.getMessage().getParts().values().iterator().next();
//            MessageInfo info = this.opInfo.createMessage(new QName(part.getElementName().getNamespaceURI(), input.getMessage().getQName().getLocalPart()));
//            this.winput2msg.put(input, info);
//            this.opInfo.setInputMessage(info);
//            this.createMessageParts(info, this.getWrappedSchema(input.getMessage()));
//        } else {
//            MessageInfo info = this.opInfo.createMessage(input.getMessage().getQName());
//            this.winput2msg.put(input, info);
//            this.opInfo.setInputMessage(info);
//            this.createMessageParts((MessagePartContainer)info, (Message)input.getMessage());
//        }
//
//    }
//
//    protected void visit(Operation operation) {
//        this.opInfo = this.getServiceInfo(this.portType).addOperation(operation.getName(), (Method)null);
//        Element docElem = operation.getDocumentationElement();
//        if (docElem != null) {
//            String docText = docElem.getNodeValue();
//            this.opInfo.setDocumenation(docText);
//        }
//
//        this.wop2op.put(operation, this.opInfo);
//    }
//
//    private void createMessageParts(MessageInfo info, XmlSchemaElement el) {
//        if (el != null) {
//            XmlSchemaComplexType type = (XmlSchemaComplexType)el.getSchemaType();
//            if (type != null) {
//                if (type.getParticle() instanceof XmlSchemaSequence) {
//                    XmlSchemaSequence seq = (XmlSchemaSequence)type.getParticle();
//                    XmlSchemaObjectCollection col = seq.getItems();
//                    Iterator itr = col.getIterator();
//
//                    while(itr.hasNext()) {
//                        XmlSchemaObject schemaObj = (XmlSchemaObject)itr.next();
//                        if (schemaObj instanceof XmlSchemaElement) {
//                            this.createMessagePart(info, (XmlSchemaElement)schemaObj, el.getQName());
//                        }
//                    }
//                }
//
//            }
//        }
//    }
//
//    private void createMessagePart(MessageInfo info, XmlSchemaElement element, QName type) {
//        int index = info.size();
//        boolean globalElement = element.getRefName() != null;
//        QName name;
//        QName schemaType;
//        if (globalElement) {
//            name = element.getRefName();
//            schemaType = name;
//        } else {
//            name = element.getQName();
//            schemaType = element.getSchemaTypeName();
//        }
//
//        MessagePartInfo part = info.addMessagePart(name, XmlSchemaElement.class);
//        part.setIndex(index);
//        part.setSchemaElement(globalElement);
//        part.setWrappedType(type);
//        SchemaType st = this.getBindingProvider().getSchemaType(schemaType, this.service);
//        part.setSchemaType(st);
//    }
//
//    public static boolean isWrapped(Operation op, XmlSchemaCollection schemas) {
//        Input input = op.getInput();
//        Output output = op.getOutput();
//        boolean hasOutput = output != null && output.getMessage().getParts() != null;
//        if (input.getMessage().getParts().size() != 1 || hasOutput && output.getMessage().getParts().size() != 1) {
//            return false;
//        } else {
//            Part inPart = (Part)input.getMessage().getParts().values().iterator().next();
//            Part outPart = null;
//            if (hasOutput) {
//                outPart = (Part)output.getMessage().getParts().values().iterator().next();
//            }
//
//            QName inElementName = inPart.getElementName();
//            QName outElementName = null;
//            if (hasOutput) {
//                outElementName = outPart.getElementName();
//            }
//
//            if (inElementName != null && (!hasOutput || outElementName != null)) {
//                if (!inElementName.getLocalPart().equals(op.getName()) || hasOutput && !outElementName.getLocalPart().equals(op.getName() + "Response")) {
//                    return false;
//                } else {
//                    XmlSchemaElement reqSchemaEl = schemas.getElementByQName(inElementName);
//                    XmlSchemaElement resSchemaEl = null;
//                    if (hasOutput) {
//                        resSchemaEl = schemas.getElementByQName(outElementName);
//                    }
//
//                    if (reqSchemaEl == null) {
//                        throw new XFireRuntimeException("Couldn't find schema part: " + inElementName);
//                    } else if (hasOutput && resSchemaEl == null) {
//                        throw new XFireRuntimeException("Couldn't find schema part: " + outElementName);
//                    } else {
//                        XmlSchemaComplexType ct;
//                        if (reqSchemaEl.getSchemaType() instanceof XmlSchemaComplexType) {
//                            ct = (XmlSchemaComplexType)reqSchemaEl.getSchemaType();
//                            if (hasAttributes(ct) || ct.getContentModel() != null) {
//                                return false;
//                            }
//
//                            if (ct.getParticle() != null && !(ct.getParticle() instanceof XmlSchemaSequence) && !(ct.getParticle() instanceof XmlSchemaAll)) {
//                                return false;
//                            }
//
//                            if (containsAnonymousTypes(ct)) {
//                                return false;
//                            }
//                        } else if (reqSchemaEl.getSchemaType() != null) {
//                            return false;
//                        }
//
//                        if (hasOutput && resSchemaEl.getSchemaType() instanceof XmlSchemaComplexType) {
//                            ct = (XmlSchemaComplexType)resSchemaEl.getSchemaType();
//                            if (hasAttributes(ct)) {
//                                return false;
//                            }
//
//                            if (ct.getContentModel() != null) {
//                                return false;
//                            }
//
//                            if (ct.getParticle() != null && !(ct.getParticle() instanceof XmlSchemaSequence) && !(ct.getParticle() instanceof XmlSchemaAll)) {
//                                return false;
//                            }
//
//                            if (containsAnonymousTypes(ct)) {
//                                return false;
//                            }
//                        } else if (hasOutput && resSchemaEl.getSchemaType() != null) {
//                            return false;
//                        }
//
//                        return true;
//                    }
//                }
//            } else {
//                return false;
//            }
//        }
//    }
//
//    private static boolean containsAnonymousTypes(XmlSchemaComplexType ct) {
//        XmlSchemaGroupBase particle = (XmlSchemaGroupBase)ct.getParticle();
//        if (particle == null) {
//            return false;
//        } else {
//            XmlSchemaObjectCollection items = particle.getItems();
//
//            for(int i = 0; i < items.getCount(); ++i) {
//                XmlSchemaObject item = items.getItem(i);
//                if (item instanceof XmlSchemaElement) {
//                    XmlSchemaElement el = (XmlSchemaElement)item;
//                    if (el.getSchemaTypeName() == null) {
//                        return true;
//                    }
//                } else if (item instanceof XmlSchemaElement) {
//                    XmlSchemaComplexType el = (XmlSchemaComplexType)item;
//                    if (el.getParticle() != null) {
//                        return true;
//                    }
//                }
//            }
//
//            return false;
//        }
//    }
//
//    private XmlSchemaElement getWrappedSchema(Message message) {
//        Part part = (Part)message.getParts().values().iterator().next();
//        XmlSchemaElement schemaEl = this.schemas.getElementByQName(part.getElementName());
//        return schemaEl.getSchemaType() instanceof XmlSchemaComplexType ? schemaEl : null;
//    }
//
//    protected static boolean hasAttributes(XmlSchemaComplexType complexType) {
//        return complexType.getAnyAttribute() != null || complexType.getAttributes().count > 0;
//    }
//
//    private void createMessageParts(MessagePartContainer info, Message msg) {
//        List parts = msg.getOrderedParts((List)null);
//        Iterator itr = parts.iterator();
//
//        while(itr.hasNext()) {
//            Part entry = (Part)itr.next();
//            QName typeName = entry.getTypeName();
//            QName elementName;
//            MessagePartInfo part;
//            if (typeName != null) {
//                elementName = new QName(this.getTargetNamespace(), entry.getName());
//                part = info.addMessagePart(elementName, (Class)null);
//                part.setSchemaElement(false);
//                part.setSchemaType(this.getBindingProvider().getSchemaType(typeName, this.service));
//                part.setIndex(info.size() - 1);
//            }
//
//            elementName = entry.getElementName();
//            if (elementName != null) {
//                part = info.addMessagePart(elementName, (Class)null);
//                part.setSchemaType(this.getBindingProvider().getSchemaType(typeName, this.service));
//                part.setIndex(info.size() - 1);
//                if (entry.getDocumentationElement() != null) {
//                    part.setDocumentation(entry.getDocumentationElement().getNodeValue());
//                }
//            }
//        }
//
//    }
//
//    protected String getTargetNamespace() {
//        return this.getDefinition().getTargetNamespace();
//    }
//
//    protected void visit(Output output) {
//        MessageInfo info = this.opInfo.createMessage(new QName(this.opInfo.getInputMessage().getName().getNamespaceURI(), output.getMessage().getQName().getLocalPart()));
//        this.opInfo.setOutputMessage(info);
//        this.woutput2msg.put(output, info);
//        if (this.isWrapped) {
//            this.createMessageParts(info, this.getWrappedSchema(output.getMessage()));
//        } else {
//            this.createMessageParts((MessagePartContainer)info, (Message)output.getMessage());
//        }
//
//    }
//
//    public List getSchemas() {
//        return this.schemaInfos;
//    }
//
//    public XmlSchemaCollection getSchemaCollection() {
//        return this.schemas;
//    }
//
//    public boolean isForceBare() {
//        return this.forceBare;
//    }
//
//    public void setForceBare(boolean forceBare) {
//        this.forceBare = forceBare;
//    }
//
//    static {
//        log = LogFactory.getLog(WSDLServiceBuilder.class);
//    }
//}