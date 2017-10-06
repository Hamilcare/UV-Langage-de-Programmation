
public class FabriqueListeChainee<T> implements IFabriqueFile<T>{
	//From fabrique
	@Override
	public ListeChainee<T> creerFile() {
		return new ListeChainee<T>();
	}

	@Override
	public ListeChainee<T> creerFile(T element) {
		// TODO Auto-generated method stub
		return new ListeChainee<T>(element);
	}

	/*@Override
	public ListeChainee<T> creerFile(T element, T file) {
		// TODO Auto-generated method stub
		return new ListeChainee<T>(element,file);
	}*/

}
