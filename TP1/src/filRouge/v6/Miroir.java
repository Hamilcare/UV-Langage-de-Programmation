package filRouge.v6;

import filRouge.v5Correction.ListeImmutable;

public class Miroir<E> {
	//ETAT
	ListeImmutable<E> source;
	ListeImmutable<E> enCours;

	//Builder
	Miroir(ListeImmutable<E> src) {
		source = src;
		enCours = ListeImmutable.vide();
	}

	//Methode
	boolean estInversible() {
		return source.taille() > 1;
	}

	void inverser() {
		if (this.estInversible()) {
			this.enCours = this.enCours.creer(this.source.tete());
			this.source = this.source.reste();
		}

		if (this.source.taille() > 0) {
			this.enCours = this.enCours.creer(this.source.tete());
			this.source = this.source.reste();
		}

	}

	ListeImmutable<E> miroir() {
		while (this.estInversible()) {
			inverser();
		}
		return enCours;
	}

}
