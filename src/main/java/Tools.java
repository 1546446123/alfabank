import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Tools {
    public static String  EscapeString(String value){
        String result = null;
        try {
            result = URLEncoder.encode(value, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;

    }
}
