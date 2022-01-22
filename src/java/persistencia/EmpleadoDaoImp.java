
package persistencia;

import java.util.List;
import negocio.Empleado;

public class EmpleadoDaoImp implements EmpleadoDao {
    @Override
    public String grabar(Empleado emp){
        
        String sql="insert into empleado values('"+emp.getCod()+"','"+emp.getNom()+"','"+emp.getTip()+"','"+emp.getUsu()+"','"+emp.getPas()+"')";
        return Operacion.ejecutar(sql);
    }

    @Override
    public Empleado validar(String usu, String pas) {
        String sql="select * from empleado where usu like '"+usu+"' and pas like '"+pas+"' ";
        Object[]fil=Operacion.buscar(sql);
        if(fil!=null){
            Empleado emp=new Empleado();
            emp.setCod(fil[0].toString());
            emp.setNom(fil[1].toString());
            emp.setTip(fil[2].toString());
            emp.setUsu(fil[3].toString());
            emp.setPas(fil[4].toString());
            return emp;
        }
        return null;
    }

    @Override
    public Empleado buscar(String cod) {
        String sql="select * from empleado where cod='"+cod+"'";
        Object[]fil=Operacion.buscar(sql);
        if(fil!=null){
            Empleado emp=new Empleado();
            emp.setCod(fil[0].toString());
            emp.setNom(fil[1].toString());
            emp.setTip(fil[2].toString());
            emp.setUsu(fil[3].toString());
            emp.setPas(fil[4].toString());
            return emp;
        }
        return null;
    }

    @Override
    public String actualizar(String tip, String pas, String cod) {
        String sql="update empleado set tip='"+tip+"' , pas='"+pas+"' where cod='"+cod+"'";
        return Operacion.ejecutar(sql);
    }

    @Override
    public String eliminar(String cod) {
        String sql="delete from empleado where cod='"+cod+"'";
        return Operacion.ejecutar(sql);
    }

    @Override
    public List listar() {
        String sql="select * from empleado";
        List lis=Operacion.listar(sql);
        if(lis!=null){
            return lis;
        }
        return null;
    }
}
