import java.io.*;

public class BinaryFileCopy {
	public static void main(String[] args) {
		File f1 = new File("c:\\����\\2021-1�б�\\�ڹ�\\Lebron.jpg");
		File f2 = new File("c:\\����\\2021-1�б�\\�ڹ�\\1roundDDak.jpg");
		
		try {
			FileInputStream fi = new FileInputStream(f1);
			FileOutputStream fo = new FileOutputStream(f2);
			
			int c;
			while((c = fi.read()) != -1) {
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			System.out.println(f1.getPath()+ "��" + f2.getPath()+"���� �����Ͽ����ϴ�.");
		}
		catch(IOException e) {
			System.out.println("���� ����  ����");
		}
	}
}