import java.io.*;

public class FileWriterEx {
	public static void main(String[] args) {
		InputStreamReader in = new InputStreamReader(System.in);
		
		FileWriter fw = null;
		int c;
		try {
			fw = new FileWriter("c:\\����\\2021-1�б�\\�ڹ�\\FileWriterEx.txt");
			while((c = in.read()) != -1) {
				fw.write((char)c);
				System.out.print((char)c);
			}
			
			String a = "\nKakaoBank";
			fw.write(a);
			
			in.close();
			fw.close();
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
		catch(IOException e) {
			System.out.println("File not open");
		}
		
	}
}
