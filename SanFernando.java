import java.util.Scanner;
import java.util.ArrayList;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
public class SanFernando {
    //pollo
    static ArrayList<String> pollo = new ArrayList<>();
    static ArrayList<Double> precioPollo = new ArrayList<>();
    static ArrayList<Integer> stockPollo = new ArrayList<>();
    static ArrayList<Integer> carritoPollo = new ArrayList<>();
    //pavita
    static ArrayList<String> pavita = new ArrayList<>();
    static ArrayList<Double> precioPavita = new ArrayList<>();
    static ArrayList<Integer> stockPavita = new ArrayList<>();
    static ArrayList<Integer> carritoPavita = new ArrayList<>();
    //cerdo
    static ArrayList<String> cerdo = new ArrayList<>();
    static ArrayList<Double> precioCerdo = new ArrayList<>();
    static ArrayList<Integer> stockCerdo = new ArrayList<>();
    static ArrayList<Integer> carritoCerdo = new ArrayList<>();
    //huevos
    static ArrayList<String> huevos = new ArrayList<>();
    static ArrayList<Double> precioHuevos = new ArrayList<>();
    static ArrayList<Integer> stockHuevos = new ArrayList<>();
    static ArrayList<Integer> carritoHuevos = new ArrayList<>();
    //congelados
    static ArrayList<String> congelados = new ArrayList<>();
    static ArrayList<Double> precioCongelados = new ArrayList<>();
    static ArrayList<Integer> stockCongelados = new ArrayList<>();
    static ArrayList<Integer> carritoCongelados = new ArrayList<>();
    //emmbutidos
    static ArrayList<String> embutidos = new ArrayList<>();
    static ArrayList<Double> precioEmbutidos = new ArrayList<>();
    static ArrayList<Integer> stockEmbutidos = new ArrayList<>();
    static ArrayList<Integer> carritoEmbutidos = new ArrayList<>();
    // celebridades
    static ArrayList<String> celebridades = new ArrayList<>();
    static ArrayList<Double> precioCelebridades = new ArrayList<>();
    static ArrayList<Integer> stockCelebridades = new ArrayList<>();
    static ArrayList<Integer> carritoCelebridades = new ArrayList<>();
    //complementos
    static ArrayList<String> complementos = new ArrayList<>();
    static ArrayList<Double> precioComplementos = new ArrayList<>();
    static ArrayList<Integer> stockComplementos = new ArrayList<>();
    static ArrayList<Integer> carritoComplementos = new ArrayList<>();

