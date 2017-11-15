package tp.v3;

import java.util.Iterator;

public interface ListeGenerique<E> extends Iterable<E> {
	/*default boolean casVide() {
		return Boolean.FALSE;
	}*/
	boolean casVide();

	/**
	 * 
	 * @return le premier element de la liste
	 * 
	 */
	default E tete() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @return le reste de la liste
	 */
	default ListeGenerique<E> reste() {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @return true si la liste n'est pas vide
	 */
	default boolean casCons() {
		return Boolean.FALSE;
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

	default Iterator<E> iterator() {
		return new IterateurListeGenerique<E>(this) {
		}; // Compléter puis utiliser IterateurListe.
	}

	static <E> ListeGenerique<E> vide() {
		return new ListeGenerique<E>() {

			@Override
			public boolean casVide() {
				return true;
			}

			@Override
			public boolean estVide() {
				return true;
			}

			@Override
			public ListeGenerique<E> reste() {
				return ListeGenerique.vide();
			}

			@Override
			public ListeGenerique<E> ajouter(E element) {
				return ListeGenerique.cons(element, ListeGenerique.vide());
			}

		};
	};

	static <E> ListeGenerique<E> cons(E t, ListeGenerique<E> r) {
		return new ListeGenerique<E>() {
			@Override
			public E tete() {
				return t;
			}

			@Override
			public boolean casVide() {
				return false;
			}

			@Override
			public ListeGenerique<E> reste() {
				return r;
			}

			@Override
			public boolean casCons() {
				return true;
			}

			@Override
			public int taille() {
				return 1 + r.taille();
			}

			@Override
			public ListeGenerique<E> ajouter(E element) {
				ListeGenerique<E> resul = vide();
				resul = this.miroir();
				resul = cons(element, resul);
				resul = resul.miroir();
				return resul;
			}

			@Override
			public ListeGenerique<E> ajouter(ListeGenerique<E> liste) {
				ListeGenerique<E> resul = vide();
				resul = this.miroir();
				Iterator<E> i = liste.iterator();
				while (i.hasNext()) {
					resul = cons((E) i.next(), resul);
				}
				resul = resul.miroir();
				return resul;
			}

			// TODO Définir les méthodes utiles.
		};

	}

	default ListeGenerique<E> miroir() {
		ListeGenerique<E> resul = ListeGenerique.vide();
		Iterator<E> i = this.iterator();
		while (i.hasNext()) {
			E tmp = (E) i.next();
			resul = ListeGenerique.cons(tmp, resul);
		}
		return resul;
	}

	/**
	 * 
	 * @return une nouvelle liste contenant les éléments de la liste appelante ainsi
	 *         que l'élément passé en paramètre ajouté à la fin
	 */
	default public ListeGenerique<E> ajouter(E elementAAjouter) {
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @return une nouvelle liste contenant les éléments de la liste appelante ainsi
	 *         que ajouter tous les éléments de la liste passée en paramètre
	 */
	default public ListeGenerique<E> ajouter(ListeGenerique<E> AAjouter) {
		throw new UnsupportedOperationException();
	}

}
