package Modelo;

public class Cliente {
    int id;
    String dpi;
    String nom;
    String dir;
    String es;

    public Cliente() {
    }

    public Cliente(int id, String dpi, String nom, String dir, String es) {
        this.id = id;
        this.dpi = dpi;
        this.nom = nom;
        this.dir = dir;
        this.es = es;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDPI() {
        return dpi;
    }

    public void setDPI(String dpi) {
        this.dpi = dpi;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getEs() {
        return es;
    }

    public void setEs(String es) {
        this.es = es;
    }
    
    
}
