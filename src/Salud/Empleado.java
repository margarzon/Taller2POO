package Salud;

public class Empleado extends Persona {

   private String cargo;
   private double valorHora;
   private String departamento;
   private double horasTrabajadas;


   
   public void setCargo(String cargo) {
       this.cargo = cargo;
   }

   public double getValorHora() {
       return valorHora;
   }

   public void setHorasTrabajadas(double horasTrabajadas) {
    this.horasTrabajadas = horasTrabajadas;
} 
   public void setValorHora(double valorHora) {
       this.valorHora = valorHora;
   }

   public String getCargo() {
    return cargo;
}

   public double getHorasTrabajadas() {
       return horasTrabajadas;
   }



   public String getDepartamento() {
       return departamento;
   }

   public double calcularHonorarios() {
    double honorarios = valorHora * horasTrabajadas;
    double reteica = honorarios * 0.00966;
    return honorarios - reteica;
}
   public void setDepartamento(String departamento) {
       this.departamento = departamento;
   }



   public void imprimirDatos() {
       System.out.println("Tipo de documento: " + getTipoDoc());
       System.out.println("Número de documento: " + getDocumento());
       System.out.println("Nombres: " + getNombre());
       System.out.println("Apellidos: " + getApellido());
       System.out.println("Cargo: " + cargo);
       System.out.println("Horas trabajadas: " + horasTrabajadas);
       System.out.println("Valor por hora: " + valorHora);
       System.out.println("Total a pagar: " + calcularHonorarios());
   }
   
} 
