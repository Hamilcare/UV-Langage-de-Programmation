package filRouge.v5;

public class EtatFileImmutableImplementation<E> implements EtatFileImmutable<E> {
	private ListeImmutable<E> listeDebut; // liste de tete dans l'ordre d'arrivée 
	private ListeImmutable<E> listeFin;// liste de queue dans l'ordre inverse d'arrivée
	//Invariant : si listeTete vide, alors listeFin vide.

	private int taille;

	public EtatFileImmutableImplementation() {
		ListeImmutable<E> vide = ListeImmutable.vide();
		this.listeFin = vide;
		this.listeDebut = vide;
		this.taille = 0;
	}

	public EtatFileImmutableImplementation(int taille, ListeImmutable<E> listeTete, ListeImmutable<E> listeFin) {
		this.taille = taille;
		if (listeTete.estVide()) {
			ListeImmutable<E> vide = listeTete;
			listeTete = listeFin.miroir();
			listeFin = vide;
		}
		this.listeDebut = listeTete;
		this.listeFin = listeFin;
	}

	@Override
	public E premier() {
		if (this.estVide()) {
			throw new UnsupportedOperationException();
		}
		return this.listeDebut.tete();
	}

	@Override
	public EtatFileImmutableImplementation<E> suivants() {
		if (this.estVide()) {
			throw new UnsupportedOperationException();
		}
		return new EtatFileImmutableImplementation<E>(this.taille - 1, this.listeDebut.reste(), this.listeFin);
	}

	@Override
	public int taille() {
		return this.taille;
	}

	@Override
	public EtatFileImmutable<E> creer() {
		return new EtatFileImmutableImplementation<>();
	}

	@Override
	public EtatFileImmutable<E> creer(E dernier) {
		return new EtatFileImmutableImplementation<>(this.taille + 1, this.listeDebut,
				ListeImmutable.cons(dernier, this.listeFin));
	}

	@Override
	public boolean estVide() {

		return taille() == 0;
	}

	@Override
	public String toString() {
		String s = "[";
		for (E element : listeDebut) {
			s = s + element.toString() + " ";
		}
		for (E element : listeFin.miroir()) {
			s = s + element.toString() + " ";
		}
		s = s.trim() + "]";
		return s;
	}

	/*@Override
	public Iterator<E> iterator() {
		return new IterateurFile<>(this);
	}*/

}
