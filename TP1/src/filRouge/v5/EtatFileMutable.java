package filRouge.v5;

/**
 * 
 * @author valentin Quiedeville, Vivien Louradour
 *
 */
public interface EtatFileMutable<E> extends FileMutable<E> {

	/**
	 * retourne la taille de la file
	 */
	public int taille();

	@Override
	default boolean estVide() {
		return taille() > 0;
	}

	@Override
	public EtatFileMutable<E> creer();

	@Override
	FileMutable<E> creerCopie();

}
