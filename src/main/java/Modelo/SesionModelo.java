
package Modelo;

import Bean.PacienteBean;
import Util.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SesionModelo {
    
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    ConexionBD cn = new ConexionBD();
    int res;
    String msj;
    
    public int validarPaciente(PacienteBean objPacienteBean){
        int val=0;
        try {
            con = cn.getConnection();
            ps = con.prepareStatement("select count(*) from paciente where usuario=? and contraseña=?");
            ps.setString(1, objPacienteBean.getUsuario());
            ps.setString(2, objPacienteBean.getContraseña());
            rs=ps.executeQuery();
            if(rs.next())
            { val=rs.getInt(1);
            }
            ps.close();
            rs.close();
            con.close();
        } catch (Exception e) {
            
        }
        return val;
    }

}
