package filRouge.v5;

/**
 * 
 * @author valentin Quiedeville, Vivien Louradour
 *
 * @param <E>
 */

public interface FileMutable<E>
		extends File<FileMutable<E>, E>, IdentifiableParIteration<FileMutable<?>, E>, RepresentableParIteration<E> {

	/**
	 * 
	 * @param element
	 *            ajouté en fin de file
	 */
	void ajouter(E element);

	/**
	 * retire le premier élément de la liste
	 */
	void retirer();

	default FileMutable<E> suivants() {
		FileMutable<E> resul = this.creerCopie();
		resul.retirer();
		return resul;
	}

	/**
	 * 
	 * @return une copie de la file
	 */
	FileMutable<E> creerCopie();

	@Override
	public default FileMutable<E> retrait() {
		this.retirer();
		return this;
	}

	@Override
	public default FileMutable<E> ajout(E dernierDansFile) {
		this.ajouter(dernierDansFile);
		return this;
	}

	/**
	 * 
	 * @param fileAAjouter
	 *            en fin de la file courante Complexité en o(n)
	 */
	default void ajouter(FileMutable<E> fileAAjouter) {
		for (E element : fileAAjouter) {
			this.ajout(element);
		}
	}

}
