package pe.edu.upc.tfsafeport.entities;


import javax.persistence.*;


@Entity
@Table(name = "Conductor")

public class Conductor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idConductor;

    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;

    @Column(name = "apellido", length = 40, nullable = false)
    private String apellido;

    @Column(name = "dni", length = 8, nullable = false)
    private int dni;
    @Column(name = "genero", length = 1, nullable = false)
    private String genero;
    @Column(name = "edad", length = 3, nullable = false)
    private int edad;
    @Column(name = "tiempoconduccion", length = 3, nullable = false)
    private int tiempoconduccion;
    @Column(name = "direccion", length = 50, nullable = false)
    private String direccion;
    @Column(name = "verificado", length = 3, nullable = false)
    private String verificado;

    public Conductor() {

    }

    public Conductor(int id, String nombre, String apellido, int dni, String genero, int edad, int tiempoconduccion, String direccion, String verificado) {
        this.idConductor = idConductor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.genero = genero;
        this.edad = edad;
        this.tiempoconduccion = tiempoconduccion;
        this.direccion = direccion;
        this.verificado = verificado;
    }

    public int getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(int idConductor) {
        this.idConductor = idConductor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTiempoconduccion() {
        return tiempoconduccion;
    }

    public void setTiempoconduccion(int tiempoconduccion) {
        this.tiempoconduccion = tiempoconduccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getVerificado() {
        return verificado;
    }

    public void setVerificado(String verificado) {
        this.verificado = verificado;
    }
}
