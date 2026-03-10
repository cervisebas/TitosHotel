package titoshotel.Models.Entities;

import java.util.Date;

public class Disponibilidad {
    protected Habitacion oHabitacion;
    protected Date fechaDesde;
    protected Date fechaHasta;

    public Disponibilidad() {
    }

    public Disponibilidad(Habitacion oHabitacion, Date fechaDesde, Date fechaHasta) {
        this.oHabitacion = oHabitacion;
        this.fechaDesde = fechaDesde;
        this.fechaHasta = fechaHasta;
    }

    public Habitacion getOHabitacion() {
        return oHabitacion;
    }

    public void setOHabitacion(Habitacion oHabitacion) {
        this.oHabitacion = oHabitacion;
    }

    public Date getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(Date fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Date getFechaHasta() {
        return fechaHasta;
    }

    public void setFechaHasta(Date fechaHasta) {
        this.fechaHasta = fechaHasta;
    }
}
