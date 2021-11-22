
package Bean;

public class PacienteBean {
    private int cod_paci;
    private String nombrepaci;
    private String apepaci;
    private String usuario;
    private String contraseña;
    private String dnipaci;
    private String fechNacipaci;
    private String sexopaci;
    private String telfpaci;
    private String correopaci;
    private String cod_ubigeo;
    private String descripcionUbi;

    public PacienteBean() {
    }

    public PacienteBean(int cod_paci, String nombrepaci, String apepaci, String usuario, String contraseña, String dnipaci, String fechNacipaci, String sexopaci, String telfpaci, String correopaci, String cod_ubigeo, String descripcionUbi) {
        this.cod_paci = cod_paci;
        this.nombrepaci = nombrepaci;
        this.apepaci = apepaci;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.dnipaci = dnipaci;
        this.fechNacipaci = fechNacipaci;
        this.sexopaci = sexopaci;
        this.telfpaci = telfpaci;
        this.correopaci = correopaci;
        this.cod_ubigeo = cod_ubigeo;
        this.descripcionUbi = descripcionUbi;
    }

    public int getCod_paci() {
        return cod_paci;
    }

    public void setCod_paci(int cod_paci) {
        this.cod_paci = cod_paci;
    }

    public String getNombrepaci() {
        return nombrepaci;
    }

    public void setNombrepaci(String nombrepaci) {
        this.nombrepaci = nombrepaci;
    }

    public String getApepaci() {
        return apepaci;
    }

    public void setApepaci(String apepaci) {
        this.apepaci = apepaci;
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

    public String getDnipaci() {
        return dnipaci;
    }

    public void setDnipaci(String dnipaci) {
        this.dnipaci = dnipaci;
    }

    public String getFechNacipaci() {
        return fechNacipaci;
    }

    public void setFechNacipaci(String fechNacipaci) {
        this.fechNacipaci = fechNacipaci;
    }

    public String getSexopaci() {
        return sexopaci;
    }

    public void setSexopaci(String sexopaci) {
        this.sexopaci = sexopaci;
    }

    public String getTelfpaci() {
        return telfpaci;
    }

    public void setTelfpaci(String telfpaci) {
        this.telfpaci = telfpaci;
    }

    public String getCorreopaci() {
        return correopaci;
    }

    public void setCorreopaci(String correopaci) {
        this.correopaci = correopaci;
    }

    public String getCod_ubigeo() {
        return cod_ubigeo;
    }

    public void setCod_ubigeo(String cod_ubigeo) {
        this.cod_ubigeo = cod_ubigeo;
    }

    public String getDescripcionUbi() {
        return descripcionUbi;
    }

    public void setDescripcionUbi(String descripcionUbi) {
        this.descripcionUbi = descripcionUbi;
    }
    
}
