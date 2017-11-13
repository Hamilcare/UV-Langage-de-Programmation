package tp.v2;

import java.util.Iterator;

public interface Liste<E> extends Iterable<E> {
	/*
	 * Accesseurs
	 */
	/**
	 * 
	 * @return Aucune idée
	 */
	default boolean casVide() {
		return false;
	}

	/**
	 * 
	 * @return le premier element de la liste
	 */
	default E tete() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @return le reste de la liste
	 */
	default Liste<E> reste() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @return Aucune idée
	 */
	default boolean casCons() {
		return false;
	}

	/**
	 * 
	 * @return la taille de la liste
	 */
	default public int taille() {
		return 0;
	}

	/**
	 * 
	 * @return true si la liste est vide
	 */
	default public boolean estVide() {
		return this.taille() == 0;
	}

	/*
	 * Services
	 */
	default Iterator<E> iterator() {
		// TODO
		return new Iterator<E>() {
			@Override
			public boolean hasNext() {
				return !(reste().estVide());
			}

			@Override
			public E next() {
				// TODO Auto-generated method stub
				if (hasNext()) {
					return reste().tete();
				}
				return null;
			}

		}; // Compléter puis utiliser IterateurListe.
	}

	/**
	 * 
	 * @return la liste inversée {1,2,3} ===> {3,2,1}
	 */

	default Liste<E> miroir() {
		// TODO
		return null;
	}
	/*
	 * Fabriques (statiques)
	 */

	/**
	 * 
	 * @return une Liste<E> vide
	 */
	public static <E> Liste<E> vide() {
		return new Liste<E>() {
			// TODO Définir les méthodes utiles.
			@Override
			public boolean estVide() {
				return true;
			}

		};
	}

	/**
	 * 
	 * @param t
	 *            la tete de la nouvelle liste
	 * @param r
	 *            le reste de la nouvelle liste
	 * @return une nouvelle liste à partir des paramètres
	 */

	public static <E> Liste<E> cons(E t, Liste<E> r) {
		return new Liste<E>() {

			public E tete = t;
			public Liste<E> suite = r;

			@Override
			public E tete() {
				return tete;
			}

			@Override
			public Liste<E> reste() {
				return suite;
			}

			@Override
			public int taille() {
				return 1 + r.taille();
			}

			// TODO Définir les méthodes utiles.
		};
	}

}
