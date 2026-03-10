package titoshotel.Controllers;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;
import titoshotel.Models.Entities.Disponibilidad;
import titoshotel.Models.Entities.Habitacion;
import titoshotel.Models.Entities.Reserva;

/**
 * Controller para administrar la disponibilidad de las habitaciones
 */
public class DisponibilidadController {

    private HabitacionController habitacionController;
    private ReservaController reservaController;

    public DisponibilidadController() {
        this.habitacionController = new HabitacionController();
        this.reservaController = new ReservaController();
    }

    /**
     * Metodo que retorna una lista de habitaciones disponibles en un rango de
     * fechas
     * 
     * @param fechaDesde Fecha desde la cual se quiere consultar la disponibilidad
     * @param fechaHasta Fecha hasta la cual se quiere consultar la disponibilidad
     * @return Lista de habitaciones disponibles en el rango de fechas
     */
    public List<Disponibilidad> getDisponibilidad(Date fechaDesde, Date fechaHasta) {
        List<Disponibilidad> disponibles = new ArrayList<>();

        List<Habitacion> todasLasHabitaciones = habitacionController.getAll();
        List<Reserva> todasLasReservas = reservaController.getAll();

        for (Habitacion h : todasLasHabitaciones) {
            boolean ocupada = false;

            for (Reserva r : todasLasReservas) {
                if (r.getOHabitacion() != null && r.getOHabitacion().getId().equals(h.getId())) {
                    if (fechaDesde.before(r.getFechaHasta()) && fechaHasta.after(r.getFechaDesde())) {
                        ocupada = true;
                        break;
                    }
                }
            }

            if (!ocupada) {
                Disponibilidad d = new Disponibilidad(h, fechaDesde, fechaHasta);
                disponibles.add(d);
            }
        }

        return disponibles;
    }

    /**
     * Metodo que retorna si una habitacion esta disponible en un rango de fechas
     * 
     * @param h          Habitacion a consultar
     * @param fechaDesde Fecha desde la cual se quiere consultar la disponibilidad
     * @param fechaHasta Fecha hasta la cual se quiere consultar la disponibilidad
     * @return Retorna una valor booleano que indica si la habitacion esta
     *         disponible o no
     */
    public Boolean isDisponible(Habitacion h, Date fechaDesde, Date fechaHasta) {
        List<Reserva> todasLasReservas = reservaController.getAll();

        for (Reserva r : todasLasReservas) {
            if (r.getOHabitacion() != null && r.getOHabitacion().getId().equals(h.getId())) {

                if (fechaDesde.before(r.getFechaHasta()) && fechaHasta.after(r.getFechaDesde())) {
                    return false;
                }
            }
        }

        return true;
    }
}
