
package ee.ttu.idu0080.hinnakiri.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ee.ttu.idu0080.hinnakiri.types package. 
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

    private final static QName _HinnakiriFault_QNAME = new QName("http://www.ttu.ee/idu0080/hinnakiri/1.0", "hinnakiriFault");
    private final static QName _GetHinnakiri_QNAME = new QName("http://www.ttu.ee/idu0080/hinnakiri/1.0", "getHinnakiri");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ee.ttu.idu0080.hinnakiri.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Toode }
     * 
     */
    public Toode createToode() {
        return new Toode();
    }

    /**
     * Create an instance of {@link GetHinnakiriResponse }
     * 
     */
    public GetHinnakiriResponse createGetHinnakiriResponse() {
        return new GetHinnakiriResponse();
    }

    /**
     * Create an instance of {@link Hinnakiri }
     * 
     */
    public Hinnakiri createHinnakiri() {
        return new Hinnakiri();
    }

    /**
     * Create an instance of {@link Hinnakiri.HinnakirjaRida }
     * 
     */
    public Hinnakiri.HinnakirjaRida createHinnakiriHinnakirjaRida() {
        return new Hinnakiri.HinnakirjaRida();
    }

    /**
     * Create an instance of {@link Hind }
     * 
     */
    public Hind createHind() {
        return new Hind();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0080/hinnakiri/1.0", name = "hinnakiriFault")
    public JAXBElement<Object> createHinnakiriFault(Object value) {
        return new JAXBElement<Object>(_HinnakiriFault_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.ttu.ee/idu0080/hinnakiri/1.0", name = "getHinnakiri")
    public JAXBElement<String> createGetHinnakiri(String value) {
        return new JAXBElement<String>(_GetHinnakiri_QNAME, String.class, null, value);
    }

}
