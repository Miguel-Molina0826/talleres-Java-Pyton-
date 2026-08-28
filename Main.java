import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // =====================================================
        // NIVEL 1 - LA FLOTA DE CAMIONES
        // =====================================================

        System.out.println("========== NIVEL 1 ==========");

        Camion camion1 = new Camion("ABC-123", 1200.0, "Armenia");
        Camion camion2 = new Camion("DEF-456", 1500.0, "Pereira");
        Camion camion3 = new Camion("GHI-789", 1000.0, "Armenia");

        camion1.cargaActualKg = 350.5;
        camion2.cargaActualKg = 500.0;

        System.out.println("===== CAMIONES =====");

        camion1.mostrarFicha();
        camion2.mostrarFicha();
        camion3.mostrarFicha();

        // Operación del día
        camion1.cargaActualKg = camion1.cargaActualKg + 200;
        camion2.disponible = false;

        System.out.println("\n===== DESPUÉS DE LA OPERACIÓN =====");

        camion1.mostrarFicha();
        camion2.mostrarFicha();
        camion3.mostrarFicha();


        // =====================================================
        // EJEMPLO PRODUCTO - NIVEL 2
        // =====================================================

        System.out.println("\n========== EJEMPLO PRODUCTO NIVEL 2 ==========");

        Producto caramelos = new Producto(
                "Caramelos de café",
                6.2,
                18500
        );

        caramelos.recibir(50);

        caramelos.ficha();

        caramelos.recibir(30);
        caramelos.despachar(45);
        caramelos.despachar(100);
        caramelos.despachar(-5);

        caramelos.ficha();


        // =====================================================
        // EJEMPLO PRODUCTO - NIVEL 3
        // =====================================================

        System.out.println("\n========== EJEMPLO PRODUCTO NIVEL 3 ==========");

        Producto arequipe = new Producto(
                "Arequipe de café",
                4.8,
                21000
        );

        arequipe.recibir(40);

        System.out.println(arequipe.ficha());

        System.out.println("Peso total en bodega: " +
                arequipe.pesoTotal() + " kg");

        System.out.println("Valor del inventario: $" +
                arequipe.valorInventario());

        if (arequipe.puedeDespachar(35)) {
            System.out.println("✅ El pedido de 35 cajas es viable");
        }

        arequipe.despachar(35);
        arequipe.despachar(20);

        System.out.println(arequipe.ficha());


        // =====================================================
        // NIVEL 2 - EL CAMIÓN OPERATIVO
        // =====================================================

        System.out.println("\n========== NIVEL 2 - CAMIÓN OPERATIVO ==========");

        Camion camion4 = new Camion(
                "JKL-012",
                1000.0,
                "Armenia"
        );

        // Secuencia del profesor
        camion4.cargar(400);
        camion4.cargar(700);
        camion4.cargar(500);
        camion4.descargar(200);
        camion4.enviarATaller();
        camion4.cargar(100);
        camion4.mostrarFicha();


        // =====================================================
        // NIVEL 3 - EL CAMIÓN QUE RESPONDE
        // =====================================================

        System.out.println("\n========== NIVEL 3 - CAMIÓN QUE RESPONDE ==========");

        Camion camion5 = new Camion(
                "MNO-345",
                1000.0,
                "Armenia"
        );

        camion5.cargaActualKg = 350.0;

        System.out.println(camion5.ficha());

        if (camion5.cabe(700)) {
            System.out.println("✅ Caben 700 kg");
        } else {
            System.out.println("⛔ No caben 700 kg");
        }

        camion5.cargar(500);

        System.out.println(camion5.ficha());


        // =====================================================
        // NIVEL 4 - CONSTRUCTORES
        // =====================================================

        System.out.println("\n========== NIVEL 4 - CONSTRUCTORES ==========");

        // Ejemplo del profesor: producto con peso inválido
        Producto productoNivel4 = new Producto(
                "Galletas de café",
                -3.0,
                15000
        );

        productoNivel4.recibir(20);

        System.out.println(productoNivel4.ficha());


        // =====================================================
        // NIVEL 4 - LA FLOTA NACE COMPLETA
        // =====================================================

        System.out.println("\n========== NIVEL 4 - FLOTA COMPLETA ==========");

        Camion camionNivel4_1 = new Camion(
                "N4-001",
                1000.0,
                "Armenia"
        );

        Camion camionNivel4_2 = new Camion(
                "N4-002",
                50.0,
                "Pereira"
        );

        Camion camionNivel4_3 = new Camion(
                "N4-003",
                800.0,
                "Calarcá"
        );

        camionNivel4_1.cargar(300);
        camionNivel4_2.cargar(50);
        camionNivel4_3.cargar(400);

        System.out.println(camionNivel4_1.ficha());
        System.out.println(camionNivel4_2.ficha());
        System.out.println(camionNivel4_3.ficha());


        // =====================================================
        // NIVEL 5 - OBJETOS QUE COLABORAN
        // =====================================================

        System.out.println("\n========== NIVEL 5 - OBJETOS QUE COLABORAN ==========");

        Producto producto5 = new Producto(
                "Chocolatinas",
                5.0,
                12000
        );

        Producto producto6 = new Producto(
                "Dulces de café",
                4.0,
                10000
        );

        producto5.recibir(50);
        producto6.recibir(80);

        Camion camionNivel5 = new Camion(
                "NIV-005",
                300.0,
                "Armenia"
        );

        camionNivel5.cargarProducto(producto5, 20);
        camionNivel5.cargarProducto(producto6, 30);
        camionNivel5.cargarProducto(producto6, 10);

        System.out.println(camionNivel5.ficha());

        if (producto5.tieneMasStockQue(producto6)) {
            System.out.println("🏆 Más stock restante: " +
                    producto5.nombre);
        } else {
            System.out.println("🏆 Más stock restante: " +
                    producto6.nombre);
        }


        // =====================================================
        // NIVEL 5 - EJEMPLO PEDIDO
        // =====================================================

        System.out.println("\n========== EJEMPLO PEDIDO NIVEL 5 ==========");

        Cliente clienteEjemplo = new Cliente(
                "Dulcería El Trébol",
                "Armenia"
        );

        Producto productoPedido = new Producto(
                "Arequipe especial",
                4.8,
                21000
        );

        productoPedido.recibir(30);

        Camion camionPedido = new Camion(
                "PED-123",
                500.0,
                "Armenia"
        );

        // Pedido normal
        Pedido pedidoEjemplo = new Pedido(
                clienteEjemplo,
                productoPedido,
                15
        );

        pedidoEjemplo.procesar(camionPedido);

        System.out.println(pedidoEjemplo.ficha());


        // =====================================================
        // NIVEL 5 - LOS 3 PEDIDOS
        // =====================================================

        System.out.println("\n========== NIVEL 5 - LOS 3 PEDIDOS ==========");

        Cliente cliente1 = new Cliente(
                "Dulcería El Trébol",
                "Armenia"
        );

        Cliente cliente2 = new Cliente(
                "Café Quindiano",
                "Pereira"
        );

        Producto productoPedido2 = new Producto(
                "Galletas de café",
                3.5,
                15000
        );

        Producto productoPedido3 = new Producto(
                "Caramelos especiales",
                2.5,
                10000
        );

        productoPedido2.recibir(10);
        productoPedido3.recibir(20);

        Camion camionPedidos = new Camion(
                "PED-500",
                500.0,
                "Armenia"
        );

        // Pedido 1: normal
        Pedido pedido1 = new Pedido(
                cliente1,
                productoPedido2,
                5
        );

        // Pedido 2: excede el stock
        Pedido pedido2 = new Pedido(
                cliente2,
                productoPedido3,
                50
        );

        // Pedido 3: se intentará procesar dos veces
        Pedido pedido3 = new Pedido(
                cliente1,
                productoPedido3,
                5
        );

        pedido1.procesar(camionPedidos);

        pedido2.procesar(camionPedidos);

        pedido3.procesar(camionPedidos);
        pedido3.procesar(camionPedidos);

        System.out.println("\n===== FICHAS DE LOS PEDIDOS =====");

        System.out.println(pedido1.ficha());
        System.out.println(pedido2.ficha());
        System.out.println(pedido3.ficha());


        // =====================================================
        // RETO NIVEL 5 - MISMO DESTINO
        // =====================================================

        System.out.println("\n========== RETO NIVEL 5 ==========");

        if (pedido1.mismoDestino(pedido3)) {
            System.out.println("📍 Los pedidos 1 y 3 tienen el mismo destino");
        } else {
            System.out.println("📍 Los pedidos 1 y 3 tienen diferente destino");
        }


        // =====================================================
        // RETO ADICIONAL NIVEL 3
        // =====================================================

        System.out.println("\n========== RETO ADICIONAL NIVEL 3 ==========");

        Camion camionViajes = new Camion(
                "VIA-001",
                1000.0,
                "Armenia"
        );

        System.out.println(
                "Viajes necesarios para 2500 kg: " +
                        camionViajes.viajesNecesarios(2500)
        );


        // =====================================================
        // RESUMEN DEL DÍA - NIVEL 4
        // =====================================================

        System.out.println("\n========== RESUMEN DEL DÍA ==========");

        System.out.println(caramelos.resumenDelDia());
        System.out.println(arequipe.resumenDelDia());


        // =====================================================
        // JEFE FINAL - BODEGA MAESTRA
        // =====================================================

        System.out.println("\n");
        System.out.println("==============================================");
        System.out.println("       JEFE FINAL - BODEGA MAESTRA");
        System.out.println("==============================================");


        // =====================================================
        // FABRICAR LOS 3 PRODUCTOS
        // =====================================================

        Producto caramelosMaestra = new Producto(
                "Caramelos de café",
                6.2,
                18500
        );

        Producto arequipeMaestra = new Producto(
                "Arequipe de café",
                4.8,
                21000
        );

        Producto galletasMaestra = new Producto(
                "Galletas de café",
                3.5,
                15000
        );


        // =====================================================
        // RECIBIR PRODUCCIÓN INICIAL
        // =====================================================

        caramelosMaestra.recibir(50);
        arequipeMaestra.recibir(40);
        galletasMaestra.recibir(30);


        // =====================================================
        // FABRICAR LOS 2 CAMIONES
        // =====================================================

        Camion camionMaestro1 = new Camion(
                "SIB-001",
                1000.0,
                "Armenia"
        );

        Camion camionMaestro2 = new Camion(
                "SIB-002",
                800.0,
                "Pereira"
        );


        // =====================================================
        // MENÚ SIBOM
        // =====================================================

        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("\n==============================================");
            System.out.println("       SIBOM — Dulce Café S.A.");
            System.out.println("==============================================");
            System.out.println("1. Ver catálogo");
            System.out.println("2. Recibir producción");
            System.out.println("3. Cargar camión");
            System.out.println("4. Ver flota");
            System.out.println("5. Reporte general");
            System.out.println("6. Cerrar bodega");
            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                // =================================================
                // OPCIÓN 1 - VER CATÁLOGO
                // =================================================

                case 1:

                    System.out.println("\n===== CATÁLOGO =====");

                    System.out.println(caramelosMaestra.ficha());
                    System.out.println(arequipeMaestra.ficha());
                    System.out.println(galletasMaestra.ficha());

                    break;


                // =================================================
                // OPCIÓN 2 - RECIBIR PRODUCCIÓN
                // =================================================

                case 2:

                    System.out.println("\n===== RECIBIR PRODUCCIÓN =====");
                    System.out.println("1. Caramelos");
                    System.out.println("2. Arequipe");
                    System.out.println("3. Galletas");
                    System.out.print("Seleccione producto: ");

                    int productoElegido = scanner.nextInt();

                    System.out.print("Cantidad de cajas: ");
                    int cantidadCajas = scanner.nextInt();

                    switch (productoElegido) {

                        case 1:
                            caramelosMaestra.recibir(cantidadCajas);
                            break;

                        case 2:
                            arequipeMaestra.recibir(cantidadCajas);
                            break;

                        case 3:
                            galletasMaestra.recibir(cantidadCajas);
                            break;

                        default:
                            System.out.println("⛔ Producto no válido");
                    }

                    break;


                // =================================================
                // OPCIÓN 3 - CARGAR CAMIÓN
                // =================================================

                case 3:

                    System.out.println("\n===== CARGAR CAMIÓN =====");
                    System.out.println("1. Caramelos");
                    System.out.println("2. Arequipe");
                    System.out.println("3. Galletas");
                    System.out.print("Seleccione producto: ");

                    int productoCarga = scanner.nextInt();

                    System.out.println("\nSeleccione camión:");
                    System.out.println("1. SIB-001");
                    System.out.println("2. SIB-002");
                    System.out.print("Camión: ");

                    int camionElegido = scanner.nextInt();

                    System.out.print("Cantidad de cajas: ");
                    int cajasCarga = scanner.nextInt();


                    // Elegir producto
                    Producto productoSeleccionado;

                    switch (productoCarga) {

                        case 1:
                            productoSeleccionado = caramelosMaestra;
                            break;

                        case 2:
                            productoSeleccionado = arequipeMaestra;
                            break;

                        case 3:
                            productoSeleccionado = galletasMaestra;
                            break;

                        default:
                            productoSeleccionado = null;
                            System.out.println("⛔ Producto no válido");
                    }


                    // Elegir camión
                    Camion camionSeleccionado;

                    switch (camionElegido) {

                        case 1:
                            camionSeleccionado = camionMaestro1;
                            break;

                        case 2:
                            camionSeleccionado = camionMaestro2;
                            break;

                        default:
                            camionSeleccionado = null;
                            System.out.println("⛔ Camión no válido");
                    }


                    if (productoSeleccionado != null &&
                            camionSeleccionado != null) {

                        camionSeleccionado.cargarProducto(
                                productoSeleccionado,
                                cajasCarga
                        );
                    }

                    break;


                // =================================================
                // OPCIÓN 4 - VER FLOTA
                // =================================================

                case 4:

                    System.out.println("\n===== FLOTA =====");

                    System.out.println(camionMaestro1.ficha());
                    System.out.println(camionMaestro2.ficha());

                    break;


                // =================================================
                // OPCIÓN 5 - REPORTE GENERAL
                // =================================================

                case 5:

                    System.out.println("\n===== REPORTE GENERAL =====");

                    System.out.println(caramelosMaestra.ficha());
                    System.out.println(arequipeMaestra.ficha());
                    System.out.println(galletasMaestra.ficha());

                    int valorTotal =
                            caramelosMaestra.valorInventario()
                                    + arequipeMaestra.valorInventario()
                                    + galletasMaestra.valorInventario();

                    System.out.println("💰 Valor total del inventario: $" +
                            valorTotal);

                    break;


                // =================================================
                // OPCIÓN 6 - CERRAR
                // =================================================

                case 6:

                    System.out.println("\n🏭 Bodega cerrada.");
                    System.out.println("Gracias por usar SIBOM.");

                    break;


                // =================================================
                // OPCIÓN INVÁLIDA
                // =================================================

                default:

                    System.out.println("⛔ Opción no válida.");
            }

        } while (opcion != 6);

        scanner.close();
    }
}


