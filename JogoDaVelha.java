import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] gamePos = new String[9];
		for (int i = 0; i < gamePos.length; i++) {
			gamePos[i] = ".";
		}
		
		
		System.out.println("-----JOGO DA VÉIA-----\n");

		while (true) {
			//PLAYER 1
			while (true) {
				
				gameInterface(gamePos);
				
				System.out.print("Player 1: ");
				int p = scan.nextInt() - 1;
				System.out.println();
				
				if (p >= 0 & p <= 8) {
					if (!gamePos[p].contains("X") & !gamePos[p].contains("O")) {
						gamePos[p] = "X";
						break;
					} else {
						System.out.println("Posição ocupada pelo "+gamePos[p]);
					}
				} else {
					System.out.println("Posição inválida.");
				}
			}
			if (gamePos[0].equals("X") & gamePos[1].equals("X") & gamePos[2].equals("X")) {
				System.out.println("Player 1 ganhou!");
				break;
			}
			if (gamePos[3].equals("X") & gamePos[4].equals("X") & gamePos[5].equals("X")) {
				System.out.println("Player 1 ganhou!");
				break;
			}
			if (gamePos[6].equals("X") & gamePos[7].equals("X") & gamePos[8].equals("X")) {
				System.out.println("Player 1 ganhou!");
				break;
			}
			
			
			if (gamePos[0].equals("X") & gamePos[4].equals("X") & gamePos[8].equals("X")) {
				System.out.println("Player 1 ganhou!");
				break;
			}
			if (gamePos[2].equals("X") & gamePos[4].equals("X") & gamePos[6].equals("X")) {
				System.out.println("Player 1 ganhou!");
				break;
			}
			
			
			if (gamePos[0].equals("X") & gamePos[3].equals("X") & gamePos[6].equals("X")) {
				System.out.println("Player 1 ganhou!");
				break;
			}
			if (gamePos[1].equals("X") & gamePos[4].equals("X") & gamePos[7].equals("X")) {
				System.out.println("Player 1 ganhou!");
				break;
			}
			if (gamePos[2].equals("X") & gamePos[5].equals("X") & gamePos[8].equals("X")) {
				System.out.println("Player 1 ganhou!");
				break;
			}
			if (!gamePos[0].equals(".") & !gamePos[1].equals(".") & !gamePos[2].equals(".") & !gamePos[3].equals(".") & !gamePos[4].equals(".") & !gamePos[5].equals(".") & !gamePos[6].equals(".") & !gamePos[7].equals(".") & !gamePos[8].equals(".")) {
				System.out.println("EMPATE!");
				break;
			}
			
			//PLAYER 2
			while (true) {
				
				gameInterface(gamePos);
				
				System.out.print("Player 2: ");
				int p = scan.nextInt() - 1;
				System.out.println();
				
				if (p >= 0 & p <= 8) {
					if (!gamePos[p].contains("X") & !gamePos[p].contains("O")) {
						gamePos[p] = "O";
						break;
					} else {
						System.out.println("Posição ocupada pelo "+gamePos[p]);
					}
				} else {
					System.out.println("Posição inválida.");
				}
			}
			if (gamePos[0].equals("O") & gamePos[1].equals("O") & gamePos[2].equals("O")) {
				System.out.println("Player 2 ganhou!");
				break;
			}
			if (gamePos[3].equals("O") & gamePos[4].equals("O") & gamePos[5].equals("O")) {
				System.out.println("Player 2 ganhou!");
				break;
			}
			if (gamePos[6].equals("O") & gamePos[7].equals("O") & gamePos[8].equals("O")) {
				System.out.println("Player 2 ganhou!");
				break;
			}
			
			
			if (gamePos[0].equals("O") & gamePos[4].equals("O") & gamePos[8].equals("O")) {
				System.out.println("Player 2 ganhou!");
				break;
			}
			if (gamePos[2].equals("O") & gamePos[4].equals("O") & gamePos[6].equals("O")) {
				System.out.println("Player 2 ganhou!");
				break;
			}
			
			
			if (gamePos[0].equals("O") & gamePos[3].equals("O") & gamePos[6].equals("O")) {
				System.out.println("Player 2 ganhou!");
				break;
			}
			if (gamePos[1].equals("O") & gamePos[4].equals("O") & gamePos[7].equals("O")) {
				System.out.println("Player 2 ganhou!");
				break;
			}
			if (gamePos[2].equals("O") & gamePos[5].equals("O") & gamePos[8].equals("O")) {
				System.out.println("Player 2 ganhou!");
				break;
			}
			if (!gamePos[0].equals(".") & !gamePos[1].equals(".") & !gamePos[2].equals(".") & !gamePos[3].equals(".") & !gamePos[4].equals(".") & !gamePos[5].equals(".") & !gamePos[6].equals(".") & !gamePos[7].equals(".") & !gamePos[8].equals(".")) {
				System.out.println("EMPATE!");
				break;
			}
			
		}
		System.out.println();
		gameInterface(gamePos);
	}

	//INTERFACE DO JOGO
	private static void gameInterface(String[] game) {
		
		
		for (int i = 0; i < 3; i++) {
			if (i != 0) {System.out.print(" | ");}else {System.out.print("       ");}
			System.out.print(game[i]);
		}
		System.out.print("      (1 - 2 - 3)");
		System.out.print("\n       ---------");
		System.out.println();
		
		for (int i = 3; i < 6; i++) {
			if (i != 3) {System.out.print(" | ");}else {System.out.print("       ");}
			System.out.print(game[i]);
		}
		System.out.print("      (4 - 5 - 6)");
		System.out.print("\n       ---------");
		System.out.println();
		
		for (int i = 6; i < 9; i++) {
			if (i != 6) {System.out.print(" | ");}else {System.out.print("       ");}
			System.out.print(game[i]);
		}
		
		System.out.print("      (7 - 8 - 9)");
		System.out.println();
		System.out.println();
	}
}
