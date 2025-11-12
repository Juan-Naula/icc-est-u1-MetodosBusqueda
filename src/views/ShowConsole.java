package views;

import models.Persona;

public class ShowConsole {
    public ShowConsole(){

    }

    public void printArray(int[] numeros){
        System.out.print("[");
        for (int i = 0; i < numeros.length; i++) {
            if (i<numeros.length-1) {
                System.out.print(numeros[i] + ", ");
            }else{
                System.out.print(numeros[i]);
            }
        }
        System.out.println("]");
    }

    public void printResult(int result1, int numeroBuscar) {
        if (result1==-1) {
            System.out.println("Error -> No se encontro el " + numeroBuscar);
        }else{
            System.out.println("El numero " + "{" + numeroBuscar + "}" + " Se encontro en la posicion " + "{" + result1 + "}");
        }
    }
    
    public void printResult(Integer result1) {
        if (result1 == null) {
            System.out.println("Error -> No se encontro");
        } else {
            System.out.println("Se encontro en la posicion " + "{" + result1 + "}");
        }
    }

    public void showPersonResult(Persona resultadoPer, String name){
        System.out.println(
            resultadoPer != null
            ? "Se encontro a: " + resultadoPer.getName()
            : "No se encontro a una persona con el nombre de: " + name );
    }

        public void showPersonResultAge(Persona resultadoPerAge, int age){
            System.out.println(
                resultadoPerAge != null
                ? "Se encontro a: " + resultadoPerAge.getName() + " con edad " + resultadoPerAge.getAge()
                : "No se encontro a una persona con edad mayor e impar a: " + age );
        }

    public void printPersonas(Persona[] personas){
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Nombre: " + personas[i].getName()+ ", Edad:" + personas[i].getAge());
        }
    }


}
