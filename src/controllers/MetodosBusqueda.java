package controllers;

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

        showConsole.printResult(result1, 5);
        showConsole.printResult(result2, 2);
        showConsole.printResult(result3, 20);
        showConsole.printResult(result4);
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
            i++;
            if (arreglo[i]==numeroBuscar) {
                return i;
            }
        }
        return -1;
    }

    public int busquedaLinealObj(int numeroBuscar){
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i]==numeroBuscar) {
                return i;
            }
        }
        return (Integer) null;
    }
}
