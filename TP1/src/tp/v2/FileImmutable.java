package session2.tp.v2;

public interface FileImmutable<E> extends File<E> {

	/* 
	 * Accesseurs
	 */
	FileImmutable<E> suivants();

	/*
	 * Fabriques
	 */
	FileImmutable<E> creer();

	FileImmutable<E> creer(E dernier);

	/*
	 * Services
	 */
	@Override
	default FileImmutable<E> ajout(E dernierDansFile) {
		FileImmutable<E> resul = creer();
		resul = resul.ajout(this);
		resul = resul.ajout(dernierDansFile);
		return resul;
	}

	@Override
	default FileImmutable<E> retrait() {
		FileImmutable<E> resul = creer();
		resul = resul.ajout(suivants());
		return resul;
	}

	// Complexité O(|secondeFile|)
	@Override
	default FileImmutable<E> ajout(File<E> secondeFile) {
		FileImmutable<E> r = this;
		for (E e : secondeFile) {
			r = r.ajout(e);
		}
		return r;
	}

}
