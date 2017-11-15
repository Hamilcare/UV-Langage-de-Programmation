package tp.v3;

public interface ListeImmutable<E> extends ListeGenerique<E> {
	public static <E> ListeImmutable<E> vide() {
		return (ListeImmutable<E>) ListeGenerique.vide();

	}

}