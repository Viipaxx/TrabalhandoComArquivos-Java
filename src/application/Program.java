package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		// Utilizando o FileWriter e o BufferedWriter
		Scanner sc = new Scanner(System.in);

		String path = "C:\\Users\\kngat\\OneDrive\\Documentos\\GitHub\\TrabalhandoComArquivos-Java\\CriandoArquivo.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			char resp = ' ';
			while (resp != 'n'){
				
				System.out.print("Insira o texto: ");
				String line = sc.nextLine();
				
				System.out.print("Quer continuar? ");
				resp = sc.nextLine().charAt(0);

				bw.write(line);
				bw.newLine();
				
				if (resp == 'n') {
					break;
				}
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
