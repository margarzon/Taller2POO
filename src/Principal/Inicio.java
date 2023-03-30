package Principal;

import java.util.Scanner;

import Salud.Empleado;

public class Inicio {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);

        Empleado empleado1 = new Empleado();

        empleado1.calcularHonorarios();

        empleado1.imprimirDatos();

        lectura.close();

    }

}
