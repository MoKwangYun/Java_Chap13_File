import java.io.*;

public class BinaryFileCopy {
	public static void main(String[] args) {
		File f1 = new File("c:\\모광윤\\2021-1학기\\자바\\Lebron.jpg");
		File f2 = new File("c:\\모광윤\\2021-1학기\\자바\\1roundDDak.jpg");
		
		try {
			FileInputStream fi = new FileInputStream(f1);
			FileOutputStream fo = new FileOutputStream(f2);
			
			int c;
			while((c = fi.read()) != -1) {
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			System.out.println(f1.getPath()+ "을" + f2.getPath()+"으로 복사하였습니다.");
		}
		catch(IOException e) {
			System.out.println("파일 복사  오류");
		}
	}
}
