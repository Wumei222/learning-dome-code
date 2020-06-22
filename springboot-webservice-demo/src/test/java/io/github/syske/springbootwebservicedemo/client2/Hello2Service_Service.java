package io.github.syske.springbootwebservicedemo.client2;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.1
 * 2020-04-28T16:48:08.307+08:00
 * Generated source version: 3.3.1
 *
 */
@WebServiceClient(name = "Hello2Service",
                  wsdlLocation = "http://localhost:8080/service/service2?wsdl",
                  targetNamespace = "http://service.ws.sample/")
public class Hello2Service_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.ws.sample/", "Hello2Service");
    public final static QName Hello2ServiceImplPort = new QName("http://service.ws.sample/", "Hello2ServiceImplPort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:8080/service/service2?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Hello2Service_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "http://localhost:8080/service/service2?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Hello2Service_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Hello2Service_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Hello2Service_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public Hello2Service_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public Hello2Service_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public Hello2Service_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns Hello2Service
     */
    @WebEndpoint(name = "Hello2ServiceImplPort")
    public Hello2Service getHello2ServiceImplPort() {
        return super.getPort(Hello2ServiceImplPort, Hello2Service.class);
    }

    /**
     *
     * @param features
     *     A list of {@link WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Hello2Service
     */
    @WebEndpoint(name = "Hello2ServiceImplPort")
    public Hello2Service getHello2ServiceImplPort(WebServiceFeature... features) {
        return super.getPort(Hello2ServiceImplPort, Hello2Service.class, features);
    }

}