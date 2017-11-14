package tp.v1;

public class FabriqueFile<T> implements IFabriqueFile<T> {
	public FabriqueFile() {
	}

	//From fabrique
	@Override
	public File<T> creerFile() {
		return new File<T>();
	}

	@Override
	public File<T> creerFile(T element) {
		// TODO Auto-generated method stub
		return new File<T>(element);
	}
}
