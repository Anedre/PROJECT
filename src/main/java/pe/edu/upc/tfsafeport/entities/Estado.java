package pe.edu.upc.tfsafeport.entities;


import javax.persistence.*;

@Entity
@Table(name = "Estado")
public class Estado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstado;
    @Column(name = "direccionPartida", length = 100, nullable = false)
    private String direccionPartida;
    @Column(name = "direccionLlegada", length = 100, nullable = false)
    private String direccionLlegada;
    @Column(name = "duracion", length = 10, nullable = false)
    private int duracion;
    @Column(name = "comentario", length = 250, nullable = false)
    private String comentario;

    public Estado() {
    }

    public Estado(int idEstado, String direccionPartida, String direccionLlegada, int duracion, String comentario) {
        this.idEstado = idEstado;
        this.direccionPartida = direccionPartida;
        this.direccionLlegada = direccionLlegada;
        this.duracion = duracion;
        this.comentario = comentario;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public String getDireccionPartida() {
        return direccionPartida;
    }

    public void setDireccionPartida(String direccionPartida) {
        this.direccionPartida = direccionPartida;
    }

    public String getDireccionLlegada() {
        return direccionLlegada;
    }

    public void setDireccionLlegada(String direccionLlegada) {
        this.direccionLlegada = direccionLlegada;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
}
