import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ApiDataProcessor {

    // Step 1 & 2: Fetch data from API and parse (basic string list assumption)
    static List<String> fetchDataFromApi(String apiEndpoint) throws Exception {
        URL url = new URL(apiEndpoint);
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod("GET");

        int responseCode = conn.getResponseCode();
        if (responseCode != HttpURLConnection.HTTP_OK) { // Check for successful response
            throw new RuntimeException("HttpResponseCode: " + responseCode);
        }

        // Read the response
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        StringBuilder content = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            content.append(inputLine);
        }
        in.close();
        conn.disconnect();

        // For this example, we manually create a list assuming the API returned simple string data
        // In a real application, you would parse the 'content' string from the API into a List using a JSON library like Gson.
        // Example: List<String> dataList = new Gson().fromJson(content.toString(), new TypeToken<List<String>>(){}.getType());

        // Mock data for demonstration:
        List<String> mockData = new ArrayList<>();
        mockData.add("apple");
        mockData.add("banana");
        mockData.add("apple");
        mockData.add("orange");
        mockData.add("banana");
        mockData.add("grape");
        return mockData;
    }

    // Step 3: Use Java Streams to find duplicate elements
    static <T> Set<T> findDuplicates(List<T> list) {
        // A Set's add method returns false if the element is already present
        Set<T> seenElements = new HashSet<>();
        return list.stream()
                .filter(e -> !seenElements.add(e)) // Filter elements that cannot be added (i.e., duplicates)
                .collect(Collectors.toSet()); // Collect the duplicates into a Set to avoid duplicate duplicates
    }
}
