public class Nodo<E extends Comparable<E>> {
    private E info;
    private Nodo<E> left;
    private Nodo<E> right;
    private Nodo<E> padre;

    public Nodo(E info) {
        this.info = info;
        this.left = null;
        this.right = null;
        this.padre = null;
    }

    public E getInfo() { return info; }
    public void setInfo(E info) { this.info = info; }
    public Nodo<E> getLeft() { return left; }
    public void setLeft(Nodo<E> left) { this.left = left; }
    public Nodo<E> getRight() { return right; }
    public void setRight(Nodo<E> right) { this.right = right; }
    public Nodo<E> getpadre() { return padre; }
    public void setpadre(Nodo<E> padre) { this.padre = padre; }
}