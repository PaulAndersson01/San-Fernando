import java.util.Scanner;

public class SanFernando {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String nombre, ubicacion;
        int categoria, producto, cantidad, pago;

        String nomProducto = "";
        String metodoPago = "";
        double precio = 0;

        double subtotal, igv, total;

        System.out.println("=================================");
        System.out.println("       SISTEMA SAN FERNANDO      ");
        System.out.println("=================================");

        System.out.print("Ingrese su nombre: ");
        nombre = entrada.nextLine();

        System.out.print("Ingrese su ubicación: ");
        ubicacion = entrada.nextLine();

        int continuar;

        do {

            System.out.println("=========== CATEGORÍAS ===========");
            System.out.println("1. Pollo");
            System.out.println("2. Pavita");
            System.out.println("3. Cerdo");
            System.out.println("4. Embutidos");
            System.out.println("5. Congelados");
            System.out.println("6. Salir");

            System.out.print("Seleccione categoría: ");
            categoria = entrada.nextInt();

            // 🔥 ARREGLO IMPORTANTE (consume salto de línea)
            entrada.nextLine();

            if (categoria == 6) {
                System.out.println("Gracias por su compra.");
                break;
            }

            System.out.print("Seleccione producto (1-10): ");
            producto = entrada.nextInt();

            System.out.print("Cantidad: ");
            cantidad = entrada.nextInt();

            // PRODUCTOS (simplificado)
            switch (categoria) {

                case 1:
                    switch (producto) {
                        case 1: nomProducto = "Pollo entero"; precio = 18.50; break;
                        case 2: nomProducto = "Pechuga"; precio = 16.00; break;
                        case 3: nomProducto = "Muslo"; precio = 12.50; break;
                        case 4: nomProducto = "Ala"; precio = 10.00; break;
                        case 5: nomProducto = "Pierna"; precio = 11.00; break;
                        case 6: nomProducto = "Filete"; precio = 20.00; break;
                        case 7: nomProducto = "Pollo adobado"; precio = 22.00; break;
                        case 8: nomProducto = "Pollo orgánico"; precio = 30.00; break;
                        case 9: nomProducto = "Menudencia"; precio = 6.00; break;
                        case 10: nomProducto = "Combo pollo"; precio = 25.00; break;
                    }
                    break;

                case 2:
                    switch (producto) {
                        case 1: nomProducto = "Pavita entera"; precio = 45.00; break;
                        case 2: nomProducto = "Pechuga pavita"; precio = 28.00; break;
                        case 3: nomProducto = "Jamón pavita"; precio = 20.00; break;
                        case 4: nomProducto = "Filete pavita"; precio = 26.00; break;
                        case 5: nomProducto = "Muslo pavita"; precio = 22.00; break;
                        case 6: nomProducto = "Pavita ahumada"; precio = 35.00; break;
                        case 7: nomProducto = "Pavita premium"; precio = 50.00; break;
                        case 8: nomProducto = "Pavita congelada"; precio = 40.00; break;
                        case 9: nomProducto = "Pavita molida"; precio = 18.00; break;
                        case 10: nomProducto = "Combo pavita"; precio = 55.00; break;
                    }
                    break;
            }

            // PAGO
            System.out.println("===== MÉTODO DE PAGO =====");
            System.out.println("1. Yape");
            System.out.println("2. Plin");
            System.out.println("3. BCP");
            System.out.println("4. Interbank");
            System.out.println("5. BBVA");

            System.out.print("Seleccione pago: ");
            pago = entrada.nextInt();

            switch (pago) {
                case 1: metodoPago = "Yape"; break;
                case 2: metodoPago = "Plin"; break;
                case 3: metodoPago = "BCP"; break;
                case 4: metodoPago = "Interbank"; break;
                case 5: metodoPago = "BBVA"; break;
            }

            subtotal = precio * cantidad;
            igv = subtotal * 0.18;
            total = subtotal + igv;

            System.out.println("========= BOLETA =========");
            System.out.println("Cliente: " + nombre);
            System.out.println("Ubicación: " + ubicacion);
            System.out.println("Producto: " + nomProducto);
            System.out.println("Cantidad: " + cantidad);
            System.out.println("Pago: " + metodoPago);
            System.out.println("TOTAL: S/." + total);
            System.out.println("==========================");

            System.out.print("¿Otra compra? (1=Sí / 2=No): ");
            continuar = entrada.nextInt();

        } while (continuar == 1);

        entrada.close();
    }
}