
public class ConstInputText {

    private String msg;

    private int lenArrText;

    public ConstInputText() {
        this.msg = "Введите данные в одну строку через пробел: " +
                "Фамилия Имя Отчество дата_рождения(формата dd.mm.yyyy) " +
                "номер_телефона(7 цифр без разделителя) пол(символ латиницей f или m)";
        this.lenArrText = 6;
    }

    public String getMsg() {
        return msg;
    }

    public int getLenArrText() {
        return lenArrText;
    }
}
