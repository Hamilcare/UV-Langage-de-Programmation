package filRouge.v5;

/**
 * 
 * @author valentin Quiedeville, Vivien Louradour
 *
 * @param <E>
 */
public interface EtatFileImmutable<E> extends EtatFile<EtatFileImmutable<E>, E> {

	/*
	@Override
	EtatFileImmutable<E> suivants();
	
	@Override
	public EtatFileImmutable<E> ajout(E dernierDansFile);
	
	@Override
	public EtatFileImmutable<E> retrait();
	*/

	/**
	 * 
	 * @param dernier
	 * @return Fabrique un etat formé de l'état cible et d'un nouveau dernier
	 *         élément
	 */
	EtatFileImmutable<E> creer(E dernier);

	EtatFileImmutable<E> creer();

}
