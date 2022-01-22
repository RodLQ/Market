
package persistencia;

import java.util.List;
import negocio.Cliente;

public class ClienteDaoImp implements ClienteDao{
    @Override
    public String grabar(Cliente cli){
        String sql="insert into cliente values('"+cli.getCodCli()+"','"+cli.getNom()+"','"+cli.getDir()+"')";
        String msg=Operacion.ejecutar(sql);
        return msg;
    }

    @Override
    public Cliente validar(String usu, String pas) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cliente buscar(String cod) {
        String sql="select * from cliente where codcli='"+cod+"'";
        Object[]fil=Operacion.buscar(sql);
        if(fil!=null){
            Cliente cli=new Cliente();
            
            cli.setCodCli(fil[0].toString());
            cli.setNom(fil[1].toString());
            cli.setDir(fil[2].toString());
            return cli;
        }
        return null;
    }

    @Override
    public String actualizar(String dir, String nom, String cod) {
        String sql="update cliente set dir='"+dir+"' , nom='"+nom+"' where codcli='"+cod+"'";
        return Operacion.ejecutar(sql);
    }

    @Override
    public String eliminar(String cod) {
        String sql="delete from cliente where codcli='"+cod+"'";
        return Operacion.ejecutar(sql);
    }

    @Override
    public List listar() {
        String sql="select * from cliente";
        List lis=Operacion.listar(sql);
        if(lis!=null){
            return lis;
        }
        return null;
    }
}