// =========================================================
// CLASE PRODUCTO
// =========================================================

class Producto {

    String nombre;
    double pesoCajaKg;
    int precioCaja;
    int stockCajas;
    int totalDespachado;


    // =====================================================
    // CONSTRUCTOR - NIVEL 4
    // =====================================================

    Producto(
            String nombre,
            double pesoCajaKg,
            int precioCaja
    ) {

        this.nombre = nombre;

        this.stockCajas = 0;
        this.totalDespachado = 0;

        if (pesoCajaKg > 0) {

            this.pesoCajaKg = pesoCajaKg;

        } else {

            this.pesoCajaKg = 1.0;

            System.out.println(
                    "⚠ Peso inválido para " +
                            nombre +
                            ": se ajustó a 1.0 kg"
            );
        }

        if (precioCaja > 0) {

            this.precioCaja = precioCaja;

        } else {

            this.precioCaja = 1;

            System.out.println(
                    "⚠ Precio inválido para " +
                            nombre +
                            ": se ajustó a $1"
            );
        }

        System.out.println(
                "🏭 Producto registrado: " +
                        this.nombre
        );
    }


    // =====================================================
    // RECIBIR - NIVEL 2
    // =====================================================

    void recibir(int cajas) {

        if (cajas > 0) {

            this.stockCajas =
                    this.stockCajas + cajas;

            System.out.println(
                    "⬆ Entraron " +
                            cajas +
                            " cajas de " +
                            this.nombre
            );

        } else {

            System.out.println(
                    "⛔ Cantidad inválida"
            );
        }
    }

