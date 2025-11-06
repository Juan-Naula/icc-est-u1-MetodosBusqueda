package views;

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
        if (result1 != null) {
            System.out.println("Error -> No se encontro");
        }else{
            System.out.println("Se encontro en la posicion " + "{" + result1 + "}");
        }
    }
}
