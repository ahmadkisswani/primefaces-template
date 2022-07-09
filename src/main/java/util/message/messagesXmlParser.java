/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util.message;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

/**
 *
 * @author ahmad-kisswani
 */
public class messagesXmlParser {

    private static schema unmarshallT;
    private static Map<String, schemaSource> messagesMap = new HashMap<String, schemaSource>();

    private schema intoData() {
        JAXBContext context;
        try {

            // xmlURL will be null when the path is incorrect.
            context = JAXBContext.newInstance(schema.class);
        
           
            unmarshallT = (schema) context.createUnmarshaller()
                    .unmarshal(new File("src/messages/main/java/messages.xml"));

        } catch (JAXBException ex) {
            Logger.getLogger(messagesXmlParser.class.getName()).log(Level.SEVERE, null, ex);
        }
        return unmarshallT;
    }

    public void lodMaper() {
        schema source = intoData();

        for (schemaSource obj : source.getLsmessages()) {
            if (!messagesMap.keySet().contains(obj.getCode())) {
                messagesMap.put(obj.getCode(), obj);
            }
        }

    }

    /**
     * @return the messagesMap
     */
    public static Map<String, schemaSource> getMessagesMap() {
        return messagesMap;
    }

    /**
     * @param messagesMap the messagesMap to set
     */
    public void setMessagesMap(Map<String, schemaSource> messagesMap) {
        this.messagesMap = messagesMap;
    }

}