    void mostrarFicha() {
        System.out.println("📦 " + this.nombre +
                " — stock: " + this.stockCajas + " cajas");
    }


    // =====================================================
    // PUEDE DESPACHAR - NIVEL 3
    // =====================================================

    boolean puedeDespachar(int cajas) {

        return cajas > 0 &&
                cajas <= this.stockCajas;
    }


    // =====================================================
    // DESPACHAR - NIVEL 2 Y RETO NIVEL 4
    // =====================================================

    void despachar(int cajas) {

        if (this.puedeDespachar(cajas)) {

            this.stockCajas =
                    this.stockCajas - cajas;

            this.totalDespachado =
                    this.totalDespachado + cajas;

            System.out.println(
                    "⬇ Salieron " +
                            cajas +
                            " cajas de " +
                            this.nombre
            );

        } else {

            System.out.println(
                    "⛔ Despacho de " +
                            cajas +
                            " cajas rechazado"
            );
        }
    }


    // =====================================================
    // PESO TOTAL - NIVEL 3
    // =====================================================

    double pesoTotal() {

        return this.stockCajas *
                this.pesoCajaKg;
    }


    // =====================================================
    // VALOR INVENTARIO - NIVEL 3
    // =====================================================

    int valorInventario() {

        return this.stockCajas *
                this.precioCaja;
    }


