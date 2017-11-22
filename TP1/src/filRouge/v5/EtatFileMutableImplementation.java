package filRouge.v5;

public class EtatFileMutableImplementation<E> implements EtatFileMutable<E> {
	private ListeMutable<E> liste; // liste complète
	private ListeMutable<E> fin;// sous-liste suffixe d'un élément ou *
	private int taille = 0;

	public EtatFileMutableImplementation() {
		this.liste = ListeMutable.vide();
		this.fin = null;
		this.taille = 0;
	}

	public EtatFileMutableImplementation(int taille, ListeMutable<E> listeTete, ListeMutable<E> listeFin) {
		this.taille = taille;
		this.liste = listeTete;
		this.fin = listeFin;
	}

	@Override
	public E premier() {
		if (this.estVide())
			throw new UnsupportedOperationException();
		return this.liste.tete();
	}

	@Override
	public EtatFileMutable<E> suivants() {
		if (this.estVide())
			throw new UnsupportedOperationException();
		return new EtatFileMutableImplementation<E>(this.taille - 1, this.liste.reste(), this.fin);
	}

	@Override
	public EtatFileMutable<E> creer() {
		return new EtatFileMutableImplementation<E>();
	}

	@Override
	public EtatFileMutable<E> creerCopie() {
		return new EtatFileMutableImplementation<>(this.taille, this.liste, this.fin);
	}

	@Override
	public int taille() {
		return this.taille;
	}

	public void ajouter(E element) {
		if (this.estVide()) {
			ListeMutable<E> nouvelElement = ListeMutable.cons(element, this.liste);
			this.liste = nouvelElement;
			this.fin = nouvelElement;
			this.taille++;
			return;
		}
		ListeMutable<E> nouvelElement = ListeMutable.cons(element, this.fin.reste());
		this.fin.changerReste(nouvelElement);
		this.fin = nouvelElement;
		this.taille++;
	}

	public String toString() {
		StringBuilder s = new StringBuilder("[");
		for (E element : liste) {
			s.append(element.toString() + " ");
		}
		s.trimToSize();
		s.append("]");
		return s.toString();
	}
}
