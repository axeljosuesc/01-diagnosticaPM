public class Ejercicio5 {

    public static double calcularPromedio(double a, double b) {
        return (a + b) / 2;
        }

    public static void main(String[] args) {
        double a =10, b=10;
        
        double promedio = calcularPromedio(a, b); 
        System.out.println(promedio); 
        Estudiante estudiante = new Estudiante("Alumno", 16, promedio); 
        estudiante.mostrarFicha();

    }
}

public class Estudiante {
    String nombre; 
    int edad; 
    double promedio;

     public Estudiante(String nombre, int edad, double promedio) { 
        this.nombre = nombre; 
        this.edad = edad;
        this.promedio = promedio; 
    }

     public void mostrarFicha() { 
        System.out.println(nombre);
        System.out.println(edad+" años");
        System.out.println(promedio); 
    }

}
