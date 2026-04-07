public class ServicioTuristico implements Comparable<ServicioTuristico> {
    private int idOrden;
    private String departamento; // Cocina, Taller, Lavandería
    private String descripcion;

    public ServicioTuristico(int idOrden, String departamento, String descripcion) {
        this.idOrden = idOrden;
        this.departamento = departamento;
        this.descripcion = descripcion;
    }

    public int getIdOrden() {
        return idOrden;
    }

    @Override
    public int compareTo(ServicioTuristico otro) {
        // Criterio de ordenación del ABB: por ID de servicio
        return Integer.compare(this.idOrden, otro.idOrden);
    }

    @Override
    public String toString() {
        return "ID: " + idOrden + " | Dept: " + departamento + " | Detalle: " + descripcion;
    }
}