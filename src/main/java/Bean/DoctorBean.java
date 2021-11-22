
package Bean;

public class DoctorBean {
    private int cod_doct;
    private String usuario;
    private String contraseña;
    private String nombdoct;
    private String apedoct;
    private String fechnacidoct;
    private String correodoct;
    private String teldoct;
    private int cod_turno;
    private int cod_espec;
    
    public DoctorBean() {
    
        }
    
    public DoctorBean(int cod_doct,String usuario,String contraseña,String nombdoct,String apedoct,String fechnacidoct,String correodoct,String teldoct,int cod_turno,int cod_espec){
        
    this.cod_doct= cod_doct;
    this.usuario= usuario;
    this.contraseña= contraseña;
    this.nombdoct= nombdoct;
    this.apedoct= apedoct;
    this.fechnacidoct= fechnacidoct;
    this.correodoct= correodoct;
    this.teldoct= teldoct;
    this.cod_turno= cod_turno;
    this.cod_espec= cod_espec;
        
    }
    

    public int getCod_doct() {
        return cod_doct;
    }

    public void setCod_doct(int cod_doct) {
        this.cod_doct = cod_doct;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNombdoct() {
        return nombdoct;
    }

    public void setNombdoct(String nombdoct) {
        this.nombdoct = nombdoct;
    }

    public String getApedoct() {
        return apedoct;
    }

    public void setApedoct(String apedoct) {
        this.apedoct = apedoct;
    }

    public String getFechnacidoct() {
        return fechnacidoct;
    }

    public void setFechnacidoct(String fechnacidoct) {
        this.fechnacidoct = fechnacidoct;
    }

    public String getCorreodoct() {
        return correodoct;
    }

    public void setCorreodoct(String correodoct) {
        this.correodoct = correodoct;
    }

    public String getTeldoct() {
        return teldoct;
    }

    public void setTeldoct(String teldoct) {
        this.teldoct = teldoct;
    }

    public int getCod_turno() {
        return cod_turno;
    }

    public void setCod_turno(int cod_turno) {
        this.cod_turno = cod_turno;
    }

    public int getCod_espec() {
        return cod_espec;
    }

    public void setCod_espec(int cod_espec) {
        this.cod_espec = cod_espec;
    }
    
}
