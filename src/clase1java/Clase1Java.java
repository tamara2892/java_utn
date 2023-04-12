package clase1java;


public class Clase1Java {

    public static void main(String[] args) {
        
/* Ejercicio 1.a

        int numeroInicio = 3;
        int numeroFinal = 14;

        while (numeroInicio <= numeroFinal) {
            System.out.println(numeroInicio);
            numeroInicio++;
        }  */

        
 /*Ejercicio 1.b
         
        int numeroInicio = 3;
        int numeroFinal = 14;

        while (numeroInicio <= numeroFinal) {
            if (numeroInicio % 2 == 0) {
                System.out.println(numeroInicio);
            }
            numeroInicio++;
        } */

 /*Ejercicio 1.c

        int numeroInicio = 3;
        int numeroFinal = 14;
        String eleccion = "Par"; // si la variable es "par" muestra numeros pares y si es distinta muestra los numeros impares 

        while (numeroInicio <= numeroFinal) {
            if (eleccion == "Par") {
                if (numeroInicio % 2 == 0) {
                    System.out.println(numeroInicio);
                }
            } else if (eleccion != "Par") {
                if (numeroInicio % 2 == 1) {
                    System.out.println(numeroInicio);
                }
            }
            numeroInicio++;
        }
    }*/

 /*Ejercicio 1.d

        for (int numeroInicio = 14; numeroInicio > 3; numeroInicio--) {
            if (numeroInicio % 2 == 0){
            System.out.println(numeroInicio);}
            
        } */
 
 /*Ejercicio 2.d */
 
        float ingresosMensuales = 299000;
        int vehiculos = 2;
        int inmuebles = 2;
        boolean embarcaciones = true;

        if ((ingresosMensuales >= 489083)
                || (vehiculos >= 3)
                || (inmuebles >= 3)
                || (embarcaciones == true)) {
            System.out.println("Pertenece al sector de Ingresos Altos");
        } else if ((ingresosMensuales < 489083)
                || (vehiculos < 2)
                || (inmuebles < 2)
                || (embarcaciones == false)) {
            System.out.println("Pertenece al sector de Ingresos Bajos");
        }

    }

}
