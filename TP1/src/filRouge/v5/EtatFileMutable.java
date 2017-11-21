package filRouge.v5;

public interface EtatFileMutable<E> extends EtatFile<EtatFileMutable<E>, E> {

	EtatFileMutable<E> creer();

	EtatFileMutable<E> creerCopie();

}
