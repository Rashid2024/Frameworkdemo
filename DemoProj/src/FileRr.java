import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileRr {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Hello World");
		
		File file = new File("files\\TestFile.txt");
		
		FileReader fr = new FileReader(file);
		
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		
		while ((str=br.readLine())!=null){
			
			System.out.println(str);
			
		}
		
		System.out.println(br.readLine());
	
		br.close();

	}

}
