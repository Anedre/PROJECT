package pe.edu.upc.tfsafeport.entities;

import javax.persistence.*;

@Entity
@Table(name = "Padredefamilia")
public class Padredefamilia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name = "nombre", length = 50, nullable = false)
    private String nombre;
    @Column(name = "apellido", length = 50, nullable = false)
    private String apellido;
    @Column(name = "edad", length = 3, nullable = false)
    private int edad;
    @Column(name = "email", length = 30, nullable = false)
    private String email;
    @Column(name = "telefono", length = 9, nullable = false)
    private int telefono;
    @Column(name = "direccion", length = 50, nullable = false)
    private String direccion;

    public Padredefamilia() {
    }

    public Padredefamilia(int id, String nombre, String apellido, int edad, String email, int telefono, String direccion) {
        Id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
