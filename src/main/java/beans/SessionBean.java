/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author ahmad-kisswani
 */
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import javax.annotation.PostConstruct;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import util.message.messagesXmlParser;

@ManagedBean(name = "SessionBean")
@SessionScoped
public class SessionBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String localeCode;

    private static Map<String, Object> countries;

    static {
        countries = new LinkedHashMap<String, Object>();
        countries.put("English", new Locale("English")); //label, value
        countries.put("Arabic", new Locale("Arabic"));

    }

    public static void doFillMessageData() {
        messagesXmlParser loder = new messagesXmlParser();
        loder.lodMaper();
       
    }

    public Map<String, Object> getCountriesInMap() {
        return countries;
    }

    public String getLocaleCode() {
        if (localeCode == null) {
            localeCode = "English";
        }
        return localeCode;
    }

    public void setLocaleCode(String localeCode) {
        if (localeCode == null) {
            localeCode = "English";
        }
        this.localeCode = localeCode;
    }

    //value change event listener
    public void countryLocaleCodeChanged(String e) {

        String newLocaleValue = e.trim();

        //loop country map to compare the locale code
        for (Map.Entry<String, Object> entry : countries.entrySet()) {

            if (entry.getValue().toString().equals(newLocaleValue)) {

                FacesContext.getCurrentInstance()
                        .getViewRoot().setLocale((Locale) entry.getValue());

            }
        }
    }

}
