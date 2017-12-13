package filRouge.v6;

import java.util.Iterator;

import filRouge.v5Correction.ListeImmutable;

public interface EtatImmutableAvecInversionParesseuse<E> extends EtatFileImmutable<E> {
	default ListeImmutable<E> debut() {
		throw new UnsupportedOperationException();
	}

	default E premier() {
		throw new UnsupportedOperationException();
	}

	default EtatImmutableAvecInversionParesseuse<E> suivant() {
		throw new UnsupportedOperationException();
	}

	default int taille() {
		return 0;
	}

	@Override
	default Iterator<E> iterator() {
		return new IterateurEtatFileImmutable<>(this);
	}

	default boolean estVide() {
		return true;
	}

	EtatFileImmutable<E> creer();

}
