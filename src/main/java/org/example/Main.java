package org.example;

public class Main {
    public static void main(String[] args) {
        secondExercise();
    }
    //2. Crear un vector de 20 elementos con valores numéricos diferentes. Hallar el mayor valor y su posición y calcular el promedio
    public static void secondExercise(){
        int[] vector = new int[20];
        int mayor = 0;
        int posicion = 0;
        int suma = 0;
        double promedio = 0;

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100);
            System.out.println("Posición "+ i +" : "+vector[i]);
            suma += vector[i];
            if(vector[i] > mayor){
                mayor = vector[i];
                posicion = i;
            }
        }
        promedio = suma / vector.length;
        System.out.println("El mayor valor es: " + mayor+", en la posición: "+posicion);
        System.out.println("El promedio de los numeros generados es: " + promedio );
    }
}