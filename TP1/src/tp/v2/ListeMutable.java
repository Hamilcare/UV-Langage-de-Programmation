package tp.v2;

/**
 * 
 * @author valentin Quiedeville, Vivien Lauradour
 * 
 *         Cette classe décrit le comportement d'une liste mutable
 * 
 * @param <E>
 */
public interface ListeMutable<E> extends Liste<E> {

	/*
	 * Accesseurs.
	 */
	/**
	 * @return le reste de la liste passée en paramètre
	 */
	default ListeMutable<E> reste() {
		throw new UnsupportedOperationException();
	}

	/**
	 * Change le reste de la liste courante
	 * 
	 * @param reste
	 *            le nouveau reste de la liste
	 */
	default void changerReste(ListeMutable<E> reste) {
		throw new UnsupportedOperationException();
	}

	/**
	 * Change la tete de la liste courante
	 * 
	 * @param tete
	 *            la nouvelle tete de la liste
	 */
	default void changerTete(E tete) {
		throw new UnsupportedOperationException();
	}

	/*
	 * Services
	 */
	default ListeMutable<E> miroir() {
		// TODO
		return null;
	}

	/**
	 * 
	 * @param t
	 *            la tete de la nouvelle liste
	 * @param r
	 *            le reste de la nouvelle liste
	 * @return une nouvelle liste ayant t pour tête et r pour reste
	 */

	public static <E> ListeMutable<E> cons(E t, ListeMutable<E> r) {
		return new ListeMutable<E>() {
			E tete;
			ListeMutable<E> reste;

			@Override
			public ListeMutable<E> reste() {
				return reste;
			}

			@Override
			public void changerTete(E t) {
				this.tete = t;
			}

			@Override
			public void changerReste(ListeMutable<E> r) {
				this.reste = r;
			}
		};
	}

	/**
	 * 
	 * @return une Liste<E> vide
	 */
	public static <E> ListeMutable<E> vide() {
		return new ListeMutable<E>() {
			public boolean casVide() {
				return Boolean.TRUE;
			}
		};
	}

}
