package titoshotel.Models.Entities;

public class Pasajero {
    protected Integer Id;
    protected String Nombre;
    protected String Apellido;
    protected Long Telefono;
    protected Integer Dni;

    public Pasajero() {
    }

    public Pasajero(Integer id, String nombre, String apellido, Long telefono, Integer dni) {
        this.Id = id;
        this.Nombre = nombre;
        this.Apellido = apellido;
        this.Telefono = telefono;
        this.Dni = dni;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        this.Apellido = apellido;
    }

    public Long getTelefono() {
        return Telefono;
    }

    public void setTelefono(Long telefono) {
        this.Telefono = telefono;
    }

    public Integer getDni() {
        return Dni;
    }

    public void setDni(Integer dni) {
        this.Dni = dni;
    }
}
