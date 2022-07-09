/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util.message;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ahmad-kisswani
 */

@XmlAccessorType(XmlAccessType.FIELD)
public class schemaSource {

    @XmlAttribute
    private String code;
    @XmlElement(name = "en")
    private String en;
    @XmlElement(name = "ar")
    private String ar;
    @XmlAttribute
    private String type;

    /**
     * @return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return the en
     */
    public String getEn() {
        return en;
    }

    /**
     * @param en the en to set
     */
    public void setEn(String en) {
        this.en = en;
    }

    /**
     * @return the ar
     */
    public String getAr() {
        return ar;
    }

    /**
     * @param ar the ar to set
     */
    public void setAr(String ar) {
        this.ar = ar;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

}
