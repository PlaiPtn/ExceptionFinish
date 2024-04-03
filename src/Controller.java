public class Controller {

    MapInputText mapStr = new MapInputText();
    CheckedData checkedData = new CheckedData();
    public String startMsg(){
        return mapStr.msg;
    }
    public void checked(String[] arr){
        checkedData.checkedText(arr);
    }
}