    // =====================================================
    // FICHA - NIVEL 3
    // =====================================================

    String ficha() {

        return "📦 " +
                this.nombre +
                " | " +
                this.stockCajas +
                " cajas | " +
                this.pesoTotal() +
                " kg | $" +
                this.valorInventario() +
                " | despachado: " +
                this.totalDespachado;
    }


    // =====================================================
    // COMPARAR STOCK - NIVEL 5
    // =====================================================

    boolean tieneMasStockQue(Producto otro) {

        return this.stockCajas >
                otro.stockCajas;
    }


    // =====================================================
    // RESUMEN DEL DÍA - RETO NIVEL 4
    // =====================================================

    String resumenDelDia() {

        return "📊 " +
                this.nombre +
                " | Stock actual: " +
                this.stockCajas +
                " | Total despachado: " +
                this.totalDespachado;
    }
}


// =========================================================
// CLASE CAMION
// =========================================================

class Camion {

    String placa;
    double capacidadKg;
    double cargaActualKg;
    String ciudadAsignada;
    boolean disponible;


    // =====================================================
    // CONSTRUCTOR - NIVEL 4
    // =====================================================

    Camion(
            String placa,
            double capacidadKg,
            String ciudadAsignada
    ) {

        this.placa = placa;
        this.ciudadAsignada = ciudadAsignada;

        this.cargaActualKg = 0.0;
        this.disponible = true;

        if (capacidadKg >= 100) {

            this.capacidadKg = capacidadKg;

        } else {

            this.capacidadKg = 100;

            System.out.println(
                    "⚠ Capacidad inválida para " +
                            this.placa +
                            ": se ajustó a 100.0 kg"
            );
        }

        System.out.println(
                "🚚 Camión " +
                        this.placa +
                        " asignado a " +
                        this.ciudadAsignada +
                        " (" +
                        this.capacidadKg +
                        " kg)"
        );
    }


