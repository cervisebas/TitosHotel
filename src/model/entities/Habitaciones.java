
package model.entities;




public class Habitaciones {
    private long id;
    private long numero;
    private String camasSimples;
    private String camasDobles;
    private float precio;
    
    
    public Habitaciones (Long id, Long numero, String camasSimples, String camasDobles, float precio){
        
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

    public String getCamasSimples() {
        return camasSimples;
    }

    public String getCamasDobles() {
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

    public void setCamasSimples(String camasSimples) {
        this.camasSimples = camasSimples;
    }

    public void setCamasDobles(String camasDobles) {
        this.camasDobles = camasDobles;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
}
