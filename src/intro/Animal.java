package intro;

import java.util.Scanner;

public class Animal {
    //Atributos 

private String nombre;
public int edad;





private Scanner lectura= new Scanner(System.in);

//metodods constructor//
public Animal(){

}
public Animal(String nombre, int edad){
    this.nombre=nombre;
    this.edad=edad;
    

}
    //Metodos 

    public void registrarAnimal(String n, int e){

        System.out.println("Ingrese el nombre del animal");

        nombre=lectura.nextLine();

        System.out.println("Ingrese la edad del animal");

        edad=lectura.nextInt();
    
    }

    public void mostrarAnimal(){
        System.out.println( "El nombre del animal es: " +nombre+ "y su edad es: " + edad); //Tambien puede utilizarse con +this.edad
    }
}
