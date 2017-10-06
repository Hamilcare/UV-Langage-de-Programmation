public  class ListeChainee<T> implements IFile<T> {
	private T head;
	private ListeChainee<T> next;
	
	
	public ListeChainee(){
		head = null;
		next = null;
	}
	
	public ListeChainee(T element) {
		head = element;
		next = null;
	}
	
	private T getHead() {
		return head;
	}
	
	private ListeChainee<T> getNext() {
		return  next;
	}
	
	private void setNext(ListeChainee<T> nextListe) {
		next = nextListe;
	}
	
	private void setHead(T head) {
		this.head = head;
	}
	
	@Override
	public T getFirstElement() {
		return getHead();
	}
	
	@Override
	public ListeChainee<T> removeHead() {
		return this.getNext();
	}

	@Override
	public void add(T element) {
		ListeChainee<T> listeToAppend = new ListeChainee<>(element);
		if (this.next == null) {
			this.setNext(listeToAppend);
		}
		else {
			this.getNext().add(element);
		}
	}


	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return getHead()==null && getNext()==null; 
	}
	
	


}
