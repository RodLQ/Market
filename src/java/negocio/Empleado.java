
package negocio;

public class Empleado {
    private String cod,nom,tip,usu,pas;

    public Empleado() {
    }
    
    public Empleado(String cod, String nom, String tip, String usu, String pas) {
        this.cod = cod;
        this.nom = nom;
        this.tip = tip;
        this.usu = usu;
        this.pas = pas;
    }

    public String getCod() {
        return cod;
    }

    public String getNom() {
        return nom;
    }

    public String getTip() {
        return tip;
    }

    public String getUsu() {
        return usu;
    }

    public String getPas() {
        return pas;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public void setUsu(String usu) {
        this.usu = usu;
    }

    public void setPas(String pas) {
        this.pas = pas;
    }
    
}
