package application;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		// Instanciando um objeto do tipo file
		File file = new File("C:\\Users\\kngat\\OneDrive\\Documentos\\GitHub\\TrabalhandoComArquivos-Java\\ArquivoParaSerLido.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			if (sc != null) {
				sc.close();				
			}
		}
	}
}
