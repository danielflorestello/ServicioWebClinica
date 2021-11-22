
package WS;

import Bean.PacienteBean;
import Bean.UbigeoBean;
import Modelo.PacienteModelo;
import Modelo.SesionModelo;
import Modelo.UbigeoModelo;
import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "Servicios")
public class Servicios {
    PacienteModelo pdao = new PacienteModelo();
    UbigeoModelo udao = new UbigeoModelo();
    SesionModelo pm = new SesionModelo();
    
    @WebMethod(operationName = "listar")    
    public List<PacienteBean> listarPaciente() {
        List datos = pdao.listar();
        return datos;
    }
    
    @WebMethod(operationName = "agregar")    
    public String agregar(
            @WebParam(name = "nombrepaci") String nombrepaci, @WebParam(name = "apepaci") String apepaci, 
            @WebParam(name = "usuario") String usuario, @WebParam(name = "contraseña") String contraseña, 
            @WebParam(name = "dnipaci") String dnipaci, @WebParam(name = "fechNacipaci") String fechNacipaci,
            @WebParam(name = "sexopaci") String sexopaci, @WebParam(name = "telfpaci") String telfpaci,
            @WebParam(name = "correopaci") String correopaci, @WebParam(name = "cod_ubigeo") String cod_ubigeo
    ) {
        String datos = pdao.add(nombrepaci, apepaci, usuario, contraseña, dnipaci, fechNacipaci, sexopaci, telfpaci, correopaci, cod_ubigeo);
        return datos;
    }
    
    @WebMethod(operationName = "validar")
    public int validarPaciente(@WebParam(name = "usuario") PacienteBean objPacienteBean, @WebParam(name = "contraseña") PacienteBean ObjPacienteBean) {
        int paciente = pm.validarPaciente(objPacienteBean);
        return paciente;
    }
    
    @WebMethod(operationName = "listarUbigeo")    
    public List<UbigeoBean> listarUbigeo() {
        List datos = udao.listar();
        return datos;
    }
}
