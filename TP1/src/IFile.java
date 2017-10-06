
public interface IFile<T> {
	public void add(T element);//Ajouter l'élément à la file
	public T getFirstElement(); //retourne le premier élément de la file sans le supprimer
	public IFile<T> removeHead();// Supprime le premier élément de la file et renvoie le prochain élément
	public boolean isEmpty();//Renvoie vrai si la file est vide 
	}
