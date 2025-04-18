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
            salir = ejecutarOperacion(consola, personas);
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
}