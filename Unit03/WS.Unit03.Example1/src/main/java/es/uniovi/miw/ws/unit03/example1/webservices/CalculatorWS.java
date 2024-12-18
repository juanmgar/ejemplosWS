package es.uniovi.miw.ws.unit03.example1.webservices;
import jakarta.jws.WebService;

@WebService
public class CalculatorWS implements ICalculatorWS{
    @Override
    public double add(double term1, double term2) {
        return term1 + term2;
    }
    @Override
    public double sub(double term1, double term2) {
        return term1 - term2;
    }

    @Override
    public double mul(double term1, double term2) {
        return term1 * term2;
    }

    @Override
    public double div(double term1, double term2) {
        return term1 / term2;
    }
}
