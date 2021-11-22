package Bean;

public class DiagnosticoBean {
    private int id;
    private int edad;
    private int sexo;
    private int tdp;
    private int par;
    private int cs;
    private int asa;
    private int re;
    private int fcm;
    private int aie;
    private int dst;
    private int pst;
    private int nv;
    private int thal;
    private int resultado; 
    private int id_paci;
    private String valor;
    private String nombre;
    private String nombrepaci;
    private String apepaci;

    public DiagnosticoBean() {
    }

    public DiagnosticoBean(int id, int edad, int sexo, int tdp, int par, int cs, int asa, int re, int fcm, int aie, int dst, int pst, int nv, int thal, int resultado, int id_paci, String valor, String nombre, String nombrepaci, String apepaci) {
        this.id = id;
        this.edad = edad;
        this.sexo = sexo;
        this.tdp = tdp;
        this.par = par;
        this.cs = cs;
        this.asa = asa;
        this.re = re;
        this.fcm = fcm;
        this.aie = aie;
        this.dst = dst;
        this.pst = pst;
        this.nv = nv;
        this.thal = thal;
        this.resultado = resultado;
        this.id_paci = id_paci;
        this.valor = valor;
        this.nombre = nombre;
        this.nombrepaci = nombrepaci;
        this.apepaci = apepaci;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }

    public int getTdp() {
        return tdp;
    }

    public void setTdp(int tdp) {
        this.tdp = tdp;
    }

    public int getPar() {
        return par;
    }

    public void setPar(int par) {
        this.par = par;
    }

    public int getCs() {
        return cs;
    }

    public void setCs(int cs) {
        this.cs = cs;
    }

    public int getAsa() {
        return asa;
    }

    public void setAsa(int asa) {
        this.asa = asa;
    }

    public int getRe() {
        return re;
    }

    public void setRe(int re) {
        this.re = re;
    }

    public int getFcm() {
        return fcm;
    }

    public void setFcm(int fcm) {
        this.fcm = fcm;
    }

    public int getAie() {
        return aie;
    }

    public void setAie(int aie) {
        this.aie = aie;
    }

    public int getDst() {
        return dst;
    }

    public void setDst(int dst) {
        this.dst = dst;
    }

    public int getPst() {
        return pst;
    }

    public void setPst(int pst) {
        this.pst = pst;
    }

    public int getNv() {
        return nv;
    }

    public void setNv(int nv) {
        this.nv = nv;
    }

    public int getThal() {
        return thal;
    }

    public void setThal(int thal) {
        this.thal = thal;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }

    public int getId_paci() {
        return id_paci;
    }

    public void setId_paci(int id_paci) {
        this.id_paci = id_paci;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
    
}
