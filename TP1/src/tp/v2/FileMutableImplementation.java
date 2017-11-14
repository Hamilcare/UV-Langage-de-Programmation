package session2.tp.v2;

import java.util.Iterator;

public class FileMutableImplementation<E> implements FileMutable<E> {
    private ListeMutable<E> liste;
    private ListeMutable<E> fin;

    public static FileMutableImplementation Fabrique = new FileMutableImplementation<>();

    @Override
    public void ajouter(E element) {
        liste.ajout(element);
        fin = ListeMutable.cons(element, ListeMutable.vide());
    }

    @Override
    public void retirer() {
        this.liste = liste.reste();
    }

    @Override
    public E premier() {
        return liste.tete();
    }

    @Override
    public int taille() {
        return liste.taille();
    }

    @Override
    public FileMutableImplementation<E> creer() {
        FileMutableImplementation<E> file = new FileMutableImplementation<>();
        file.liste = ListeMutable.vide();
        file.fin = ListeMutable.vide();
        return file;
    }

    @Override
    public FileMutableImplementation<E> creerCopie() {
        FileMutableImplementation fileCopie = FileMutableImplementation.Fabrique.creer();
        for(E elem : this.liste){
            fileCopie.ajout(elem);
        }
        return fileCopie;
    }

    @Override
    public void ajouter(File<E> secondeFile) {
        //Complexité en O(1)
    }

    @Override
    public Iterator<E> iterator() {
        return this.liste.iterator();
    }
}
