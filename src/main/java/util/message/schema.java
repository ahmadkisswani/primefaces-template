/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util.message;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ahmad-kisswani
 */
@XmlRootElement(name = "messages")
@XmlAccessorType(XmlAccessType.FIELD)
public class schema {
    @XmlElement(name = "message")
    private List<schemaSource> lsmessages;

    /**
     * @return the lsmessages
     */
    public List<schemaSource> getLsmessages() {
        return lsmessages;
    }

    /**
     * @param lsmessages the lsmessages to set
     */
    
    public void setLsmessages(List<schemaSource> lsmessages) {
        this.lsmessages = lsmessages;
    }
    
    
}
