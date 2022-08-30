public class ejercicio9 {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.nombre = "Juan"; 
        cliente.edad = 55;
        cliente.telefono = 5673340;
        cliente.credito = 120000;
        System.out.println(cliente.getNombre()); 
        System.out.println(cliente.getEdad()); 
        System.out.println(cliente.getTelefono());
        System.out.println(cliente.getCredito());

        Trabajador trabajador = new Trabajador();
        trabajador.salario = 8000;
        System.out.println(trabajador.getSalario());
    }
    
}

class Alguien {
    String nombre;
    int edad;
    int telefono; 

    public void setNombre (String nombre){
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre; 
    }
    public void setEdad (int edad) {
        this.edad = edad; 
    }

    public int getEdad(){
        return this.edad;
    }

    public void setTelefono (int telefono){
        this.telefono = telefono;
    }

    public int getTelefono (){
        return this.telefono;
    }
}
 class Cliente extends Alguien {
    int credito;

    public void setCredito (int credito) {
        this.credito = credito; 
    }

    public int getCredito(){
        return this.credito;
    }
 }
class Trabajador extends Alguien{
    int salario;

    public void setSalario (int salario){
        this.salario = salario;
    }
    public int getSalario (){
        return this.salario;
    }
    
    public Trabajador (){
        System.out.println("El salario del trabajador es");
    }

}