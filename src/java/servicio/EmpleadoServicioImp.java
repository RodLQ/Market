
package servicio;

import java.util.List;
import negocio.Empleado;
import persistencia.EmpleadoDao;
import persistencia.EmpleadoDaoImp;

public class EmpleadoServicioImp implements EmpleadoServicio {
    private EmpleadoDao empDao;

    public EmpleadoServicioImp() {
        empDao=new EmpleadoDaoImp();
    }
    @Override 
    public String grabar(String cod,String nom,String tip,String usu,String pas){
        
        Empleado emp=new Empleado(cod,nom,tip,usu,pas);
        
        String msg=empDao.grabar(emp);
        if(msg==null){
            msg="Empleado Grabadoo";
        }
        return msg;
    }
    @Override
    public Object[]validar(String usu, String pas){
        Empleado emp=empDao.validar(usu, pas);
        if(emp!=null){
            Object[]fil=new Object[2];
            fil[0]=emp.getCod();
            fil[1]=emp.getNom();
            return fil;
        }
        return null;
    }

    @Override
    public Object[] buscar(String cod) {
        Empleado emp=empDao.buscar(cod);
        if(emp!=null){
            Object[]fil=new Object[3];
            fil[0]=emp.getCod();
            fil[1]=emp.getNom();
            fil[2]=emp.getTip();
            return fil;
        }
        return null;
    }

    @Override
    public List listar() {
        return empDao.listar();
    }

    @Override
    public String eliminar(String cod) {
        return empDao.eliminar(cod);
    }
    
}
