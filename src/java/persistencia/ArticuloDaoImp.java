
package persistencia;

import java.util.List;
import negocio.Articulo;

public class ArticuloDaoImp implements ArticuloDao{

    @Override
    public String grabar(Articulo art) {
        String sql="insert into articulo values('"+art.getCod()+"','"+art.getNom()+"',"+art.getPre()+","+art.getSto()+")";
        String msg=Operacion.ejecutar(sql);
        return msg;
    }

    @Override
    public Articulo validar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Articulo buscar(String cod) {
        String sql="select * from articulo where cod='"+cod+"'";
        Object[]fil=Operacion.buscar(sql);
        if(fil!=null){
            Articulo art=new Articulo();
            
            art.setCod(fil[0].toString());
            art.setNom(fil[1].toString());
            art.setPre((double) fil[2]);
            art.setSto((int) fil[3]);
            
            return art;
        }
        return null;
    }

    @Override
    public String actualizar(String cod, String nom, Double pre, Integer sto) {
        String sql="update articulo set nom='"+nom+"' , pre="+pre+" , sto="+sto+" where cod='"+cod+"'";
        return Operacion.ejecutar(sql);
    }

    @Override
    public String eliminar(String cod) {
        String sql="delete from articulo where cod='"+cod+"'";
        return Operacion.ejecutar(sql);
    }

    @Override
    public List listar() {
        String sql="select * from articulo";
        List lis=Operacion.listar(sql);
        if(lis!=null){
            return lis;
        }
        return null;
        //todo el codigo en una linea
        //return Operacion.Listar("select * from articulo"w);
    }
    
}
