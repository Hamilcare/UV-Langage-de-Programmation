package filRouge.v5;

/**
 * 
 * @author valentin Quiedeville, Vivien Louradour
 *
 * @param <K>
 * @param <E>
 */
public interface EtatFile<K extends EtatFile<K, E>, E> {

	/**
	 * 
	 * @return le premier element de la file
	 */
	E premier();

	/**
	 * 
	 * @return un état représenant la file privée de son premier élément
	 */
	K suivants();

	/**
	 * 
	 * @return true si la file est vide
	 */
	default boolean estVide() {
		return taille() <= 0;
	}

	/**
	 * 
	 * @return un nouvel etat
	 */
	K creer();

	/**
	 * 
	 * @return l'état courant
	 */
	default K sujet() {
		return (K) this;
	}

	/**
	 * 
	 * @return la taille de la file représentée par l'état
	 */

	public int taille();
}
