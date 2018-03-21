
package ee.ttu.idu0080.hinnakiri.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hinnakiri" type="{http://www.ttu.ee/idu0080/hinnakiri/1.0}Hinnakiri" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "hinnakiri"
})
@XmlRootElement(name = "getHinnakiriResponse")
public class GetHinnakiriResponse {

    protected Hinnakiri hinnakiri;

    /**
     * Gets the value of the hinnakiri property.
     * 
     * @return
     *     possible object is
     *     {@link Hinnakiri }
     *     
     */
    public Hinnakiri getHinnakiri() {
        return hinnakiri;
    }

    /**
     * Sets the value of the hinnakiri property.
     * 
     * @param value
     *     allowed object is
     *     {@link Hinnakiri }
     *     
     */
    public void setHinnakiri(Hinnakiri value) {
        this.hinnakiri = value;
    }

}
