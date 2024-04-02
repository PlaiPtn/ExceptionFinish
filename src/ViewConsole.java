import java.util.LinkedHashMap;
import java.util.Map;

public class ViewConsole {

    CheckedData check = new CheckedData();
    public void run(){
        System.out.println(check.msg);
        InputClientText clientData = new InputClientText();
        String inputText = clientData.clientText();
        System.out.println(check.checkedText(inputText));


    }
}
