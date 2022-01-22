
package servicio;

import java.util.List;

public interface ArticuloServicio {
    public String grabar(String cod, String nom,double pre,int sto);
    public Object[]validar();
    public Object[]buscar(String cod);
    public List listar();
    public String Actualizar(String cod, String nom,double pre,int sto);
    public String eliminar(String cod);
}
