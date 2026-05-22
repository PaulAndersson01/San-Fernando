import java.util.Scanner;
public class SanFernando {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("---BIENVENIDO A SAN FERNANDO---");
        menuAcceso(leer);
    }
    public static void menuAcceso(Scanner leer) {
        int opcion = 0;
        String correoCliente = "Invitado";
        boolean estadoMenu = true;
        while (estadoMenu == true) {
            System.out.println("--- MENÚ DE DE INICIO ---");
            System.out.println("1. Crear Cuenta");
            System.out.println("2. Entrar como Invitado");
            System.out.println("3. Salir");
            System.out.println("Seleccione una opcion");
            opcion = leer.nextInt();
            leer.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese su correo:");
                    correoCliente = leer.nextLine();
                    System.out.println("Ingrese su contraseña:");
                    String passwordCliente = leer.nextLine();
                    System.out.println("Cuenta creada con éxito.");
                    menuPrincipal(correoCliente, leer);
                    break;
                case 2:
                    System.out.println("Entrando como invitado...");
                    correoCliente = "Invitado";
                    menuPrincipal(correoCliente, leer);
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    estadoMenu = false;
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
    public static void menuPrincipal(String correoCliente, Scanner leer) {
        double totalPagar = 0;
        boolean estadoTienda = true;
        int stockPolloEntero = 10;
        int stockPavitaTrozada = 10;
        int stockHotDog = 10;
        int stockJabaHuevos = 10;
        while (estadoTienda == true) {
            System.out.println("--- CATEGORÍAS ---");
            System.out.println("Usuario actual: " + correoCliente);
            System.out.println("1. Pollo");
            System.out.println("2. Pavita");
            System.out.println("3. Embutidos");
            System.out.println("4. Huevos");
            System.out.println("5. Ver mi carrito total");
            System.out.println("6. Pagar y generar boleta");
            System.out.println("7. Cerrar sesión");
            System.out.println("seleccione una  opcion");
            int opcionMenu = leer.nextInt();
            switch (opcionMenu) {
                case 1:
                    System.out.println("-- PRODUCTOS DE POLLO --");
                    System.out.println("1. Pollo Entero (S/ 19.0) - Stock: " + stockPolloEntero);
                    System.out.println("Seleccione el producto a comprar:");
                    int productoPollo = leer.nextInt();
                    if (productoPollo == 1) {
                        System.out.println("Ingrese la cantidad a comprar:");
                        int cantidadComprar = leer.nextInt();
                        if (cantidadComprar <= stockPolloEntero) {
                            stockPolloEntero = stockPolloEntero - cantidadComprar;
                            totalPagar = totalPagar + (19.0 * cantidadComprar);
                            System.out.println("Agregado al carrito.");
                        }
                        else {
                            System.out.println("No hay suficiente stock.");
                        }
                    }
                    else {
                        System.out.println("Producto no válido.");
                    }
                    break;
                case 2:
                    System.out.println("-- PRODUCTOS DE PAVITA --");
                    System.out.println("1. Pavita Trozada (S/ 24.0) - Stock: " + stockPavitaTrozada);
                    System.out.println("Seleccione el producto a comprar:");
                    int productoPavita = leer.nextInt();
                    if (productoPavita == 1) {
                        System.out.println("Ingrese la cantidad a comprar:");
                        int cantidadComprar = leer.nextInt();
                        if (cantidadComprar <= stockPavitaTrozada) {
                            stockPavitaTrozada = stockPavitaTrozada - cantidadComprar;
                            totalPagar = totalPagar + (24.0 * cantidadComprar);
                            System.out.println("Agregado al carrito.");
                        }
                        else {
                            System.out.println("No hay suficiente stock.");
                        }
                    }
                    else {
                        System.out.println("Producto no válido.");
                    }
                    break;

                case 3:
                    System.out.println("-- PRODUCTOS DE EMBUTIDOS --");
                    System.out.println("1. Hot Dog (S/ 9.0) - Stock: " + stockHotDog);
                    System.out.println("Seleccione el producto a comprar:");
                    int productoEmbutido = leer.nextInt();
                    if (productoEmbutido == 1) {
                        System.out.println("Ingrese la cantidad a comprar:");
                        int cantidadComprar = leer.nextInt();
                        if (cantidadComprar <= stockHotDog) {
                            stockHotDog = stockHotDog - cantidadComprar;
                            totalPagar = totalPagar + (9.0 * cantidadComprar);
                            System.out.println("Agregado al carrito.");
                        }
                        else {
                            System.out.println("No hay suficiente stock.");
                        }
                    } else {
                        System.out.println("Producto no válido.");
                    }
                    break;
                case 4:
                    System.out.println("-- PRODUCTOS DE HUEVOS --");
                    System.out.println("1. Jaba de Huevos (S/ 16.0) - Stock: " + stockJabaHuevos);
                    System.out.println("Seleccione el producto a comprar:");
                    int productoHuevo = leer.nextInt();
                    if (productoHuevo == 1) {
                        System.out.println("Ingrese la cantidad a comprar:");
                        int cantidadComprar = leer.nextInt();
                        if (cantidadComprar <= stockJabaHuevos) {
                            stockJabaHuevos = stockJabaHuevos - cantidadComprar;
                            totalPagar = totalPagar + (16.0 * cantidadComprar);
                            System.out.println("Agregado al carrito.");
                        }
                        else {
                            System.out.println("No hay suficiente stock.");
                        }
                    } else {
                        System.out.println("Producto no válido.");
                    }
                    break;
                case 5:
                    System.out.println("TOTAL A PAGAR HASTA AHORA: S/ " + totalPagar);
                    break;
                case 6:
                    if (totalPagar > 0) {
                        double montoPagado = validaPago(totalPagar, leer);
                        generarBoleta(correoCliente, totalPagar, montoPagado);
                        estadoTienda = false;
                    }
                    else {
                        System.out.println("No compraste nada todavía.");
                    }
                    break;

                case 7:
                    System.out.println("Cerrando sesión de " + correoCliente);
                    estadoTienda = false;
                    break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }
        }
    }
    public static double validaPago(double totalPagar, Scanner leer) {
        double montoEntregado = 0;
        while (montoEntregado < totalPagar) {
            System.out.println("TOTAL A PAGAR: S/ " + totalPagar);
            System.out.println("Ingrese monto de pago: ");
            montoEntregado = leer.nextDouble();
            if (montoEntregado < totalPagar) {
                System.out.println("Dinero insuficiente. Falta: S/ " + (totalPagar - montoEntregado));
            }
        }
        return montoEntregado;
    }
    public static void generarBoleta(String correoCliente, double totalPagar, double montoEntregado) {
        double subtotalPago = totalPagar / 1.18;
        double impuestoIgv = totalPagar - subtotalPago;
        double vueltoPago = montoEntregado - totalPagar;

        System.out.println("        BOLETA DE VENTA         ");
        System.out.println("Usuario:       " + correoCliente);
        System.out.println("Subtotal:      S/ " + subtotalPago);
        System.out.println("IGV (18%):     S/ " + impuestoIgv);
        System.out.println("TOTAL A PAGAR: S/ " + totalPagar);
        System.out.println("Monto Pagado:  S/ " + montoEntregado);
        System.out.println("Vuelto:        S/ " + vueltoPago);
        System.out.println("   Gracias por la Visita   ");
    }
}