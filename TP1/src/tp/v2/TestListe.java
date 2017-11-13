package tp.v2;

public class TestListe {

	public static void main(String[] args) {
		Liste<Integer> l1 = Liste.cons(1, Liste.vide());
		System.out.println(l1.taille());
	}

}
