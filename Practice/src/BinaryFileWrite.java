import java.io.*;

public class BinaryFileWrite {
	public static void main(String[] args) {
		byte[] b = {7,51,3,4,-1,24};
		
		try {
			FileOutputStream fo = new FileOutputStream("c:\\����\\2021-1�б�\\�ڹ�\\BinaryFileWrite.out");
			for(int i = 0;i<b.length;i++) {
				fo.write(b[i]);
			}
			fo.close();
		}
		catch(IOException e) {
		}
		System.out.println("����Ϸ�");
	}
}
