using System.ServiceModel;

namespace WS.Unit06.Example1.WebService
{
    [ServiceContract(Namespace = "http://ws.unit06.example1/")]
    public interface ICalculatorWS
    {
        [OperationContract]
        public double Add(double term1, double term2);
    }

}
