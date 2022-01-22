
package negocio;

public class Cliente {
    private String codCli,nom,dir;

    public Cliente() {
    }
    
    
    public Cliente(String codCli, String nom, String dir) {
        this.codCli = codCli;
        this.nom = nom;
        this.dir = dir;
    }

    public String getCodCli() {
        return codCli;
    }

    public String getNom() {
        return nom;
    }

    public String getDir() {
        return dir;
    }

    public void setCodCli(String codCli) {
        this.codCli = codCli;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }
    
}
