package application;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		// Informações do caminho do arquivo
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a file path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());
		System.out.println("getAbsolutePath: " + path.getAbsolutePath());
		System.out.println("getParentFile: " + path.getParentFile());

		sc.close();
	}
}