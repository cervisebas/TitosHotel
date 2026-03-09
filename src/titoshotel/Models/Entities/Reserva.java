package titoshotel.Models.Entities;

import java.util.Date;

public class Reserva {
    public Integer Id;
    public Integer Numero;
    public Date FechaDesde;
    public Date FechaHasta;

    public Habitacion oHabitacion;
    public Pasajero oPasajero;

    public Float Precio;
    public Float Anticipo;

    public Reserva() {
    }

    public Reserva(Integer id, Integer numero, Date fechaDesde, Date fechaHasta, Habitacion oHabitacion,
            Pasajero oPasajero, Float precio, Float anticipo) {
        this.Id = id;
        this.Numero = numero;
        this.FechaDesde = fechaDesde;
        this.FechaHasta = fechaHasta;
        this.oHabitacion = oHabitacion;
        this.oPasajero = oPasajero;
        this.Precio = precio;
        this.Anticipo = anticipo;
    }

    public Integer getId() {
        return this.Id;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    public Integer getNumero() {
        return this.Numero;
    }

    public void setNumero(Integer numero) {
        this.Numero = numero;
    }

    public Date getFechaDesde() {
        return this.FechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.FechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return this.FechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.FechaHasta = fechaHasta;
    }

    public Habitacion getOHabitacion() {
        return this.oHabitacion;
    }

    public void setOHabitacion(Habitacion oHabitacion) {
        this.oHabitacion = oHabitacion;
    }

    public Pasajero getOPasajero() {
        return this.oPasajero;
    }

    public void setOPasajero(Pasajero oPasajero) {
        this.oPasajero = oPasajero;
    }

    public Float getPrecio() {
        return this.Precio;
    }

    public void setPrecio(Float precio) {
        this.Precio = precio;
    }

    public Float getAnticipo() {
        return this.Anticipo;
    }

    public void setAnticipo(Float anticipo) {
        this.Anticipo = anticipo;
    }
}
