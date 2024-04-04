import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class CheckedData implements CheckedInter {

    MapInputText mapStr;
    DateFormat df;
    Date todayDate;

    public CheckedData() {
        this.mapStr = new MapInputText();;
        this.df = new SimpleDateFormat("dd.MM.yyyy");;
        this.todayDate = new Date();
    }

    public void checkedText(String[] arrText){
        checkedLen(arrText);
        checkedName(arrText[0]);
        checkedSurname(arrText[1]);
        checkedPatronymic(arrText[2]);
        checkedBirthday(arrText[3]);
        checkedNumbTelephone(arrText[4]);
        checkedGender(arrText[5]);

    }

    @Override
    public void checkedLen(String[] text) {
        if(text.length != mapStr.map.size()){
            throw new WrongLenDataException();
        }
    }

    @Override
    public void checkedName(String text) {
        char[] charsText = text.toCharArray();
        for (char c : charsText) {
            if (!Character.isLetter(c)) {
                throw new WrongDataException("'Имя'");
            }
        }
    }

    @Override
    public void checkedSurname(String text) {
        char[] charsText = text.toCharArray();
        for (char c : charsText) {
            if (!Character.isLetter(c)) {
                throw new WrongDataException("'Фамилия'");
            }
        }

    }

    @Override
    public void checkedPatronymic(String text) {
        char[] charsText = text.toCharArray();
        for (char c : charsText) {
            if (!Character.isLetter(c)) {
                throw new WrongDataException("'Отчество'");
            }
        }
    }

    @Override
    public void checkedNumbTelephone(String text) {
        if(text.length() != 7){
            throw new WrongDataException("'Номер телефона'");
        }
        else {
            try {
                Integer.valueOf(text);
            }
            catch (NumberFormatException e) {
                throw new WrongDataException("'Номер телефона'");
            }
        }

    }

    @Override
    public void checkedBirthday(String text) {
        df.setLenient(false);
        try {
            Date Birthday = df.parse(text);
            if(todayDate.before(Birthday)) throw new Exception();
        } catch (Exception e) {
            throw new WrongDataException("'День рождения'");
        }
    }

    @Override
    public void checkedGender(String text) {
        if(!text.equals("m") && !text.equals("f")){
            throw new WrongDataException("'Пол'");
        }
    }
}
