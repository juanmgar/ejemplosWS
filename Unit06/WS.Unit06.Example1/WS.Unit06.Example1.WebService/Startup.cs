using Microsoft.Extensions.DependencyInjection.Extensions;
using SoapCore;
using System.ServiceModel;

namespace WS.Unit06.Example1.WebService
{
    public class Startup
    {
        public void ConfigureServices(IServiceCollection services)
        {
            services.TryAddSingleton<ICalculatorWS, CalculatorWS>();
            services.AddMvc(x => x.EnableEndpointRouting = false);
            services.AddSoapCore();
        }
        public void Configure(IApplicationBuilder app, IWebHostEnvironment env)
        {
            app.UseSoapEndpoint<ICalculatorWS>(
            "/CalculatorWS.svc", new BasicHttpBinding(),
            SoapSerializer.DataContractSerializer,
            false, null, null, true, true);
            app.UseMvc();
        }
    }
}
