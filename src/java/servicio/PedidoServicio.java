//clase abstracta
package servicio;

import java.util.List;

public interface PedidoServicio {
    //casos de uso
    public Object[] nuevoPedido(String cod);
    public List agregarArticulo(String cod, String nom,String pre,String can);
    public List quitarArticulo(String cod);
    public List ListarArticulos();
    public Object[] BuscarCliente(String codCli);
    public String grabarPedido(String codcli);
}
