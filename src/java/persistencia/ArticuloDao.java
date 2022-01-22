
package persistencia;

import java.util.List;
import negocio.Articulo;

public interface ArticuloDao {
    public String grabar(Articulo art);
    public Articulo validar();
    public Articulo buscar(String cod);
    public String actualizar(String cod,String nom,Double pre,Integer sto);
    public String eliminar(String cod);
    public List listar();   
}
