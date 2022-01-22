
package servicio;

import java.util.List;
import negocio.Proveedor;
import persistencia.ProveedorDao;
import persistencia.ProveedorDaoImp;

public class ProveedorServicioImp implements ProveedorServicio{
    private ProveedorDao proDao;
    public ProveedorServicioImp() {
        proDao=new ProveedorDaoImp();
    }
    
    @Override
    public String grabar(String codPro,String nom,String dir){
        Proveedor prov=new Proveedor(codPro,nom,dir);
        String msg= proDao.grabar(prov);
        if(msg==null){
            msg="Proveedor Grabado";
        }
        return msg;
    }

    @Override
    public Object[] validar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] buscar(String cod) {
        Proveedor pro=proDao.buscar(cod);
        if(pro!=null){
            Object[]fil=new Object[3];
            fil[0]=pro.getCodPro();
            fil[1]=pro.getNom();
            fil[2]=pro.getDir();
            return fil;
        }
        return null;
    }

    @Override
    public List listar() {
        return proDao.listar();
    }

    @Override
    public String eliminar(String cod) {
        return proDao.eliminar(cod);
    }
}
