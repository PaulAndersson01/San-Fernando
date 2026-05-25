import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
public class SanFernandoTrabajo {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("====================================================================");
        System.out.println(" ██████╗ ██╗███████╗███╗   ██╗██╗   ██╗███████╗███╗   ██╗██╗██████╗  ██████╗ ███████╗");
        System.out.println(" ██╔══██╗██║██╔════╝████╗  ██║██║   ██║██╔════╝████╗  ██║██║██╔══██╗██╔═══██╗██╔════╝");
        System.out.println(" ██████╔╝██║█████╗  ██╔██╗ ██║██║   ██║█████╗  ██╔██╗ ██║██║██║  ██║██║   ██║███████╗");
        System.out.println(" ██╔══██╗██║██╔══╝  ██║╚██╗██║╚██╗ ██╔╝██╔══╝  ██║╚██╗██║██║██║  ██║██║   ██║╚════██║");
        System.out.println(" ██████╔╝██║███████╗██║ ╚████║ ╚████╔╝ ███████╗██║ ╚████║██║██████╔╝╚██████╔╝███████║");
        System.out.println(" ╚═════╝ ╚═╝╚══════╝╚═╝  ╚═══╝  ╚═══╝  ╚══════╝╚═╝  ╚═══╝╚═╝╚═════╝  ╚═════╝ ╚══════╝");
        System.out.println(" ");
        System.out.println("                     █████╗     ███████╗ █████╗ ███╗   ██╗");
        System.out.println("                    ██╔══██╗    ██╔════╝██╔══██╗████╗  ██║");
        System.out.println("                    ███████║    ███████╗███████║██╔██╗ ██║");
        System.out.println("                    ██╔══██║    ╚════██║██╔══██║██║╚██╗██║");
        System.out.println("                    ██║  ██║    ███████║██║  ██║██║ ╚████║");
        System.out.println("                    ╚═╝  ╚═╝    ╚══════╝╚═╝  ╚═╝╚═╝  ╚═══╝");
        System.out.println(" ");
        System.out.println("███████╗███████╗██████╗ ███╗   ██╗ █████╗ ███╗   ██╗██████╗  ██████╗ ");
        System.out.println("██╔════╝██╔════╝██╔══██╗████╗  ██║██╔══██╗████╗  ██║██╔══██╗██╔═══██╗");
        System.out.println("█████╗  █████╗  ██████╔╝██╔██╗ ██║███████║██╔██╗ ██║██║  ██║██║   ██║");
        System.out.println("██╔══╝  ██╔══╝  ██╔══██╗██║╚██╗██║██╔══██║██║╚██╗██║██║  ██║██║   ██║");
        System.out.println("██║     ███████╗██║  ██║██║ ╚████║██║  ██║██║ ╚████║██████╔╝╚██████╔╝");
        System.out.println("╚═╝     ╚══════╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝  ╚═════╝ ");
        System.out.println("====================================================================");
        menuAcceso(leer);
    }
    public static void menuAcceso(Scanner leer) {
        int opcion = 0;
        String correoRegistrado = "", contraseñaRegistrada = "";
        String correoCliente = "Invitado";
        boolean estadoMenu = true;
        while (estadoMenu == true) {
            System.out.println("--- MENÚ DE INICIO ---");
            System.out.println("1. Crear Cuenta");
            System.out.println("2. Iniciar Sesión");
            System.out.println("3. Entrar como Invitado");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opcion: ");
            opcion = leer.nextInt();
            leer.nextLine();
            switch (opcion) {
                case 1:
                    System.out.println("--- REGISTRAR CUENTA ---");
                    System.out.println("Ingrese su nuevo correo:");
                    correoRegistrado = leer.nextLine();
                    System.out.println("Ingrese su nueva contraseña:");
                    contraseñaRegistrada = leer.nextLine();
                    System.out.println("Cuenta creada con éxito. Ahora puede iniciar sesión.");
                    break;
                case 2:
                    System.out.println("--- INICIAR SESIÓN ---");
                    if (correoRegistrado.equals("")) {
                        System.out.println("No hay ninguna cuenta registrada aún. Por favor, cree una primero.");
                    }
                    else
                    {
                        System.out.println("Ingrese su correo:");
                        String correoIngresado = leer.nextLine();
                        System.out.println("Ingrese su contraseña:");
                        String contraseñaIngresada = leer.nextLine();

                        if (correoIngresado.equals(correoRegistrado) && contraseñaIngresada.equals(contraseñaRegistrada)) {
                            System.out.println("Inicio de sesión Exitoso");
                            correoCliente = correoRegistrado;
                            menuPrincipal(correoCliente, leer);
                        }
                        else {
                            System.out.println("Correo o contraseña incorrectos.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Entrando como invitado...");
                    correoCliente = "Invitado";
                    menuPrincipal(correoCliente, leer);
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    estadoMenu = false;
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }
    public static void menuPrincipal(String correoCliente, Scanner leer) {
        double totalPagar = 0;
        boolean estadoTienda = true;

        //stock pollo //
        int stockPolloEntero205 = 10;
        int stockPolloEntero245 = 10;
        int stockPolloSinPiel = 10;
        int stockPolloSazonBrasa = 10;
        int stockPiernaFresca = 10;
        int stockPiernaCongelada = 10;
        int stockMusloFresco = 10;
        int stockMusloCongelado = 10;
        int stockPechugaEntera = 10;
        int stockMollejaPollo = 10;

        //stock pavita//
        int stockpechugaespecial = 10;
        int stockchuletadepavitacortemediano = 10;
        int stockcarnemolidadepavita = 10;
        int stockpackpechugapavita = 10;
        int stockmedallondepavita = 10;
        int stockguisodemulsodepavita = 10;
        int stockfiletedepechuga = 10;
        int stockbrazuelodepavita = 10;
        int stockrodajadepavita = 10;
        int stockguisodepechugadepavita = 10;

        //------ stock cerdito----//
        int stockPancetaPiel = 10;
        int stockChuletaLomo = 10;
        int stockChuletaPierna = 10;
        int stockChuletaBrazuelo = 10;
        int stockMedallonLomo = 10;
        int stockChuletaLomoKg = 10;
        int stockPulpaPierna = 10;
        int stockPancetaSinPiel = 10;
        int stockCostillaEspecial = 10;
        int stockTocinoCerdo = 10;

        //Stock Celebridades//
        int stockCerdo = 10;
        int stockPavita = 10;
        int stockDeliCerdo = 10;
        int stockPollo = 10;
        int stockDeliPollo = 10;
        int stockPavo = 10;
        int stockJamon = 10;
        int stockSalchicha = 10;
        int stockAlitas = 10;
        int stockNugets = 10;

        // Stock Complementos//
        int stockAgrande = 10;
        int stockApequenia = 10;
        int stockAMega = 10;
        int stockVinagre = 10;
        int stockAceitunaV = 10;
        int stockAceitunaN = 10;
        int stockSalsa = 10;
        int stockQueso = 10;
        int stockPasta = 10;
        int stockTomate = 10;

        //---EMBUTIDOS--- //
        int stockHotDog1 = 10;
        int stockHotDog2 = 10;
        int stockJamonQueso1 = 10;
        int stockJamonQueso2 = 10;
        int stockTripack = 10;
        int stockJamon1 = 10;
        int stockChorizo1 = 10;
        int stockChorizo2 = 10;

        //---CONGELADOS---//
        int stockNuggetsPavita = 10;
        int stockNuggetsPechuga = 10;
        int stockNuggetsPollo = 10;
        int stockMilanesaApanado = 10;
        int stockSupremaApanado = 10;
        int stockHamburguesaRes = 10;
        int stockDinonuggetsPollo = 10;
        int stockTirasPechuga = 10;
        int stockChicharonPechuga = 10;
        int stockHamburguesaPavita = 10;

        //stock huevos//
        int stockJabaHuevos15 = 10;
        int stockJabaHuevos30 = 10;

        while (estadoTienda == true) {
            System.out.println("--- CATEGORÍAS ---");
            System.out.println("Usuario actual: " + correoCliente);
            System.out.println("1. Pollo");
            System.out.println("2. Pavita");
            System.out.println("3. Cerdo");
            System.out.println("4. Huevos");
            System.out.println("5. Congelados");
            System.out.println("6. Embutidos");
            System.out.println("7. Celebridades ");
            System.out.println("8. Complementos");
            System.out.println("9. Ver mi carrito total");
            System.out.println("10. Pagar y generar boleta");
            System.out.println("11. Cerrar sesión");
            System.out.println("seleccione una  opcion");
            int opcionMenu = leer.nextInt();
            leer.nextLine();
            switch (opcionMenu) {
                case 1:
                    System.out.println("   PRODUCTOS POLLO   ");
                    System.out.println("1. Pollo entero fresco 2.05 kg (S/ 10.90 x kg) Disponible: " + stockPolloEntero205 + " Stocks");
                    System.out.println("2. Pollo entero fresco 2.45 kg (S/ 11.20 x kg) Disponible: " + stockPolloEntero245 + " Stocks");
                    System.out.println("3. Pollo entero sin piel (S/ 19.40 x kg) Disponible: " + stockPolloSinPiel + " Stocks");
                    System.out.println("4. Pollo sazón brasa 1.4 kg (S/ 26.40 Stock) Disponible: " + stockPolloSazonBrasa + " Stocks");
                    System.out.println("5. Pierna de pollo fresca (S/ 17.50 Stock) Disponible: " + stockPiernaFresca + " Stocks");
                    System.out.println("6. Pierna de pollo congelada (S/ 13.90 Stock) Disponible: " + stockPiernaCongelada + " Stocks");
                    System.out.println("7. Muslo de pollo fresco (S/ 14.00 x kg) Disponible: " + stockMusloFresco + " Stocks");
                    System.out.println("8. Muslo de pollo congelado (S/ 15.30 x kg) Disponible: " + stockMusloCongelado + " Stocks");
                    System.out.println("9. Pechuga entera de pollo fresco (S/ 14.90 x kg) Disponible: " + stockPechugaEntera + " Stockst");
                    System.out.println("10. Molleja de pollo (S/ 13.90 Stock) Disponible: " + stockMollejaPollo + " Stocks");
                    System.out.println("Seleccione una Opcion:");
                    int productoPollo = leer.nextInt();
                    switch (productoPollo) {
                        case 1:
                            System.out.println("Ingrese cantidad:");
                            int cantidadPollo1 = leer.nextInt();
                            if (cantidadPollo1 <= stockPolloEntero205) {
                                stockPolloEntero205 = stockPolloEntero205 - cantidadPollo1;
                                totalPagar = totalPagar + (10.90 * cantidadPollo1);
                                System.out.println("Pollo entero fresco 2.05 kg seleccionado añadiendo a carrito");
                            }
                            else {
                                System.out.println("No hay suficiente stock");
                            }
                            break;
                        case 2:
                            System.out.println("Ingrese cantidad:");
                            int cantidadPollo2 = leer.nextInt();
                            if (cantidadPollo2 <= stockPolloEntero245) {
                                stockPolloEntero245 = stockPolloEntero245 - cantidadPollo2;
                                totalPagar = totalPagar + (11.20 * cantidadPollo2);
                                System.out.println("Pollo entero fresco 2.45 kg seleccionado añadiendo a carrito");
                            }
                            else {
                                System.out.println("No hay suficiente stock");
                            }
                            break;
                        case 3:
                            System.out.println("Ingrese cantidad:");
                            int cantidadPollo3 = leer.nextInt();
                            if (cantidadPollo3 <= stockPolloSinPiel) {
                                stockPolloSinPiel = stockPolloSinPiel - cantidadPollo3;
                                totalPagar = totalPagar + (19.40 * cantidadPollo3);
                                System.out.println("Pollo entero sin piel seleccionado añadiendo a carrito");
                            }
                            else {
                                System.out.println("No hay suficiente stock");
                            }
                            break;
                        case 4:
                            System.out.println("Ingrese cantidad:");
                            int cantidadPollo4 = leer.nextInt();
                            if (cantidadPollo4 <= stockPolloSazonBrasa) {
                                stockPolloSazonBrasa = stockPolloSazonBrasa - cantidadPollo4;
                                totalPagar = totalPagar + (26.40 * cantidadPollo4);
                                System.out.println("Pollo sazón brasa 1.4 kg seleccionado añadiendo a carrito");
                            }
                            else {
                                System.out.println("No hay suficiente stock");
                            }
                            break;
                        case 5:
                            System.out.println("Ingrese cantidad:");
                            int cantidadPollo5 = leer.nextInt();
                            if (cantidadPollo5 <= stockPiernaFresca) {
                                stockPiernaFresca = stockPiernaFresca - cantidadPollo5;
                                totalPagar = totalPagar + (17.50 * cantidadPollo5);
                                System.out.println("Pierna de pollo fresca seleccionada añadiendo a carrito");
                            }
                            else {
                                System.out.println("No hay suficiente stock");
                            }
                            break;
                        case 6:
                            System.out.println("Ingrese cantidad:");
                            int cantidadPollo6 = leer.nextInt();
                            if (cantidadPollo6 <= stockPiernaCongelada) {
                                stockPiernaCongelada = stockPiernaCongelada - cantidadPollo6;
                                totalPagar = totalPagar + (13.90 * cantidadPollo6);
                                System.out.println("Pierna de pollo congelada seleccionada añadiendo a carrito");
                            }
                            else {
                                System.out.println("No hay suficiente stock");
                            }
                            break;
                        case 7:
                            System.out.println("Ingrese cantidad:");
                            int cantidadPollo7 = leer.nextInt();
                            if (cantidadPollo7 <= stockMusloFresco) {
                                stockMusloFresco = stockMusloFresco - cantidadPollo7;
                                totalPagar = totalPagar + (14.00 * cantidadPollo7);
                                System.out.println("Muslo de pollo fresco seleccionado añadiendo a carrito");
                            }
                            else {
                                System.out.println("No hay suficiente stock");
                            }
                            break;
                        case 8:
                            System.out.println("Ingrese cantidad:");
                            int cantidadPollo8 = leer.nextInt();
                            if (cantidadPollo8 <= stockMusloCongelado) {
                                stockMusloCongelado = stockMusloCongelado - cantidadPollo8;
                                totalPagar = totalPagar + (15.30 * cantidadPollo8);
                                System.out.println("Muslo de pollo congelado seleccionado añadiendo a carrito");
                            }
                            else {
                                System.out.println("No hay suficiente stock");
                            }
                            break;
                        case 9:
                            System.out.println("Ingrese cantidad:");
                            int cantidadPollo9 = leer.nextInt();
                            if (cantidadPollo9 <= stockPechugaEntera) {
                                stockPechugaEntera = stockPechugaEntera - cantidadPollo9;
                                totalPagar = totalPagar + (14.90 * cantidadPollo9);
                                System.out.println("Pechuga entera de pollo fresco seleccionada añadiendo a carrito");
                            }
                            else {
                                System.out.println("No hay suficiente stock");
                            }
                            break;
                        case 10:
                            System.out.println("Ingrese cantidad:");
                            int cantidadPollo10 = leer.nextInt();
                            if (cantidadPollo10 <= stockMollejaPollo) {
                                stockMollejaPollo = stockMollejaPollo - cantidadPollo10;
                                totalPagar = totalPagar + (13.90 * cantidadPollo10);
                                System.out.println("Molleja de pollo seleccionada añadiendo a carrito");
                            }
                            else {
                                System.out.println("No hay suficiente stock");
                            }
                            break;
                        default:
                            System.out.println("Producto no válido.");
                    }
                    break;
                case 2:
                    System.out.println("--- PRODUCTOS DE PAVITA ---");
                    System.out.println("1. Pechuga Especial de Pavita - S/ 113.0, stock disponible: " + stockpechugaespecial);
                    System.out.println("2. Chuleta de Pavita Corte Mediano - S/ 30.00, stock disponible: " + stockchuletadepavitacortemediano);
                    System.out.println("3. Carne Molida de Pavita x 500 Gr. - S/ 21.30, stock disponible: " + stockcarnemolidadepavita);
                    System.out.println("4. Pack Pechuga de Pavita en Trozos - S/ 18.50, stock disponible: " + stockpackpechugapavita);
                    System.out.println("5. Medallon de Pavita x 500 Gr. - S/12.50, stock disponible: " + stockmedallondepavita);
                    System.out.println("6. Guiso de muslo de pavita x 1.5 Kg - S/20.20, stock disponible: " + stockguisodemulsodepavita);
                    System.out.println("7. Filete de pechuga de pavita x 1.5 Kg - 27.50, stock disponible: " + stockfiletedepechuga);
                    System.out.println("8. Brazuelo de pavita - 12.00, stock disponible: " + stockbrazuelodepavita);
                    System.out.println("9. Rodaja de pavita x 1.5 Kg - 17.00, stock disponible: " + stockrodajadepavita);
                    System.out.println("10.Guiso de pechuga de pavita - 14.40, stock disponible: " + stockguisodepechugadepavita);
                    System.out.println("Seleccione el producto a comprar:");
                    int productoPavita = leer.nextInt();
                    System.out.println("Ingrese la cantidad a comprar:");
                    int cantidadComprar = leer.nextInt();
                    switch (productoPavita) {
                        case 1:
                            if (cantidadComprar <= stockpechugaespecial) {
                                stockpechugaespecial = stockpechugaespecial - cantidadComprar;
                                totalPagar = totalPagar + (113.0 * cantidadComprar);
                                System.out.println("Agregado al carrito.");
                            }
                            else {
                                System.out.println("No hay suficiente stock.");
                            }
                            break;
                        case 2:
                            if (cantidadComprar <= stockchuletadepavitacortemediano) {
                                stockchuletadepavitacortemediano = stockchuletadepavitacortemediano - cantidadComprar;
                                totalPagar = totalPagar + (30.0 * cantidadComprar);
                                System.out.println("Agregado al carrito.");
                            }
                            else {
                                System.out.println("No hay suficiente stock.");
                            }
                            break;
                        case 3:
                            if (cantidadComprar <= stockcarnemolidadepavita) {
                                stockcarnemolidadepavita = stockcarnemolidadepavita - cantidadComprar;
                                totalPagar = totalPagar + (21.30 * cantidadComprar);
                                System.out.println("Agregado al carrito.");
                            }
                            else {
                                System.out.println("No hay suficiente stock.");
                            }
                            break;
                        case 4:
                            if (cantidadComprar <= stockpackpechugapavita) {
                                stockpackpechugapavita = stockpackpechugapavita - cantidadComprar;
                                totalPagar = totalPagar + (18.50 * cantidadComprar);
                                System.out.println("Agregado al carrito.");
                            } else {
                                System.out.println("No hay suficiente stock.");
                            }
                            break;
                        case 5:
                            if (cantidadComprar <= stockmedallondepavita) {
                                stockmedallondepavita = stockmedallondepavita - cantidadComprar;
                                totalPagar = totalPagar + (12.50 * cantidadComprar);
                                System.out.println("Agregado al carrito.");
                            }
                            else {
                                System.out.println("No hay suficiente stock.");
                            }
                            break;
                        case 6:
                            if (cantidadComprar <= stockguisodemulsodepavita) {
                                stockguisodemulsodepavita = stockguisodemulsodepavita - cantidadComprar;
                                totalPagar = totalPagar + (20.20 * cantidadComprar);
                                System.out.println("Agregado al carrito.");
                            }
                            else {
                                System.out.println("No hay suficiente stock.");
                            }
                            break;
                        case 7:
                            if (cantidadComprar <= stockfiletedepechuga) {
                                stockfiletedepechuga = stockfiletedepechuga - cantidadComprar;
                                totalPagar = totalPagar + (27.50 * cantidadComprar);
                                System.out.println("Agregado al carrito.");
                            }
                            else {
                                System.out.println("No hay suficiente stock.");
                            }
                            break;
                        case 8:
                            if (cantidadComprar <= stockbrazuelodepavita) {
                                stockbrazuelodepavita = stockbrazuelodepavita - cantidadComprar;
                                totalPagar = totalPagar + (12.0 * cantidadComprar);
                                System.out.println("Agregado al carrito.");
                            }
                            else {
                                System.out.println("No hay suficiente stock.");
                            }
                            break;
                        case 9:
                            if (cantidadComprar <= stockrodajadepavita) {
                                stockrodajadepavita = stockrodajadepavita - cantidadComprar;
                                totalPagar = totalPagar + (17.00 * cantidadComprar);
                                System.out.println("Agregado al carrito.");
                            }
                            else {
                                System.out.println("No hay suficiente stock.");
                            }
                            break;
                        case 10:
                            if (cantidadComprar <= stockguisodepechugadepavita) {
                                stockguisodepechugadepavita = stockguisodepechugadepavita - cantidadComprar;
                                totalPagar = totalPagar + (14.40 * cantidadComprar);
                                System.out.println("Agregado al carrito.");
                            }
                            else {
                                System.out.println("No hay suficiente stock.");
                            }
                            break;
                        default:
                            System.out.println("Producto no válido.");
                    }
                    break;
                case 3:
                    System.out.println("-- PRODUCTOS DE CERDO --");
                    System.out.println("1. Panceta de cerdo con piel y hueso");
                    System.out.println("Precio: S/ 38.10 x kg - Stock: " + stockPancetaPiel);
                    System.out.println("2. Chuleta lomo de cerdo Rango ");
                    System.out.println("Precio: S/ 17.50 x kg - Stock: " + stockChuletaLomo);
                    System.out.println("3. Chuleta de pierna cerdo sin piel ");
                    System.out.println("Precio: S/ 20.90 x kg - Stock: " + stockChuletaPierna);
                    System.out.println("4. Chuleta brazuelo cerdo sin piel ");
                    System.out.println("Precio: S/ 19.80 x kg - Stock: " + stockChuletaBrazuelo);
                    System.out.println("5. Medallón de lomo de cerdo");
                    System.out.println("Precio: S/ 33.90 x kg - Stock: " + stockMedallonLomo);
                    System.out.println("6. Chuleta lomo de cerdo ");
                    System.out.println("Precio: S/ 34.90 x kg - Stock: " + stockChuletaLomoKg);
                    System.out.println("7. Pulpa de Pierna de Cerdo");
                    System.out.println("Precio: S/ 33.50 x kg - Stock: " + stockPulpaPierna);
                    System.out.println("8. Panceta de cerdo sin piel y sin hueso");
                    System.out.println("Precio: S/ 43.00 x kg - Stock: " + stockPancetaSinPiel);
                    System.out.println("9. Costilla Especial Lomo Cerdo ");
                    System.out.println("Precio: S/ 22.50 x kg - Stock: " + stockCostillaEspecial);
                    System.out.println("10. Tocino de Cerdo");
                    System.out.println("Precio: S/ 18.90 x kg - Stock: " + stockTocinoCerdo);
                    System.out.println("Seleccione el producto a comprar:");
                    int productoCerdo = leer.nextInt();
                    switch (productoCerdo) {
                        case 1:
                            System.out.println("Ingrese cantidad:");
                            int cantidad1 = leer.nextInt();
                            if (cantidad1 <= stockPancetaPiel) {
                                stockPancetaPiel -= cantidad1;
                                totalPagar += 38.10 * cantidad1;
                                System.out.println("Producto agregado al carrito.");
                            }
                            else {
                                System.out.println("Stock insuficiente.");
                            }
                            break;
                        case 2:
                            System.out.println("Ingrese cantidad:");
                            int cantidad2 = leer.nextInt();
                            if (cantidad2 <= stockChuletaLomo) {
                                stockChuletaLomo -= cantidad2;
                                totalPagar += 17.50 * cantidad2;
                                System.out.println("Producto agregado al carrito.");
                            }
                            else {
                                System.out.println("Stock insuficiente.");
                            }
                            break;
                        case 3:
                            System.out.println("Ingrese cantidad:");
                            int cantidad3 = leer.nextInt();
                            if (cantidad3 <= stockChuletaPierna) {
                                stockChuletaPierna -= cantidad3;
                                totalPagar += 20.90 * cantidad3;
                                System.out.println("Producto agregado al carrito.");
                            }
                            else {
                                System.out.println("Stock insuficiente.");
                            }
                            break;
                        case 4:
                            System.out.println("Ingrese cantidad:");
                            int cantidad4 = leer.nextInt();
                            if (cantidad4 <= stockChuletaBrazuelo) {
                                stockChuletaBrazuelo -= cantidad4;
                                totalPagar += 19.80 * cantidad4;
                                System.out.println("Producto agregado al carrito.");
                            }
                            else {
                                System.out.println("Stock insuficiente.");
                            }
                            break;
                        case 5:
                            System.out.println("Ingrese cantidad:");
                            int cantidad5 = leer.nextInt();
                            if (cantidad5 <= stockMedallonLomo) {
                                stockMedallonLomo -= cantidad5;
                                totalPagar += 33.90 * cantidad5;
                                System.out.println("Producto agregado al carrito.");
                            }
                            else {
                                System.out.println("Stock insuficiente.");
                            }
                            break;
                        case 6:
                            System.out.println("Ingrese cantidad:");
                            int cantidad6 = leer.nextInt();
                            if (cantidad6 <= stockChuletaLomoKg) {
                                stockChuletaLomoKg -= cantidad6;
                                totalPagar += 34.90 * cantidad6;
                                System.out.println("Producto agregado al carrito.");
                            }
                            else {
                                System.out.println("Stock insuficiente.");
                            }
                            break;
                        case 7:
                            System.out.println("Ingrese cantidad:");
                            int cantidad7 = leer.nextInt();
                            if (cantidad7 <= stockPulpaPierna) {
                                stockPulpaPierna -= cantidad7;
                                totalPagar += 33.50 * cantidad7;
                                System.out.println("Producto agregado al carrito.");
                            }
                            else {
                                System.out.println("Stock insuficiente.");
                            }
                            break;
                        case 8:
                            System.out.println("Ingrese cantidad:");
                            int cantidad8 = leer.nextInt();
                            if (cantidad8 <= stockPancetaSinPiel) {
                                stockPancetaSinPiel -= cantidad8;
                                totalPagar += 43.00 * cantidad8;
                                System.out.println("Producto agregado al carrito.");
                            }
                            else {
                                System.out.println("Stock insuficiente.");
                            }
                            break;
                        case 9:
                            System.out.println("Ingrese cantidad:");
                            int cantidad9 = leer.nextInt();
                            if (cantidad9 <= stockCostillaEspecial) {
                                stockCostillaEspecial -= cantidad9;
                                totalPagar += 22.50 * cantidad9;
                                System.out.println("Producto agregado al carrito.");
                            }
                            else {
                                System.out.println("Stock insuficiente.");
                            }
                            break;
                        case 10:
                            System.out.println("Ingrese cantidad:");
                            int cantidad10 = leer.nextInt();
                            if (cantidad10 <= stockTocinoCerdo) {
                                stockTocinoCerdo -= cantidad10;
                                totalPagar += 18.90 * cantidad10;
                                System.out.println("Producto agregado al carrito.");
                            }
                            else {
                                System.out.println("Stock insuficiente.");
                            }
                            break;
                        default:
                            System.out.println("Producto no válido.");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("-- SECCIÓN HUEVOS (OFERTAS ACTUALES) --");
                    System.out.println("1. Huevos de gallina x 15 und - S/ 9.20 un | Stock: " + stockJabaHuevos15);
                    System.out.println("2. Huevos de gallina x 30 und - S/ 18.30 un | Stock: " + stockJabaHuevos30);
                    System.out.println("Seleccione el producto a comprar:");
                    int productoHuevo = leer.nextInt();
                    switch (productoHuevo) {
                        case 1:
                            System.out.println("Ingrese cantidad:");
                            int cantidadHuevo1 = leer.nextInt();
                            if (cantidadHuevo1 <= stockJabaHuevos15) {
                                stockJabaHuevos15 = stockJabaHuevos15 - cantidadHuevo1;
                                totalPagar = totalPagar + (9.20 * cantidadHuevo1);
                                System.out.println("Huevos de gallina x 15 und seleccionado añadiendo a carrito.");
                            }
                            else {
                                System.out.println("No hay suficiente stock.");
                            }
                            break;
                        case 2:
                            System.out.println("Ingrese cantidad:");
                            int cantidadHuevo2 = leer.nextInt();
                            if (cantidadHuevo2 <= stockJabaHuevos30) {
                                stockJabaHuevos30 = stockJabaHuevos30 - cantidadHuevo2;
                                totalPagar = totalPagar + (18.30 * cantidadHuevo2);
                                System.out.println("Huevos de gallina x 30 und seleccionado añadiendo a carrito.");
                            }
                            else {
                                System.out.println("No hay suficiente stock.");
                            }
                            break;
                        default:
                            System.out.println("Producto no válido.");
                    }
                    break;
                case 5:
                    System.out.println("---PRODUCTOS CONGELADOS---");
                    System.out.println(" 1-Nuggets de pavita");
                    System.out.println("precio: s/ 78 x 2kg - stock:" + stockNuggetsPavita);
                    System.out.println(" 2-Nuggets de pecchuga");
                    System.out.println("precio: s/ 52 x 2kg - stock" + stockNuggetsPechuga);
                    System.out.println(" 3-Nuggets de Pollo bolsa");
                    System.out.println("precio: s/ 48.50 x 2kg - stock:" + stockNuggetsPollo);
                    System.out.println(" 4-Milanesa de Pollo Apanada");
                    System.out.println("precio: s/ 27.50 x 10 unid. - stock" + stockMilanesaApanado);
                    System.out.println(" 5-Suprema apanada de pollo");
                    System.out.println("precio: s/ 24.20 x 10 unid. - stock" + stockSupremaApanado);
                    System.out.println(" 6-Hamburguesa de Res y Cerdo");
                    System.out.println("precio: s/ 24.80 x 8 unid. - stock:" + stockHamburguesaRes);
                    System.out.println(" 7-Dinonuggets de Pollo ");
                    System.out.println("precio: s/ 5.90 x 5 unid. - stock:" + stockDinonuggetsPollo);
                    System.out.println(" 8-Tiras de pechuga de pollo");
                    System.out.println("precio: s/ 13.50 - stock" + stockTirasPechuga);
                    System.out.println(" 9-Chicharrón de pechuga de pollo");
                    System.out.println("precio: s/ 13.50 - stock" + stockChicharonPechuga);
                    System.out.println(" 10-Hamburguesa de pavita");
                    System.out.println("precio: s/ 17.40 - stock" + stockHamburguesaPavita);
                    System.out.println("Seleccione el producto a comprar");
                    int productoCongelado = leer.nextInt();
                    switch (productoCongelado) {
                        case 1:
                            System.out.println("Ingrese cantidad:");
                            int cantidadCongelado1 = leer.nextInt();
                            if (cantidadCongelado1 <= stockNuggetsPavita) {
                                stockNuggetsPavita -= cantidadCongelado1;
                                totalPagar += 78 * cantidadCongelado1;
                                System.out.println("Producto agregado al carrito.");
                            }
                            else {
                                System.out.println("Stock insuficiente.");
                            }
                            break;
                        case 2:
                            System.out.println("Ingrese cantidad:");
                            int cantidadCongelado2 = leer.nextInt();
                            if (cantidadCongelado2 <= stockNuggetsPechuga) {
                                stockNuggetsPechuga -= cantidadCongelado2;
                                totalPagar += 52 * cantidadCongelado2;
                                System.out.println("Producto agregado al carrito.");
                            }
                            else {
                                System.out.println("Stock insuficiente.");
                            }
                            break;
                        case 3:
                            System.out.println("Ingrese cantidad:");
                            int cantidadCongelado3 = leer.nextInt();
                            if (cantidadCongelado3 <= stockNuggetsPollo) {
                                stockNuggetsPollo -= cantidadCongelado3;
                                totalPagar += 48.50 * cantidadCongelado3;
                                System.out.println("Producto agregado al carrito.");
                            }
                            else {
                                System.out.println("Stock insuficiente.");
                            }
                            break;
                        case 4:
                            System.out.println("Ingrese cantidad:");
                            int cantidadCongelado4 = leer.nextInt();
                            if (cantidadCongelado4 <= stockMilanesaApanado) {
                                stockMilanesaApanado -= cantidadCongelado4;
                                totalPagar += 27.50 * cantidadCongelado4;
                                System.out.println("Producto agregado al carrito.");
                            }
                            else {
                                System.out.println("Stock insuficiente.");
                            }
                            break;
                        case 5:
                            System.out.println("Ingrese cantidad:");
                            int cantidadCongelado5 = leer.nextInt();
                            if (cantidadCongelado5 <= stockSupremaApanado) {
                                stockSupremaApanado -= cantidadCongelado5;
                                totalPagar += 24.20 * cantidadCongelado5;
                                System.out.println("Producto agregado al carrito.");
                            }
                            else {
                                System.out.println("Stock insuficiente.");
                            }
                            break;
                        case 6:
                            System.out.println("Ingrese cantidad:");
                            int cantidadCongelado6 = leer.nextInt();
                            if (cantidadCongelado6 <= stockHamburguesaRes) {
                                stockHamburguesaRes -= cantidadCongelado6;
                                totalPagar += 24.80 * cantidadCongelado6;
                                System.out.println("Producto agregado al carrito.");
                            }
                            else {
                                System.out.println("Stock insuficiente.");
                            }
                            break;
                        case 7:
                            System.out.println("Ingrese cantidad:");
                            int cantidadCongelado7 = leer.nextInt();
                            if (cantidadCongelado7 <= stockDinonuggetsPollo) {
                                stockDinonuggetsPollo -= cantidadCongelado7;
                                totalPagar += 5.90 * cantidadCongelado7;
                                System.out.println("Producto agregado al carrito.");
                            }
                            else {
                                System.out.println("Stock insuficiente.");
                            }
                            break;
                        case 8:
                            System.out.println("Ingrese cantidad:");
                            int cantidadCongelado8 = leer.nextInt();
                            if (cantidadCongelado8 <= stockTirasPechuga) {
                                stockTirasPechuga -= cantidadCongelado8;
                                totalPagar += 13.50 * cantidadCongelado8;
                                System.out.println("Producto agregado al carrito.");
                            }
                            else {
                                System.out.println("Stock insuficiente.");
                            }
                            break;
                        case 9:
                            System.out.println("Ingrese cantidad:");
                            int cantidadCongelado9 = leer.nextInt();
                            if (cantidadCongelado9 <= stockChicharonPechuga) {
                                stockChicharonPechuga -= cantidadCongelado9;
                                totalPagar += 13.50 * cantidadCongelado9;
                                System.out.println("Producto agregado al carrito.");
                            }
                            else {
                                System.out.println("Stock insuficiente.");
                            }
                            break;
                        case 10:
                            System.out.println("Ingrese cantidad:");
                            int cantidadCongelado10 = leer.nextInt();
                            if (cantidadCongelado10 <= stockHamburguesaPavita) {
                                stockHamburguesaPavita -= cantidadCongelado10;
                                totalPagar += 17.40 * cantidadCongelado10;
                                System.out.println("Producto agregado al carrito.");
                            }
                            else {
                                System.out.println("Stock insuficiente.");
                            }
                            break;
                        default:
                            System.out.println("Producto no válido.");
                    }
                    break;
                case 6:
                    System.out.println("---PRODUCTOS DE EMBUTIDOS---");
                    System.out.println("1. Chorizo Parrillero x 400 Gr. (S/. 15.5) - Stock:" + stockChorizo1);
                    System.out.println("2. Chorizo Finas Hiervas x 400 Gr. (S/. 17.0) - Stock: " + stockChorizo2);
                    System.out.println("3. Hot dog ahumado de pollo x 440 Gr. (S/. 8.5) - Stock: " + stockHotDog1);
                    System.out.println("4. Pack Jamón sándwich 378 Gr y Queso edam 306 Gr. (S/. 31.25) - Stock: " + stockJamonQueso1);
                    System.out.println("5. Jamón ahumado de pavita x 150 Gr. (S/. 11.10) - Stock: " + stockJamon1);
                    System.out.println("6. Hot dog ahumado de pollo x 220 Gr. (S/. 4.8) - Stock: " + stockHotDog2);
                    System.out.println("7. Pack Jamón sándwich 230 Gr y Queso edam 108 Gr. (S/. 14.1) - Stock: " + stockJamonQueso2);
                    System.out.println("8. Tripack salchicha huachana (S/. 13.1) - Stock: " + stockTripack);
                    System.out.println("Seleccione el producto a comprar:");
                    int productoEmbutido = leer.nextInt();
                    switch (productoEmbutido) {
                        case 1:
                            System.out.println("Ingrese la cantidad a comprar: ");
                            int cantidadComprarEmbutidos1 = leer.nextInt();
                            if (cantidadComprarEmbutidos1 <= stockChorizo1) {
                                stockChorizo1 = stockChorizo1 - cantidadComprarEmbutidos1;
                                totalPagar = totalPagar + (15.5 * cantidadComprarEmbutidos1);
                                System.out.println("Agregado al carrito");
                            }
                            else {
                                System.out.println("No hay suficiente Stock");
                            }
                            break;
                        case 2:
                            System.out.println("Ingrese la cantidad a comprar: ");
                            int cantidadComprarEmbutidos2 = leer.nextInt();
                            if (cantidadComprarEmbutidos2 <= stockChorizo2) {
                                stockChorizo2 = stockChorizo2 - cantidadComprarEmbutidos2;
                                totalPagar = totalPagar + (17.0 * cantidadComprarEmbutidos2);
                                System.out.println("Agregado al carrito");
                            }
                            else {
                                System.out.println("No hay suficiente Stock");
                            }
                            break;
                        case 3:
                            System.out.println("Ingrese la cantidad a comprar: ");
                            int cantidadComprarEmbutidos3 = leer.nextInt();
                            if (cantidadComprarEmbutidos3 <= stockHotDog1) {
                                stockHotDog1 = stockHotDog1 - cantidadComprarEmbutidos3;
                                totalPagar = totalPagar + (8.5 * cantidadComprarEmbutidos3);
                                System.out.println("Agregado al carrito.");
                            }
                            else {
                                System.out.println("No hay suficiente Stock");
                            }
                            break;
                        case 4:
                            System.out.println("Ingrese la cantidad a comprar: ");
                            int cantidadComprarEmbutidos4 = leer.nextInt();
                            if (cantidadComprarEmbutidos4 <= stockJamonQueso1) {
                                stockJamonQueso1 = stockJamonQueso1 - cantidadComprarEmbutidos4;
                                totalPagar = totalPagar + (31.25 * cantidadComprarEmbutidos4);
                                System.out.println("Agregado al carrito");
                            }
                            else {
                                System.out.println("No hay suficiente stock");
                            }
                            break;
                        case 5:
                            System.out.println("Ingrese la cantidad a comprar: ");
                            int cantidadComprarEmbutidos5 = leer.nextInt();
                            if (cantidadComprarEmbutidos5 <= stockJamon1) {
                                stockJamon1 = stockJamon1 - cantidadComprarEmbutidos5;
                                totalPagar = totalPagar + (11.1 * cantidadComprarEmbutidos5);
                                System.out.println("Agregado al carrito");
                            }
                            else {
                                System.out.println("No hay suficiente stock");
                            }
                            break;
                        case 6:
                            System.out.println("Ingrese la cantidad a comprar: ");
                            int cantidadComprarEmbutidos6 = leer.nextInt();
                            if (cantidadComprarEmbutidos6 <= stockHotDog2) {
                                stockHotDog2 = stockHotDog2 - cantidadComprarEmbutidos6;
                                totalPagar = totalPagar + (4.8 * cantidadComprarEmbutidos6);
                                System.out.println("Agregado al carrito");
                            }
                            else {
                                System.out.println("No hay suficiente stock");
                            }
                            break;
                        case 7:
                            System.out.println("Ingrese la cantidad a comprar: ");
                            int cantidadComprarEmbutidos7 = leer.nextInt();
                            if (cantidadComprarEmbutidos7 <= stockJamonQueso2) {
                                stockJamonQueso2 = stockJamonQueso2 - cantidadComprarEmbutidos7;
                                totalPagar = totalPagar + (14.1 * cantidadComprarEmbutidos7);
                                System.out.println("Agregado al carrito");
                            }
                            else {
                                System.out.println("No hay suficiente stock");
                            }
                            break;
                        case 8:
                            System.out.println("Ingrese la cantidad a comprar: ");
                            int cantidadComprarEmbutidos8 = leer.nextInt();
                            if (cantidadComprarEmbutidos8 <= stockTripack) {
                                stockTripack = stockTripack - cantidadComprarEmbutidos8;
                                totalPagar = totalPagar + (13.1 * cantidadComprarEmbutidos8);
                                System.out.println("Agregado al carrito");
                            }
                            else {
                                System.out.println("No hay suficiente stock");
                            }
                            break;
                        default:
                            System.out.println("Opcion Invalida");
                    }
                    break;

                case 7:
                    System.out.println("------------Celebraciones-------------");
                    System.out.println("--------------------------------------");
                    System.out.println("1.Pierna de Cerdo Congelado /Stock: " + stockCerdo);
                    System.out.println("Precio: S/ 24.00 x kg");
                    System.out.println("--------------------------------------");
                    System.out.println("2.Enrollado americano de pavita /Stock: " + stockPavita);
                    System.out.println("Precio: S/ 42.40");
                    System.out.println("--------------------------------------");
                    System.out.println("3.Enrollado delizia de cerdo /Stock: " + stockDeliCerdo);
                    System.out.println("Precio: S/ 41.00");
                    System.out.println("--------------------------------------");
                    System.out.println("4.Enrollado americano de pollo /Stock: " + stockPollo);
                    System.out.println("Precio: S/ 37.10");
                    System.out.println("--------------------------------------");
                    System.out.println("5.Enrollado delizia de pollo /Stock: " + stockDeliPollo);
                    System.out.println("Precio: S/ 37.30");
                    System.out.println("--------------------------------------");
                    System.out.println("6.Pavo entero congelado /Stock: " + stockPavo);
                    System.out.println("Precio: S/ 89.90");
                    System.out.println("--------------------------------------");
                    System.out.println("7.Jamón inglés especial /Stock: " + stockJamon);
                    System.out.println("Precio: S/ 32.50");
                    System.out.println("--------------------------------------");
                    System.out.println("8.Salchicha parrillera familiar /Stock: " + stockSalchicha);
                    System.out.println("Precio: S/ 28.90");
                    System.out.println("--------------------------------------");
                    System.out.println("9.Alitas BBQ marinadas /stock: " + stockAlitas);
                    System.out.println("Precio: S/ 25.40");
                    System.out.println("---------------------------------------");
                    System.out.println("10.Nuggets de pollo crocante /stock:" + stockNugets);
                    System.out.println("Precio: S/ 19.80");
                    System.out.println("---------------------------------------");

                    System.out.println("Seleccione el producto a comprar[En números]:");
                    int opcionC = leer.nextInt();
                    switch (opcionC) {
                        case 1:
                            System.out.println("Ingrese la cantidad que desea llevar");
                            int cantidadC1 = leer.nextInt();
                            if (cantidadC1 <= stockCerdo) {
                                stockCerdo -= cantidadC1;
                                totalPagar += (24.00 * cantidadC1);
                                System.out.println("Agregado exitosamente al carrito de compras");
                            }
                            else {
                                System.out.println("Stock insuficiente");
                            }
                            break;
                        case 2:
                            System.out.println("Ingrese la cantidad que desea llevar");
                            int cantidadC2 = leer.nextInt();
                            if (cantidadC2 <= stockPavita) {
                                stockPavita -= cantidadC2;
                                totalPagar += (42.40 * cantidadC2);
                                System.out.println("Agregado exitosamente al carrito de compras");
                            }
                            else {
                                System.out.println("Stock insuficiente");
                            }
                            break;
                        case 3:
                            System.out.println("Ingrese la cantidad que desea llevar");
                            int cantidadC3 = leer.nextInt();
                            if (cantidadC3 <= stockDeliCerdo) {
                                stockDeliCerdo -= cantidadC3;
                                totalPagar += (41.00 * cantidadC3);
                                System.out.println("Agregado exitosamente al carrito de compras");
                            }
                            else {
                                System.out.println("Stock insuficiente");
                            }
                            break;
                        case 4:
                            System.out.println("Ingrese la cantidad que desea llevar");
                            int cantidadC4 = leer.nextInt();
                            if (cantidadC4 <= stockPollo) {
                                stockPollo -= cantidadC4;
                                totalPagar += (37.10 * cantidadC4);
                                System.out.println("Agregado exitosamente al carrito de compras");
                            }
                            else {
                                System.out.println("Stock insuficiente");
                            }
                            break;
                        case 5:
                            System.out.println("Ingrese la cantidad que desea llevar");
                            int cantidadC5 = leer.nextInt();
                            if (cantidadC5 <= stockDeliPollo) {
                                stockDeliPollo -= cantidadC5;
                                totalPagar += (37.30 * cantidadC5);
                                System.out.println("Agregado exitosamente al carrito de compras");
                            }
                            else {
                                System.out.println("Stock insuficiente");
                            }
                            break;
                        case 6:
                            System.out.println("Ingrese la cantidad que desea llevar");
                            int cantidadC6 = leer.nextInt();
                            if (cantidadC6 <= stockPavo) {
                                stockPavo -= cantidadC6;
                                totalPagar += (89.90 * cantidadC6);
                                System.out.println("Agregado exitosamente al carrito de compras");
                            }
                            else {
                                System.out.println("Stock insuficiente");
                            }
                            break;
                        case 7:
                            System.out.println("Ingrese la cantidad que desea llevar");
                            int cantidadC7 = leer.nextInt();
                            if (cantidadC7 <= stockJamon) {
                                stockJamon -= cantidadC7;
                                totalPagar += (32.50 * cantidadC7);
                                System.out.println("Agregado exitosamente al carrito de compras");
                            }
                            else {
                                System.out.println("Stock insuficiente");
                            }
                            break;
                        case 8:
                            System.out.println("Ingrese la cantidad que desea llevar");
                            int cantidadC8 = leer.nextInt();
                            if (cantidadC8 <= stockSalchicha) {
                                stockSalchicha -= cantidadC8;
                                totalPagar += (28.90 * cantidadC8);
                                System.out.println("Agregado exitosamente al carrito de compras");
                            }
                            else {
                                System.out.println("Stock insuficiente");
                            }
                            break;
                        case 9:
                            System.out.println("Ingrese la cantidad que desea llevar");
                            int cantidadC9 = leer.nextInt();
                            if (cantidadC9 <= stockAlitas) {
                                stockAlitas -= cantidadC9;
                                totalPagar += (25.40 * cantidadC9);
                                System.out.println("Agregado exitosamente al carrito de compras");
                            }
                            else {
                                System.out.println("Stock insuficiente");
                            }
                            break;
                        case 10:
                            System.out.println("Ingrese la cantidad que desea llevar");
                            int cantidadC10 = leer.nextInt();
                            if (cantidadC10 <= stockNugets) {
                                stockNugets -= cantidadC10;
                                totalPagar += (19.80 * cantidadC10);
                                System.out.println("Agregado exitosamente al carrito de compras");
                            }
                            else {
                                System.out.println("Stock insuficiente");
                            }
                            break;
                        default:
                            System.out.println("Opción no válida");
                    }
                    break;
                case 8:
                    System.out.println("----------Complementos----------");
                    System.out.println("--------------------------------------");
                    System.out.println("1. Arroz grande costeño de 5Kg /Stock: " + stockAgrande);
                    System.out.println("Precio: S/ 23.50");
                    System.out.println("--------------------------------------");
                    System.out.println("2. Arroz pequeño costeño de 1Kg /Stock: " + stockApequenia);
                    System.out.println("Precio: S/ 4.90");
                    System.out.println("--------------------------------------");
                    System.out.println("3. Arroz mega costeño de 10Kg /Stock: " + stockAMega);
                    System.out.println("Precio: S/ 45.40");
                    System.out.println("--------------------------------------");
                    System.out.println("4. Vinagre de manzana de 500ml /Stock: " + stockVinagre);
                    System.out.println("Precio: S/ 7.20");
                    System.out.println("--------------------------------------");
                    System.out.println("5. Aceitunas verdes de 250g /Stock: " + stockAceitunaV);
                    System.out.println("Precio: S/ 5.30");
                    System.out.println("--------------------------------------");
                    System.out.println("6. Aceitunas negras de 250g /Stock: " + stockAceitunaN);
                    System.out.println("Precio: S/ 5.80");
                    System.out.println("--------------------------------------");
                    System.out.println("7. Salsa lista de tomate hongo y carne de 200g /Stock: " + stockSalsa);
                    System.out.println("Precio: S/ 4.50");
                    System.out.println("--------------------------------------");
                    System.out.println("8. Queso edam laminado de 200g /Stock: " + stockQueso);
                    System.out.println("Precio: S/ 11.20");
                    System.out.println("--------------------------------------");
                    System.out.println("9. Pasta de tomate de 150g /stock: " + stockPasta);
                    System.out.println("Precio: S/ 3.40");
                    System.out.println("---------------------------------------");
                    System.out.println("10. Tomate pelado en cubos de 400g /stock:" + stockTomate);
                    System.out.println("Precio: S/ 5.20");
                    System.out.println("---------------------------------------");

                    System.out.println("Seleccione el complemento a comprar[En números]:");
                    int opcionCom = leer.nextInt();

                    switch (opcionCom) {
                        case 1:
                            System.out.println("Ingrese la cantidad que desea llevar");
                            int cantidadCom1 = leer.nextInt();

                            if (cantidadCom1 <= stockAgrande) {
                                stockAgrande = stockAgrande - cantidadCom1;
                                totalPagar = totalPagar + (23.50 * cantidadCom1);
                                System.out.println("Agregado exitosamente al carrito de compras");
                            }
                            else {
                                System.out.println("Stock insuficiente");
                            }
                            break;
                        case 2:
                            System.out.println("Ingrese la cantidad que desea llevar");
                            int cantidadCom2 = leer.nextInt();

                            if (cantidadCom2 <= stockApequenia) {
                                stockApequenia = stockApequenia - cantidadCom2;
                                totalPagar = totalPagar + (4.90 * cantidadCom2);
                                System.out.println("Agregado exitosamente al carrito de compras");
                            }
                            else {
                                System.out.println("Stock insuficiente");
                            }
                            break;
                        case 3:
                            System.out.println("Ingrese la cantidad que desea llevar");
                            int cantidadCom3 = leer.nextInt();

                            if (cantidadCom3 <= stockAMega) {
                                stockAMega -= cantidadCom3;
                                totalPagar += (45.40 * cantidadCom3);
                                System.out.println("Agregado exitosamente al carrito de compras");
                            }
                            else {
                                System.out.println("Stock insuficiente");
                            }
                            break;
                        case 4:
                            System.out.println("Ingrese la cantidad que desea llevar");
                            int cantidadCom4 = leer.nextInt();

                            if (cantidadCom4 <= stockVinagre) {
                                stockVinagre -= cantidadCom4;
                                totalPagar += (7.20 * cantidadCom4);
                                System.out.println("Agregado exitosamente al carrito de compras");
                            }
                            else {
                                System.out.println("Stock insuficiente");
                            }
                            break;
                        case 5:
                            System.out.println("Ingrese la cantidad que desea llevar");
                            int cantidadCom5 = leer.nextInt();

                            if (cantidadCom5 <= stockAceitunaV) {
                                stockAceitunaV -= cantidadCom5;
                                totalPagar += (5.30 * cantidadCom5);
                                System.out.println("Agregado exitosamente al carrito de compras");
                            }
                            else {
                                System.out.println("Stock insuficiente");
                            }
                            break;
                        case 6:
                            System.out.println("Ingrese la cantidad que desea llevar");
                            int cantidadCom6 = leer.nextInt();

                            if (cantidadCom6 <= stockAceitunaN) {
                                stockAceitunaN -= cantidadCom6;
                                totalPagar += (5.80 * cantidadCom6);
                                System.out.println("Agregado exitosamente al carrito de compras");
                            }
                            else {
                                System.out.println("Stock insuficiente");
                            }
                            break;
                        case 7:
                            System.out.println("Ingrese la cantidad que desea llevar");
                            int cantidadCom7 = leer.nextInt();

                            if (cantidadCom7 <= stockSalsa) {
                                stockSalsa -= cantidadCom7;
                                totalPagar += (4.50 * cantidadCom7);
                                System.out.println("Agregado exitosamente al carrito de compras");
                            }
                            else {
                                System.out.println("Stock insuficiente");
                            }
                            break;
                        case 8:
                            System.out.println("Ingrese la cantidad que desea llevar");
                            int cantidadCom8 = leer.nextInt();

                            if (cantidadCom8 <= stockQueso) {
                                stockQueso -= cantidadCom8;
                                totalPagar += (11.20 * cantidadCom8);
                                System.out.println("Agregado exitosamente al carrito de compras");
                            }
                            else {
                                System.out.println("Stock insuficiente");
                            }
                            break;
                        case 9:
                            System.out.println("Ingrese la cantidad que desea llevar");
                            int cantidadCom9 = leer.nextInt();

                            if (cantidadCom9 <= stockPasta) {
                                stockPasta -= cantidadCom9;
                                totalPagar += (3.40 * cantidadCom9);
                                System.out.println("Agregado exitosamente al carrito de compras");
                            }
                            else {
                                System.out.println("Stock insuficiente");
                            }
                            break;
                        case 10:
                            System.out.println("Ingrese la cantidad que desea llevar");
                            int cantidadCom10 = leer.nextInt();

                            if (cantidadCom10 <= stockTomate) {
                                stockTomate -= cantidadCom10;
                                totalPagar += (5.20 * cantidadCom10);
                                System.out.println("Agregado exitosamente al carrito de compras");
                            }
                            else {
                                System.out.println("Stock insuficiente");
                            }
                            break;
                        default:
                            System.out.println("Opción no válida");
                    }
                    break;
                case 9:
                    System.out.println("Monto acumulado en el carrito de compras:");
                    System.out.println("Total actual: S/ " + totalPagar);
                    break;
                case 10:
                    if (totalPagar == 0) {
                        System.out.println("Tu carrito está vacío. Agrega productos antes de pagar.");
                        break;
                    }
                    String metodoPago = MetodoPago(leer);
                    String sucursalRecojo = ValidarSucursalRecojo(leer);
                    double montoFinal;
                    if (metodoPago.equals("Efectivo")) {
                        montoFinal = PagoEfectivo(leer, totalPagar);
                    } else {
                        PagoTarjeta(leer, totalPagar);
                        montoFinal = totalPagar;
                    }
                    generarBoleta(correoCliente, totalPagar, montoFinal, metodoPago, sucursalRecojo);
                    break;
                case 11:
                    System.out.println("Cerrando sesión en la tienda...");
                    estadoTienda = false;
                    break;
                default:
                    System.out.println("Opción de menú inválida.");
            }
        }
    }
    public static String MetodoPago(Scanner leer) {
        System.out.println("--- MÉTODOS DE PAGO ---");
        System.out.println("1. Efectivo");
        System.out.println("2. Tarjeta");
        System.out.println("Seleccione su método de pago:");
        int opcionPago = leer.nextInt();
        leer.nextLine();
        String metodoTexto = "";
        switch (opcionPago) {
            case 1:
                metodoTexto = "Efectivo";
                break;
            case 2:
                metodoTexto = "Tarjeta";
                break;
            default:
                System.out.println("Opción incorrecta. Se seleccionará Efectivo por defecto.");
                metodoTexto = "Efectivo";
                break;
        }
        return metodoTexto;
    }
    public static String ValidarSucursalRecojo(Scanner leer) {
        System.out.println("--- TIENDAS DISPONIBLES RECOJO ---");
        System.out.println("1. San Fernando - Tienda Puno");
        System.out.println("2. San Fernando - Tienda Juliaca");
        System.out.println("3. San Fernando - Tienda Arequipa");
        System.out.println("4. San Fernando - Tienda Lima");
        System.out.println("5. San Fernando - Tienda Moquegua");
        System.out.println("Seleccione local para recojo:");
        int opcionSucursal = leer.nextInt();
        leer.nextLine();
        String sucursalRecojo = "";
        switch (opcionSucursal) {
            case 1:
                sucursalRecojo = "Tienda Puno";
                break;
            case 2:
                sucursalRecojo = "Tienda Juliaca";
                break;
            case 3:
                sucursalRecojo = "Tienda Arequipa";
                break;
            case 4:
                sucursalRecojo= "Tienda Lima";
                break;
            case 5:
                sucursalRecojo = "Tienda Moquegua";
                break;
            default:
                System.out.println("Opción incorrecta.");
                break;
        }
        return sucursalRecojo;
    }
    public static double PagoTarjeta(Scanner leer, double  total) {
        String nroTarjeta, fechaVencimiento, cvv;
        boolean pAprovado = false;
        System.out.println("Monto total a pagar con tarjeta es:" + total);
        do {
            System.out.println("Ingrese los 16 digitos de la tarjeta");
            nroTarjeta = leer.nextLine();
            System.out.println("Ingrese la fecha de caducidad (MM/AA) ");
            fechaVencimiento = leer.nextLine();
            System.out.println("Ingrese el código de seguridads CVV");
            cvv = leer.nextLine();

            boolean tarjetaOk = (nroTarjeta.length() == 16);
            boolean cvvOk = (cvv.length() == 3);
            boolean fechaEstructuraOk = (fechaVencimiento.length() == 5 && fechaVencimiento.contains("/"));
            boolean fechaNoVencida = false;
            if (fechaEstructuraOk) {
                try {
                    //intenta esto
                    DateTimeFormatter formateador = DateTimeFormatter.ofPattern("MM/yy");
                    YearMonth fechaTarjeta = YearMonth.parse(fechaVencimiento, formateador);
                    YearMonth fechaActual = YearMonth.now();
                    if (fechaTarjeta.isAfter(fechaActual) || fechaTarjeta.equals(fechaActual)) {
                        fechaNoVencida = true;
                    }
                } catch (DateTimeParseException e) {
                    //muestra el error aqui
                    fechaEstructuraOk = false;
                }
            }
            if (tarjetaOk && fechaEstructuraOk && fechaNoVencida) {
                System.out.println(" Autorizando fondos... transaccion exitosa");
                pAprovado = true;
            } else {
                System.out.println("Operación denegada por la pasarela bancaria");
            }
            if (!tarjetaOk) {
                System.out.println("El número de tarjeta debe contener exactamente 16 dígitos");
            }
            if (!fechaEstructuraOk) {
                System.out.println("Formato de fecha incorrecto");
            }
            if (fechaEstructuraOk && !fechaNoVencida) {
                System.out.println("Tarjeta caducada");
            }
            if (!cvvOk) {
                System.out.println("El CVV debe contener 3 dígitos");
            }
            if (!pAprovado) {
            System.out.println("Intente nuevamente el pago electrónico");
            }
        }
        while (!pAprovado);
        return total;
    }
    public static double PagoEfectivo(Scanner leer, double totalPagar) {
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
    public static void generarBoleta(String correoCliente, double totalPagar, double montoEntregado, String metodoPago, String sucursalRecojo) {
        double subtotalPago = totalPagar / 1.18;
        double impuestoIgv = totalPagar - subtotalPago;
        double vueltoPago = montoEntregado - totalPagar;
        System.out.println("        BOLETA DE VENTA         ");
        System.out.println("Usuario:         " + correoCliente);
        System.out.println("Método de Pago:  " + metodoPago);
        System.out.println("Local de Recojo: " + sucursalRecojo);
        System.out.println("Subtotal:        S/ " + subtotalPago);
        System.out.println("IGV:             S/ " + impuestoIgv);
        System.out.println("TOTAL A PAGAR:   S/ " + totalPagar);
        System.out.println("Monto Entregado: S/ " + montoEntregado);
        System.out.println("Vuelto:          S/ " + vueltoPago);
        System.out.println("Gracias por su compra en San Fernando");
        System.exit(0);
    }
}