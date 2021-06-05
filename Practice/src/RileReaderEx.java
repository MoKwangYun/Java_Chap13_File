import java.util.*;
import java.awt.*;
import java.io.*;
import javax.swing.*;

public class RileReaderEx extends JFrame{
	public static void main(String[] args) {
		JFrame f = new JFrame();
		FileDialog dialog = new FileDialog(f,"����",FileDialog.LOAD);
		dialog.setVisible(true);
		String fName = dialog.getDirectory() + dialog.getFile();
		
		try{
			BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(fName)));
			String temp;
			String t;
			int i = 0;
			while((temp = in.readLine())!= null) {
				StringTokenizer st = new StringTokenizer(temp,"\t");
				
				t= st.nextToken();
				System.out.println(t);
			}
		}
			catch(FileNotFoundException e) {
				System.out.println("���� �� �� ����");
			}
			catch(IOException e) {
				System.out.println("����� ����");
			}
		
		
		
	}
}