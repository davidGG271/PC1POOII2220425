/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen;

/**
 *
 * @author david
 */
public class Service {
    
    private MailSender emailStrategy;

    public void setEmailStrategy(MailSender emailStrategy) {
        this.emailStrategy = emailStrategy;
    }

    public void enviarAUsuarios(Mail mail) {
        emailStrategy.send(mail);
    }
}