    // =====================================================
    // MOSTRAR FICHA - NIVEL 2
    // =====================================================

    void mostrarFicha() {

        System.out.println(
                "Placa " +
                        this.placa +
                        " | " +
                        this.ciudadAsignada +
                        " | " +
                        this.capacidadKg +
                        " kg máx | carga: " +
                        this.cargaActualKg +
                        " kg | disponible: " +
                        this.disponible
        );
    }


    // =====================================================
    // ESPACIO LIBRE - NIVEL 3
    // =====================================================

    double espacioLibre() {

        return this.capacidadKg -
                this.cargaActualKg;
    }


    // =====================================================
    // CABE - NIVEL 3
    // =====================================================

    boolean cabe(double kg) {

        return kg > 0 &&
                this.disponible &&
                this.cargaActualKg + kg <=
                        this.capacidadKg;
    }


    // =====================================================
    // PORCENTAJE OCUPACIÓN - NIVEL 3
    // =====================================================

    double porcentajeOcupacion() {

        return this.cargaActualKg /
                this.capacidadKg *
                100;
    }


    // =====================================================
    // CARGAR - NIVEL 2
    // =====================================================

    void cargar(double kg) {

        if (kg <= 0) {

            System.out.println(
                    "⛔ Cantidad inválida"
            );

        } else if (!this.disponible) {

            System.out.println(
                    "⛔ El camión " +
                            this.placa +
                            " no está disponible"
            );

        } else if (!this.cabe(kg)) {

            System.out.println(
                    "⛔ Capacidad insuficiente"
            );

        } else {

            this.cargaActualKg =
                    this.cargaActualKg + kg;

            System.out.println(
                    "⬆ Se cargaron " +
                            kg +
                            " kg al camión " +
                            this.placa
            );
        }
    }


