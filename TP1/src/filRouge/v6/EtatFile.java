package filRouge.v6;

import filRouge.v5.Mesurable;

public interface EtatFile<K extends EtatFile<K, E>, E> extends Iterable<E>, Mesurable {

	/*
	 * Accesseurs
	 */
	default public E premier() {
		throw new UnsupportedOperationException();
	}

	default public K suivants() {
		throw new UnsupportedOperationException();
	}

	default boolean estVide() {
		return this.taille() == 0;
	}

	/*
	 * Fabriques
	 */
	K creer();

	@SuppressWarnings("unchecked")
	default K sujet() {
		return (K) this;
	}
}