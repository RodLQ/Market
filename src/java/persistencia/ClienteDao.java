
package persistencia;

import java.util.List;
import negocio.Cliente;

public interface ClienteDao {
    public String grabar(Cliente cli);
    public Cliente validar(String usu, String pas);
    public Cliente buscar(String cod);
    public String actualizar(String dir, String nom, String cod);
    public String eliminar(String cod);
    public List listar();
}
