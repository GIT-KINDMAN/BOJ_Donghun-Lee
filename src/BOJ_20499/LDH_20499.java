package BOJ_20499;

import java.util.Scanner;
public class LDH_20499 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String input = sc.nextLine();
		
		String[] KDA = input.split("/");
		
		int K = Integer.parseInt(KDA[0]);
		int D = Integer.parseInt(KDA[1]);
		int A = Integer.parseInt(KDA[2]);
		
		if(K+A<D || D==0) {
			System.out.println("hasu");
		} else {
			System.out.println("gosu");
		}

	}

}