package Local;

import java.util.Scanner;

public class Classificador_de_nível_de_Herói {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner (System.in);

		System.out.print("Digite o nome do herói: ");
		String nomeHeroi = sc.nextLine();

		System.out.print("Digite a quantidade de XP do herói: ");
		int xpHeroi = sc.nextInt();

		String nivel;
		if (xpHeroi < 1000) {
			nivel = "Ferro";
		} else if (xpHeroi <= 2000) {
			nivel = "Bronze";
		} else if (xpHeroi <= 5000) {
			nivel = "Prata";
		} else if (xpHeroi <= 7000) {
			nivel = "Ouro";
		} else if (xpHeroi <= 8000) {
			nivel = "Platina";
		} else if (xpHeroi <= 9000) {
			nivel = "Ascendente";
		} else if (xpHeroi <= 10000) {
			nivel = "Imortal";
		} else {
			nivel = "Radiante";
		}

		System.out.println("O Herói de nome " + nomeHeroi + " está no nível de " + nivel);

		sc.close();

	}

}
