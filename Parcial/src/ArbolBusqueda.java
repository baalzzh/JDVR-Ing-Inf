public class ArbolBusqueda<E extends Comparable<E>> {
    private Nodo<E> root;

    public ArbolBusqueda() {
        this.root = null;
    }

    //Inserción Recursiva
    public void insertar(E dato) {
        if (root == null) {
            root = new Nodo<>(dato);
        } else {
            insertarRecursivo(root, dato);
        }
    }

    private void insertarRecursivo(Nodo<E> actual, E dato) {
        if (dato.compareTo(actual.getInfo()) < 0) {
            if (actual.getLeft() == null) {
                Nodo<E> nuevo = new Nodo<>(dato);
                nuevo.setpadre(actual);
                actual.setLeft(nuevo);
            } else {
                insertarRecursivo(actual.getLeft(), dato);
            }
        } else if (dato.compareTo(actual.getInfo()) > 0) {
            if (actual.getRight() == null) {
                Nodo<E> nuevo = new Nodo<>(dato);
                nuevo.setpadre(actual);
                actual.setRight(nuevo);
            } else {
                insertarRecursivo(actual.getRight(), dato);
            }
        }
    }

    //Búsqueda Iterativa
    public Nodo<E> buscar(E datoReferencia) {
        Nodo<E> aux = root;
        while (aux != null) {
            int comp = datoReferencia.compareTo(aux.getInfo());
            if (comp == 0) return aux;
            aux = (comp < 0) ? aux.getLeft() : aux.getRight();
        }
        return null;
    }

    // Recorrido Inorden para reporte final
    public void recorridoInorden(Nodo<E> nodo) {
        if (nodo != null) {
            recorridoInorden(nodo.getLeft());
            System.out.println(nodo.getInfo());
            recorridoInorden(nodo.getRight());
        }
    }

    public Nodo<E> getRoot() { return root; }
}