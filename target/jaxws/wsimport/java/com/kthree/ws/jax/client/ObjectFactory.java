
package com.kthree.ws.jax.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.kthree.ws.jax.client package. 
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

    private final static QName _CurrencyConvertion_QNAME = new QName("http://ws.jax.resources.kthree.com/", "currencyConvertion");
    private final static QName _GetCurrencyExchangeRate_QNAME = new QName("http://ws.jax.resources.kthree.com/", "getCurrencyExchangeRate");
    private final static QName _GetCurrencyExchangeRateResponse_QNAME = new QName("http://ws.jax.resources.kthree.com/", "getCurrencyExchangeRateResponse");
    private final static QName _SayHelloResponse_QNAME = new QName("http://ws.jax.resources.kthree.com/", "sayHelloResponse");
    private final static QName _CurrencyConvertionResponse_QNAME = new QName("http://ws.jax.resources.kthree.com/", "currencyConvertionResponse");
    private final static QName _SayHello_QNAME = new QName("http://ws.jax.resources.kthree.com/", "sayHello");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.kthree.ws.jax.client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link GetCurrencyExchangeRate }
     * 
     */
    public GetCurrencyExchangeRate createGetCurrencyExchangeRate() {
        return new GetCurrencyExchangeRate();
    }

    /**
     * Create an instance of {@link CurrencyConvertion }
     * 
     */
    public CurrencyConvertion createCurrencyConvertion() {
        return new CurrencyConvertion();
    }

    /**
     * Create an instance of {@link CurrencyConvertionResponse }
     * 
     */
    public CurrencyConvertionResponse createCurrencyConvertionResponse() {
        return new CurrencyConvertionResponse();
    }

    /**
     * Create an instance of {@link GetCurrencyExchangeRateResponse }
     * 
     */
    public GetCurrencyExchangeRateResponse createGetCurrencyExchangeRateResponse() {
        return new GetCurrencyExchangeRateResponse();
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyConvertion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jax.resources.kthree.com/", name = "currencyConvertion")
    public JAXBElement<CurrencyConvertion> createCurrencyConvertion(CurrencyConvertion value) {
        return new JAXBElement<CurrencyConvertion>(_CurrencyConvertion_QNAME, CurrencyConvertion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrencyExchangeRate }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jax.resources.kthree.com/", name = "getCurrencyExchangeRate")
    public JAXBElement<GetCurrencyExchangeRate> createGetCurrencyExchangeRate(GetCurrencyExchangeRate value) {
        return new JAXBElement<GetCurrencyExchangeRate>(_GetCurrencyExchangeRate_QNAME, GetCurrencyExchangeRate.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCurrencyExchangeRateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jax.resources.kthree.com/", name = "getCurrencyExchangeRateResponse")
    public JAXBElement<GetCurrencyExchangeRateResponse> createGetCurrencyExchangeRateResponse(GetCurrencyExchangeRateResponse value) {
        return new JAXBElement<GetCurrencyExchangeRateResponse>(_GetCurrencyExchangeRateResponse_QNAME, GetCurrencyExchangeRateResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jax.resources.kthree.com/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CurrencyConvertionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jax.resources.kthree.com/", name = "currencyConvertionResponse")
    public JAXBElement<CurrencyConvertionResponse> createCurrencyConvertionResponse(CurrencyConvertionResponse value) {
        return new JAXBElement<CurrencyConvertionResponse>(_CurrencyConvertionResponse_QNAME, CurrencyConvertionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.jax.resources.kthree.com/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

}
