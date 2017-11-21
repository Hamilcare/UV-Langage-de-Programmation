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
	boolean estVide();

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
	 * @param dernierDansFile
	 * @return l'état courant avec dernierDansFile à la fin
	 */
	public K ajout(E dernierDansFile);

	/**
	 * 
	 * @return l'état courant privé de son premier élément
	 */
	public K retrait();

	public int taille();

}
