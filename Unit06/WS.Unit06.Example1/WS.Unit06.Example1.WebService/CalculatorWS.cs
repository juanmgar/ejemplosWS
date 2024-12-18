namespace WS.Unit06.Example1.WebService
{
    public class CalculatorWS : ICalculatorWS
    {
        public double Add(double term1, double term2)
        {
            return term1 + term2;
        }
    }

}
