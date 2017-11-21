package filRouge.v5;

public interface EtatFileMutable<E> extends EtatFile<EtatFileMutable<E>, E> {

	/**
	 * 
	 * @param element
	 *            ajouté en fin de file
	 */
	void ajouter(E element);

	/**
	 * retire le premier élément de l'état
	 */
	void retirer();

}
