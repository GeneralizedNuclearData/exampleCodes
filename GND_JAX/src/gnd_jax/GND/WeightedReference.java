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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


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
 *         &lt;element name="reference" type="{}xlink"/>
 *         &lt;element name="XYs1d" type="{}xData_XYs1d_primary"/>
 *       &lt;/sequence>
 *       &lt;attribute name="label" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "reference",
    "xYs1D"
})
@XmlRootElement(name = "weightedReference")
public class WeightedReference {

    @XmlElement(required = true)
    protected Xlink reference;
    @XmlElement(name = "XYs1d", required = true)
    protected XDataXYs1DPrimary xYs1D;
    @XmlAttribute(name = "label", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "NCName")
    protected String label;

    /**
     * Gets the value of the reference property.
     * 
     * @return
     *     possible object is
     *     {@link Xlink }
     *     
     */
    public Xlink getReference() {
        return reference;
    }

    /**
     * Sets the value of the reference property.
     * 
     * @param value
     *     allowed object is
     *     {@link Xlink }
     *     
     */
    public void setReference(Xlink value) {
        this.reference = value;
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

}
