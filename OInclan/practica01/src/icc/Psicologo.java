import java.util.Scanner;

public class Psicologo {
    public static void main(String[] args) {
        Scanner entradas = new Scanner(System.in);
        System.out.println("Bienvenido, cual es su nombre?");
        String nombre = entradas.nextLine();
        System.out.println("Buenas tardes " + nombre);
        System.out.println("Digame, cual es su problema en la vida?, no tiene dinero? lo engañaron? a mi tambien");
        String problema = entradas.nextLine();
        System.out.println("MMMMM... ya veo");
        System.out.println("y digame");
        System.out.println("por que dice que " + problema + "?");
        String respuesta = entradas.nextLine();
        System.out.println("Muy interesante!! Hablaremos de ello con mas detalle en la siguiente sesion.");


    }
}