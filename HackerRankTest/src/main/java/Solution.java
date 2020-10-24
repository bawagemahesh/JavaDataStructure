
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


class Result {

    /*
     * Complete the 'getNumDraws' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER year as parameter.
     */


    public static int getNumDraws(int year) {


        try {
            URL url = new URL("https://jsonmock.hackerrank.com/api/football_matches?{year}&{page}");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestMethod("GET");

        //    conn.setRequestProperty("Accept", "application/json");
            conn.setRequestProperty("year", new Integer(year).toString());
            conn.setRequestProperty("page", new Integer(1).toString());

            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Failed : HTTP error code : "
                        + conn.getResponseCode());
            }
            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));

            StringBuffer output = null;

            System.out.println("Output from Server .... \n");
            while ((br.readLine()) != null) {
                output.append(br.readLine());
            }
            System.out.println(output);

            conn.disconnect();

        } catch (MalformedURLException e) {

            e.printStackTrace();

        } catch (IOException e) {

            e.printStackTrace();

        }
        return 0;
    }

}

public class Solution {

    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        int year = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.getNumDraws(2011);

//        bufferedWriter.write(String.valueOf(result));
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }

}