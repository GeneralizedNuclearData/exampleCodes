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
 * <p>Java class for generalEvaporation complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="generalEvaporation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="U" type="{}PhysicalQuantity"/>
 *         &lt;element name="theta" type="{}energyFunctionalData"/>
 *         &lt;element name="g" type="{}energyFunctionalData"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "generalEvaporation", propOrder = {
    "u",
    "theta",
    "g"
})
public class GeneralEvaporation {

    @XmlElement(name = "U", required = true)
    protected PhysicalQuantity u;
    @XmlElement(required = true)
    protected EnergyFunctionalData theta;
    @XmlElement(required = true)
    protected EnergyFunctionalData g;

    /**
     * Gets the value of the u property.
     * 
     * @return
     *     possible object is
     *     {@link PhysicalQuantity }
     *     
     */
    public PhysicalQuantity getU() {
        return u;
    }

    /**
     * Sets the value of the u property.
     * 
     * @param value
     *     allowed object is
     *     {@link PhysicalQuantity }
     *     
     */
    public void setU(PhysicalQuantity value) {
        this.u = value;
    }

    /**
     * Gets the value of the theta property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyFunctionalData }
     *     
     */
    public EnergyFunctionalData getTheta() {
        return theta;
    }

    /**
     * Sets the value of the theta property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyFunctionalData }
     *     
     */
    public void setTheta(EnergyFunctionalData value) {
        this.theta = value;
    }

    /**
     * Gets the value of the g property.
     * 
     * @return
     *     possible object is
     *     {@link EnergyFunctionalData }
     *     
     */
    public EnergyFunctionalData getG() {
        return g;
    }

    /**
     * Sets the value of the g property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnergyFunctionalData }
     *     
     */
    public void setG(EnergyFunctionalData value) {
        this.g = value;
    }

}