
package negocio;

public class Proveedor {
    private String codPro,nom,dir;

    public Proveedor() {
    }
    
    public Proveedor(String codPro, String nom, String dir) {
        this.codPro = codPro;
        this.nom = nom;
        this.dir = dir;
    }

    public String getCodPro() {
        return codPro;
    }

    public String getNom() {
        return nom;
    }

    public String getDir() {
        return dir;
    }

    public void setCodPro(String codPro) {
        this.codPro = codPro;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }
    
}
