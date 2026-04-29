import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

import net.salesianoscuesta.Reparacion.Reparacion;

public class App {
    public static void main(String[] args) throws Exception {

        Queue<Reparacion> cola = new LinkedList<>();

        // añadir
        cola.add(new Reparacion("R001", "Ana", "Cambio de pantalla", false));
        cola.add(new Reparacion("R002", "Luis", "Batería dañada", true));
        cola.add(new Reparacion("R003", "Marta", "Teclado roto", false));
        cola.add(new Reparacion("R004", "Pedro", "Puerto de carga", true));

        System.out.println("--- Reparaciones pendientes ---");
        for (Reparacion r : cola) {
            System.out.println(r);
        }

        // Mostrar primera reparacion
        System.out.println("\nSiguiente cliente: " + cola.peek());

        Stack<Reparacion> historial = new Stack<>();

        historial.push(cola.poll());

        historial.push(cola.poll());

        System.out.println("\nÚltima reparación finalizada: " + historial.peek());

        Reparacion extraida = historial.pop();
        System.out.println("Se ha sacado del archivo la reparación: " + extraida.getCodigo());

         System.out.println("\nQuedan " + cola.size() + " reparaciones en la cola.");

        if (cola.isEmpty()) {
            System.out.println("¡Buen trabajo! No hay reparaciones pendientes.");
        } else {
            System.out.println("Todavía hay trabajo por hacer.");
        }

    }
}
