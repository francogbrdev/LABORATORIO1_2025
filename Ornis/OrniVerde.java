
import java.util.Scanner;

public class OrniVerde extends Castor implements MamaPata {

    private double pico = 6.8;
    private double patas = 7.5;
    private String nombre;

    public OrniVerde(String nombre) {
        super();
        this.nombre = nombre;
    }

    @Override
    public void tocarOrgano() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do-Re-Mi");
        System.out.print("Presiona Enter para continuar...");
        sc.nextLine(); // Espera enter
        System.out.println("Fa-Sol-La-Si");
    }

    public void tocarGuitorgan() {
        System.out.println(nombre + " está tocando el Guitorgan:");
        super.tocarGuitarra(); // del Castor
        this.tocarOrgano(); // de MamaPata
        System.out.println("cuac cuaac…!");
    }
}