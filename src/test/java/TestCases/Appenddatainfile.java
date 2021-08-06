package TestCases;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Appenddatainfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
  FileWriter  file = new FileWriter("E:\\usingbufferedreader.txt",true);
  BufferedWriter b =new BufferedWriter(file);
  b.write("welcome");
 // b.append("welcome");
  b.close();
  file.close();
  
	}

}
