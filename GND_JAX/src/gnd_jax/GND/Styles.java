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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for styles complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="styles">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice maxOccurs="unbounded">
 *         &lt;element name="evaluated">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="temperature" type="{}PhysicalQuantity"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="label" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                 &lt;attribute name="library" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="crossSectionReconstructed">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="label" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                 &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="derivedFrom" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="heated">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="temperature" type="{}PhysicalQuantity"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="label" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                 &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="derivedFrom" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="averageProductData">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="label" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
 *                 &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="derivedFrom" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "styles", propOrder = {
    "evaluatedOrCrossSectionReconstructedOrHeated"
})
public class Styles {

    @XmlElements({
        @XmlElement(name = "evaluated", type = Styles.Evaluated.class),
        @XmlElement(name = "crossSectionReconstructed", type = Styles.CrossSectionReconstructed.class),
        @XmlElement(name = "heated", type = Styles.Heated.class),
        @XmlElement(name = "averageProductData", type = Styles.AverageProductData.class)
    })
    protected List<Object> evaluatedOrCrossSectionReconstructedOrHeated;

    /**
     * Gets the value of the evaluatedOrCrossSectionReconstructedOrHeated property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the evaluatedOrCrossSectionReconstructedOrHeated property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEvaluatedOrCrossSectionReconstructedOrHeated().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Styles.Evaluated }
     * {@link Styles.CrossSectionReconstructed }
     * {@link Styles.Heated }
     * {@link Styles.AverageProductData }
     * 
     * 
     */
    public List<Object> getEvaluatedOrCrossSectionReconstructedOrHeated() {
        if (evaluatedOrCrossSectionReconstructedOrHeated == null) {
            evaluatedOrCrossSectionReconstructedOrHeated = new ArrayList<Object>();
        }
        return this.evaluatedOrCrossSectionReconstructedOrHeated;
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
     *       &lt;attribute name="label" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *       &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="derivedFrom" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AverageProductData {

        @XmlAttribute(name = "label", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String label;
        @XmlAttribute(name = "date", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar date;
        @XmlAttribute(name = "derivedFrom", required = true)
        protected String derivedFrom;

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
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
        }

        /**
         * Gets the value of the derivedFrom property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDerivedFrom() {
            return derivedFrom;
        }

        /**
         * Sets the value of the derivedFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDerivedFrom(String value) {
            this.derivedFrom = value;
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
     *       &lt;attribute name="label" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *       &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="derivedFrom" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CrossSectionReconstructed {

        @XmlAttribute(name = "label", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String label;
        @XmlAttribute(name = "date", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar date;
        @XmlAttribute(name = "derivedFrom", required = true)
        protected String derivedFrom;

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
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
        }

        /**
         * Gets the value of the derivedFrom property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDerivedFrom() {
            return derivedFrom;
        }

        /**
         * Sets the value of the derivedFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDerivedFrom(String value) {
            this.derivedFrom = value;
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
     *         &lt;element name="temperature" type="{}PhysicalQuantity"/>
     *       &lt;/sequence>
     *       &lt;attribute name="label" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *       &lt;attribute name="library" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "temperature"
    })
    public static class Evaluated {

        @XmlElement(required = true)
        protected PhysicalQuantity temperature;
        @XmlAttribute(name = "label", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String label;
        @XmlAttribute(name = "library", required = true)
        protected String library;
        @XmlAttribute(name = "version", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String version;
        @XmlAttribute(name = "date", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar date;

        /**
         * Gets the value of the temperature property.
         * 
         * @return
         *     possible object is
         *     {@link PhysicalQuantity }
         *     
         */
        public PhysicalQuantity getTemperature() {
            return temperature;
        }

        /**
         * Sets the value of the temperature property.
         * 
         * @param value
         *     allowed object is
         *     {@link PhysicalQuantity }
         *     
         */
        public void setTemperature(PhysicalQuantity value) {
            this.temperature = value;
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
         * Gets the value of the library property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLibrary() {
            return library;
        }

        /**
         * Sets the value of the library property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLibrary(String value) {
            this.library = value;
        }

        /**
         * Gets the value of the version property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVersion() {
            return version;
        }

        /**
         * Sets the value of the version property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVersion(String value) {
            this.version = value;
        }

        /**
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
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
     *         &lt;element name="temperature" type="{}PhysicalQuantity"/>
     *       &lt;/sequence>
     *       &lt;attribute name="label" use="required" type="{http://www.w3.org/2001/XMLSchema}NCName" />
     *       &lt;attribute name="date" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="derivedFrom" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "temperature"
    })
    public static class Heated {

        @XmlElement(required = true)
        protected PhysicalQuantity temperature;
        @XmlAttribute(name = "label", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "NCName")
        protected String label;
        @XmlAttribute(name = "date", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar date;
        @XmlAttribute(name = "derivedFrom", required = true)
        protected String derivedFrom;

        /**
         * Gets the value of the temperature property.
         * 
         * @return
         *     possible object is
         *     {@link PhysicalQuantity }
         *     
         */
        public PhysicalQuantity getTemperature() {
            return temperature;
        }

        /**
         * Sets the value of the temperature property.
         * 
         * @param value
         *     allowed object is
         *     {@link PhysicalQuantity }
         *     
         */
        public void setTemperature(PhysicalQuantity value) {
            this.temperature = value;
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
         * Gets the value of the date property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * Sets the value of the date property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
        }

        /**
         * Gets the value of the derivedFrom property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDerivedFrom() {
            return derivedFrom;
        }

        /**
         * Sets the value of the derivedFrom property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDerivedFrom(String value) {
            this.derivedFrom = value;
        }

    }

}
