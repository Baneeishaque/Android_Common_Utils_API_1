package ndk.utils_android1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class NetworkUtils {

    //TODO : Can ping function
    //TODO : No connection Snackbar with Retry option

    public static String[] performHttpGet(String url) {

        String inputLine;

        try {
            //Create a connection
            HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
            //Set methods and timeouts
            connection.setRequestMethod("GET");

            // TODO : Connection With Read Timeout
            // TODO : Connection With Connection Timeout
//            connection.setReadTimeout(READ_TIMEOUT);
//            connection.setConnectTimeout(CONNECTION_TIMEOUT);

            //Connect to our url
            connection.connect();
            //Create a new InputStreamReader
            InputStreamReader streamReader = new InputStreamReader(connection.getInputStream());
            //Create a new buffered reader and String Builder
            BufferedReader reader = new BufferedReader(streamReader);
            StringBuilder stringBuilder = new StringBuilder();
            //Check if the line we are reading is not null
            while ((inputLine = reader.readLine()) != null) {
                stringBuilder.append(inputLine);
            }
            //Close our InputStream and Buffered reader
            reader.close();
            streamReader.close();
            //Set our result equal to our stringBuilder
            return new String[]{"0", stringBuilder.toString()};

        } catch (ProtocolException e) {
            return new String[]{"1", "ProtocolException : " + e.getLocalizedMessage()};
        } catch (MalformedURLException e) {
            return new String[]{"1", "MalformedURLException : " + e.getLocalizedMessage()};
        } catch (IOException e) {
            return new String[]{"1", "IOException : " + e.getLocalizedMessage()};
        }
    }
}
