
package persistencia;

import java.util.List;
import negocio.Proveedor;

public interface ProveedorDao {
    public String grabar(Proveedor pro);
    public Proveedor validar(String usu, String pas);
    public Proveedor buscar(String cod);
    public String actualizar(String dir, String nom, String cod);
    public String eliminar(String cod);
    public List listar();
}
