package Ejercicios1;
// Ejercicios del libro 
public class Main{
    public static void main(String[] args) throws Exception {


        Animal a1 = new Animal();
        Animal a2 = new Animal();

        a1.edad = 5;
        a1.especie = "leon";
        a2.edad = 10;
        a2.especie = "tigre";

        a1.hacerSonido();
        a2.hacerSonido();

    }
}
