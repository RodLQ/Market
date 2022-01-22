/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import java.util.List;
import negocio.Articulo;
import persistencia.ArticuloDao;
import persistencia.ArticuloDaoImp;

/**
 *
 * @author PC
 */
public class ArticuloServicioImp implements ArticuloServicio{
    private ArticuloDao artDao;

    public ArticuloServicioImp() {
        artDao=new ArticuloDaoImp();
    }
    
    @Override
    public  String grabar(String cod,String nom,double pre, int sto){
        Articulo art=new Articulo(cod,nom,pre,sto);
        String msg= artDao.grabar(art);
        if(msg==null){
            msg="Articulo Grabado";
        }
        return msg;
    }

    @Override
    public Object[] validar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] buscar(String cod) {
        Articulo art=artDao.buscar(cod);
        if(art!=null){
            Object[]fil=new Object[4];
            fil[0]=art.getCod();
            fil[1]=art.getNom();
            fil[2]=art.getPre();
            fil[3]=art.getSto();
            return fil;
        }
        return null;
    }

    @Override
    public List listar() {
        return artDao.listar();
    }

    @Override
    public String Actualizar(String cod, String nom, double pre, int sto) {
        return artDao.actualizar(cod, nom, pre, sto);
    }

    @Override
    public String eliminar(String cod) {
        return artDao.eliminar(cod);
    }
    
}
