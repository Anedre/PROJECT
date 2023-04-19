package pe.edu.upc.tfsafeport.entities;

import javax.persistence.*;

@Entity
@Table(name = "Historialviaje")
public class Historialviaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHistorial;

    @Column(name = "observaciones", length = 250, nullable = false)
    private String observaciones;

    public Historialviaje() {
    }

    public Historialviaje(int idHistorial, String observaciones) {
        this.idHistorial = idHistorial;
        this.observaciones = observaciones;
    }

    public int getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(int idHistorial) {
        this.idHistorial = idHistorial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
}
