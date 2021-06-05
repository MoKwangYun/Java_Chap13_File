import java.io.*;

public class FileReaderEX {

	public static void main(String[] args) {
		
		try {
			File file = new File("c:\\모광윤\\2021-1학기\\자바\\Hello.txt");
			FileReader in = new FileReader(file);
			int c;
			while((c = in.read()) != -1) {
				System.out.print((char)c);
			}
			
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
		catch(IOException e) {
			System.out.println("입출력오류");
		}
		
		System.out.println("\n\n"+"String ln으로 한 줄 씩 읽기");
		try {
			File file = new File("c:\\모광윤\\2021-1학기\\자바\\Hello.txt");
			FileReader in = new FileReader(file);
			
			BufferedReader bf = new BufferedReader(in);
			
			String ln;
			while((ln = bf.readLine()) != null) {
				System.out.println();
				System.out.print(ln);
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
		catch(IOException e) {
			System.out.println("입출력오류");
		}
	}
}
