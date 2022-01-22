
package servicio;

import java.sql.Connection;
import persistencia.Conexion;

public class Prueba {
    public static void main(String[] args){
        Conexion con=new Conexion();
        Connection cn=con.getConexion();
        if(cn!=null){
           System.out.println("Si hay conexion");
        }
        else{
            System.out.println("No hay conexion");
        }
    }   
}
