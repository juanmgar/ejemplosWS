package es.uniovi.miw.ws.unit03.example1.webservices;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface ICalculatorWS {
    @WebMethod
    public double add(double term1, double term2);
    @WebMethod
    public double sub(double term1, double term2);
    @WebMethod
    public double mul(double term1, double term2);
    @WebMethod
    public double div(double term1, double term2) throws DividedByZeroException;
}
