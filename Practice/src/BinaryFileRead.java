import java.io.*;


public class BinaryFileRead {
	public static void main(String[] args) {
		byte [] b= new byte[6];
		
		try {
			FileInputStream fi = new FileInputStream("c:\\??????\\2021-1?б?\\?ڹ?\\BinaryFileWrite.out");
			int n = 0, c;
			
			while((c = fi.read()) != -1) {
				b[n] = (byte)c;
				System.out.print(b[n]+" ");
				n++;
			}
			
			
			
			fi.close();
		}
		catch(IOException e) {
			System.out.println();
		}
	}
}
