import java.util.LinkedHashMap;
import java.util.Map;

public class CheckedData{

    MapStr mapStr = new MapStr();
    String msg = mapStr.msg;
    public void checkedText(String text){
        String[] arr = text.split(" ");
        Map<String, String> map = mapStr.mapAdd(arr);
        if (arr.length < map.size()){
            throw new WrongLenDataException();
        } else {
            for(var i: map.keySet()){
                char[] charsText = map.get(i).toCharArray();
                for (char c : charsText) {
                    if (!Character.isLetter(c)) {
                        if (i.equals("Телефон")){
                            if(map.get(i).length() < 7){
                                throw new WrongDataException(i);
                            }
                        throw new WrongDataException(i);
                }
            }
            }
        }
    }
}
