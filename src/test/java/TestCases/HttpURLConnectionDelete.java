package TestCases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.testng.annotations.Test;

public class HttpURLConnectionDelete {
	@Test
	public void employeedetails() throws IOException {
	URL url=new URL("http://dummy.restapiexample.com/api/v1/update/21");
	HttpURLConnection connection=(HttpURLConnection) url.openConnection();
	connection.setRequestMethod("DELETE");
	connection.setRequestProperty("Content-Type", "application/json");
	connection.setDoOutput(true);
	
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



