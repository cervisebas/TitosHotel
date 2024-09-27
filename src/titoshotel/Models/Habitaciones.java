
package titoshotel.Models;




public class Habitaciones {
    private long id;
    private long numero;
    private long camasSimples;
    private long camasDobles;
    private float precio;
    
    
    public Habitaciones (long id, long numero, long camasSimples, long camasDobles, float precio){
        
        this.id = id;
        this.numero = numero;
        this.camasSimples = camasSimples;
        this.camasDobles = camasDobles;
        this.precio = precio;
    }

    public long getId() {
        return id;
    }

    public long getNumero() {
        return numero;
    }

    public long getCamasSimples() {
        return camasSimples;
    }

    public long getCamasDobles() {
        return camasDobles;
    }

    public float getPrecio() {
        return precio;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public void setCamasSimples(long camasSimples) {
        this.camasSimples = camasSimples;
    }

    public void setCamasDobles(long camasDobles) {
        this.camasDobles = camasDobles;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
}
