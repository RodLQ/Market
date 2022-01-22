
package persistencia;

import negocio.Compra;

public class CompraDaoImp implements CompraDao{

    @Override
    public String grabar(Compra c) {
        String sql="insert into compra values ('"+c.getNum()+"','"+c.getFec()+"',"+c.getTot()+",'"+c.getPro().getCodPro()+"','"+c.getEmp().getCod()+"')";
        return Operacion.ejecutar(sql);
    }
    
}
