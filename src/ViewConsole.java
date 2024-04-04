
public class ViewConsole {

    Controller controller;

    public ViewConsole() {
        this.controller = new Controller();;
    }

    public void run(){
        System.out.println(controller.startMsg());
        String[] arrInputText = controller.clientText();
        controller.checked(arrInputText);
        controller.fileWrite(arrInputText);
        System.out.println("Абонент записан в файл");
    }
}
