package pe.edu.upc.tfsafeport.entities;

import javax.persistence.*;

@Entity
@Table(name = "Solicitud")
public class Solicitud {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSolicitud;

    @Column(name = "precio", length = 10, nullable = false)
    private int precio;

    @Column(name = "fecha", length = 30, nullable = false)
    private int fecha;

    @Column(name = "descripcion", length = 250, nullable = false)
    private String descripcion;

    @Column(name = "fechainicio", length = 30, nullable = false)
    private String fechainicio;

    @Column(name = "fechafin", length = 30, nullable = false)
    private String fechafin;

    @Column(name = "nombrehijo", length = 30, nullable = false)
    private String nombrehijo;

    @Column(name = "edadhijo", length = 5, nullable = false)
    private int edadhijo;

    @Column(name = "direccioncasa", length = 100, nullable = false)
    private String direccioncasa;

    @Column(name = "direccioncolegio", length = 100, nullable = false)
    private String dirrecioncolegio;

    @Column(name ="estado", length = 10, nullable = false)
    private String estado;

    public Solicitud() {
    }

    public Solicitud(int idSolicitud, int precio, int fecha, String descripcion, String fechainicio, String fechafin, String nombrehijo, int edadhijo, String direccioncasa, String dirrecioncolegio, String estado) {
        this.idSolicitud = idSolicitud;
        this.precio = precio;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.nombrehijo = nombrehijo;
        this.edadhijo = edadhijo;
        this.direccioncasa = direccioncasa;
        this.dirrecioncolegio = dirrecioncolegio;
        this.estado = estado;
    }

    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(String fechainicio) {
        this.fechainicio = fechainicio;
    }

    public String getFechafin() {
        return fechafin;
    }

    public void setFechafin(String fechafin) {
        this.fechafin = fechafin;
    }

    public String getNombrehijo() {
        return nombrehijo;
    }

    public void setNombrehijo(String nombrehijo) {
        this.nombrehijo = nombrehijo;
    }

    public int getEdadhijo() {
        return edadhijo;
    }

    public void setEdadhijo(int edadhijo) {
        this.edadhijo = edadhijo;
    }

    public String getDireccioncasa() {
        return direccioncasa;
    }

    public void setDireccioncasa(String direccioncasa) {
        this.direccioncasa = direccioncasa;
    }

    public String getDirrecioncolegio() {
        return dirrecioncolegio;
    }

    public void setDirrecioncolegio(String dirrecioncolegio) {
        this.dirrecioncolegio = dirrecioncolegio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
