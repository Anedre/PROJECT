package pe.edu.upc.tfsafeport.entities;


import javax.persistence.*;

@Entity
@Table(name = "Ubicacion")
public class Ubicacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "hora", length = 10, nullable = false)
    private int hora;
    @Column(name = "distrito", length = 50, nullable = false)
    private String distrito;

    public Ubicacion() {
    }

    public Ubicacion(int id, int hora, String distrito) {
        Id = id;
        this.hora = hora;
        this.distrito = distrito;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
}
