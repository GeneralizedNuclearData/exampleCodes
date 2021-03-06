//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.27 at 11:31:49 AM PDT 
//


package gnd_jax.GND;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for weightedFunctionals complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="weightedFunctionals">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="weighted" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="XYs1d" type="{}xData_XYs1d_primary"/>
 *                   &lt;choice>
 *                     &lt;element name="evaporation" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;/choice>
 *                 &lt;/sequence>
 *                 &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}integer" />
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
@XmlType(name = "weightedFunctionals", propOrder = {
    "weighted"
})
public class WeightedFunctionals {

    @XmlElement(required = true)
    protected List<WeightedFunctionals.Weighted> weighted;

    /**
     * Gets the value of the weighted property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the weighted property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWeighted().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeightedFunctionals.Weighted }
     * 
     * 
     */
    public List<WeightedFunctionals.Weighted> getWeighted() {
        if (weighted == null) {
            weighted = new ArrayList<WeightedFunctionals.Weighted>();
        }
        return this.weighted;
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
     *         &lt;element name="XYs1d" type="{}xData_XYs1d_primary"/>
     *         &lt;choice>
     *           &lt;element name="evaporation" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;/choice>
     *       &lt;/sequence>
     *       &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "xYs1D",
        "evaporation"
    })
    public static class Weighted {

        @XmlElement(name = "XYs1d", required = true)
        protected XDataXYs1DPrimary xYs1D;
        protected Object evaporation;
        @XmlAttribute(name = "index")
        protected BigInteger index;

        /**
         * Gets the value of the xYs1D property.
         * 
         * @return
         *     possible object is
         *     {@link XDataXYs1DPrimary }
         *     
         */
        public XDataXYs1DPrimary getXYs1D() {
            return xYs1D;
        }

        /**
         * Sets the value of the xYs1D property.
         * 
         * @param value
         *     allowed object is
         *     {@link XDataXYs1DPrimary }
         *     
         */
        public void setXYs1D(XDataXYs1DPrimary value) {
            this.xYs1D = value;
        }

        /**
         * Gets the value of the evaporation property.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getEvaporation() {
            return evaporation;
        }

        /**
         * Sets the value of the evaporation property.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setEvaporation(Object value) {
            this.evaporation = value;
        }

        /**
         * Gets the value of the index property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getIndex() {
            return index;
        }

        /**
         * Sets the value of the index property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setIndex(BigInteger value) {
            this.index = value;
        }

    }

}
