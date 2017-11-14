package session2.tp.v2;

import java.util.Iterator;

public class FileImmutableImplementation<E> implements FileImmutable<E>{
    private Liste<E> debut;
    private Liste<E> fin;

    @Override
    public E premier() {
        return debut.tete();
    }

    @Override
    public FileImmutable<E> suivants() {
        FileImmutable<E> nouvelleFile = creer();
        nouvelleFile.aj
        return ;
    }

    @Override
    public int taille() {
        return debut.taille() + fin.taille();
    }

    @Override
    public FileImmutableImplementation<E> creer() {
        FileImmutableImplementation<E> file = new FileImmutableImplementation<E>();
        file.debut = Liste.vide();
        file.fin = Liste.vide();
        return file;
    }

    @Override
    public FileImmutable<E> creer(E dernier) {
        FileImmutableImplementation<E> file = new FileImmutableImplementation<E>();
        file.debut = Liste.vide();
        file.fin = Liste.cons(dernier, Liste.vide());
        return file;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
