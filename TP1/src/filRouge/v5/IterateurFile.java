package filRouge.v5;

import java.util.Iterator;

public class IterateurFile<K extends File<K, E>, E> implements Iterator<E>{
    private K courant;

    public IterateurFile(K file) {
        this.courant = file;
    }

    @Override
    public boolean hasNext() {
        return !this.courant.estVide();
    }

    @Override
    public E next() {
        E r = this.courant.premier();
        this.courant = this.courant.retrait();
        return r;
    }
}
