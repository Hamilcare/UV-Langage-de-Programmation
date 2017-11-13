public interface IFabriqueFile<T> {
	IFile<T> creerFile();
	IFile<T> creerFile(T element);
}
