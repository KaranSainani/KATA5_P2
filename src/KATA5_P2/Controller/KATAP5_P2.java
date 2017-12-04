package KATA5_P2.Controller;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import KATA5_P2.Model.Histogram;
import KATA5_P2.Model.Mail;
import View.HistogramDisplay;
import View.MailHistogramBuilder;
import View.MailListReader;
import View.MailListReaderDDBB;

public class KATAP5_P2 {
    
/*
Se modifica la clase de Control, Kata4, usando el patrón de
diseño CIPO: se deben crear los módulos de control execute(), de
entrada input(), de proceso process() y de salida output().
*/

    
    private List<Mail> mailList;
    private Histogram<String> histogram;
   
    public static void main(String[] args) throws IOException, FileNotFoundException, ClassNotFoundException, SQLException {
      KATAP5_P2 kata4;
        kata4 = new KATAP5_P2();
      kata4.execute();
    }
    
    void execute() throws IOException, FileNotFoundException, ClassNotFoundException, SQLException {
        input();
        process();
        output();
    }
    
    void input() throws IOException, FileNotFoundException, ClassNotFoundException, SQLException {
        String fileName="emails.txt";
        mailList = MailListReaderDDBB.read(); //Almacena los emails accediendo a una base de datos
        //mailList=MailListReader.read(fileName); //Almacena los emails accediendo a un archivo txt
        
    }
    
    void process() {
        histogram = MailHistogramBuilder.build(mailList);
    }
    
    void output() {
        HistogramDisplay histoDisplay = new HistogramDisplay(histogram);
        histoDisplay.execute();
    }
    
}
