import java.io.FileWriter;
import java.io.BufferedWriter; 
import org.json.JSONObject;

public class JsonParser {
    public static void main(String[] args) throws Exception {                        
       
        JSONObject object = new JSONObject();
        object.put("key", "value");
        try {
            BufferedWriter fw = new BufferedWriter(new FileWriter("Name.json",true));
                fw.write(object.toString()); 
                /*fw.write("{\"key\":\"value\"}"); */ /*nativ*/
                fw.close(); 
        } catch (Exception e) {
            System.out.print("Dateifehler");
        }
    }
}

    
/* java -classpath C:\Users\FIS-02-2020\Documents\GitHub\Java\JsonWriter\JsonWriter\lib\json-20200518.jar JsonParser.java */