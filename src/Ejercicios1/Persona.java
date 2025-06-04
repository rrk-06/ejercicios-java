package Ejercicios1;
public class Persona {
    private 
    String nombre;
    int id;
    public Persona (){
        
    }
    public Persona (String nombre, int id){
        this.nombre = nombre;
        this.id = id;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public String getNombre (){
        return this.nombre;
    }
}
