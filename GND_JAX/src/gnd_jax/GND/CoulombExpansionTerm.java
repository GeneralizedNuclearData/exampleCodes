//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.27 at 11:31:49 AM PDT 
//


package gnd_jax.GND;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoulombExpansionTerm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CoulombExpansionTerm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="regions2d" type="{}xData_regions_2d_primary"/>
 *           &lt;element name="XYs2d" type="{}xData_XYs2d_primary"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoulombExpansionTerm", propOrder = {
    "regions2D",
    "xYs2D"
})
public class CoulombExpansionTerm {

    @XmlElement(name = "regions2d")
    protected XDataRegions2DPrimary regions2D;
    @XmlElement(name = "XYs2d")
    protected XDataXYs2DPrimary xYs2D;

    /**
     * Gets the value of the regions2D property.
     * 
     * @return
     *     possible object is
     *     {@link XDataRegions2DPrimary }
     *     
     */
    public XDataRegions2DPrimary getRegions2D() {
        return regions2D;
    }

    /**
     * Sets the value of the regions2D property.
     * 
     * @param value
     *     allowed object is
     *     {@link XDataRegions2DPrimary }
     *     
     */
    public void setRegions2D(XDataRegions2DPrimary value) {
        this.regions2D = value;
    }

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
