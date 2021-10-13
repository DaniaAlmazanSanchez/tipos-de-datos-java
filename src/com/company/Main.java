package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // Variable String
        String Nombre = "Dany";

        //Datos primitivos numéricos
        byte  num1 = 15;
        short num2 = 18;
        int   num3 = 19;
        long  num4 = 10;

        //datos primitivos decimales
        //números decimales se le agrega la letra f para que tome encuenta todos los num
        float decimal1 = 11.3437577f;
        double decimal2 = 5.07866785f;

        //datos primitivos char
        char character = 'v';

        // dato primitivo boolean
        boolean verdadero = true;

        short numeroShort1 = numero1;
        int numeroInt = numeroShort1;
        short numeroShort2 = (short) numeroInt;

         byte numeroByte1 = 120;
         byte numeroByte2 = 120;
         short suma = (short) (numeroByte1 + numeroByte2);

        System.out.println(Nombre);
        //System.out.println(numeroInt);
        //System.out.println(suma);

        // Operadores aritméticos
        
        // + sumar o concatenar
        // - restar
        // * multiplicar
        // / dividir
        // % residuo

        byte nume1 = 8;
        byte nume2 = 5;

        byte suma = (byte) (nume1 + nume2);
        short multli= (short) (nume1 * nume2);
        byte division = (byte) (nume2 / nume1);

        System.out.println(suma);
        System.out.println(multli);
        System.out.println(division);

    }
}
