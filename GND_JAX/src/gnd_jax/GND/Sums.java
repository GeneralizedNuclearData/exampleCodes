//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.27 at 11:31:49 AM PDT 
//


package gnd_jax.GND;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for sums complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sums">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="crossSections">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="crossSectionSum" type="{}crossSectionSum" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="multiplicities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="multiplicitySum" type="{}multiplicitySum" maxOccurs="unbounded"/>
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
@XmlType(name = "sums", propOrder = {
    "crossSections",
    "multiplicities"
})
public class Sums {

    @XmlElement(required = true)
    protected Sums.CrossSections crossSections;
    protected Sums.Multiplicities multiplicities;

    /**
     * Gets the value of the crossSections property.
     * 
     * @return
     *     possible object is
     *     {@link Sums.CrossSections }
     *     
     */
    public Sums.CrossSections getCrossSections() {
        return crossSections;
    }

    /**
     * Sets the value of the crossSections property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sums.CrossSections }
     *     
     */
    public void setCrossSections(Sums.CrossSections value) {
        this.crossSections = value;
    }

    /**
     * Gets the value of the multiplicities property.
     * 
     * @return
     *     possible object is
     *     {@link Sums.Multiplicities }
     *     
     */
    public Sums.Multiplicities getMultiplicities() {
        return multiplicities;
    }

    /**
     * Sets the value of the multiplicities property.
     * 
     * @param value
     *     allowed object is
     *     {@link Sums.Multiplicities }
     *     
     */
    public void setMultiplicities(Sums.Multiplicities value) {
        this.multiplicities = value;
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
     *         &lt;element name="crossSectionSum" type="{}crossSectionSum" maxOccurs="unbounded"/>
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
        "crossSectionSum"
    })
    public static class CrossSections {

        @XmlElement(required = true)
        protected List<CrossSectionSum> crossSectionSum;

        /**
         * Gets the value of the crossSectionSum property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the crossSectionSum property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCrossSectionSum().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CrossSectionSum }
         * 
         * 
         */
        public List<CrossSectionSum> getCrossSectionSum() {
            if (crossSectionSum == null) {
                crossSectionSum = new ArrayList<CrossSectionSum>();
            }
            return this.crossSectionSum;
        }

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
     *         &lt;element name="multiplicitySum" type="{}multiplicitySum" maxOccurs="unbounded"/>
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
        "multiplicitySum"
    })
    public static class Multiplicities {

        @XmlElement(required = true)
        protected List<MultiplicitySum> multiplicitySum;

        /**
         * Gets the value of the multiplicitySum property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the multiplicitySum property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMultiplicitySum().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultiplicitySum }
         * 
         * 
         */
        public List<MultiplicitySum> getMultiplicitySum() {
            if (multiplicitySum == null) {
                multiplicitySum = new ArrayList<MultiplicitySum>();
            }
            return this.multiplicitySum;
        }

    }

}
