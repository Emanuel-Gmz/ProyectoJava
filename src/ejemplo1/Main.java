package ejemplo1;

public class Main {
    public static void main(String[] args) {
        // comentario de una sola linea
        /*
        comentario de multiples lineas
        comentario de multiples lineas

         */
        // Declaracion de variables
        // tipo de dato nombreVariable = valor;
        byte edad = 30;
        short stock = 300;
        double precio = 10.5;

        //imprimir en consola
        System.out.println("La edad es: " + edad);
        System.out.println("El stock es: " + stock);
        System.out.println("El precio es: " + precio);

        String nombreProducto = "Notebook HP";
        System.out.println("El nombre del producto es: " + nombreProducto);


        boolean estaDisponible=true;
        char letra='A';
        //esto es una constante
        final byte NRO_ISP=63;

        System.out.println("El numero del ISP es: " + NRO_ISP);

        //los float y double son decimales, pero float necesita f al final del nro
        float nroDecimalLargo=3453123123.764653636514212f;

        System.out.println("Esta es la primera linea \n Esta es la segunda linea");

        System.out.println("Este es un texto de tres lineas \nlinea1 \nlinea2 \nlinea3");
    }
}