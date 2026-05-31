import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class FirstApiExample {

    public static void main(String[] args) {

        try {

            URL url = new URL("https://jsonplaceholder.typicode.com/users");

            HttpURLConnection connection =
                    (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");

            int statusCode = connection.getResponseCode();
            System.out.println("Status Code: " + statusCode);

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()));

            String line;
            StringBuilder response = new StringBuilder();

            while ((line = br.readLine()) != null) {
                response.append(line);
            }

            br.close();
            connection.disconnect();

            System.out.println(response.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}