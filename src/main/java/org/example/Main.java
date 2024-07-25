package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leerTeclado=new Scanner(System.in);
        String nombreVendedor;
        String Simple;
        String Doble;
        String Especial;
        int numeroVendidosSimple;
        int numeroVendidosDoble;
        int numeroVendidosEspecial;
        final int precioHeladoSimple=1000;
        final int precioHeladoDoble=2000;
        final int precioHeladoEspecial=3000;

        System.out.print("ingrese el nombre del vendedor:");
        nombreVendedor=leerTeclado.nextLine();

        System.out.println("Por favor ingrese el numero de elados Simples vendidos: ");
        numeroVendidosSimple=leerTeclado.nextInt();
        System.out.println("Por favor ingrese el numero de elados Dobles vendidos: ");
        numeroVendidosDoble=leerTeclado.nextInt();
        System.out.println("Por favor ingrese el numero de elados Especiales vendidos: ");
        numeroVendidosEspecial=leerTeclado.nextInt();

        System.out.println("El total de ventas de Helado simple son:"+numeroVendidosSimple);
        int totalVentasSimple;
        totalVentasSimple=numeroVendidosSimple*precioHeladoSimple;
        System.out.println("el velor de la venta de helado simple es"+totalVentasSimple);

        System.out.println("El total de ventas de Helado doble son:"+numeroVendidosDoble);
        int totalVentasDoble;
        totalVentasDoble=numeroVendidosDoble*precioHeladoDoble;
        System.out.println("el velor de la venta de helado doble es"+totalVentasDoble);

        System.out.println("El total de ventas de Helado especial son:"+numeroVendidosEspecial);
        int totalVentasEspecial;
        totalVentasEspecial=numeroVendidosEspecial*precioHeladoEspecial;
        System.out.println("el velor de la venta de helado doble es"+totalVentasEspecial);

        int totalVentasDia=totalVentasSimple+totalVentasDoble+totalVentasEspecial;
        int cantidadTotalHelados=numeroVendidosSimple+numeroVendidosDoble+numeroVendidosEspecial;
        System.out.println("El valor de las ventas totales del día es:"+totalVentasDia+"la cantidad total de helados vendidos es"+cantidadTotalHelados);






    }
}