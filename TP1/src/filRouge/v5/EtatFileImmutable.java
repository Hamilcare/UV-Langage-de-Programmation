package filRouge.v5;

/**
 * 
 * @author valentin Quiedeville, Vivien Louradour
 *
 * @param <E>
 */
public interface EtatFileImmutable<E> extends FileImmutable<E> {

	@Override
	public EtatFileImmutable<E> suivants();

	/**
	 * retourne la taille de la file
	 */
	public int taille();

	@Override
	public EtatFileImmutable<E> creer();

	@Override
	FileImmutable<E> creer(E dernier);

	@Override
	default boolean estVide() {
		return taille() > 0;
	}

}
