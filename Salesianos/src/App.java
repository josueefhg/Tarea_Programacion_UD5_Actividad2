
import net.Combustion.CocheCombustion;

public class App {
    public static void main(String[] args) {
        CocheCombustion coche = new CocheCombustion(
                "Azul electrico papa",
                3,
                4,
                "Golf GTI R300",
                "4324 KTJ",
                false,
                20);

        System.out.println("Datos del coche:");
        System.out.println(coche);
        System.out.println();

        System.out.println("Intento de mover el coche antes de arrancarlo:");
        coche.mover();
        System.out.println();

        System.out.println("Arrancamos el motor y movemos el coche varias veces:");
        coche.arrancar();
        coche.mover();
        coche.mover();
        coche.mover();
        coche.mover();
        System.out.println();

        System.out.printf("Combustible restante: %.2f litros.%n%n", coche.getLitrosCombustible());

        System.out.println("Modificamos el combustible a 2 litros y movemos el coche tres veces mas:");
        coche.setLitrosCombustible(2);
        coche.mover();
        coche.mover();
        coche.mover();
        System.out.println();

        System.out.println("Estado final del coche:");
        System.out.println(coche);
    }
}
