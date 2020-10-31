
package Modelo;

public class Empleado {
    int id;
    String dpi;
    String nom;
    String tel;
    String estado;
    String usuario;

    public Empleado() {
    }

    public Empleado(int id, String dpi, String nom, String tel, String estado, String usuario) {
        this.id = id;
        this.dpi = dpi;
        this.nom = nom;
        this.tel = tel;
        this.estado = estado;
        this.usuario = usuario;
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

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getUser() {
        return usuario;
    }

    public void setUser(String usuario) {
        this.usuario = usuario;
    }

    
}