    // =====================================================
    // DESCARGAR - NIVEL 2
    // =====================================================

    void descargar(double kg) {

        if (kg <= 0) {

            System.out.println(
                    "⛔ Cantidad inválida"
            );

        } else if (kg > this.cargaActualKg) {

            System.out.println(
                    "⛔ No se pueden descargar " +
                            kg +
                            " kg. La carga actual es " +
                            this.cargaActualKg +
                            " kg"
            );

        } else {

            this.cargaActualKg =
                    this.cargaActualKg - kg;

            System.out.println(
                    "⬇ Se descargaron " +
                            kg +
                            " kg del camión " +
                            this.placa
            );
        }
    }


    // =====================================================
    // ENVIAR A TALLER - NIVEL 2
    // =====================================================

    void enviarATaller() {

        this.disponible = false;

        System.out.println(
                "🔧 Camión " +
                        this.placa +
                        " fuera de servicio"
        );
    }


    // =====================================================
    // CARGAR PRODUCTO - NIVEL 5
    // =====================================================

    void cargarProducto(
            Producto p,
            int cajas
    ) {

        if (p == null) {

            System.out.println(
                    "⛔ Producto no válido"
            );

        } else {

            double kilos =
                    cajas * p.pesoCajaKg;

            if (!p.puedeDespachar(cajas)) {

                System.out.println(
                        "⛔ " +
                                p.nombre +
                                " no tiene " +
                                cajas +
                                " cajas"
                );

            } else if (!this.disponible) {

                System.out.println(
                        "⛔ El camión " +
                                this.placa +
                                " no está disponible"
                );

            } else if (
                    this.cargaActualKg + kilos >
                            this.capacidadKg
            ) {

                System.out.println(
                        "⛔ No caben " +
                                kilos +
                                " kg en el camión " +
                                this.placa
                );

            } else {

                p.despachar(cajas);

                this.cargaActualKg =
                        this.cargaActualKg + kilos;

                System.out.println(
                        "✅ " +
                                cajas +
                                " cajas de " +
                                p.nombre +
                                " (" +
                                kilos +
                                " kg) al camión " +
                                this.placa
                );
            }
        }
    }


