
package es.uniovi.miw.ws.unit04.example1.webservices;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the es.uniovi.miw.ws.unit04.example1.webservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _DividedByZeroException_QNAME = new QName("http://webservices.example1.unit03.ws.miw.uniovi.es/", "DividedByZeroException");
    private final static QName _Add_QNAME = new QName("http://webservices.example1.unit03.ws.miw.uniovi.es/", "add");
    private final static QName _AddResponse_QNAME = new QName("http://webservices.example1.unit03.ws.miw.uniovi.es/", "addResponse");
    private final static QName _Div_QNAME = new QName("http://webservices.example1.unit03.ws.miw.uniovi.es/", "div");
    private final static QName _DivResponse_QNAME = new QName("http://webservices.example1.unit03.ws.miw.uniovi.es/", "divResponse");
    private final static QName _Mul_QNAME = new QName("http://webservices.example1.unit03.ws.miw.uniovi.es/", "mul");
    private final static QName _MulResponse_QNAME = new QName("http://webservices.example1.unit03.ws.miw.uniovi.es/", "mulResponse");
    private final static QName _Sub_QNAME = new QName("http://webservices.example1.unit03.ws.miw.uniovi.es/", "sub");
    private final static QName _SubResponse_QNAME = new QName("http://webservices.example1.unit03.ws.miw.uniovi.es/", "subResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: es.uniovi.miw.ws.unit04.example1.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DividedByZeroException }
     * 
     */
    public DividedByZeroException createDividedByZeroException() {
        return new DividedByZeroException();
    }

    /**
     * Create an instance of {@link Add }
     * 
     */
    public Add createAdd() {
        return new Add();
    }

    /**
     * Create an instance of {@link AddResponse }
     * 
     */
    public AddResponse createAddResponse() {
        return new AddResponse();
    }

    /**
     * Create an instance of {@link Div }
     * 
     */
    public Div createDiv() {
        return new Div();
    }

    /**
     * Create an instance of {@link DivResponse }
     * 
     */
    public DivResponse createDivResponse() {
        return new DivResponse();
    }

    /**
     * Create an instance of {@link Mul }
     * 
     */
    public Mul createMul() {
        return new Mul();
    }

    /**
     * Create an instance of {@link MulResponse }
     * 
     */
    public MulResponse createMulResponse() {
        return new MulResponse();
    }

    /**
     * Create an instance of {@link Sub }
     * 
     */
    public Sub createSub() {
        return new Sub();
    }

    /**
     * Create an instance of {@link SubResponse }
     * 
     */
    public SubResponse createSubResponse() {
        return new SubResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DividedByZeroException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DividedByZeroException }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservices.example1.unit03.ws.miw.uniovi.es/", name = "DividedByZeroException")
    public JAXBElement<DividedByZeroException> createDividedByZeroException(DividedByZeroException value) {
        return new JAXBElement<DividedByZeroException>(_DividedByZeroException_QNAME, DividedByZeroException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Add }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Add }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservices.example1.unit03.ws.miw.uniovi.es/", name = "add")
    public JAXBElement<Add> createAdd(Add value) {
        return new JAXBElement<Add>(_Add_QNAME, Add.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservices.example1.unit03.ws.miw.uniovi.es/", name = "addResponse")
    public JAXBElement<AddResponse> createAddResponse(AddResponse value) {
        return new JAXBElement<AddResponse>(_AddResponse_QNAME, AddResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Div }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Div }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservices.example1.unit03.ws.miw.uniovi.es/", name = "div")
    public JAXBElement<Div> createDiv(Div value) {
        return new JAXBElement<Div>(_Div_QNAME, Div.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DivResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DivResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservices.example1.unit03.ws.miw.uniovi.es/", name = "divResponse")
    public JAXBElement<DivResponse> createDivResponse(DivResponse value) {
        return new JAXBElement<DivResponse>(_DivResponse_QNAME, DivResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Mul }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Mul }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservices.example1.unit03.ws.miw.uniovi.es/", name = "mul")
    public JAXBElement<Mul> createMul(Mul value) {
        return new JAXBElement<Mul>(_Mul_QNAME, Mul.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MulResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link MulResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservices.example1.unit03.ws.miw.uniovi.es/", name = "mulResponse")
    public JAXBElement<MulResponse> createMulResponse(MulResponse value) {
        return new JAXBElement<MulResponse>(_MulResponse_QNAME, MulResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Sub }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Sub }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservices.example1.unit03.ws.miw.uniovi.es/", name = "sub")
    public JAXBElement<Sub> createSub(Sub value) {
        return new JAXBElement<Sub>(_Sub_QNAME, Sub.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SubResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SubResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://webservices.example1.unit03.ws.miw.uniovi.es/", name = "subResponse")
    public JAXBElement<SubResponse> createSubResponse(SubResponse value) {
        return new JAXBElement<SubResponse>(_SubResponse_QNAME, SubResponse.class, null, value);
    }

}
