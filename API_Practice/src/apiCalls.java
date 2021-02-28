import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
//import java.net.HttpURLConnection;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class apiCalls {
	//private static HttpURLConnection connection;
	public static void main(String[] args) throws JSONException{
		// TODO Auto-generated method stub
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request= HttpRequest.newBuilder()
		.uri(URI.create("https://jsonplaceholder.typicode.com/albums"))
		.GET()
		.build();
		
		client.sendAsync(request,BodyHandlers.ofString())
		.thenApply(HttpResponse::body)
		//.thenApply(apiCalls::parse)
		.thenAccept(System.out::println)
		.join();
		

	}
	public static String parse(String responseBody) throws Exception {
		JSONArray albums= new JSONArray(responseBody);
		for(int x=0; x < albums.length();x++) {
			JSONObject album = new JSONObject();
			 //albums.getJSONObject(x);
			//int id=album.getInt("id");
			//int userId=album.getInt("userId");
			//String title=album.getString("title");
			//System.out.println(id+" "+title+" "+userId);
		}
		return null;
	}


}
