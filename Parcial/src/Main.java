public class Main {
    public static void main(String[] args) {
        ArbolBusqueda<ServicioTuristico> abbServicios = new ArbolBusqueda<>();

        abbServicios.insertar(new ServicioTuristico(120, "Taller", "Mantenimiento Ómnibus Yutong"));
        abbServicios.insertar(new ServicioTuristico(45, "Cocina", "Almuerzo para 30 guías"));
        abbServicios.insertar(new ServicioTuristico(200, "Lavanderia", "Lencería Hotel Ermita"));
        abbServicios.insertar(new ServicioTuristico(75, "Taller", "Reparación Aire Acondicionado"));
        abbServicios.insertar(new ServicioTuristico(160, "Lavanderia", "Toallas Centro de Visitantes"));

        // Activacion del metodo inorden para reporte implementado
        System.out.println("REPORTE DE ÓRDENES DEL DÍA (Ordenadas por ID):");
        abbServicios.recorridoInorden(abbServicios.getRoot());

        // Mostrar busqueda
        int idABuscar = 75;
        System.out.println("\nBuscando servicio con ID: " + idABuscar + "...");
        ServicioTuristico criterio = new ServicioTuristico(idABuscar, "", "");
        Nodo<ServicioTuristico> encontrado = abbServicios.buscar(criterio);

        if (encontrado != null) {
            System.out.println("RESULTADO ENCONTRADO: " + encontrado.getInfo());
        } else {
            System.out.println("Orden no registrada.");
        }
    }
}