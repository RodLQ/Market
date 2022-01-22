
package persistencia;

import java.util.List;
import negocio.Proveedor;

public class ProveedorDaoImp implements ProveedorDao{
    @Override
    public String grabar(Proveedor prov){
        String sql="insert into proveedor values('"+prov.getCodPro()+"','"+prov.getNom()+"','"+prov.getDir()+"')";
        String msg=Operacion.ejecutar(sql);
        return msg;
    }

    @Override
    public Proveedor validar(String usu, String pas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Proveedor buscar(String cod) {
        String sql="select * from proveedor where codpro='"+cod+"'";
        Object[]fil=Operacion.buscar(sql);
        if(fil!=null){
            Proveedor pro=new Proveedor();
            
            pro.setCodPro(fil[0].toString());
            pro.setNom(fil[1].toString());
            pro.setDir(fil[2].toString());
            return pro;
        }
        return null;
    }

    @Override
    public String actualizar(String dir, String nom, String cod) {
        String sql="update proveedor set dir='"+dir+"' , nom='"+nom+"' where codpro='"+cod+"'";
        return Operacion.ejecutar(sql);
    }

    @Override
    public String eliminar(String cod) {
        String sql="delete from proveedor where codpro='"+cod+"'";
        return Operacion.ejecutar(sql);
    }

    @Override
    public List listar() {
        String sql="select * from proveedor";
        List lis=Operacion.listar(sql);
        if(lis!=null){
            return lis;
        }
        return null;
    }
}
