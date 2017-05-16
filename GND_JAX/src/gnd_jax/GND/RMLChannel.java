//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.27 at 11:31:49 AM PDT 
//


package gnd_jax.GND;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RML_channel complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RML_channel">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="scatteringRadius" type="{}scatteringRadius" minOccurs="0"/>
 *         &lt;element name="hardSphereRadius" type="{}scatteringRadius" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="label" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="resonanceReaction" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="L" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="channelSpin" use="required" type="{}fractionAttribute" />
 *       &lt;attribute name="columnIndex" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RML_channel", propOrder = {
    "scatteringRadius",
    "hardSphereRadius"
})
public class RMLChannel {

    protected ScatteringRadius scatteringRadius;
    protected ScatteringRadius hardSphereRadius;
    @XmlAttribute(name = "label", required = true)
    protected String label;
    @XmlAttribute(name = "resonanceReaction", required = true)
    protected String resonanceReaction;
    @XmlAttribute(name = "L", required = true)
    protected BigInteger l;
    @XmlAttribute(name = "channelSpin", required = true)
    protected String channelSpin;
    @XmlAttribute(name = "columnIndex", required = true)
    protected BigInteger columnIndex;

    /**
     * Gets the value of the scatteringRadius property.
     * 
     * @return
     *     possible object is
     *     {@link ScatteringRadius }
     *     
     */
    public ScatteringRadius getScatteringRadius() {
        return scatteringRadius;
    }

    /**
     * Sets the value of the scatteringRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScatteringRadius }
     *     
     */
    public void setScatteringRadius(ScatteringRadius value) {
        this.scatteringRadius = value;
    }

    /**
     * Gets the value of the hardSphereRadius property.
     * 
     * @return
     *     possible object is
     *     {@link ScatteringRadius }
     *     
     */
    public ScatteringRadius getHardSphereRadius() {
        return hardSphereRadius;
    }

    /**
     * Sets the value of the hardSphereRadius property.
     * 
     * @param value
     *     allowed object is
     *     {@link ScatteringRadius }
     *     
     */
    public void setHardSphereRadius(ScatteringRadius value) {
        this.hardSphereRadius = value;
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
     * Gets the value of the resonanceReaction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResonanceReaction() {
        return resonanceReaction;
    }

    /**
     * Sets the value of the resonanceReaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResonanceReaction(String value) {
        this.resonanceReaction = value;
    }

    /**
     * Gets the value of the l property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getL() {
        return l;
    }

    /**
     * Sets the value of the l property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setL(BigInteger value) {
        this.l = value;
    }

    /**
     * Gets the value of the channelSpin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChannelSpin() {
        return channelSpin;
    }

    /**
     * Sets the value of the channelSpin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChannelSpin(String value) {
        this.channelSpin = value;
    }

    /**
     * Gets the value of the columnIndex property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getColumnIndex() {
        return columnIndex;
    }

    /**
     * Sets the value of the columnIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setColumnIndex(BigInteger value) {
        this.columnIndex = value;
    }

}