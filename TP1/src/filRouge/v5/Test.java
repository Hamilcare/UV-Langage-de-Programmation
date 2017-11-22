package filRouge.v5;

public class Test {

	public static void main(String[] args) {
		FileImmutable<Integer> yolo = new FileImmutableImplementation<>();
		yolo = yolo.ajout(1);

		FileMutable<Integer> fm = new FileMutableImplementation<>();
		fm.ajouter(1);
		fm.ajouter(2);
		fm.ajouter(3);
		fm.retirer();
		//fm.suivants();
		Integer premier = fm.premier();
		for (Integer i : fm) {
			System.out.println("i = " + i);
		}

	}
}
