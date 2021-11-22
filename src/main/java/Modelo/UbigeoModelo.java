
package Modelo;

import Bean.UbigeoBean;
import Interfaces.CRUDUbigeo;
import Util.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UbigeoModelo implements CRUDUbigeo{
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    ConexionBD cn = new ConexionBD();

    @Override
    public List listar() {
        List<UbigeoBean> listado = new ArrayList<>();
        String sql = "select * from ubigeo";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
             while (rs.next()) {
                UbigeoBean u = new UbigeoBean();
                u.setCod_ubigeo(rs.getInt("cod_ubigeo"));
                u.setDescripcionUbi(rs.getString("descripcionUbi"));
                listado.add(u);               
             }            
        } catch (Exception e) {

        }
        return listado;
    }
}
