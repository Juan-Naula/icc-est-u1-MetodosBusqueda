import controllers.MetodosBusqueda;
import models.Persona;
import views.ShowConsole;

public class App {
    public static void main(String[] args) throws Exception {
        MetodosBusqueda metodosBusqueda = new MetodosBusqueda();
        ShowConsole showConsole = new ShowConsole();

        System.out.println("Array de Personas:");
        Persona[] personas = new Persona[] {
            new Persona("Maria", 28),
            new Persona("Carlos", 35),
            new Persona("Sofia", 22),
            new Persona("Jorge", 27),
            new Persona("Lucia", 24),
        };

        showConsole.printPersonas(personas);
        Persona resultadoPer = metodosBusqueda.searchPersonByName(personas, "Juan");
        System.out.println("Resultado 1");
        showConsole.showPersonResult(resultadoPer, "Juan");
        System.out.println("Resultado 2");
        Persona resultadoPerAge = metodosBusqueda.searchPersonByAgeAndImpar(personas, 25);
        showConsole.showPersonResultAge(resultadoPerAge, 25);
        





    }
}
