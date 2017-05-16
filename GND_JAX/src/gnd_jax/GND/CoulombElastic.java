//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.27 at 11:31:49 AM PDT 
//


package gnd_jax.GND;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoulombElastic complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoulombElastic">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RutherfordScattering">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="domainMin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="domainMax" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="domainUnit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;choice>
 *           &lt;element name="CoulombExpansion" type="{}CoulombExpansion"/>
 *           &lt;element name="NuclearPlusCoulombInterference" type="{}NuclearPlusCoulombInterference"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="label" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="productFrame" use="required" type="{}frame" />
 *       &lt;attribute name="identicalParticles" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoulombElastic", propOrder = {
    "rutherfordScattering",
    "coulombExpansion",
    "nuclearPlusCoulombInterference"
})
public class CoulombElastic {

    @XmlElement(name = "RutherfordScattering", required = true)
    protected CoulombElastic.RutherfordScattering rutherfordScattering;
    @XmlElement(name = "CoulombExpansion")
    protected CoulombExpansion coulombExpansion;
    @XmlElement(name = "NuclearPlusCoulombInterference")
    protected NuclearPlusCoulombInterference nuclearPlusCoulombInterference;
    @XmlAttribute(name = "label", required = true)
    protected String label;
    @XmlAttribute(name = "productFrame", required = true)
    protected Frame productFrame;
    @XmlAttribute(name = "identicalParticles")
    protected Boolean identicalParticles;

    /**
     * Gets the value of the rutherfordScattering property.
     * 
     * @return
     *     possible object is
     *     {@link CoulombElastic.RutherfordScattering }
     *     
     */
    public CoulombElastic.RutherfordScattering getRutherfordScattering() {
        return rutherfordScattering;
    }

    /**
     * Sets the value of the rutherfordScattering property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoulombElastic.RutherfordScattering }
     *     
     */
    public void setRutherfordScattering(CoulombElastic.RutherfordScattering value) {
        this.rutherfordScattering = value;
    }

    /**
     * Gets the value of the coulombExpansion property.
     * 
     * @return
     *     possible object is
     *     {@link CoulombExpansion }
     *     
     */
    public CoulombExpansion getCoulombExpansion() {
        return coulombExpansion;
    }

    /**
     * Sets the value of the coulombExpansion property.
     * 
     * @param value
     *     allowed object is
     *     {@link CoulombExpansion }
     *     
     */
    public void setCoulombExpansion(CoulombExpansion value) {
        this.coulombExpansion = value;
    }

    /**
     * Gets the value of the nuclearPlusCoulombInterference property.
     * 
     * @return
     *     possible object is
     *     {@link NuclearPlusCoulombInterference }
     *     
     */
    public NuclearPlusCoulombInterference getNuclearPlusCoulombInterference() {
        return nuclearPlusCoulombInterference;
    }

    /**
     * Sets the value of the nuclearPlusCoulombInterference property.
     * 
     * @param value
     *     allowed object is
     *     {@link NuclearPlusCoulombInterference }
     *     
     */
    public void setNuclearPlusCoulombInterference(NuclearPlusCoulombInterference value) {
        this.nuclearPlusCoulombInterference = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the productFrame property.
     * 
     * @return
     *     possible object is
     *     {@link Frame }
     *     
     */
    public Frame getProductFrame() {
        return productFrame;
    }

    /**
     * Sets the value of the productFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link Frame }
     *     
     */
    public void setProductFrame(Frame value) {
        this.productFrame = value;
    }

    /**
     * Gets the value of the identicalParticles property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIdenticalParticles() {
        return identicalParticles;
    }

    /**
     * Sets the value of the identicalParticles property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIdenticalParticles(Boolean value) {
        this.identicalParticles = value;
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
     *       &lt;attribute name="domainMin" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="domainMax" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="domainUnit" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RutherfordScattering {

        @XmlAttribute(name = "domainMin")
        protected String domainMin;
        @XmlAttribute(name = "domainMax")
        protected String domainMax;
        @XmlAttribute(name = "domainUnit")
        protected String domainUnit;

        /**
         * Gets the value of the domainMin property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDomainMin() {
            return domainMin;
        }

        /**
         * Sets the value of the domainMin property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDomainMin(String value) {
            this.domainMin = value;
        }

        /**
         * Gets the value of the domainMax property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDomainMax() {
            return domainMax;
        }

        /**
         * Sets the value of the domainMax property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDomainMax(String value) {
            this.domainMax = value;
        }

        /**
         * Gets the value of the domainUnit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDomainUnit() {
            return domainUnit;
        }

        /**
         * Sets the value of the domainUnit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDomainUnit(String value) {
            this.domainUnit = value;
        }

    }

}
