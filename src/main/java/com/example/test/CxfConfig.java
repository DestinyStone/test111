package com.example.test;

import com.example.testa.OaWebService;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.namespace.QName;
import javax.xml.ws.Endpoint;

@Configuration
public class CxfConfig {

    @Autowired
    private OaWebService oaWebService;

    @Autowired
    private Bus bus;

    /**
     * 发布服务
     * @return
     */
    @Bean
    public Endpoint userServiceEndpoint() {
        System.out.println("服务发布");
        //这里指定的端口不能跟应用的端口冲突, 单独指定
        String path = "http://10.119.139.28:9999/gd-bpc-extend-web/services/oaWebService";
//        String path = "http://8.130.118.129:9090/pms-service/services/QuiryProvProjectEffectSrv";

        EndpointImpl userEndpoint = new EndpointImpl(bus, oaWebService);
        userEndpoint.setEndpointName(new QName("http://service.pmseffectservice.sdunicomsi.com/", "OaWebServiceImplPort"));
        userEndpoint.publish(path);

        System.out.println("服务成功，path: " + path);
        System.out.println(String.format("在线的wsdl：%s?wsdl", path));
        return userEndpoint;
    }
}