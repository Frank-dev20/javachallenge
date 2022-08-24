package challenge;

import java.net.URL;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;

public class JavaAPI {

    public static void main (String[] args) {
        System.setProperty("http.agent", "Chrome");
        try {
            URL url = new URL("https://coderbyte.com/api/challenges/json/rest-get-simple");
            try {
                URLConnection connection = url.openConnection();
                InputStream inputStream = connection.getInputStream();
                int bufferSize = 1024;
                char[] buffer = new char[bufferSize];
                StringBuilder out = new StringBuilder();
                Reader in = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
                for(int numRead; (numRead = in.read(buffer, 0, buffer.length))>0;){
                    out.append(buffer, 0, numRead);
                }
                String jsonString = out.toString();
                String stringArray = jsonString.split("hobbies\":")[1];
                System.out.println(stringArray);
                String hobbies = stringArray.substring(1, stringArray.length()-1);
                String[] hobbiesArray = hobbies.split(",");

                StringBuilder sb = new StringBuilder();
                for(String hobby : hobbiesArray){
                    sb.append(hobby, 1, hobby.length()-1);
                    sb.append(",");
                }

                String finalOutput = sb.substring(0, sb.toString().length()-2);
                String challengeString = "6yp4bli192";
                int count = 0;
                StringBuilder result = new StringBuilder();

                for(char character: finalOutput.toCharArray()){
                    if(count < challengeString.length()){
                        result.append(character).append(challengeString.charAt(count));
                        count++;
                    }else{
                        result.append(character);
                    }
                }
                System.out.println(result);
            } catch (IOException ioEx) {
                System.out.println(ioEx);
            }
        } catch (MalformedURLException malEx) {
            System.out.println(malEx);
        }
    }
}

