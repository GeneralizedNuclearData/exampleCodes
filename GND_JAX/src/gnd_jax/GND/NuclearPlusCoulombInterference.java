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
 * <p>Java class for NuclearPlusCoulombInterference complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NuclearPlusCoulombInterference">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="effectiveCrossSection">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="XYs1d" type="{}xData_XYs1d_primary"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="effectiveDistribution">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="XYs2d" type="{}xData_XYs2d_primary"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="muCutoff" use="required" type="{http://www.w3.org/2001/XMLSchema}double" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NuclearPlusCoulombInterference", propOrder = {
    "effectiveCrossSection",
    "effectiveDistribution"
})
public class NuclearPlusCoulombInterference {

    @XmlElement(required = true)
    protected NuclearPlusCoulombInterference.EffectiveCrossSection effectiveCrossSection;
    @XmlElement(required = true)
    protected NuclearPlusCoulombInterference.EffectiveDistribution effectiveDistribution;
    @XmlAttribute(name = "muCutoff", required = true)
    protected double muCutoff;

    /**
     * Gets the value of the effectiveCrossSection property.
     * 
     * @return
     *     possible object is
     *     {@link NuclearPlusCoulombInterference.EffectiveCrossSection }
     *     
     */
    public NuclearPlusCoulombInterference.EffectiveCrossSection getEffectiveCrossSection() {
        return effectiveCrossSection;
    }

    /**
     * Sets the value of the effectiveCrossSection property.
     * 
     * @param value
     *     allowed object is
     *     {@link NuclearPlusCoulombInterference.EffectiveCrossSection }
     *     
     */
    public void setEffectiveCrossSection(NuclearPlusCoulombInterference.EffectiveCrossSection value) {
        this.effectiveCrossSection = value;
    }

    /**
     * Gets the value of the effectiveDistribution property.
     * 
     * @return
     *     possible object is
     *     {@link NuclearPlusCoulombInterference.EffectiveDistribution }
     *     
     */
    public NuclearPlusCoulombInterference.EffectiveDistribution getEffectiveDistribution() {
        return effectiveDistribution;
    }

    /**
     * Sets the value of the effectiveDistribution property.
     * 
     * @param value
     *     allowed object is
     *     {@link NuclearPlusCoulombInterference.EffectiveDistribution }
     *     
     */
    public void setEffectiveDistribution(NuclearPlusCoulombInterference.EffectiveDistribution value) {
        this.effectiveDistribution = value;
    }

    /**
     * Gets the value of the muCutoff property.
     * 
     */
    public double getMuCutoff() {
        return muCutoff;
    }

    /**
     * Sets the value of the muCutoff property.
     * 
     */
    public void setMuCutoff(double value) {
        this.muCutoff = value;
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
        "xYs1D"
    })
    public static class EffectiveCrossSection {

        @XmlElement(name = "XYs1d", required = true)
        protected XDataXYs1DPrimary xYs1D;

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
     *         &lt;element name="XYs2d" type="{}xData_XYs2d_primary"/>
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
        "xYs2D"
    })
    public static class EffectiveDistribution {

        @XmlElement(name = "XYs2d", required = true)
        protected XDataXYs2DPrimary xYs2D;

        /**
         * Gets the value of the xYs2D property.
         * 
         * @return
         *     possible object is
         *     {@link XDataXYs2DPrimary }
         *     
         */
        public XDataXYs2DPrimary getXYs2D() {
            return xYs2D;
        }

        /**
         * Sets the value of the xYs2D property.
         * 
         * @param value
         *     allowed object is
         *     {@link XDataXYs2DPrimary }
         *     
         */
        public void setXYs2D(XDataXYs2DPrimary value) {
            this.xYs2D = value;
        }

    }

}
