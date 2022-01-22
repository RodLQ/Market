
package servicio;

import java.util.List;

public interface CompraServicio {
    public Object[] nuevoPedido(String cod);
    public List agregarArticulo(String cod, String nom,String pre,String can);
    public List quitarArticulo(String cod);
    public List ListarArticulos();
    public Object[] BuscarProveedor(String codPro);
    public String grabarCompra(String codPro);
}
