package filRouge.v5;

import java.util.Iterator;

/**
 * 
 * @author valentin Quiedeville, Vivien Louradour
 *
 * @param <K>
 * @param <E>
 */
public interface File<K extends File<K, E>, E> extends Iterable<E>, Mesurable {

	public E premier();

	public K suivants();

	default boolean estVide() {
		return taille() == 0;
	}

	//Fabrique
	/**
	 * 
	 * @return une file vide
	 */
	public K creer();

	@SuppressWarnings("unchecked")
	default K sujet() { // Alias de this
		return (K) this;
	}

	public K ajout(E dernierDansFile); // Ajout en fin

	public K retrait(); // Retrait de premier élément

	default public K ajout(K secondeFile) {// Ajout de la seconde file en fin de file
		for (E element : secondeFile) {
			this.ajout(element);
		}
		return sujet();
	};

}
