package ejemplo1;

public class EjOperadores {
    public static void main(String[] args) {

        double precio;
        int cantidad;
        double total;
        byte unidades;

        //operador de asignación
        precio=6542.55;
        cantidad=5;

        total=precio*cantidad; //operador de asignación y multiplicación
        System.out.println("El total es: " + total);

        precio=7852.55;
        cantidad=256;

        //total=total + (precio+cantidad)
        total += (precio * cantidad);
        System.out.println("El total es: " + total);

        cantidad++; // operador unario

        System.out.println(cantidad);

    }
}