    static String usuarioActivo = "invitado";
    static String correoRegistrado = " ";
    static String contraseñaRegistrada = " ";
    static boolean cuentaCreada = false;
    static boolean sesionIniciada = false;
    static boolean esAdmin = false;
    static Scanner leer = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(" ███████╗  █████╗ ███╗   ██╗    ███████╗███████╗██████╗ ███╗   ██╗ █████╗ ███╗   ██╗██████╗  ██████╗ ");
        System.out.println(" ██╔════╝ ██╔══██╗████╗  ██║    ██╔════╝██╔════╝██╔══██╗████╗  ██║██╔══██╗████╗  ██║██╔══██╗██╔═══██╗");
        System.out.println(" ███████╗ ███████║██╔██╗ ██║    █████╗  █████╗  ██████╔╝██╔██╗ ██║███████║██╔██╗ ██║██║  ██║██║   ██║");
        System.out.println(" ╚════██║ ██╔══██║██║╚██╗██║    ██╔══╝  ██╔══╝  ██╔══██╗██║╚██╗██║██╔══██║██║╚██╗██║██║  ██║██║   ██║");
        System.out.println(" ███████║ ██║  ██║██║ ╚████║    ██║     ███████╗██║  ██║██║ ╚████║██║  ██║██║ ╚████║██████╔╝╚██████╔╝");
        System.out.println(" ╚══════╝ ╚═╝  ╚═╝╚═╝  ╚═══╝    ╚═╝     ╚══════╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═════╝  ╚═════╝ ");
        System.out.println();
        System.out.println("                           ╔══════════════════════╗");
        System.out.println("                           ║   LA BUENA FAMILIA   ║");
        System.out.println("                           ╚══════════════════════╝");
        System.out.println();
        inicializarDatos();
        menuPrincipal();
    }
    public static void inicializarDatos() {
        //pollo
        pollo.add("Pollo entero fresco 2.05 kg");
        precioPollo.add(10.90);
        stockPollo.add(10);
        pollo.add("Pollo entero fresco 2.45 kg");
        precioPollo.add(11.20);
        stockPollo.add(10);
        pollo.add("Pollo entero sin piel");
        precioPollo.add(19.40);
        stockPollo.add(10);
        pollo.add("Pollo sazon brasa 1.4 kg");
        precioPollo.add(26.40);
        stockPollo.add(10);
        pollo.add("Pierna de pollo fresca");
        precioPollo.add(17.50);
        stockPollo.add(10);
        pollo.add("Pierna de pollo congelada");
        precioPollo.add(13.90);
        stockPollo.add(10);
        pollo.add("Muslo de pollo fresco");
        precioPollo.add(14.00);
        stockPollo.add(10);
        pollo.add("Muslo de pollo congelado");
        precioPollo.add(15.30);
        stockPollo.add(10);
        pollo.add("Pechuga entera de pollo");
        precioPollo.add(14.90);
        stockPollo.add(10);
        pollo.add("Molleja de pollo");
        precioPollo.add(13.90);
        stockPollo.add(10);
        // pavita
        pavita.add("Pechuga Especial de Pavita");
        precioPavita.add(113.00);
        stockPavita.add(10);
        pavita.add("Chuleta de Pavita Corte Mediano");
        precioPavita.add(30.00);
        stockPavita.add(10);
        pavita.add("Carne Molida de Pavita x500g");
        precioPavita.add(21.30);
        stockPavita.add(10);
        pavita.add("Pack Pechuga de Pavita en Trozos");
        precioPavita.add(18.50);
        stockPavita.add(10);
        pavita.add("Medallon de Pavita x500g");
        precioPavita.add(12.50);
        stockPavita.add(10);
        pavita.add("Guiso de muslo de pavita x1.5kg");
        precioPavita.add(20.20);
        stockPavita.add(10);
        pavita.add("Filete de pechuga de pavita x1.5kg");
        precioPavita.add(27.50);
        stockPavita.add(10);
        pavita.add("Brazuelo de pavita");
        precioPavita.add(12.00);
        stockPavita.add(10);
        pavita.add("Rodaja de pavita x1.5kg");
        precioPavita.add(17.00);
        stockPavita.add(10);
        pavita.add("Guiso de pechuga de pavita");
        precioPavita.add(14.40);
        stockPavita.add(10);
        // cerdo
        cerdo.add("Panceta de cerdo con piel y hueso");
        precioCerdo.add(38.10);
        stockCerdo.add(10);
        cerdo.add("Chuleta lomo de cerdo Rango");
        precioCerdo.add(17.50);
        stockCerdo.add(10);
        cerdo.add("Chuleta de pierna cerdo sin piel");
        precioCerdo.add(20.90);
        stockCerdo.add(10);
        cerdo.add("Chuleta brazuelo cerdo sin piel");
        precioCerdo.add(19.80);
        stockCerdo.add(10);
        cerdo.add("Medallon de lomo de cerdo");
        precioCerdo.add(33.90);
        stockCerdo.add(10);
        cerdo.add("Chuleta lomo de cerdo x kg");
        precioCerdo.add(34.90);
        stockCerdo.add(10);
        cerdo.add("Pulpa de Pierna de Cerdo");
        precioCerdo.add(33.50);
        stockCerdo.add(10);
        cerdo.add("Panceta de cerdo sin piel y sin hueso");
        precioCerdo.add(43.00);
        stockCerdo.add(10);
        cerdo.add("Costilla Especial Lomo Cerdo");
        precioCerdo.add(22.50);
        stockCerdo.add(10);
        cerdo.add("Tocino de Cerdo");
        precioCerdo.add(18.90);
        stockCerdo.add(10);
        // huevos
        huevos.add("Huevos de gallina x15 und");
        precioHuevos.add(9.20);
        stockHuevos.add(10);
        huevos.add("Huevos de gallina x30 und");
        precioHuevos.add(18.30);
        stockHuevos.add(10);
        // congelados
        congelados.add("Nuggets de pavita x2kg");
        precioCongelados.add(78.00);
        stockCongelados.add(10);
        congelados.add("Nuggets de pechuga x2kg");
        precioCongelados.add(52.00);
        stockCongelados.add(10);
        congelados.add("Nuggets de Pollo bolsa x2kg");
        precioCongelados.add(48.50);
        stockCongelados.add(10);
        congelados.add("Milanesa de Pollo Apanada x10und");
        precioCongelados.add(27.50);
        stockCongelados.add(10);
        congelados.add("Suprema apanada de pollo x10und");
        precioCongelados.add(24.20);
        stockCongelados.add(10);
        congelados.add("Hamburguesa de Res y Cerdo x8und");
        precioCongelados.add(24.80);
        stockCongelados.add(10);
        congelados.add("Dinonuggets de Pollo x5und");
        precioCongelados.add(5.90);
        stockCongelados.add(10);
        congelados.add("Tiras de pechuga de pollo");
        precioCongelados.add(13.50);
        stockCongelados.add(10);
        congelados.add("Chicharron de pechuga de pollo");
        precioCongelados.add(13.50);
        stockCongelados.add(10);
        congelados.add("Hamburguesa de pavita");
        precioCongelados.add(17.40);
        stockCongelados.add(10);
        // embutidos
        embutidos.add("Chorizo Parrillero x400g");
        precioEmbutidos.add(15.50);
        stockEmbutidos.add(10);
        embutidos.add("Chorizo Finas Hierbas x400g");
        precioEmbutidos.add(17.00);
        stockEmbutidos.add(10);
        embutidos.add("Hot dog ahumado de pollo x440g");
        precioEmbutidos.add(8.50);
        stockEmbutidos.add(10);
        embutidos.add("Pack Jamon sandwich 378g y Queso edam 306g");
        precioEmbutidos.add(31.25);
        stockEmbutidos.add(10);
        embutidos.add("Jamon ahumado de pavita x150g");
        precioEmbutidos.add(11.10);
        stockEmbutidos.add(10);
        embutidos.add("Hot dog ahumado de pollo x220g");
        precioEmbutidos.add(4.80);
        stockEmbutidos.add(10);
        embutidos.add("Pack Jamon sandwich 230g y Queso edam 108g");
        precioEmbutidos.add(14.10);
        stockEmbutidos.add(10);
        embutidos.add("Tripack salchicha huachana");
        precioEmbutidos.add(13.10);
        stockEmbutidos.add(10);
        //celebridades
        celebridades.add("Pierna de Cerdo Congelado");
        precioCelebridades.add(24.00);
        stockCelebridades.add(10);
        celebridades.add("Enrollado americano de pavita");
        precioCelebridades.add(42.40);
        stockCelebridades.add(10);
        celebridades.add("Enrollado delizia de cerdo");
        precioCelebridades.add(41.00);
        stockCelebridades.add(10);
        celebridades.add("Enrollado americano de pollo");
        precioCelebridades.add(37.10);
        stockCelebridades.add(10);
        celebridades.add("Enrollado delizia de pollo");
        precioCelebridades.add(37.30);
        stockCelebridades.add(10);
        celebridades.add("Pavo entero congelado");
        precioCelebridades.add(89.90);
        stockCelebridades.add(10);
        celebridades.add("Jamon ingles especial");
        precioCelebridades.add(32.50);
        stockCelebridades.add(10);
        celebridades.add("Salchicha parrillera familiar");
        precioCelebridades.add(28.90);
        stockCelebridades.add(10);
        celebridades.add("Alitas BBQ marinadas");
        precioCelebridades.add(25.40);
        stockCelebridades.add(10);
        celebridades.add("Nuggets de pollo crocante");
        precioCelebridades.add(19.80);
        stockCelebridades.add(10);
        // complementos
        complementos.add("Arroz grande costeno 5kg");
        precioComplementos.add(23.50);
        stockComplementos.add(10);
        complementos.add("Arroz pequeno costeno 1kg");
        precioComplementos.add(4.90);
        stockComplementos.add(10);
        complementos.add("Arroz mega costeno 10kg");
        precioComplementos.add(45.40);
        stockComplementos.add(10);
        complementos.add("Vinagre de manzana 500ml");
        precioComplementos.add(7.20);
        stockComplementos.add(10);
        complementos.add("Aceitunas verdes 250g");
        precioComplementos.add(5.30);
        stockComplementos.add(10);
        complementos.add("Aceitunas negras 250g");
        precioComplementos.add(5.80);
        stockComplementos.add(10);
        complementos.add("Salsa lista tomate hongo y carne 200g");
        precioComplementos.add(4.50);
        stockComplementos.add(10);
        complementos.add("Queso edam laminado 200g");
        precioComplementos.add(11.20);
        stockComplementos.add(10);
        complementos.add("Pasta de tomate 150g");
        precioComplementos.add(3.40);
        stockComplementos.add(10);
        complementos.add("Tomate pelado en cubos 400g");
        precioComplementos.add(5.20);
        stockComplementos.add(10);
    }

    public static void menuPrincipal() {
        boolean estado = true;
        while (estado) {
            System.out.println("--- San Fernando ---");
            System.out.println("Status: [" + usuarioActivo + "] [Admin: " + esAdmin + "]");
            System.out.println("0.- Salir");
            System.out.println("1.- Iniciar Sesion");
            System.out.println("2.- Crear Cuenta");
            System.out.println("3.- Entrar a la Tienda");
            if (esAdmin) {
                System.out.println("4.- Panel de ADMINISTRADOR");
            }
            System.out.println("Seleccione una opcion:");
            int opcion = leer.nextInt();
            leer.nextLine();
            switch (opcion) {
                case 0:
                    System.out.println("Saliendo del sistema...");
                    estado = false;
                    break;
                case 1:
                    iniciarSesion();
                    break;
                case 2:
                    crearCuenta();
                    break;
                case 3:
                    if (sesionIniciada == true) {
                        tiendaSanFernando();
                    }
                    else {
                        System.out.println("Debe iniciar sesion para acceder a la tienda");
                    }
                    break;
                case 4:
                    if (esAdmin == true) {
                        menuAdminCRUD();
                    }
                    else {
                        System.out.println("Udeted no es Adminitrador");
                    }
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
    public static void iniciarSesion() {
        System.out.println("Ingrese su correo:");
        String correoIngresado = leer.nextLine();
        System.out.println("Ingrese su contraseña:");
        String passIngresada = leer.nextLine();
        if (correoIngresado.equals("upeu@gmail.com") && passIngresada.equals("123456789")) {
            esAdmin = true;
            sesionIniciada = true;
            usuarioActivo = "admin";
            System.out.println("Bienvenido " + usuarioActivo);
            return;
        }
        boolean correoOk = correoIngresado.equals(correoRegistrado);
        boolean passOk = passIngresada.equals(contraseñaRegistrada);
        if (correoOk && passOk) {
            sesionIniciada = true;
            esAdmin = false;
            usuarioActivo = correoRegistrado;
            System.out.println("Sesion iniciada como: " + usuarioActivo);
        }
        else {
            System.out.println("Correo o contraseña incorrectos");
        }
    }
    public static void crearCuenta() {
        System.out.println("-----CREAR CUENTA------");
        if (cuentaCreada) {
            System.out.println("Ya existe una cuenta. Inicie sesion.");
        }
        else {
            boolean registroExitoso = false;
            do {
                System.out.println("Ingrese su correo:");
                correoRegistrado = leer.nextLine();
                System.out.println("Ingrese su contraseña:");
                contraseñaRegistrada = leer.nextLine();
                boolean correoOk = correoRegistrado.contains("@") && correoRegistrado.endsWith(".com");
                boolean passOk = contraseñaRegistrada.length() >= 8;
                if (!correoOk || !passOk) {
                    System.out.println("Error, los datos no cumplen requisitos:");
                    if (!correoOk) {
                        System.out.println("El correo debe contener @ y terminar en .com");
                    }
                    if (!passOk) {
                        System.out.println("La contraseña debe tener minimo 8 caracteres");
                    }
                    System.out.println("Desea cancelar el registro? (S/N)");
                    String cancelar = leer.nextLine();
                    if (cancelar.equalsIgnoreCase("S")) {
                        break;
                    }
                    else {
                        continue;
                    }
                }
                cuentaCreada = true;
                registroExitoso = true;
                System.out.println("Cuenta creada con exito. Inicie sesion.");
            } while (!registroExitoso);
        }
    }
    public static void tiendaSanFernando() {
        for (int i = 0; i < pollo.size(); i++) {
            carritoPollo.add(0);
        }
        for (int i = 0; i < pavita.size(); i++) {
            carritoPavita.add(0);
        }
        for (int i = 0; i < cerdo.size(); i++) {
            carritoCerdo.add(0);
        }
        for (int i = 0; i < huevos.size(); i++) {
            carritoHuevos.add(0);
        }
        for (int i = 0; i < congelados.size(); i++) {
            carritoCongelados.add(0);
        }
        for (int i = 0; i < embutidos.size(); i++) {
            carritoEmbutidos.add(0);
        }
        for (int i = 0; i < celebridades.size(); i++) {
            carritoCelebridades.add(0);
        }
        for (int i = 0; i < complementos.size(); i++) {
            carritoComplementos.add(0);
        }
        int opcionTienda = 0;
        while (opcionTienda != 10) {
            System.out.println("--- TIENDA SAN FERNANDO ---");
            System.out.println("Usuario: [" + usuarioActivo + "]");
            System.out.println("1.- Pollo");
            System.out.println("2.- Pavita");
            System.out.println("3.- Cerdo");
            System.out.println("4.- Huevos");
            System.out.println("5.- Congelados");
            System.out.println("6.- Embutidos");
            System.out.println("7.- Celebridades");
            System.out.println("8.- Complementos");
            System.out.println("9.- Ver Carrito y Pagar");
            System.out.println("10.- Volver al menu principal");
            System.out.println("Seleccione una opcion:");
            opcionTienda = leer.nextInt();
            switch (opcionTienda) {
                case 1:
                    productosPollo();
                    break;
                case 2:
                    productosPavita();
                    break;
                case 3:
                    productosCerdo();
                    break;
                case 4:
                    productosHuevo();
                    break;
                case 5:
                   productosCongelados();
                    break;
                case 6:
                    productosEmbutidos();
                    break;
                case 7:
                    productosCelebridades();
                    break;
                case 8:
                    productosComplementos();
                    break;
                case 9:
                    mostrarCarritoYPagar();
                    opcionTienda = 10;
                    break;
                case 10:
                    System.out.println("Regresando al menu principal...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
    public static void productosPollo() {
        System.out.println("--- POLLO ---");
        imprimirProductos(pollo, precioPollo, stockPollo);
        System.out.println("Seleccione un producto (-1 para cancelar):");
        int posPollo = leer.nextInt();
        if (posPollo >= 0 && posPollo < pollo.size()) {
            System.out.println("Cuantos " + pollo.get(posPollo) + " desea agregar al carrito:");
            int cant = leer.nextInt();
            if (cant <= stockPollo.get(posPollo)) {
                carritoPollo.set(posPollo, carritoPollo.get(posPollo) + cant);
                stockPollo.set(posPollo, stockPollo.get(posPollo) - cant);
                System.out.println(cant + " " + pollo.get(posPollo) + " agregado al carrito");
            }
            else {
                System.out.println("Stock insuficiente. Solo hay: " + stockPollo.get(posPollo));
            }
        }
    }
    public static void productosPavita() {
        System.out.println("--- PAVITA ---");
        imprimirProductos(pavita, precioPavita, stockPavita);
        System.out.println("Seleccione un producto (-1 para cancelar):");
        int posPavita = leer.nextInt();
        if (posPavita >= 0 && posPavita < pavita.size()) {
            System.out.println("Cuantos " + pavita.get(posPavita) + " desea agregar al carrito:");
            int cant = leer.nextInt();
            if (cant <= stockPavita.get(posPavita)) {
                carritoPavita.set(posPavita, carritoPavita.get(posPavita) + cant);
                stockPavita.set(posPavita, stockPavita.get(posPavita) - cant);
                System.out.println(cant + " " + pavita.get(posPavita) + " agregado al carrito");
            }
            else {
                System.out.println("Stock insuficiente. Solo hay: " + stockPavita.get(posPavita));
            }
        }
    }
    public static void productosCerdo() {
        System.out.println("--- CERDO ---");
        imprimirProductos(cerdo, precioCerdo, stockCerdo);
        System.out.println("Seleccione un producto (-1 para cancelar):");
        int posCerdo = leer.nextInt();
        if (posCerdo >= 0 && posCerdo < cerdo.size()) {
            System.out.println("Cuantos " + cerdo.get(posCerdo) + " desea agregar al carrito:");
            int cant = leer.nextInt();
            if (cant <= stockCerdo.get(posCerdo)) {
                carritoCerdo.set(posCerdo, carritoCerdo.get(posCerdo) + cant);
                stockCerdo.set(posCerdo, stockCerdo.get(posCerdo) - cant);
                System.out.println(cant + " " + cerdo.get(posCerdo) + " agregado al carrito");
            } else {
                System.out.println("Stock insuficiente. Solo hay: " + stockCerdo.get(posCerdo));
            }
        }
    }
    public static void productosHuevo() {
        System.out.println("--- HUEVOS ---");
        imprimirProductos(huevos, precioHuevos, stockHuevos);
        System.out.println("Seleccione un producto (-1 para cancelar):");
        int posHuevos = leer.nextInt();
        if (posHuevos >= 0 && posHuevos < huevos.size()) {
            System.out.println("Cuantos " + huevos.get(posHuevos) + " desea agregar al carrito:");
            int cant = leer.nextInt();
            if (cant <= stockHuevos.get(posHuevos)) {
                carritoHuevos.set(posHuevos, carritoHuevos.get(posHuevos) + cant);
                stockHuevos.set(posHuevos, stockHuevos.get(posHuevos) - cant);
                System.out.println(cant + " " + huevos.get(posHuevos) + " agregado al carrito");
            }
            else {
                System.out.println("Stock insuficiente. Solo hay: " + stockHuevos.get(posHuevos));
            }
        }
    }
    public static void productosCongelados() {
        System.out.println("--- CONGELADOS ---");
        imprimirProductos(congelados, precioCongelados, stockCongelados);
        System.out.println("Seleccione un producto (-1 para cancelar):");
        int posCongelados = leer.nextInt();
        if (posCongelados >= 0 && posCongelados < congelados.size()) {
            System.out.println("Cuantos " + congelados.get(posCongelados) + " desea agregar al carrito:");
            int cant = leer.nextInt();
            if (cant <= stockCongelados.get(posCongelados)) {
                carritoCongelados.set(posCongelados, carritoCongelados.get(posCongelados) + cant);
                stockCongelados.set(posCongelados, stockCongelados.get(posCongelados) - cant);
                System.out.println(cant + " " + congelados.get(posCongelados) + " agregado al carrito");
            }
            else {
                System.out.println("Stock insuficiente. Solo hay: " + stockCongelados.get(posCongelados));
            }
        }
    }
    public static void productosEmbutidos() {
        System.out.println("--- EMBUTIDOS ---");
        imprimirProductos(embutidos, precioEmbutidos, stockEmbutidos);
        System.out.println("Seleccione un producto (-1 para cancelar):");
        int posEmbutidos = leer.nextInt();
        if (posEmbutidos >= 0 && posEmbutidos < embutidos.size()) {
            System.out.println("Cuantos " + embutidos.get(posEmbutidos) + " desea agregar al carrito:");
            int cant = leer.nextInt();
            if (cant <= stockEmbutidos.get(posEmbutidos)) {
                carritoEmbutidos.set(posEmbutidos, carritoEmbutidos.get(posEmbutidos) + cant);
                stockEmbutidos.set(posEmbutidos, stockEmbutidos.get(posEmbutidos) - cant);
                System.out.println(cant + " " + embutidos.get(posEmbutidos) + " agregado al carrito");
            }
            else {
                System.out.println("Stock insuficiente. Solo hay: " + stockEmbutidos.get(posEmbutidos));
            }
        }
    }
    public static void productosCelebridades() {
        System.out.println("--- CELEBRIDADES ---");
        imprimirProductos(celebridades, precioCelebridades, stockCelebridades);
        System.out.println("Seleccione un producto (-1 para cancelar):");
        int posCelebridades = leer.nextInt();
        if (posCelebridades >= 0 && posCelebridades < celebridades.size()) {
            System.out.println("Cuantos " + celebridades.get(posCelebridades) + " desea agregar al carrito:");
            int cant = leer.nextInt();
            if (cant <= stockCelebridades.get(posCelebridades)) {
                carritoCelebridades.set(posCelebridades, carritoCelebridades.get(posCelebridades) + cant);
                stockCelebridades.set(posCelebridades, stockCelebridades.get(posCelebridades) - cant);
                System.out.println(cant + " " + celebridades.get(posCelebridades) + " agregado al carrito");
            }
            else {
                System.out.println("Stock insuficiente. Solo hay: " + stockCelebridades.get(posCelebridades));
            }
        }
    }
    public static void productosComplementos() {
        System.out.println("--- COMPLEMENTOS ---");
        imprimirProductos(complementos, precioComplementos, stockComplementos);
        System.out.println("Seleccione un producto (-1 para cancelar):");
        int posComplementos = leer.nextInt();
        if (posComplementos >= 0 && posComplementos < complementos.size()) {
            System.out.println("Cuantos " + complementos.get(posComplementos) + " desea agregar al carrito:");
            int cant = leer.nextInt();
            if (cant <= stockComplementos.get(posComplementos)) {
                carritoComplementos.set(posComplementos, carritoComplementos.get(posComplementos) + cant);
                stockComplementos.set(posComplementos, stockComplementos.get(posComplementos) - cant);
                System.out.println(cant + " " + complementos.get(posComplementos) + " agregado al carrito");
            }
            else {
                System.out.println("Stock insuficiente. Solo hay: " + stockComplementos.get(posComplementos));
            }
        }
    }
    public static void mostrarCarritoYPagar() {
        System.out.println("================================");
        System.out.println("        SAN FERNANDO          ");
        System.out.println("================================");
        System.out.println("Cliente: " + usuarioActivo);
        System.out.println("--------------------------------");
        double total = 0;
        boolean carritoVacio = true;
        for (int i = 0; i < carritoPollo.size(); i++) {
            if (carritoPollo.get(i) > 0) {
                double sumtotal = carritoPollo.get(i) * precioPollo.get(i);
                System.out.println("Producto: " + pollo.get(i));
                System.out.println("Cant    : " + carritoPollo.get(i));
                System.out.println("P/unit  : S/ " + precioPollo.get(i));
                System.out.println("Sumtot  : S/ " + sumtotal);
                System.out.println("--------------------------------");
                total += sumtotal;
                carritoVacio = false;
            }
        }
        for (int i = 0; i < carritoPavita.size(); i++) {
            if (carritoPavita.get(i) > 0) {
                double sumtotal = carritoPavita.get(i) * precioPavita.get(i);
                System.out.println("Producto: " + pavita.get(i));
                System.out.println("Cant    : " + carritoPavita.get(i));
                System.out.println("P/unit  : S/ " + precioPavita.get(i));
                System.out.println("Sumtot  : S/ " + sumtotal);
                System.out.println("--------------------------------");
                total += sumtotal;
                carritoVacio = false;
            }
        }
        for (int i = 0; i < carritoCerdo.size(); i++) {
            if (carritoCerdo.get(i) > 0) {
                double sumtotal = carritoCerdo.get(i) * precioCerdo.get(i);
                System.out.println("Producto: " + cerdo.get(i));
                System.out.println("Cant    : " + carritoCerdo.get(i));
                System.out.println("P/unit  : S/ " + precioCerdo.get(i));
                System.out.println("Sumtot  : S/ " + sumtotal);
                System.out.println("--------------------------------");
                total += sumtotal;
                carritoVacio = false;
            }
        }
        for (int i = 0; i < carritoHuevos.size(); i++) {
            if (carritoHuevos.get(i) > 0) {
                double sumtotal = carritoHuevos.get(i) * precioHuevos.get(i);
                System.out.println("Producto: " + huevos.get(i));
                System.out.println("Cant    : " + carritoHuevos.get(i));
                System.out.println("P/unit  : S/ " + precioHuevos.get(i));
                System.out.println("Sumtot  : S/ " + sumtotal);
                System.out.println("--------------------------------");
                total += sumtotal;
                carritoVacio = false;
            }
        }
        for (int i = 0; i < carritoCongelados.size(); i++) {
            if (carritoCongelados.get(i) > 0) {
                double sumtotal = carritoCongelados.get(i) * precioCongelados.get(i);
                System.out.println("Producto: " + congelados.get(i));
                System.out.println("Cant    : " + carritoCongelados.get(i));
                System.out.println("P/unit  : S/ " + precioCongelados.get(i));
                System.out.println("Sumtot  : S/ " + sumtotal);
                System.out.println("--------------------------------");
                total += sumtotal;
                carritoVacio = false;
            }
        }
        for (int i = 0; i < carritoEmbutidos.size(); i++) {
            if (carritoEmbutidos.get(i) > 0) {
                double sumtotal = carritoEmbutidos.get(i) * precioEmbutidos.get(i);
                System.out.println("Producto: " + embutidos.get(i));
                System.out.println("Cant    : " + carritoEmbutidos.get(i));
                System.out.println("P/unit  : S/ " + precioEmbutidos.get(i));
                System.out.println("Subtot  : S/ " + sumtotal);
                System.out.println("--------------------------------");
                total += sumtotal;
                carritoVacio = false;
            }
        }
        for (int i = 0; i < carritoCelebridades.size(); i++) {
            if (carritoCelebridades.get(i) > 0) {
                double sumtotal = carritoCelebridades.get(i) * precioCelebridades.get(i);
                System.out.println("Producto: " + celebridades.get(i));
                System.out.println("Cant    : " + carritoCelebridades.get(i));
                System.out.println("P/unit  : S/ " + precioCelebridades.get(i));
                System.out.println("Sumtot  : S/ " + sumtotal);
                System.out.println("--------------------------------");
                total += sumtotal;
                carritoVacio = false;
            }
        }
        for (int i = 0; i < carritoComplementos.size(); i++) {
            if (carritoComplementos.get(i) > 0) {
                double sumtotal = carritoComplementos.get(i) * precioComplementos.get(i);
                System.out.println("Producto: " + complementos.get(i));
                System.out.println("Cant    : " + carritoComplementos.get(i));
                System.out.println("P/unit  : S/ " + precioComplementos.get(i));
                System.out.println("Sumtot  : S/ " + sumtotal);
                System.out.println("--------------------------------");
                total += sumtotal;
                carritoVacio = false;
            }
        }
        if (carritoVacio) {
            System.out.println("Tu carrito esta vacio");
            return;
        }
        double subtotal = total/1.18;
        double igv = total - subtotal;
        System.out.println("================================");
        System.out.println("Subtotal: S/ " + subtotal);
        System.out.println("IGV(18%): S/ " + igv);
        System.out.println("TOTAL   : S/ " + total);
        System.out.println("================================");
        System.out.println("1.- Efectivo");
        System.out.println("2.- Tarjeta");
        System.out.println("Seleccione metodo de pago:");
        int metodo = leer.nextInt();
        leer.nextLine();
        double montoEntregado = total;
        String metodoPago;
        switch (metodo) {
            case 1:
                montoEntregado = pagoEfectivo(total);
                metodoPago = "Efectivo";
                break;
            case 2:
                pagoTarjeta(total);
                metodoPago = "Tarjeta";
                break;
            default:
                System.out.println("Opcion no valida");
                return;
        }
        String sucursal = elegirSucursal();
        generarBoleta(total, subtotal, igv, montoEntregado, metodoPago, sucursal);
        for (int i = 0; i < carritoPollo.size(); i++) {
            carritoPollo.set(i, 0);
        }
        for (int i = 0; i < carritoPavita.size(); i++) {
            carritoPavita.set(i, 0);
        }
        for (int i = 0; i < carritoCerdo.size(); i++) {
            carritoCerdo.set(i, 0);
        }
        for (int i = 0; i < carritoHuevos.size(); i++) {
            carritoHuevos.set(i, 0);
        }
        for (int i = 0; i < carritoCongelados.size(); i++) {
            carritoCongelados.set(i, 0);
        }
        for (int i = 0; i < carritoEmbutidos.size(); i++) {
            carritoEmbutidos.set(i, 0);
        }
        for (int i = 0; i < carritoCelebridades.size(); i++) {
            carritoCelebridades.set(i, 0);
        }
        for (int i = 0; i < carritoComplementos.size(); i++) {
            carritoComplementos.set(i, 0);
        }
    }
    public static double pagoEfectivo(double total) {
        double montoEntregado = 0;
        while (montoEntregado < total) {
            System.out.println("TOTAL A PAGAR: S/ " + total);
            System.out.println("Ingrese monto de pago:");
            montoEntregado = leer.nextDouble();
            leer.nextLine();
            if (montoEntregado < total) {
                System.out.println("Dinero insuficiente. Falta: S/ " + (total - montoEntregado));
            }
        }
        return montoEntregado;
    }
    public static void pagoTarjeta(double total) {
        System.out.println("Monto a pagar con tarjeta: S/ " + total);
        boolean aprobado = false;
        do {
            System.out.println("Ingrese los 16 digitos de la tarjeta:");
            String nroTarjeta = leer.nextLine();
            System.out.println("Ingrese la fecha de caducidad (MM/AA):");
            String fecha = leer.nextLine();
            System.out.println("Ingrese el CVV:");
            String cvv = leer.nextLine();
            boolean tarjetaOk = nroTarjeta.length() == 16;
            boolean cvvOk = cvv.length() == 3;
            boolean fechaEstructOk = fecha.length() == 5 && fecha.contains("/");
            boolean fechaVigente = false;
            if (fechaEstructOk) {
                try {
                    DateTimeFormatter fmt = DateTimeFormatter.ofPattern("MM/yy");
                    YearMonth fechaTarjeta = YearMonth.parse(fecha, fmt);
                    YearMonth ahora = YearMonth.now();
                    fechaVigente = fechaTarjeta.isAfter(ahora) || fechaTarjeta.equals(ahora);
                } catch (DateTimeParseException e) {
                    fechaEstructOk = false;
                }
            }
            if (tarjetaOk && fechaEstructOk && fechaVigente && cvvOk) {
                System.out.println("Transaccion exitosa!");
                aprobado = true;
            } else {
                if (!tarjetaOk) {
                    System.out.println("El numero de tarjeta debe tener 16 digitos");
                }
                if (!fechaEstructOk) {
                    System.out.println("Formato de fecha incorrecto");
                }
                if (fechaEstructOk && !fechaVigente) {
                    System.out.println("Tarjeta caducada");
                }
                if (!cvvOk) {
                    System.out.println("El CVV debe tener 3 digitos");
                }
                System.out.println("Intente nuevamente");
            }
        } while (!aprobado);
    }
    public static String elegirSucursal() {
        System.out.println("--- TIENDAS DISPONIBLES ---");
        System.out.println("1.- San Fernando Puno");
        System.out.println("2.- San Fernando Juliaca");
        System.out.println("3.- San Fernando Arequipa");
        System.out.println("4.- San Fernando Lima");
        System.out.println("5.- San Fernando Moquegua");
        System.out.println("Seleccione sucursal de recojo:");
        int op = leer.nextInt();
        leer.nextLine();
        switch (op) {
            case 1:
                return "Tienda Puno";
            case 2:
                return "Tienda Juliaca";
            case 3:
                return "Tienda Arequipa";
            case 4:
                return "Tienda Lima";
            case 5:
                return "Tienda Moquegua";
            default:
                return "Tienda no seleccionada";
        }
    }
    public static void generarBoleta(double total, double subtotal, double igv, double montoEntregado, String metodoPago, String sucursal) {
        double vuelto = montoEntregado - total;
        System.out.println("================================");
        System.out.println("       BOLETA DE VENTA        ");
        System.out.println("================================");
        System.out.println("Cliente        : " + usuarioActivo);
        System.out.println("Metodo de Pago : " + metodoPago);
        System.out.println("Local de Recojo: " + sucursal);
        System.out.println("--------------------------------");
        System.out.println("Subtotal       : S/ " + subtotal);
        System.out.println("IGV (18%)      : S/ " + igv);
        System.out.println("TOTAL          : S/ " + total);
        System.out.println("Monto Entregado: S/ " + montoEntregado);
        System.out.println("Cambio        : S/ " + vuelto);
        System.out.println("================================");
        System.out.println("  Gracias por comprar en");
        System.out.println("      SAN FERNANDO");
        System.out.println("    LA BUENA FAMILIA"     );
        System.out.println("================================");
    }
    public static void menuAdminCRUD() {
        int opcionCRUD = 0;
        while (opcionCRUD != 5) {
            System.out.println("---BIENVENIDO ADMINISTRADOR SELECCIONE UNA OPCION");
            System.out.println("1.- REGISTRAR PRODUCTO EN EL CATALOGO");
            System.out.println("2.- ACTUALIZAR PRODUCTO EN EL CATALOGO");
            System.out.println("3.- ELIMINAR PRODUCTO EN EL CATALOGO");
            System.out.println("4.- BUSCAR PRODUCTO EN EL CATALOGO");
            System.out.println("5.- VOLVER AL MENU PRINCIPAL");
            opcionCRUD = leer.nextInt();
            leer.nextLine();
            switch (opcionCRUD) {
                case 1:
                    crudCrear();
                    break;
                case 2:
                    crudModificar();
                    break;
                case 3:
                    crudEliminar();
                    break;
                case 4:
                    crudBuscar();
                    break;
                case 5:
                    System.out.println("Regresando...");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
    }
    public static void crudCrear() {
        System.out.println("--- REGISTRAR NUEVO PRODUCTO ---");
        System.out.println("1.-Pollo");
        System.out.println("2._Pavita");
        System.out.println("3._Cerdo");
        System.out.println("4._Huevos");
        System.out.println("5._Congelados");
        System.out.println("6._Embutidos");
        System.out.println("7._Celebridades");
        System.out.println("8._Complementos");
        int tipo = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el nombre del producto:");
        String nombre = leer.nextLine();
        System.out.println("Ingrese el precio:");
        double precio = leer.nextDouble();
        System.out.println("Ingrese el stock:");
        int stock = leer.nextInt();
        leer.nextLine();
        switch (tipo) {
            case 1:
                pollo.add(nombre);
                precioPollo.add(precio);
                stockPollo.add(stock);
                carritoPollo.add(0);
                break;
            case 2:
                pavita.add(nombre);
                precioPavita.add(precio);
                stockPavita.add(stock);
                carritoPavita.add(0);
                break;
            case 3:
                cerdo.add(nombre);
                precioCerdo.add(precio);
                stockCerdo.add(stock);
                carritoCerdo.add(0);
                break;
            case 4:
                huevos.add(nombre);
                precioHuevos.add(precio);
                stockHuevos.add(stock);
                carritoHuevos.add(0);
                break;
            case 5:
                congelados.add(nombre);
                precioCongelados.add(precio);
                stockCongelados.add(stock);
                carritoCongelados.add(0);
                break;
            case 6:
                embutidos.add(nombre);
                precioEmbutidos.add(precio);
                stockEmbutidos.add(stock);
                carritoEmbutidos.add(0);
                break;
            case 7:
                celebridades.add(nombre);
                precioCelebridades.add(precio);
                stockCelebridades.add(stock);
                carritoCelebridades.add(0);
                break;
            case 8:
                complementos.add(nombre);
                precioComplementos.add(precio);
                stockComplementos.add(stock);
                carritoComplementos.add(0);
                break;
            default:
                System.out.println("Categoria no valida");
                return;
        }
        System.out.println("Producto registrado con exito.");
    }

    public static void crudModificar() {
        System.out.println("--- MODIFICAR PRODUCTO ---");
        System.out.println("1.-Pollo");
        System.out.println("2._Pavita");
        System.out.println("3._Cerdo");
        System.out.println("4._Huevos");
        System.out.println("5._Congelados");
        System.out.println("6._Embutidos");
        System.out.println("7._Celebridades");
        System.out.println("8._Complementos");
        int tipo = leer.nextInt();
        leer.nextLine();
        ArrayList<String> prod;
        ArrayList<Double> precios;
        ArrayList<Integer> stocks;
        switch (tipo) {
            case 1:
                prod = pollo;
                precios = precioPollo;
                stocks = stockPollo;
                break;
            case 2:
                prod = pavita;
                precios = precioPavita;
                stocks = stockPavita;
                break;
            case 3:
                prod = cerdo;
                precios = precioCerdo;
                stocks = stockCerdo;
                break;
            case 4:
                prod = huevos;
                precios = precioHuevos;
                stocks = stockHuevos;
                break;
            case 5:
                prod = congelados;
                precios = precioCongelados;
                stocks = stockCongelados;
                break;
            case 6:
                prod = embutidos;
                precios = precioEmbutidos;
                stocks = stockEmbutidos;
                break;
            case 7:
                prod = celebridades;
                precios = precioCelebridades;
                stocks = stockCelebridades;
                break;
            case 8:
                prod = complementos;
                precios = precioComplementos;
                stocks = stockComplementos;
                break;
            default:
                System.out.println("Categoria no valida");
                return;
        }
        imprimirProductos(prod, precios, stocks);
        System.out.println("Ingrese la posicion a modificar:");
        int pos = leer.nextInt();
        leer.nextLine();
        if (pos >= 0 && pos < prod.size()) {
            System.out.println("Nuevo nombre:");
            prod.set(pos, leer.nextLine());
            System.out.println("Nuevo precio:");
            precios.set(pos, leer.nextDouble());
            System.out.println("Nuevo stock:");
            stocks.set(pos, leer.nextInt());
            leer.nextLine();
            System.out.println("Producto actualizado.");
        }
        else {
            System.out.println("Posicion no valida");
        }
    }
    public static void crudEliminar() {
        System.out.println("--- ELIMINAR PRODUCTO ---");
        System.out.println("1.-Pollo");
        System.out.println("2._Pavita");
        System.out.println("3._Cerdo");
        System.out.println("4._Huevos");
        System.out.println("5._Congelados");
        System.out.println("6._Embutidos");
        System.out.println("7._Celebridades");
        System.out.println("8._Complementos");
        int tipo = leer.nextInt();
        leer.nextLine();
        ArrayList<String> prod;
        ArrayList<Double> precios;
        ArrayList<Integer> stocks;
        switch (tipo) {
            case 1:
                prod = pollo;
                precios = precioPollo;
                stocks = stockPollo;
                break;
            case 2:
                prod = pavita;
                precios = precioPavita;
                stocks = stockPavita;
                break;
            case 3:
                prod = cerdo;
                precios = precioCerdo;
                stocks = stockCerdo;
                break;
            case 4:
                prod = huevos;
                precios = precioHuevos;
                stocks = stockHuevos;
                break;
            case 5:
                prod = congelados;
                precios = precioCongelados;
                stocks = stockCongelados;
                break;
            case 6:
                prod = embutidos;
                precios = precioEmbutidos;
                stocks = stockEmbutidos;
                break;
            case 7:
                prod = celebridades;
                precios = precioCelebridades;
                stocks = stockCelebridades;
                break;
            case 8:
                prod = complementos;
                precios = precioComplementos;
                stocks = stockComplementos;
                break;
            default:
                System.out.println("Categoria no valida");
                return;
        }
        imprimirProductos(prod, precios, stocks);
        System.out.println("Ingrese la posicion a eliminar:");
        int pos = leer.nextInt();
        leer.nextLine();
        if (pos >= 0 && pos < prod.size()) {
            System.out.println(prod.get(pos) + " eliminado.");
            prod.remove(pos);
            precios.remove(pos);
            stocks.remove(pos);
        }
        else {
            System.out.println("Posicion no valida");
        }
    }
    public static void crudBuscar() {
        System.out.println("--- BUSCAR PRODUCTO ---");
        System.out.println("Ingrese el nombre exacto del producto:");
        String buscar = leer.nextLine();
        boolean encontrado = false;
        if (pollo.contains(buscar)) {
            int posi = pollo.indexOf(buscar);
            System.out.println("Encontrado en [Pollo] pos " + posi + " S/ " + precioPollo.get(posi) + " Stock: " + stockPollo.get(posi));
            encontrado = true;
        }
        if (pavita.contains(buscar)) {
            int posi = pavita.indexOf(buscar);
            System.out.println("Encontrado en [Pavita] pos " + posi + " S/ " + precioPavita.get(posi) + " Stock: " + stockPavita.get(posi));
            encontrado = true;
        }
        if (cerdo.contains(buscar)) {
            int posi = cerdo.indexOf(buscar);
            System.out.println("Encontrado en [Cerdo] pos " + posi + " S/ " + precioCerdo.get(posi) + " Stock: " + stockCerdo.get(posi));
            encontrado = true;
        }
        if (huevos.contains(buscar)) {
            int posi = huevos.indexOf(buscar);
            System.out.println("Encontrado en [Huevos] pos " + posi + " S/ " + precioHuevos.get(posi) + " Stock: " + stockHuevos.get(posi));
            encontrado = true;
        }
        if (congelados.contains(buscar)) {
            int posi = congelados.indexOf(buscar);
            System.out.println("Encontrado en [Congelados] pos " + posi + " S/ " + precioCongelados.get(posi) + " Stock: " + stockCongelados.get(posi));
            encontrado = true;
        }
        if (embutidos.contains(buscar)) {
            int posi = embutidos.indexOf(buscar);
            System.out.println("Encontrado en [Embutidos] pos " + posi + " S/ " + precioEmbutidos.get(posi) + " Stock: " + stockEmbutidos.get(posi));
            encontrado = true;
        }
        if (celebridades.contains(buscar)) {
            int posi = celebridades.indexOf(buscar);
            System.out.println("Encontrado en [Celebridades] pos " + posi + " S/ " + precioCelebridades.get(posi) + " Stock: " + stockCelebridades.get(posi));
            encontrado = true;
        }
        if (complementos.contains(buscar)) {
            int posi = complementos.indexOf(buscar);
            System.out.println("Encontrado en [Complementos] pos " + posi + " S/ " + precioComplementos.get(posi) + " Stock: " + stockComplementos.get(posi));
            encontrado = true;
        }
        if (!encontrado) {
            System.out.println("Producto no encontrado en el sistema.");
        }
    }
    public static void imprimirProductos(ArrayList<String> prods, ArrayList<Double> precios, ArrayList<Integer> stocks) {
        for (int i = 0; i < prods.size(); i++) {
            System.out.println(" " + i + " " + prods.get(i) + " S/ " + precios.get(i) + " Stock: " + stocks.get(i));
        }
    }
}
