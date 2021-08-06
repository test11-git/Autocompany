package TestCases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

public class HttpUrlConnectionExample {

	@Test
	public void employeedetails() throws IOException {
	URL url=new URL("http://dummy.restapiexample.com/api/v1/employees");
	HttpURLConnection connection=(HttpURLConnection)url.openConnection();
	
	connection.setRequestMethod("GET");
	connection.connect();
	int statuscode=connection.getResponseCode();
	System.out.println("status code is:"+statuscode);
	
	String message=connection.getResponseMessage();
	System.out.println("status message is:"+message);
	
	InputStream inputstream=connection.getInputStream();
	InputStreamReader inputstreamreader=new InputStreamReader(inputstream);
	BufferedReader reader=new BufferedReader(inputstreamreader);
	String line;
	StringBuffer buffer=new StringBuffer();
	while((line=reader.readLine())!=null){	
		buffer.append(line);
	}
	System.out.println(line);
	
	
}
}
