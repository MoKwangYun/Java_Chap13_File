import java.util.*;
import java.io.*;

public class Exercise02 {
	public static void main(String[] args) {
		System.out.print("�ؽ�Ʈ �����̸����Է��ϼ���>>");
		Scanner sc = new Scanner(System.in);
		String src = sc.nextLine();
		try {
			Scanner scanner = new Scanner(new FileReader(src));
			String n;
			int linenumb = 1;
			while(scanner.hasNext()) {
				String line = scanner.nextLine();
				System.out.println(linenumb+": " + line);
				linenumb++;
			}
			scanner.close();
		}
		catch(IOException e) {
			
		}
		
	}	
}
