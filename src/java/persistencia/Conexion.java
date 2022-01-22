
package persistencia;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    public Connection getConexion(){
        Connection cn=null;
        //control de excepcion
        try{
            //llamar al puente, JBC
            //puente derby
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            //crear la conexion
            cn=DriverManager.getConnection("jdbc:derby://localhost:1527/SupermercadoLoayza193791","rodrigo","rodrigo");
        }catch(Exception e){
            //si se produce un error
            cn=null;
        }
        
        return cn;
    }
}
