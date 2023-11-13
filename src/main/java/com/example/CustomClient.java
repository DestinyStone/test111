//package com.example;
//
//import org.apache.commons.logging.Log;
//import org.apache.commons.logging.LogFactory;
//import org.codehaus.xfire.MessageContext;
//import org.codehaus.xfire.XFire;
//import org.codehaus.xfire.XFireFactory;
//import org.codehaus.xfire.XFireRuntimeException;
//import org.codehaus.xfire.aegis.AegisBindingProvider;
//import org.codehaus.xfire.client.*;
//import org.codehaus.xfire.exchange.AbstractMessage;
//import org.codehaus.xfire.exchange.InMessage;
//import org.codehaus.xfire.exchange.MessageExchange;
//import org.codehaus.xfire.fault.XFireFault;
//import org.codehaus.xfire.handler.AbstractHandlerSupport;
//import org.codehaus.xfire.handler.HandlerPipeline;
//import org.codehaus.xfire.handler.OutMessageSender;
//import org.codehaus.xfire.service.Binding;
//import org.codehaus.xfire.service.Endpoint;
//import org.codehaus.xfire.service.OperationInfo;
//import org.codehaus.xfire.service.Service;
//import org.codehaus.xfire.soap.AbstractSoapBinding;
//import org.codehaus.xfire.transport.Channel;
//import org.codehaus.xfire.transport.ChannelEndpoint;
//import org.codehaus.xfire.transport.Transport;
//import org.codehaus.xfire.wsdl11.parser.WSDLServiceBuilder;
//import org.xml.sax.InputSource;
//
//import javax.wsdl.Definition;
//import javax.wsdl.factory.WSDLFactory;
//import javax.xml.stream.XMLStreamReader;
//import java.io.InputStream;
//import java.lang.reflect.Proxy;
//import java.net.URL;
//import java.util.*;
//
//public class CustomClient extends Client {
//
//    public CustomClient(URL wsdlLocation) throws Exception {
//        super(wsdlLocation);
//    }
//
//    protected void initFromDefinition(String binding, Definition definition, Class serviceClass) throws Exception {
//
//        CustomWSDLServiceBuilder builder = new CustomWSDLServiceBuilder(definition);
//        builder.setTransportManager(getXFire().getTransportManager());
//        builder.build();
//        Endpoint ep = this.findEndpoint(binding, builder.getAllServices());
//        setUrl(ep.getUrl());
////        this.binding = ep.getBinding();
////        this.transport = this.getXFire().getTransportManager().getTransport(binding);
////        if (serviceClass != null) {
////            ep.getBinding().getService().getServiceInfo().setServiceClass(serviceClass);
////        }
//
//        this.setService(ep.getBinding().getService());
//    }
//}