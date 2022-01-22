
package negocio;
// la linea de pedido seria parte del carrito de compras
//un carrito de compras tiene varias lineas
public class Articulo {
    private String cod, nom;
    private double pre;
    private int sto;

    public Articulo() {
    }
    
    public Articulo(String cod, String nom, double pre, int sto) {
        this.cod = cod;
        this.nom = nom;
        this.pre = pre;
        this.sto = sto;
    }

    public Articulo(String cod, String nom, double pre) {
        this.cod = cod;
        this.nom = nom;
        this.pre = pre;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getPre() {
        return pre;
    }

    public void setPre(double pre) {
        this.pre = pre;
    }

    public int getSto() {
        return sto;
    }

    public void setSto(int sto) {
        this.sto = sto;
    }
    
    
    
}
