
package examen;


public class SendGridSender implements MailSender{

    @Override
    public void send(Mail mail) {
        System.out.println("Se envia mediante SendGrid "+ "\n" +"Correo : "+ mail.getCorreo()+ "\n"+"Asunto : "+ mail.getAsunto()+"\n");
    }
    
}
