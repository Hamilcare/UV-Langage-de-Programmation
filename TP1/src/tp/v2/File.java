package session2.tp.v2;

public interface File<E> extends Iterable<E> {

	/*
	 * Accesseurs
	 */
	E premier();

	File<E> suivants();

	default boolean estVide() {
		return this.taille() == 0;
	}

	int taille();

	/*
	 * Fabriques
	 */
	File<E> creer();

	/*
	 * Services
	 */
	File<E> ajout(E dernierDansFile);

	File<E> retrait();

	File<E> ajout(File<E> secondeFile);

	default String representation() {
		String resul = "";
		for (E currentElement : this) {
			resul += currentElement.toString() + " ";
		}
		return resul;
	}

	default boolean estEgal(File<E> file) {

		return premier().equals(file.premier()) && suivants().estEgal(file.suivants());
	}

}