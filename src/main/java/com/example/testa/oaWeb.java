package com.example.testa;

import org.springframework.stereotype.Service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by the JAX-WS RI. JAX-WS RI 2.1.3-hudson-390-
 * Generated source version: 2.0
 * 
 */
@WebService(name = "OaWebService", targetNamespace = "http://demand.pm.web.extend.bpc.bit.com/")
@Service
public class oaWeb implements OaWebService {

	/**
	 * 
	 * @param xmlcontent
	 * @param pass
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "createProcess", targetNamespace = "http://demand.pm.web.extend.bpc.bit.com/", className = "com.example.testa.CreateProcess")
	@ResponseWrapper(localName = "createProcessResponse", targetNamespace = "http://demand.pm.web.extend.bpc.bit.com/", className = "com.example.testa.CreateProcessResponse")
	public String createProcess(
			@WebParam(name = "pass", targetNamespace = "http://demand.pm.web.extend.bpc.bit.com/") String pass,
			@WebParam(name = "xmlcontent", targetNamespace = "http://demand.pm.web.extend.bpc.bit.com/") String xmlcontent) {
		return "test";
	}

	/**
	 * 
	 * @param xmlcontent
	 * @param pass
	 * @return returns java.lang.String
	 */
	@WebMethod
	@WebResult(targetNamespace = "")
	@RequestWrapper(localName = "updateProcessInfo", targetNamespace = "http://demand.pm.web.extend.bpc.bit.com/", className = "com.example.testa.UpdateProcessInfo")
	@ResponseWrapper(localName = "updateProcessInfoResponse", targetNamespace = "http://demand.pm.web.extend.bpc.bit.com/", className = "com.example.testa.UpdateProcessInfoResponse")
	public String updateProcessInfo(

			@WebParam(name = "pass", targetNamespace = "http://demand.pm.web.extend.bpc.bit.com/") String pass,
			@WebParam(name = "xmlcontent", targetNamespace = "http://demand.pm.web.extend.bpc.bit.com/") String xmlcontent) {
		return "status";
	}

}
