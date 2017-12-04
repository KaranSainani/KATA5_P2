/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KATA5_P2.Model;

public class Mail {
    
    private final String mail;

    public Mail(String mail) {
        this.mail = mail;
    }

    public String getMail() {
        return mail;
    }
    public String getDomain() {
        String[] res = mail.split("@");
        return res[1];
    }
}
