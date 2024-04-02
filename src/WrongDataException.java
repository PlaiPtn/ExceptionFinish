public class WrongDataException extends ClassCastException{
    public WrongDataException(){
        super("Неверно введены данные");
    }
}
