package com.mycompany.actividad_4;
import java.util.Scanner;

public class Actividad_4 {

    public static void main(String[] args) {
       double radio, diametro, perimetro, area;
       Scanner valor = new Scanner(System.in);
        System.out.println("Ingrese el valor del radio: ");
       
       radio = valor.nextDouble();
       diametro = 2*radio;
       area = Math.PI * Math.pow(radio,2);
       perimetro = diametro*Math.PI;
       
       System.out.println("El area del circulo de radio " +radio+ " es: " + area);
       System.out.println("La longitud de la circunferencia(perimetro) del circulo de radio " +radio+ " es :" + perimetro);                          
    }
}
