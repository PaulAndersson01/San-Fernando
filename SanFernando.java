import java.util.Scanner;
public class SanFernando {

    public static void celebraComple() {
        System.out.println("===San fernando===");
        System.out.println("7.Celebraciones");
        System.out.println("8.Complementos");
        System.out.println("0./_Salir_/");
        System.out.println("Elija entre las siguientes opciones[En números]:");
    }

    public static double mostrarCelebraciones(Scanner scanner) {

        int producto;
        double precio = 0;
        int cantidad;
        double total;

        System.out.println("=== CELEBRACIONES ===");

        System.out.println("1.Pierna de Cerdo Congelado (9 a 10 Kg)");
        System.out.println("Precio: S/ 24.00 x kg");

        System.out.println("2.Enrollado americano de pavita x 1.30 Kg");
        System.out.println("Precio: S/ 42.40");

        System.out.println("3.Enrollado delizia de cerdo x 1.30 Kg");
        System.out.println("Precio: S/ 41.00");

        System.out.println("4.Enrollado americano de pollo x 1.30 Kg");
        System.out.println("Precio: S/ 37.10");

        System.out.println("5.Enrollado delizia de pollo x 1.30 Kg");
        System.out.println("Precio: S/ 37.30");

        System.out.println("Seleccione un producto:");
        producto = scanner.nextInt();

        switch (producto){
            case 1:
                precio = 24.00;
                break;
            case 2:
                precio = 42.40;
                break;
            case 3:
                precio = 41.00;
                break;
            case 4:
                precio = 37.10;
                break;
            case 5:
                precio = 37.30;
                break;
            default:
                System.out.println("Opcion Invalida");
                return 0;
        }

        System.out.println("Ingrese la cantidad:");
        cantidad = scanner.nextInt();

        total = precio * cantidad;
        System.out.println("Total a pagar es: "+ total +" S/. ");

        return total;
    }

    public static double mostrarComplementos(Scanner scanner) {
        int producto;
        int cantidad;
        double precio = 0;
        double total;
        System.out.println("=== COMPLEMENTOS ===");

        System.out.println("1.Aceite de Oliva extra virgen x 1 Lt.");
        System.out.println("Precio: S/ 51.90");

        System.out.println("2.Aceite de Oliva extra virgen x 500 Ml.");
        System.out.println("Precio: S/ 28.90");

        System.out.println("3.Aceite de Oliva extra virgen x 4 Litros");
        System.out.println("Precio: S/ 167.00");

        System.out.println("Seleccione un producto:");
        producto = scanner.nextInt();
        switch (producto){
            case 1:
                precio = 51.90;
                break;
            case 2:
                precio = 28.90;
                break;
            case 3:
                precio = 167.00;
                break;
            default:
                System.out.println("Opcion Invalida");
                return 0;
        }

        System.out.println("Ingrese la cantidad: ");
        cantidad = scanner.nextInt();

        total = precio * cantidad;
        System.out.println("El total a pagar es: "+ total +" S/.");
        return total;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        double totalGeneral = 0;

        while (continuar) {
            celebraComple();
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 7:
                    totalGeneral += mostrarCelebraciones(scanner);
                    break;
                case 8:
                    totalGeneral += mostrarComplementos(scanner);
                    break;
                case 0:
                    double igv = totalGeneral * 0.18;
                    double totaFinal = totalGeneral + igv;
                    System.out.println("===BOLETA FINAL===");
                    System.out.println("SubTotal: S/. "+ totalGeneral);
                    System.out.println("IGV: S/. "+ igv);
                    System.out.println("Total final: "+ totaFinal);
                    System.out.println("==================");

                    System.out.println("Saliendo del sistema...");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opcion invalida");
            }
            System.out.println("TOTAL ACUMULADO: S/. "+ totalGeneral);
        }
    }
}