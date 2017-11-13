package tp.v2;

import java.util.Iterator;

public class TestListe {

	public static void main(String[] args) {
		System.out.println("*******************");
		System.out.println("**Liste Immutable**");
		System.out.println("*******************");

		System.out.println("----Liste Vide----");
		Liste<Integer> l0 = Liste.vide();
		System.out.println("taille 0 ? " + l0.taille());
		System.out.println("estVide true ? " + l0.estVide());

		System.out.println("\n----Liste a un élément----");
		Liste<Integer> l1 = Liste.cons(2, Liste.vide());
		System.out.println("taille 1 ? " + l1.taille());
		System.out.println("estVide false ? " + l1.estVide());

		System.out.println("\n----Liste a deux éléments----");
		Liste<Integer> l2 = Liste.cons(1, Liste.cons(2, Liste.vide()));
		System.out.println("taille 2 ? " + l2.taille());
		System.out.println("estVide false ? " + l2.estVide());
		Iterator i = l2.iterator();
		System.out.println("parcours de la liste à deux éléments 1 2 ?");
		while (i.hasNext()) {
			System.out.println(i.next());
		}

		System.out.println("*******************");
		System.out.println("***Liste mutable***");
		System.out.println("*******************");
		System.out.println("\n----Liste Vide----");
		ListeMutable<Integer> l3 = ListeMutable.vide();
		System.out.println("casVide true ? " + l3.casVide());
		System.out.println("casCons false ? " + l3.casCons());

		System.out.println("\n----Liste a un élément----");
		ListeMutable<Integer> l4 = ListeMutable.cons(1, ListeMutable.cons(2, l3));
		System.out.println("casVide false ?" + l4.casVide());
		System.out.println("casCons true ? " + l3.casCons());

		i = l2.iterator();
		System.out.println("parcours de la liste à deux éléments 1 2 ?");
		while (i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
