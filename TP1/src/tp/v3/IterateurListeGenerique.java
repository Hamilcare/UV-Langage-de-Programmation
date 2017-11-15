package tp.v3;

import java.util.Iterator;

public class IterateurListeGenerique<E> implements Iterator<E> {
	ListeGenerique<E> list;

	public IterateurListeGenerique(ListeGenerique<E> l) {
		list = l;
	}

	@Override
	public boolean hasNext() {
		return !list.estVide();
	}

	@Override
	public E next() {
		E resul = list.tete();
		list = list.reste();
		return resul;
	}

}
