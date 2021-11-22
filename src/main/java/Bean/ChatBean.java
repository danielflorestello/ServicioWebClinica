
package Bean;

public class ChatBean {
     private int cod_doct;
     private int cod_paci;
     private String NameDoctor;
     private String NamePaciente;
     private String Emisor;
     private String fecha;
     private String mensaje;

         public ChatBean() {
    }

     public ChatBean(int cod_doct, int cod_paci, String NameDoctor, String NamePaciente, String Emisor, String fecha, String mensaje) {
        this.cod_doct = cod_doct;
        this.cod_paci = cod_paci;
        this.NameDoctor = NameDoctor;
        this.NamePaciente = NamePaciente;
        this.Emisor = Emisor;
        this.fecha = fecha;
        this.mensaje = mensaje;
    }
     
    public int getCod_doct() {
        return cod_doct;
    }

    public int getCod_paci() {
        return cod_paci;
    }

    public String getEmisor() {
        return Emisor;
    }

    public String getFecha() {
        return fecha;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getNameDoctor() {
        return NameDoctor;
    }

    public String getNamePaciente() {
        return NamePaciente;
    }

    public void setCod_doct(int cod_doct) {
        this.cod_doct = cod_doct;
    }

    public void setCod_paci(int cod_paci) {
        this.cod_paci = cod_paci;
    }

    public void setEmisor(String Emisor) {
        this.Emisor = Emisor;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setNameDoctor(String NameDoctor) {
        this.NameDoctor = NameDoctor;
    }

    public void setNamePaciente(String NamePaciente) {
        this.NamePaciente = NamePaciente;
    }
    
}
