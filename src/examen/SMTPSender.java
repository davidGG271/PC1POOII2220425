
package examen;


public class SMTPSender implements MailSender{

    @Override
    public void send(Mail mail) {
        System.out.println("Se envia mediante SMTPSender "+ "\n" +"Correo : "+ mail.getCorreo()+ "\n"+"Asunto : "+ mail.getAsunto()+"\n");
    }
    
}
