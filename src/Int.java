import java.util.LinkedHashMap;
import java.util.Map;

public interface Int {

    Map<String, String> map = new LinkedHashMap<>();
    String name = null;
    String SeeName = null;
    String firstName = null;
    String bzdDay = null;
    String sex = null;

    default Map<String, String> mapAdd(){
        map.put(name, " ");
        map.put(SeeName, " ");
        map.put(firstName, " ");
        map.put(bzdDay, " ");
        map.put(sex, " ");
        return map;
    }
}
