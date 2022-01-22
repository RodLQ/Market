
package negocio;

import java.util.ArrayList;
import java.util.List;

public class Compra {
    private String num, fec;
    private Proveedor pro;
    
    private Empleado emp;
    
    private List ces=new ArrayList();
    
    public void agregarLinea(Articulo art, int can){
        //composicion
        LineaCompra lin=new LineaCompra(art, can);
        //insertar datos temporales en una estructura de datos
        ces.add(lin);
    }    
    public void quitarLinea(String cod){
        for(int i=0;i<ces.size();i++){
            //obtengo de cesta el objeto 
            LineaCompra lin=(LineaCompra)ces.get(i);
            //comparacion de los articulos y codigo con el cod ingresado poor el usuario
            if(lin.getArt().getCod().equals(cod)){
                ces.remove(i);
            }
        }
    }
    public double getTot(){
        double tot=0;
        for(int i=0;i<ces.size();i++){
            LineaCompra lin=(LineaCompra)ces.get(i);
            tot = tot+lin.getImp();//tot+=lin.getImp();
        }
        return tot;        
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getFec() {
        return fec;
    }

    public void setFec(String fec) {
        this.fec = fec;
    }

    public Proveedor getPro() {
        return pro;
    }

    public void setPro(Proveedor pro) {
        this.pro = pro;
    }

    public Empleado getEmp() {
        return emp;
    }

    public void setEmp(Empleado emp) {
        this.emp = emp;
    }

    public List getCes() {
        return ces;
    }

    public void setCes(List ces) {
        this.ces = ces;
    }
    
    
}
