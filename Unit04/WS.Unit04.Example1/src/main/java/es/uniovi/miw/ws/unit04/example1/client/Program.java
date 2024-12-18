package es.uniovi.miw.ws.unit04.example1.client;

import es.uniovi.miw.ws.unit04.example1.webservices.CalculatorWSService;
import es.uniovi.miw.ws.unit04.example1.webservices.CalculatorWS;
import es.uniovi.miw.ws.unit04.example1.webservices.DividedByZeroException_Exception;

public class Program {
    public static void main(String[] args) {
        CalculatorWSService service = new CalculatorWSService();
        CalculatorWS calculator = service.getCalculatorWSPort();
        System.out.println(calculator.add(25, 5));
        try {
            System.out.println(calculator.div(25, 5));
        } catch (DividedByZeroException_Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(calculator.mul(25, 5));
        System.out.println(calculator.sub(25, 5));
    }
}
