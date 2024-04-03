public class WrongDataException extends ClassCastException{
    public WrongDataException(String text){
        super(String.format("В поле %s неверно введены данные", text));
    }
}
