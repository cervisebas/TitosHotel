
package titoshotel.Models.Entities;

public class Habitaciones {
    private Integer id;
    private Integer numero;
    private Integer camasSimples;
    private Integer camasDobles;
    private Double precio;
    
    
    public Habitaciones() {}
    public Habitaciones(Integer numero, Integer camasSimples, Integer camasDobles, Double precio){
        this.numero = numero;
        this.camasSimples = camasSimples;
        this.camasDobles = camasDobles;
        this.precio = precio;
    }

    public Integer getId() {
        return id;
    }

    public Integer getNumero() {
        return numero;
    }

    public Integer getCamasSimples() {
        return camasSimples;
    }

    public Integer getCamasDobles() {
        return camasDobles;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setCamasSimples(Integer camasSimples) {
        this.camasSimples = camasSimples;
    }

    public void setCamasDobles(Integer camasDobles) {
        this.camasDobles = camasDobles;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Habitaciones{" + "id=" + id + ", numero=" + numero + ", camasSimples=" + camasSimples + ", camasDobles=" + camasDobles + ", precio=" + precio + '}';
    }
    
}
