public class CheckedData {
    public boolean checked(String data){
        String[] arrData = data.split(" ");
        if (arrData.length < 6) {
            throw new  WrongLenDataException("Неверная длинна данных");
        }
        return true;
//        for (int i = 0; i < arrData.length; i++) {
//            pass;
//        }
    }
}
