import java.io.*;

public class TxtFileCopy {
	public static void main(String[] args) {
		File f1 = new File("c:\\����\\2021-1�б�\\�ڹ�\\FileWriterEx.txt");
		File f2 = new File("c:\\����\\2021-1�б�\\�ڹ�\\FileWriterEx02.txt");
		
		try {
			FileReader fr = new FileReader(f1);
			FileWriter fw = new FileWriter(f2);
			int c;
			while((c=fr.read())!= -1) {
				fw.write((char)c);
			}
			
			fr.close();
			fw.close();
			
			System.out.println(f1.getPath()+ "��" + f2.getPath()+"���� �����Ͽ����ϴ�.");
		}
		catch(IOException e) {
			System.out.println("���� ���� ����");
		}
	}
}