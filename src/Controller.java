import java.util.Scanner;

public class Controller {
    Scanner scanner;
    ConstInputText cInpText;
    CheckedData checkedData;
    WorkWithFile wFile;

    public Controller() {
        this.scanner = new Scanner(System.in);
        this.checkedData = new CheckedData();
        this.cInpText = new ConstInputText();
    }

    public String startMsg(){
        return cInpText.getMsg();
    }

    public int sizeText(){
        return cInpText.getLenArrText();
    }
    public void checked(String[] arr, int sizeText){
        checkedData.checkedText(arr, sizeText);
    }

    public String[] clientText(){
        return scanner.nextLine().split(" ");
    }
    public void fileWrite(String[] arrInputText){
        wFile = new WorkWithFile(arrInputText);
        wFile.checkingNameFile();
    }
}
