import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ListadoPersonasApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        List<Persona> personas = new ArrayList<>();
        var salir = false;
        while(!salir){
            mostrarMenu();
            try{
                salir = ejecutarOperacion(consola, personas);
            } catch(Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }

            System.out.println();
        }
    }

    private static void mostrarMenu(){
        System.out.println("""
                **** Listado Personas App ****
                1. Agregar
                2. Listar
                3. Salir
                """);
        System.out.print("Proporciona la opcion? ");
    }

    private static boolean ejecutarOperacion( Scanner console, List<Persona>personas){
        var opcion = Integer.parseInt(console.nextLine());
        var salir = false;

        switch(opcion){
            case 1 -> {
                System.out.print("Proporciona el nombre: ");
                var nombre = console.nextLine();
                System.out.print("Proporciona el telefono: ");
                var tel = console.nextLine();
                System.out.print("Proporciona email: ");
                var email = console.nextLine();
                var persona = new Persona(nombre, tel, email);
                personas.add(persona);
                System.out.println("La lista tiene: " + personas.size() + " elementos");
            }
            case 2 -> {
                System.out.println("Listado de personas: ");
                //Mejora usando lamba y metodo de referencia
//                personas.forEach((persona) -> System.out.println(persona)); funcion lamba
                personas.forEach(System.out::println);//metodo de referencia
            }
            case 3 -> {
                System.out.println("Hasta pronto...");
                salir = true;
            }
            default -> System.out.println("Opcion erronea: " + opcion);
        }
        return salir;
    }
}