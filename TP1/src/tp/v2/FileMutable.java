package tp.v2;

public interface FileMutable<E> extends File<E> {

	/*
	 * Accesseurs
	 */
	@Override
	default FileMutable<E> suivants() {
		this.retirer();
		return this;
	}

	void ajouter(E element);

	void retirer();

	/*
	 * Fabriques
	 */
	FileMutable<E> creer();

	FileMutable<E> creerCopie();

	/*
	 * Services
	 */
	@Override
	default FileMutable<E> ajout(E dernierDansFile) {
		this.ajouter(dernierDansFile);
		return this;
	}

	@Override
	default FileMutable<E> retrait() {
		this.retirer();
		return this;
	}

	// Complexité O(|secondeFile|)
	@Override
	default FileMutable<E> ajout(File<E> secondeFile) {
		for (E element : secondeFile) {
			this.ajouter(element);
		}
		return this;
	}

	// Complexité en O(1).
	void ajouter(File<E> secondeFile);

}
