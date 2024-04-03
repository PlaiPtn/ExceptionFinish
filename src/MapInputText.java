import java.util.LinkedHashMap;
import java.util.Map;

public class MapInputText {

    Map<String, String> map = new LinkedHashMap<>();
    String msg = "Введите данные в одну строку через пробел: " +
            "Фамилия Имя Отчество дата_рождения(формата dd.mm.yyyy) " +
            "номер_телефона(7 цифр без разделителя) пол(символ латиницей f или m)";
    public MapInputText() {
        map.put("Имя", " ");
        map.put("Фамилия", " ");
        map.put("Отчество", " ");
        map.put("Дата рождения", " ");
        map.put("Телефон", " ");
        map.put("Пол", " ");
    }

    public Map<String, String> mapAdd(String[] arr){
        map.put("Имя", arr[0]);
        map.put("Фамилия", arr[1]);
        map.put("Отчество", arr[2]);
        map.put("Дата рождения", arr[3]);
        map.put("Телефон", arr[4]);
        map.put("Пол", arr[5]);
        return map;
    }


}