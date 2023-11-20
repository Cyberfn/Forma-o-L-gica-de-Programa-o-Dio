package Local;

import java.util.Scanner;

public class Calculadora_de_partidas_Rankeadas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o numero de vitorias: ");
			int vitorias = sc.nextInt();
		
		System.out.println("Digite o numero de derrotAS: ");
			int derrotas = sc.nextInt();
		
			 calcularRankeada(vitorias, derrotas);
			 
			 sc.close();
    }

    public static void calcularRankeada(int vitorias, int derrotas) {
        
        int saldoVitorias = vitorias - derrotas;

        	String nivel;
        		if (vitorias < 10) {
        			nivel = "Ferro";
        		} else if (vitorias <= 20) {
            nivel = "Bronze";
		        } else if (vitorias <= 50) {
		            nivel = "Prata";
		        } else if (vitorias <= 80) {
		            nivel = "Ouro";
		        } else if (vitorias <= 90) {
		            nivel = "Diamante";
		        } else if (vitorias <= 100) {
		            nivel = "Lendário";
		        } else {
		            nivel = "Imortal";
		        }

        System.out.println("O Herói tem um saldo de " + saldoVitorias + " está no nível de " + nivel);
   
			
		
	}

}

