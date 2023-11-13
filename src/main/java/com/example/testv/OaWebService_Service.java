package com.example.testv;//package com.example.testa;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * <p>
 * An example of how this class may be used:
 *
 * <pre>
 * oaWebService service = new oaWebService();
 * OaWebService portType = service.getOaWebServiceImplPort();
 * portType.createProcess(...);
 * </pre>
 *
 * </p>
 *
 */
@WebServiceClient(name = "oaWebService", targetNamespace = "http://demand.pm.web.extend.bpc.bit.com/", wsdlLocation = "http://10.242.29.244:30060/gd-bpc-extend-web/services/oaWebService?wsdl")
public class OaWebService_Service extends Service {

	private final static URL OAWEBSERVICE_WSDL_LOCATION;
	private final static Logger logger = Logger
			.getLogger(OaWebService_Service.class
					.getName());

	static {
		URL url = null;
		try {
			URL baseUrl;
			baseUrl = OaWebService_Service.class
					.getResource(".");
			url = new URL(
					"http://10.242.29.244:30060/gd-bpc-extend-web/services/oaWebService?wsdl");
		} catch (MalformedURLException e) {
			logger.warning("Failed to create URL for the wsdl Location: 'http://10.242.29.244:30060/gd-bpc-extend-web/services/oaWebService?wsdl', retrying as a local file");
			logger.warning(e.getMessage());
		}
		OAWEBSERVICE_WSDL_LOCATION = url;
	}

	public OaWebService_Service(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public OaWebService_Service() {
		super(OAWEBSERVICE_WSDL_LOCATION, new QName(
				"http://demand.pm.web.extend.bpc.bit.com/", "oaWebService"));
	}

	/**
	 *
	 * @return returns OaWebService
	 */
	@WebEndpoint(name = "OaWebServiceImplPort")
	public OaWebService1 getOaWebServiceImplPort() {
		return super.getPort(new QName(
				"http://demand.pm.web.extend.bpc.bit.com/",
				"OaWebServiceImplPort"), OaWebService1.class);
	}

	public static void main(String[] args) {
		String strDatetimeNow = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		String pass = MD5( "uflow-oa-databydata" + strDatetimeNow);

		//获取参数


		String sendXml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>"
				+ "<root>"
				+ "<datas>"
				+ "<systemname>OA系统</systemname>"
				+ "<processcode>wb000002</processcode>"
				+ "<sendtime>" + strDatetimeNow + "+</sendtime>"
				+ "<data>"
				+ "<key>oakey</key>"
				+ "<value>WF_DocUnid</value>"
				+ "</data>"
				+ "<data>"
				+ "<key>type</key>"
				+ "<value>0</value>"
				+ "</data>"
				+ "<data>"
				+ "<key>time</key>"
				+ "<value>strDatetimeNow</value>"
				+ "</data>"
				+ "<data>"
				+ "<key>status</key>"
				+ "<value>开发中</value>"
				+ "</data>"
				+ "</datas>"
				+ "</root>";

        String s = new OaWebService_Service().getOaWebServiceImplPort().updateProcessInfo(pass, sendXml);
        System.out.println(s);
    }
	/*
	 * MD5加密方法
	 */
	public static String MD5(String inStr) {
		MessageDigest md5 = null;
		try {
			md5 = MessageDigest.getInstance("MD5");
		} catch (Exception e) {
			System.out.println(e.toString());
			e.printStackTrace();
			return "";
		}
		char[] charArray = inStr.toCharArray();
		byte[] byteArray = new byte[charArray.length];

		for (int i = 0; i < charArray.length; i++)
			byteArray[i] = (byte) charArray[i];

		byte[] md5Bytes = md5.digest(byteArray);

		StringBuffer hexValue = new StringBuffer();

		for (int i = 0; i < md5Bytes.length; i++) {
			int val = ((int) md5Bytes[i]) & 0xff;
			if (val < 16)
				hexValue.append("0");
			hexValue.append(Integer.toHexString(val));
		}

		return hexValue.toString();
	}
}