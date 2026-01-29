public class Alumno1a5 {

    private String nombre;
    private double nota;

    public Alumno1a5(String nombre, double nota){
        this.nombre=nombre;
        this.nota=nota;
    }
    public double getNota(){
        return nota;
    }
    public String getNombre(){return nombre;}

    public void mostrarDatos(){
        System.out.printf("Nombre: %s, Nota: %.2f%n", nombre, nota);
    }
}
