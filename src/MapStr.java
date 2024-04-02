import java.util.LinkedHashMap;
import java.util.Map;

public class MapStr {

    Map<String, String> map = new LinkedHashMap<>();
    String msg = "Введите текст согласно образцу через пробел: " +
            "Фамилия Имя Отчество дата_рождения номер_телефона пол";
    public MapStr() {
        map.put("Имя", " ");
        map.put("Фамилия", " ");
        map.put("Отчество", " ");
        map.put("Дата рождения", " ");
        map.put("Телефон", " ");
        map.put("Пол", " ");
    }

    public int getLenMap() {
        return map.size();
    }

    public Map<String, String> mapAdd(String[] arr){
        map.put("Имя", " ");
        map.put("Фамилия", " ");
        map.put("Отчество", " ");
        map.put("Дата рождения", " ");
        map.put("Телефон", " ");
        map.put("Пол", " ");
        return map;
    }
}
