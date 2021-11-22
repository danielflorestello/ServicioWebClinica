
package Modelo;

import Bean.PacienteBean;
import Interfaces.CRUDPaciente;
import Util.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class PacienteModelo implements CRUDPaciente{
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    ConexionBD cn = new ConexionBD();
    int res;
    String msj;
    
    @Override
    public List listar() {
        List<PacienteBean> listado = new ArrayList<>();
        String sql = "select P.cod_paci, P.nombrepaci,P.apepaci, P.usuario, P.contraseña, P.dnipaci, P.fechNacipaci, \n"
                + "P.sexopaci, P.telfpaci, P.correopaci, P.cod_ubigeo, U.descripcionUbi \n"
                + "from paciente P \n"
                + "inner join ubigeo U on U.cod_ubigeo = P.cod_ubigeo";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
             while (rs.next()) {
                PacienteBean p = new PacienteBean();
                p.setCod_paci(rs.getInt("cod_paci"));
                p.setNombrepaci(rs.getString("nombrepaci"));
                p.setApepaci(rs.getString("apepaci"));
                p.setUsuario(rs.getString("usuario"));
                p.setContraseña(rs.getString("contraseña"));
                p.setDnipaci(rs.getString("dnipaci"));
                p.setFechNacipaci(rs.getString("fechNacipaci"));
                p.setSexopaci(rs.getString("sexopaci"));
                p.setTelfpaci(rs.getString("telfpaci"));
                p.setCorreopaci(rs.getString("correopaci"));
                p.setCod_ubigeo(rs.getString("cod_ubigeo"));
                p.setDescripcionUbi(rs.getString("descripcionUbi"));
                listado.add(p);               
             }            
        } catch (Exception e) {

        }
        return listado;
    }
    
    @Override
    public String add(String nombrepaci, String apepaci, String usuario, String contraseña, String dnipaci, String fechNacipaci, String sexopaci, String telfpaci, String correopaci, String cod_ubigeo) {
        String sql = "insert into paciente(nombrepaci, apepaci, usuario, contraseña, dnipaci, fechNacipaci, sexopaci, telfpaci, correopaci, cod_ubigeo) values(?,?,?,?,?,?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, nombrepaci);
            ps.setString(2, apepaci);
            ps.setString(3, usuario);
            ps.setString(4, contraseña);
            ps.setString(5, dnipaci);
            ps.setString(6, fechNacipaci);
            ps.setString(7, sexopaci);
            ps.setString(8, telfpaci);
            ps.setString(9, correopaci);
            ps.setString(10, cod_ubigeo);
            res = ps.executeUpdate();
            
            if (res==1) {
                msj="Datos agregados";
            }else{
                msj="Error";
            }
        } catch (Exception e) {
        }
        return msj;
    }

    @Override
    public PacienteBean listarID(int cod_paci) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String edit(int cod_paci, String nombrepaci, String apepaci, String usuario, String contraseña, String dnipaci, String fechNacipaci, String sexopaci, String telfpaci, String correopaci, String cod_ubigeo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PacienteBean delete(int cod_paci) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
