
package examen;


public class Eurobank {

    
    public static void main(String[] args) {
        
        Mail mail1 = new Mail ("david@gmail.com", "Tema Gastos");
        Mail mail2 = new Mail ("juan@gmail.com", "Tema Ventas");
        
        MailSender smtpSender = new SMTPSender();
        MailSender gridSender = new SendGridSender();
        
        //Ejemplo con el smtpSenderr
        
        Service emailContext = new Service();
        
        emailContext.setEmailStrategy(smtpSender);
        emailContext.enviarAUsuarios(mail1);
        emailContext.enviarAUsuarios(mail2);
        
        System.out.println("---------------------------- ");
        
        //ejemplo con el SendGrid
        
        emailContext.setEmailStrategy(gridSender);
        emailContext.enviarAUsuarios(mail1);
        emailContext.enviarAUsuarios(mail2);
        
    }
    
}
