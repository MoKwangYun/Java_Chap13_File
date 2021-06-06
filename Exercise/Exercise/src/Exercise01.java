import java.io.*;
import java.util.*;

public class Exercise01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter file of directory name: ");
		analyzepath(scanner.nextLine());
		
	}
	
	public static void analyzepath(String path) {
		File name = new File(path);
		
		if(name.exists()) {
			System.out.println(name.getName()+" exists");
			
			if(name.isFile())
				System.out.println("is a file");
			else
				System.out.println("is not a  file");
			
			if(name.isDirectory())
				System.out.println("is a directory");
			else
				System.out.println("is not a directory");
			
			if(name.isAbsolute())
				System.out.println("is a absolute path");
			else
				System.out.println("is not a absolute path");
			
			System.out.println("Last modified: " + name.lastModified());
			System.out.println("Length: "+name.length());
			System.out.println("Path: "+name.getPath());
			System.out.println("Absolute path: "+name.getAbsolutePath());
			System.out.println("Parent: "+name.getParent());
			
			if(name.isDirectory()) {
			System.out.println("\nDirectory contents:\n");
			
			File[] subFiles = name.listFiles();
			
			for(int i = 0; i<name.length();i++) {
				File f = subFiles[i];
				System.out.println(f.getName());
				}
			}
		}
	}
}
