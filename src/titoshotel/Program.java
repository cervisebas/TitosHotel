
package titoshotel;

import titoshotel.Models.DAO.HabitacionesDAO;
import titoshotel.Models.Entities.Habitaciones;
import titoshotel.Views.HabitacionesView;

public class Program {

    public static void main(String[] args) {
        HabitacionesDAO habitacionesDAO = new HabitacionesDAO();

        /* Habitaciones habitaciones = new Habitaciones();
        habitaciones.setNumero(26);
        habitaciones.setCamasSimples(1);
        habitaciones.setCamasDobles(1);
        habitaciones.setPrecio(20.2);

        habitacionesDAO.save(habitaciones); */

        (new HabitacionesView()).setVisible(true);
    }
    
}
