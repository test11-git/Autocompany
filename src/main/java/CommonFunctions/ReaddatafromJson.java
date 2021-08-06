package CommonFunctions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class ReaddatafromJson {

	//@Test
	public void jsonreader() throws IOException, ParseException {
		// TODO Auto-generated method stub

		JSONParser jsonparser=new JSONParser();
		FileReader reader=new FileReader(".\\jsonfiles\\employee.json");
		Object obj=jsonparser.parse(reader);
		JSONObject empjsonobj=(JSONObject) obj;
		String fname=(String)empjsonobj.get("first_name");
		String lname=(String)empjsonobj.get("last_name");
		
		System.out.println("first name is:"+fname);
		System.out.println("Last  name is:"+lname);
	}

	
	
	@Test
	public void jsonwriter() throws IOException, ParseException {
		// TODO Auto-generated method stub

		JSONObject x= new JSONObject();
		x.put("Name", "vinoth");
		x.put("Age", 30);
		
		/*
		 * JSONArray y = new JSONArray(); y.add("magical smile");
		 * y.add("magnetoc eyes");
		 * 
		 * x.put("special qualities", y);
		 */
		FileWriter filewriter=new FileWriter("vinoth.json");
		filewriter.write(x.toJSONString());
		filewriter.close();
		
	}
}
