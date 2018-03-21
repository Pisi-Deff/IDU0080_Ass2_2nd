
package ee.ttu.idu0080.hinnakiri.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Hinnakiri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Hinnakiri">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="hinnakirjaRida" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="toode" type="{http://www.ttu.ee/idu0080/hinnakiri/1.0}Toode"/>
 *                   &lt;element name="hind" type="{http://www.ttu.ee/idu0080/hinnakiri/1.0}Hind"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Hinnakiri", propOrder = {
    "hinnakirjaRida"
})
public class Hinnakiri {

    @XmlElement(required = true)
    protected List<Hinnakiri.HinnakirjaRida> hinnakirjaRida;

    /**
     * Gets the value of the hinnakirjaRida property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hinnakirjaRida property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHinnakirjaRida().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Hinnakiri.HinnakirjaRida }
     * 
     * 
     */
    public List<Hinnakiri.HinnakirjaRida> getHinnakirjaRida() {
        if (hinnakirjaRida == null) {
            hinnakirjaRida = new ArrayList<Hinnakiri.HinnakirjaRida>();
        }
        return this.hinnakirjaRida;
    }


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
     *         &lt;element name="toode" type="{http://www.ttu.ee/idu0080/hinnakiri/1.0}Toode"/>
     *         &lt;element name="hind" type="{http://www.ttu.ee/idu0080/hinnakiri/1.0}Hind"/>
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
        "toode",
        "hind"
    })
    public static class HinnakirjaRida {

        @XmlElement(required = true)
        protected Toode toode;
        @XmlElement(required = true)
        protected Hind hind;

        /**
         * Gets the value of the toode property.
         * 
         * @return
         *     possible object is
         *     {@link Toode }
         *     
         */
        public Toode getToode() {
            return toode;
        }

        /**
         * Sets the value of the toode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Toode }
         *     
         */
        public void setToode(Toode value) {
            this.toode = value;
        }

        /**
         * Gets the value of the hind property.
         * 
         * @return
         *     possible object is
         *     {@link Hind }
         *     
         */
        public Hind getHind() {
            return hind;
        }

        /**
         * Sets the value of the hind property.
         * 
         * @param value
         *     allowed object is
         *     {@link Hind }
         *     
         */
        public void setHind(Hind value) {
            this.hind = value;
        }

    }

}
