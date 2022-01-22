
package servicio;

import java.util.List;
import negocio.Cliente;
import persistencia.ClienteDao;
import persistencia.ClienteDaoImp;

public class ClienteServicioImp implements ClienteServicio{
    
    private ClienteDao cliDao;

    public ClienteServicioImp() {
        cliDao=new ClienteDaoImp();
    }
    
    @Override
    public  String grabar(String codCli,String nom,String dir){
        Cliente cli=new Cliente(codCli,nom,dir);
        String msg= cliDao.grabar(cli);
        if(msg==null){
            msg="Cliente Grabado";
        }
        return msg;
    }

    @Override
    public Object[] validar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] buscar(String cod) {
        Cliente cli=cliDao.buscar(cod);
        if(cli!=null){
            Object[]fil=new Object[3];
            fil[0]=cli.getCodCli();
            fil[1]=cli.getNom();
            fil[2]=cli.getDir();
            return fil;
        }
        return null;
    }

    @Override
    public List listar() {
        return cliDao.listar();
    }

    @Override
    public String eliminar(String cod) {
        return cliDao.eliminar(cod);
    }
    
}
