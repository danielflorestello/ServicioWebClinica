
package Interfaces;

import Bean.PacienteBean;
import java.util.List;

public interface CRUDPaciente {
    public List listar();
    public PacienteBean listarID(int cod_paci);
    public String add(String nombrepaci, String apepaci, String usuario, String contraseña, String dnipaci, String fechNacipaci, String sexopaci, String telfpaci, String correopaci, String cod_ubigeo);
    public String edit(int cod_paci, String nombrepaci, String apepaci, String usuario, String contraseña, String dnipaci, String fechNacipaci, String sexopaci, String telfpaci, String correopaci, String cod_ubigeo);
    public PacienteBean delete(int cod_paci);
}
