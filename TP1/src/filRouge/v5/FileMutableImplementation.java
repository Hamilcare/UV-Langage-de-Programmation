package filRouge.v5;

import java.util.Iterator;

public class FileMutableImplementation<E> implements FileMutable<E> {
    EtatFileMutable<E> etat = new EtatFileMutableImplementation<E>();

    @Override
    public void ajouter(E element) {
        this.etat.ajouter(element);
    }

    @Override
    public void retirer() {
        if(this.etat.estVide())
            throw new UnsupportedOperationException();
        this.etat = this.etat.suivants();
    }

    @Override
    public FileMutable<E> suivants() {
        this.retirer();
        return this;
    }
    @Override
    public FileMutable<E> creerCopie() {
        FileMutable<E> file = creer();
        return file.ajout(this);
    }

    @Override
    public E premier() {
        return this.etat.premier();
    }

    @Override
    public FileMutable<E> creer() {
        return new FileMutableImplementation<>();
    }

    @Override
    public int taille() {
        return this.etat.taille();
    }
}
