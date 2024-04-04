import java.util.Scanner;

public class Controller {
    Scanner scanner;
    MapInputText mapStr;
    CheckedData checkedData;
    WorkWithFile wFile;

    public Controller() {
        this.scanner = new Scanner(System.in);
        this.mapStr = new MapInputText();
        this.checkedData = new CheckedData();
    }

    public String startMsg(){
        return mapStr.msg;
    }
    public void checked(String[] arr){
        checkedData.checkedText(arr);
    }

    public String[] clientText(){
        return scanner.nextLine().split(" ");
    }
    public void fileWrite(String[] arrInputText){
        wFile = new WorkWithFile(arrInputText);
        wFile.checkingNameFile();
    }
}
