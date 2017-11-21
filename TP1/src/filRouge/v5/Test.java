package filRouge.v5;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadMXBean;

public class Test {
	private static final ThreadMXBean threadBean = ManagementFactory.getThreadMXBean();
	private static long diviseur = 1000000;

	public static void main(String[] args) {
		int limite = 100;
		System.out.println("La methode de test est la suivante : \n");
		System.out.println("Ajout et retrait de tous les entiers compris entre 0 et " + (limite - 1));

		System.out.println("****FileImmutable****\n");
		long temps = threadBean.getCurrentThreadCpuTime();
		FileImmutable<Integer> immut = new FileImmutableImplementation<Integer>();
		for (int i = 0; i < limite; i++) {
			immut = immut.ajout(i);
		}
		System.out.println(immut);
		System.out.println(immut.taille());
		for (int i = 0; i < limite; i++) {
			immut = immut.retrait();
		}
		System.out.println(immut);
		temps = threadBean.getCurrentThreadCpuTime() - temps;
		System.out.println(immut.getClass() + " - ajout/retrait: " + (temps / diviseur));

	}

}
