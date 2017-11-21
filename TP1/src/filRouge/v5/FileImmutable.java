package filRouge.v5;

/**
 * 
 * @author valentin Quiedeville, Vivien Louradour
 *
 * @param <E>
 * 
 * 
 */

public interface FileImmutable<E>
		extends File<FileImmutable<E>, E>, IdentifiableParIteration<FileImmutable<?>, E>, RepresentableParIteration<E> {

	/**
	 * 
	 * @param dernier
	 *            nouveau dernier element
	 * @return Fabrique d'une file formée de la file cible et d'un nouveau dernier
	 *         élément
	 */
	FileImmutable<E> creer(E dernier);

	@Override
	default public FileImmutable<E> retrait() {
		return this.suivants();
	}

	@Override
	default public FileImmutable<E> ajout(E dernierDansFile) {
		return this.creer(dernierDansFile);
	}

}
