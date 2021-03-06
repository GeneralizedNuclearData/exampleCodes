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
 * <p>Java class for scatteringRadius complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="scatteringRadius">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="constant" type="{}constantScatteringRadius"/>
 *         &lt;element name="Ldependent" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="XYs1d" type="{}xData_XYs1d_primary"/>
 *       &lt;/choice>
 *       &lt;attribute name="lowerBound" type="{}PhysicalQuantityAttribute" />
 *       &lt;attribute name="upperBound" type="{}PhysicalQuantityAttribute" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "scatteringRadius", propOrder = {
    "constant",
    "ldependent",
    "xYs1D"
})
public class ScatteringRadius {

    protected ConstantScatteringRadius constant;
    @XmlElement(name = "Ldependent")
    protected Object ldependent;
    @XmlElement(name = "XYs1d")
    protected XDataXYs1DPrimary xYs1D;
    @XmlAttribute(name = "lowerBound")
    protected String lowerBound;
    @XmlAttribute(name = "upperBound")
    protected String upperBound;

    /**
     * Gets the value of the constant property.
     * 
     * @return
     *     possible object is
     *     {@link ConstantScatteringRadius }
     *     
     */
    public ConstantScatteringRadius getConstant() {
        return constant;
    }

    /**
     * Sets the value of the constant property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConstantScatteringRadius }
     *     
     */
    public void setConstant(ConstantScatteringRadius value) {
        this.constant = value;
    }

    /**
     * Gets the value of the ldependent property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getLdependent() {
        return ldependent;
    }

    /**
     * Sets the value of the ldependent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setLdependent(Object value) {
        this.ldependent = value;
    }

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
     * Gets the value of the lowerBound property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLowerBound() {
        return lowerBound;
    }

    /**
     * Sets the value of the lowerBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLowerBound(String value) {
        this.lowerBound = value;
    }

    /**
     * Gets the value of the upperBound property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpperBound() {
        return upperBound;
    }

    /**
     * Sets the value of the upperBound property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpperBound(String value) {
        this.upperBound = value;
    }

}
