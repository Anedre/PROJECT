package pe.edu.upc.tfsafeport.entities;


import javax.persistence.*;

@Entity
@Table(name ="Viaje")
public class Viaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idViaje;

    @Column(name = "fecha", length = 30, nullable = false)
    private int fecha;

    @Column(name = "horarinicio", length = 30, nullable = false)
    private String horainicio;

    @Column(name = "horafin", length = 25, nullable = false)
    private String horafin;

    public Viaje() {
    }

    public Viaje(int idViaje, int fecha, String horainicio, String horafin) {
        this.idViaje = idViaje;
        this.fecha = fecha;
        this.horainicio = horainicio;
        this.horafin = horafin;
    }

    public int getIdViaje() {
        return idViaje;
    }

    public void setIdViaje(int idViaje) {
        this.idViaje = idViaje;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getHorainicio() {
        return horainicio;
    }

    public void setHorainicio(String horainicio) {
        this.horainicio = horainicio;
    }

    public String getHorafin() {
        return horafin;
    }

    public void setHorafin(String horafin) {
        this.horafin = horafin;
    }
}
