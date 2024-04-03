import java.util.LinkedHashMap;
import java.util.Map;

public class ViewConsole {

    Controller controller = new Controller();
    public void run(){
        System.out.println(controller.startMsg());
        InputClientText clientData = new InputClientText();
        String[] inputText = clientData.clientText().split(" ");
        controller.checked(inputText);


    }
}