    // =====================================================
    // FICHA - NIVEL 3
    // =====================================================

    String ficha() {

        return "🚚 " +
                this.placa +
                " | " +
                this.ciudadAsignada +
                " | carga: " +
                this.cargaActualKg +
                " / " +
                this.capacidadKg +
                " kg | espacio libre: " +
                this.espacioLibre() +
                " kg | ocupación: " +
                this.porcentajeOcupacion() +
                "% | disponible: " +
                this.disponible;
    }


    // =====================================================
    // RETO ADICIONAL NIVEL 3
    // =====================================================

    int viajesNecesarios(double kgTotales) {

        int viajes = (int)
                (kgTotales / this.capacidadKg);

        if (viajes * this.capacidadKg < kgTotales) {
            viajes = viajes + 1;
        }

        return viajes;
    }
}


// =========================================================
// CLASE CLIENTE - NIVEL 5
// =========================================================

class Cliente {

    String nombre;
    String ciudad;


    // =====================================================
    // CONSTRUCTOR
    // =====================================================

    Cliente(
            String nombre,
            String ciudad
    ) {

        this.nombre = nombre;
        this.ciudad = ciudad;
    }
}


// =========================================================
// CLASE PEDIDO - NIVEL 5
// =========================================================

class Pedido {

    Cliente cliente;
    Producto producto;
    int cajas;
    boolean despachado;


    // =====================================================
    // CONSTRUCTOR
    // =====================================================

    Pedido(
            Cliente cliente,
            Producto producto,
            int cajas
    ) {

        this.cliente = cliente;
        this.producto = producto;
        this.cajas = cajas;
        this.despachado = false;
    }


    // =====================================================
    // PESO DEL PEDIDO
    // =====================================================

    double pesoDelPedido() {

        return this.cajas *
                this.producto.pesoCajaKg;
    }


    // =====================================================
    // PROCESAR PEDIDO
    // =====================================================

    void procesar(Camion camion) {

        if (this.despachado) {

            System.out.println(
                    "⛔ El pedido ya fue despachado"
            );

        } else if (camion == null) {

            System.out.println(
                    "⛔ Camión no válido"
            );

        } else {

            int stockAntes =
                    this.producto.stockCajas;

            camion.cargarProducto(
                    this.producto,
                    this.cajas
            );

            int stockDespues =
                    this.producto.stockCajas;

            if (stockDespues < stockAntes) {

                this.despachado = true;

                System.out.println(
                        "✅ Pedido procesado"
                );
            }
        }
    }


    // =====================================================
    // FICHA DEL PEDIDO
    // =====================================================

    String ficha() {

        return "🧾 Pedido de " +
                this.cliente.nombre +
                " (" +
                this.cliente.ciudad +
                "): " +
                this.cajas +
                " cajas de " +
                this.producto.nombre +
                " — " +
                this.pesoDelPedido() +
                " kg — despachado: " +
                this.despachado;
    }


    // =====================================================
    // MISMO DESTINO - RETO NIVEL 5
    // =====================================================

    boolean mismoDestino(Pedido otro) {

        return this.cliente.ciudad.equals(
                otro.cliente.ciudad
        );
    }
}