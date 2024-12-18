package es.uniovi.miw.ws.unit03.example1.webservices;
import jakarta.xml.ws.WebFault;

@WebFault
public class DividedByZeroException extends Exception {

    private String faultCode;
    private String faultString;

    public DividedByZeroException() {
        super("DividedByZeroException - Argument 'divisor' is 0");
        this.faultString = getMessage();
        this.faultCode = "412 Precondition Failed";
    }
}
