import java.util.Scanner;

public class ViewConsole {

    CheckedData check = new CheckedData();
    public void run(){
        System.out.println("Введите текст согласно образцу через пробел: " +
                "Фамилия Имя Отчество дата_рождения номер_телефона пол");
        InputClientText clientData = new InputClientText();
        String inputText = clientData.clientText();
        if(check.checked(inputText)){
            System.out.println("Да");
        }else {
            System.out.println("Нет");
        }
    }
}
