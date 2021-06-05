import java.io.*;

public class TxtFileCopy {
	public static void main(String[] args) {
		File f1 = new File("c:\\모광윤\\2021-1학기\\자바\\FileWriterEx.txt");
		File f2 = new File("c:\\모광윤\\2021-1학기\\자바\\FileWriterEx02.txt");
		
		try {
			FileReader fr = new FileReader(f1);
			FileWriter fw = new FileWriter(f2);
			int c;
			while((c=fr.read())!= -1) {
				fw.write((char)c);
			}
			
			fr.close();
			fw.close();
			
			System.out.println(f1.getPath()+ "을" + f2.getPath()+"으로 복사하였습니다.");
		}
		catch(IOException e) {
			System.out.println("파일 복사 오류");
		}
	}
}
