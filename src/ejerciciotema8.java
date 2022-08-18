public class ejerciciotema8 {
    
    public static void main (String[] args){
        Persona persona = new Persona ();
        persona.setNombre("Daniela");
        persona.setEdad(25);
        persona.setTelefono(1234566);
       
        System.out.println(persona.getNombre()); 
        System.out.println(persona.getEdad()); 
        System.out.println(persona.getTelefono());

    }


}

class Persona {
    private String nombre;
    private int edad;
    private int telefono;

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