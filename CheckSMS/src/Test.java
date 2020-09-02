import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;


public class Test {
	
	public String sendSms( String mno) {
			try {	System.out.println("Mobile no is " + mno);
				
				String apiKey = "apikey=" + "x+Ap4tqVUG0-9WGrK1lahOsqBYI6qeltwjOEWSYHvH";
				String message ="&message=" +"This is sample msg";
				String sender = "&sender=" + "TXTLCL";
				String numbers = "&numbers=" + mno;
				
				HttpURLConnection conn = (HttpURLConnection) new URL("https://api.textlocal.in/send/?").openConnection();
				String data = apiKey + numbers + message + sender;
				conn.setDoOutput(true);
				conn.setRequestMethod("POST");
				conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
				conn.getOutputStream().write(data.getBytes("UTF-8"));
				final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
				final StringBuffer stringBuffer = new StringBuffer();
				String line;
				while ((line = rd.readLine()) != null) {
					stringBuffer.append(line);
				}
				rd.close();
				return stringBuffer.toString();
			} 
			catch (Exception e) 
			{
				System.out.println("Error SMS "+e);
				return "Error "+e;
			}
		
	}
	public static void main(String[] args) {
		Test t = new Test();
	String res  =	t.sendSms("9822090966");
	System.out.println(res);

	}

}
