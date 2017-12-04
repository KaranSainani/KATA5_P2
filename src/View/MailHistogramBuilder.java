/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.util.List;
import KATA5_P2.Model.Histogram;
import KATA5_P2.Model.Mail;


public class MailHistogramBuilder {
    
    public static Histogram<String> build(List<Mail> mail) {
        Histogram<String> histo= new Histogram<String>();
        for (Mail mail1 : mail) {
            histo.increment(mail1.getDomain());
        }
        return histo;
    }
    
}