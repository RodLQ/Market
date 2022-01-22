/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

/**
 *
 * @author Rodrigo
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion cn = new Conexion();
        if(cn.getConexion()==null){
            System.out.println("No hay conexion");
        }
        else{
            System.out.println("Conectado");
        }
    }
    
}
