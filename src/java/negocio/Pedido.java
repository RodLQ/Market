//LOGICA DE NEGOCIO
//CUALQUIER CALCULO
package negocio;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String num, fec;
    private Cliente cli;
    //en la intranet el empleado elabora el pedido
    private Empleado emp;
    //la agregacion, 
    //la cesta es parte del pedido
    //no es exclusiva
    private List ces=new ArrayList();
    
    //con void no es necesario retorno
    public void agregarLinea(Articulo art, int can){
        //composicion
        LineaPedido lin=new LineaPedido(art, can);
        //insertar datos temporales en una estructura de datos
        ces.add(lin);
    }
    public void quitarLinea(String cod){
        for(int i=0;i<ces.size();i++){
            //obtengo de cesta el objeto 
            LineaPedido lin=(LineaPedido)ces.get(i);
            //comparacion de los articulos y codigo con el cod ingresado poor el usuario
            if(lin.getArt().getCod().equals(cod)){
                ces.remove(i);
            }
        }
    }
    public double getTot(){
        double tot=0;
        for(int i=0;i<ces.size();i++){
            LineaPedido lin=(LineaPedido)ces.get(i);
            tot = tot+lin.getImp();//tot+=lin.getImp();
        }
        return tot;        
    }

    public List getCes() {
        return ces;
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

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public Empleado getEmp() {
        return emp;
    }

    public void setEmp(Empleado emp) {
        this.emp = emp;
    }
    
}
