package Bean;

public class UbigeoBean {
    private int cod_ubigeo;
    private String descripcionUbi;

    public UbigeoBean() {
    }

    public UbigeoBean(int cod_ubigeo, String descripcionUbi) {
        this.cod_ubigeo = cod_ubigeo;
        this.descripcionUbi = descripcionUbi;
    }

    public int getCod_ubigeo() {
        return cod_ubigeo;
    }

    public void setCod_ubigeo(int cod_ubigeo) {
        this.cod_ubigeo = cod_ubigeo;
    }

    public String getDescripcionUbi() {
        return descripcionUbi;
    }

    public void setDescripcionUbi(String descripcionUbi) {
        this.descripcionUbi = descripcionUbi;
    }
    
}
