package filRouge.v5;

import java.util.Iterator;

public class FileImmutableImplementation<E> implements FileImmutable<E> {

	EtatFileImmutable<E> etat = new EtatFileImmutableImplementation<E>();

	@Override
	public E premier() {
		return etat.premier();
	}

	@Override
	public FileImmutable<E> suivants() {
		FileImmutableImplementation<E> resul = new FileImmutableImplementation<E>();
		resul.etat = etat.suivants();
		return resul;
	}

	@Override
	public FileImmutable<E> creer() {
		FileImmutableImplementation<E> resul = new FileImmutableImplementation<E>();
		resul.etat = etat.creer();
		return resul;
	}

	@Override
	public Iterator<E> iterator() {
		//TODO
		return null;
	}

	@Override
	public int taille() {

		return etat.taille();
	}

	@Override
	public FileImmutable<E> creer(E dernier) {
		FileImmutableImplementation<E> resul = new FileImmutableImplementation<E>();
		resul.etat = etat.creer(dernier);
		return resul;
	}

	@Override
	public String toString() {
		String s = "";
		s += etat.toString();
		return s;
	}

}
