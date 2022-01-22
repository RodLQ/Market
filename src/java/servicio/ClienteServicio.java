
package servicio;

import java.util.List;

public interface ClienteServicio {
    public String grabar(String cod, String nom,String dir);
    public Object[]validar();
    public Object[]buscar(String cod);
    public List listar();
    public String eliminar(String cod);
}
