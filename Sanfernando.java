import java.util.Scanner;
public class Sanfernando {
    // Productos pavita
    public static String[]pavita={
            "Pechuga Especial de Pavita Rango 5.4 a 6.5 Kg.",
            "Chuleta de pavita Corte Mediano",
            "Chuleta de pavita Corte Grande",
            "Filete de pechuga de pavita x 1.5 Kg",
            "Carne molida de pavita x 500 Gr.",
            "Guiso de pechuga de pavita x 1.5 Kg (Aprox.)",
            "Rodaja de pavita x 1.5 Kg",
            "Brazuelo de pavita",
            "Guiso de muslo de pavita x 1.5 Kg",
            "Carne molida de pavita x 500 Gr.",
            "Medallón de Pavita x 500 Gr.",
            "Guiso de Pechuga de Pavita x 500 Gr.",
            "Pack Pechuga de Pavita en Trozos bolsa x 500 Gr.",
    };
    public static double[]preciosPavita={
            //precio pechuga especial
            113.10,
            // chuleta de pavita corte mediano
            30.00,
            // corte grande
            29.30,
            27.49,
            21.30,
            20.20,
            17.40,
            11.90,
            13.40,
            16.50,
            12.50,
            14.40,
            18.00,
    };
    // Productos cerdo
    public static String[]cerdo={
            "Panceta de cerdo con piel y sin hueso",
            "Chuleta lomo de cerdo Rango 0.9 a 1.1 Kg.",
            "Chuleta de pierna cerdo sin piel x 1.5 kg",
            "Chuleta brazuelo cerdo sin piel x 1.5 kg",
            "Medallón de lomo de cerdo",
            "Chuleta lomo de cerdo x 1.5 kg",
            "Pulpa de Pierna de Cerdo",
            "Costilla Especial Lomo Cerdo (6 - 8 KG)",
            "Chicharrón de Panceta sin Piel x 1.5 kg",
            "Chuleta Parrillera de Cerdo x 1.5 kg",
            "Chicharrón de cerdo sin hueso y sin Piel",
            "Solomillo de Cerdo",
            "Pulpa de Bondiola de Cerdo",
            "Saltadito de cerdo x 500 Gr.",
            "Carne molida de cerdo x 500 Gr.",
    };
    public static double[] preciosCerdo = {
            37.00,
            17.50,
            20.90,
            19.80,
            33.90,
            34.90,
            33.50,
            22.50,
            34.10,
            23.40,
            38.42,
            39.90,
            32.30,
            14.70,
            14.30,
    };
    // metodo principal bienvenida
    public static void main(String[]args) {
        Scanner nu=new Scanner(System.in);
        int opcion;
        double total=0;
        System.out.println("=================================");
        System.out.println("<<<<<<<SAN FERNANDO DELIVERY>>>>>");
        System.out.println("<<<<<PROMOS PAVITA Y CERDO>>>>>>>");
        System.out.println("=================================");
        do {
            System.out.println("Menu principal");
            System.out.println("1. Ver productos Pavita");
            System.out.println("2. Ver productos Cerdo");
            System.out.println("3. Comprar");
            System.out.println("4. Salir");
            System.out.print("Ingrese opcion: ");
            opcion=nu.nextInt();
            switch (opcion) {
                case 1:
                    mostrarPavita();
                    break;
                case 2:
                    mostrarCerdo();
                    break;
                case 3:
                    int categoria;
                    System.out.println("1. Pavita");
                    System.out.println("2. Cerdo");
                    System.out.print("Seleccione categoria: ");
                    categoria=nu.nextInt();
                    if (categoria == 1) {
                        mostrarPavita();
                        System.out.print("Seleccione producto: ");
                        int prod=nu.nextInt();
                        if (prod >=1 && prod <=13) {
                            System.out.print("Cantidad: ");
                            int cantidad = nu.nextInt();
                            double subtotal =
                                    preciosPavita[prod - 1] * cantidad;
                            total=total+subtotal;
                            System.out.println("Producto agregado:");
                            System.out.println(pavita[prod-1]);
                            System.out.println("Subtotal: S/ " +subtotal);
                        }
                        else {
                            System.out.println("Producto invalido");
                        }
                    }
                    else if (categoria == 2) {
                        mostrarCerdo();
                        System.out.print("Seleccione producto: ");
                        int prod=nu.nextInt();
                        if (prod >= 1&&prod <= 15) {
                            System.out.print("Cantidad: ");
                            int cantidad=nu.nextInt();
                            double subtotal=preciosCerdo[prod-1]*cantidad;
                            total=total+subtotal;
                            System.out.println("Producto agregado:");
                            System.out.println(cerdo[prod-1]);
                            System.out.println("Subtotal: S/ "+subtotal);
                        }
                        else {
                            System.out.println("Producto invalido");
                        }
                    }
                    else {
                        System.out.println("Categoria incorrecta");
                    }
                    break;
                case 4:
                    System.out.println("<<<<<<<<Boleta>>>>>>>>");
                    System.out.println("Total a pagar S/ "+total);
                    break;
                default:

                    System.out.println("Opcion invalida");
            }
        } while (opcion !=4);
    }
    // Mostrar pavita
    public static void mostrarPavita() {
        System.out.println("<<<Productos pavita>>>");
        for (int i=0;i<13;i++) {
            System.out.println(
                    (i+1) + ". "
                            + pavita[i]
                            + " S/ "
                            + preciosPavita[i]
            );
        }
    }
    // Mostrar cerdo
    public static void mostrarCerdo() {
        System.out.println("<<<Procutos cerdo>>>");
        for (int i = 0; i < 15; i++) {
            System.out.println(
                    (i+1) + ". "
                            + cerdo[i]
                            + " S/ "
                            + preciosCerdo[i]
            );
        }
    }
}//Boleta
