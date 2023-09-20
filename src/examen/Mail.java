
package examen;

public class Mail {
    private String correo;
    private String asunto;

    public Mail(String correo, String asunto) {
        this.correo = correo;
        this.asunto = asunto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }
    
}
