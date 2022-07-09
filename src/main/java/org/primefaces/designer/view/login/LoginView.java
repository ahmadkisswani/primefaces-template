/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.primefaces.designer.view.login;

import beans.SessionBean;
import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import util.message.messagesXmlParser;

/**
 *
 * @author ahmad-kisswani
 */
@ManagedBean
@ViewScoped
public class LoginView implements Serializable {

    private String user;
    private String passWord;

    /**
     * @return the user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return the passWord
     */
    public String getPassWord() {
        return passWord;
    }

    /**
     * @param passWord the passWord to set
     */
    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public void loginAtion() {
        
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ExternalContext ec = facesContext.getExternalContext();
        try {

            ec.redirect("sample.xhtml");

        } catch (IOException ex) {
            Logger.getLogger(LoginView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
