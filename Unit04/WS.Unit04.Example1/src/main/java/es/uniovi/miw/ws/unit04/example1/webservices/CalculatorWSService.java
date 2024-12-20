
package es.uniovi.miw.ws.unit04.example1.webservices;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import jakarta.xml.ws.WebEndpoint;
import jakarta.xml.ws.WebServiceClient;
import jakarta.xml.ws.WebServiceException;
import jakarta.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 4.0.0-M4
 * Generated source version: 3.0
 * 
 */
@WebServiceClient(name = "CalculatorWSService", targetNamespace = "http://webservices.example1.unit03.ws.miw.uniovi.es/", wsdlLocation = "http://localhost:9089/ws.unit03.example1/soapws/calculator?wsdl")
public class CalculatorWSService
    extends Service
{

    private final static URL CALCULATORWSSERVICE_WSDL_LOCATION;
    private final static WebServiceException CALCULATORWSSERVICE_EXCEPTION;
    private final static QName CALCULATORWSSERVICE_QNAME = new QName("http://webservices.example1.unit03.ws.miw.uniovi.es/", "CalculatorWSService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9089/ws.unit03.example1/soapws/calculator?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CALCULATORWSSERVICE_WSDL_LOCATION = url;
        CALCULATORWSSERVICE_EXCEPTION = e;
    }

    public CalculatorWSService() {
        super(__getWsdlLocation(), CALCULATORWSSERVICE_QNAME);
    }

    public CalculatorWSService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CALCULATORWSSERVICE_QNAME, features);
    }

    public CalculatorWSService(URL wsdlLocation) {
        super(wsdlLocation, CALCULATORWSSERVICE_QNAME);
    }

    public CalculatorWSService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CALCULATORWSSERVICE_QNAME, features);
    }

    public CalculatorWSService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalculatorWSService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CalculatorWS
     */
    @WebEndpoint(name = "CalculatorWSPort")
    public CalculatorWS getCalculatorWSPort() {
        return super.getPort(new QName("http://webservices.example1.unit03.ws.miw.uniovi.es/", "CalculatorWSPort"), CalculatorWS.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link jakarta.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns CalculatorWS
     */
    @WebEndpoint(name = "CalculatorWSPort")
    public CalculatorWS getCalculatorWSPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservices.example1.unit03.ws.miw.uniovi.es/", "CalculatorWSPort"), CalculatorWS.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CALCULATORWSSERVICE_EXCEPTION!= null) {
            throw CALCULATORWSSERVICE_EXCEPTION;
        }
        return CALCULATORWSSERVICE_WSDL_LOCATION;
    }

}
