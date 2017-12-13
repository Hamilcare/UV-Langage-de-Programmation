package filRouge.v6;

import filRouge.v5Correction.ListeImmutable;

public class EtatVideInversionParesseuse<E> implements EtatImmutableAvecInversionParesseuse<E> {
	public EtatFileImmutable<E> creer() {
		return new EtatVideInversionParesseuse<>();
	}

	public EtatFileImmutable<E> creer(E dernier) {
		FileImmutable<Miroir<E>> fm = new FileImmutableAvecEtatReifie<>(
				new EtatEnveloppeDeuxListesImmutables<Miroir<E>>()).creer();
		return new EtatNonVideInversionParesseuse<E>((ListeImmutable<E>) ListeImmutable.vide().creer((E) dernier), fm,
				ListeImmutable.vide(), 1);

	}

	@Override
	public int taille() {
		// TODO Auto-generated method stub
		return 0;
	}

}
