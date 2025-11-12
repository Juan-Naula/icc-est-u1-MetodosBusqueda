package controllers;

import models.Persona;
import views.ShowConsole;

public class MetodosBusqueda {

    private int[] arreglo;
    private ShowConsole showConsole;
    public MetodosBusqueda(){
        this.arreglo = new int[] {10, 11, 2, 5, 6 ,8, 15, 22} ;
        this.showConsole = new ShowConsole() ;
        showConsole.printArray(arreglo);
        int result1 = busquedaLineal(5);
        int result2 = busquedaLinealWhile(2);
        int result3 = busquedaLinealWhile(20);
        Integer result4 = busquedaLinealObj(10);
        Integer result5 = busquedaLinealObj(100);

        System.out.println("Estudiante: Juan Naula");
        System.out.println("Resultado 1");
        showConsole.printResult(result1, 5);
        System.out.println("Resultado 2");
        showConsole.printResult(result2, 2);
        System.out.println("Resultado 3");
        showConsole.printResult(result3, 20);
        System.out.println("Resultado 4");
        showConsole.printResult(result4);
        System.out.println("Resultado 5");
        showConsole.printResult(result5);
    }   

    public int busquedaLineal(int numeroBuscar){
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i]==numeroBuscar) {
                return i;
            }
        }
        return -1;
    }

    public int busquedaLinealWhile(int numeroBuscar){
        int i = 0;
        while (i < arreglo.length) {
            if (arreglo[i]==numeroBuscar) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public Integer busquedaLinealObj(int numeroBuscar){
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i]==numeroBuscar) {
                return i; 
            }
        }
        return null;
    }

    public Persona searchPersonByName(Persona[] personas, String name) {
        for (Persona persona : personas) {
            if (persona.getName().equals(name)) {
                return persona;
            }
        }
        return null;
    }
    
    public Persona searchPersonByAgeAndImpar(Persona[] personas, int age) {
        for (Persona persona : personas) {
            if (persona.getAge() > age && persona.getAge() % 2 == 1) {
                return persona;
            }
        }
        return null;
    }

    public Persona searchPersonByValueName(Persona[] personas, int i){
        

        return null;
    }

}
