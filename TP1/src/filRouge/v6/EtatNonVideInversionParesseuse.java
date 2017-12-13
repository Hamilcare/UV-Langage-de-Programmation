package filRouge.v6;

import filRouge.v5Correction.ListeImmutable;

public class EtatNonVideInversionParesseuse<E> implements EtatImmutableAvecInversionParesseuse<E> {

	ListeImmutable<E> ld;
	FileImmutable<Miroir<E>> fm;
	ListeImmutable<E> lf;

	int taille;

	public EtatNonVideInversionParesseuse(ListeImmutable<E> debut, FileImmutable<Miroir<E>> miroirs,
			ListeImmutable<E> fin, int t) {
		taille = t;
		//invariant
		if (fin.taille() >= taille - fin.taille()) {//ie lf est plus grande que la moitiée de la liste
			Miroir<E> miroir = new Miroir<>(fin);
			miroirs = miroirs.ajout(miroir);
			miroirs.premier().inverser();
			lf = ListeImmutable.vide();
		} else {
			lf = fin;
		}
		if (debut.estVide()) {
			debut = miroirs.premier().miroir();
			miroirs = miroirs.suivants();
		}
		ld = debut;
		fm = miroirs;

	}

	@Override
	public EtatFileImmutable<E> creer(E dernier) {

		return new EtatNonVideInversionParesseuse<E>(ld, fm, lf.creer(dernier), taille + 1);
	}

	@Override
	public EtatFileImmutable<E> suivants() {
		if (taille == 1) {
			return new EtatVideInversionParesseuse<>();
		}
		if (!this.fm.estVide()) {
			this.fm.premier().inverser();
		}
		return new EtatNonVideInversionParesseuse<>(ld.reste(), fm, ld, taille - 1);
	}

	@Override
	public EtatFileImmutable<E> creer() {

		return new EtatVideInversionParesseuse<>();

	}

	@Override
	public int taille() {

		return taille;
	}

	@Override
	public ListeImmutable<E> debut() {

		return ld;
	}

	@Override
	public E premier() {
		return ld.tete();
	}

	@Override
	public boolean estVide() {//la toString marche moins bien quand on oublie de le redefinir :)
		return false;
	}

}
