//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.04.27 at 11:31:49 AM PDT 
//


package gnd_jax.GND;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for interpolation.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="interpolation">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="flat"/>
 *     &lt;enumeration value="charged-particle"/>
 *     &lt;enumeration value="lin-lin"/>
 *     &lt;enumeration value="lin-log"/>
 *     &lt;enumeration value="log-lin"/>
 *     &lt;enumeration value="log-log"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "interpolation")
@XmlEnum
public enum Interpolation {

    @XmlEnumValue("flat")
    FLAT("flat"),
    @XmlEnumValue("charged-particle")
    CHARGED_PARTICLE("charged-particle"),
    @XmlEnumValue("lin-lin")
    LIN_LIN("lin-lin"),
    @XmlEnumValue("lin-log")
    LIN_LOG("lin-log"),
    @XmlEnumValue("log-lin")
    LOG_LIN("log-lin"),
    @XmlEnumValue("log-log")
    LOG_LOG("log-log");
    private final String value;

    Interpolation(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static Interpolation fromValue(String v) {
        for (Interpolation c: Interpolation.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}