package TestCases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import org.testng.annotations.Test;

public class HttpURLConnectionPost {
	@Test
	public void employeedetails() throws IOException {
	URL url=new URL("http://dummy.restapiexample.com/api/v1/create");
	HttpURLConnection connection=(HttpURLConnection) url.openConnection();
	connection.setRequestMethod("POST");
	connection.setRequestProperty("Content-Type", "application/json");
	connection.setDoOutput(true);
	
	String jsonbody= "{\"name\":\"vinoth\",\"Age\":\"30\"}";
	byte[] inputjson=jsonbody.getBytes();
	
	OutputStream outputstream=connection.getOutputStream();
	outputstream.write(inputjson);
	
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


