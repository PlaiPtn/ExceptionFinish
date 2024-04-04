import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class WorkWithFile{
    File file = new File("src/catalog");
    private final String[] arrText;

    public WorkWithFile(String[] arrText) {
        this.arrText = arrText;
    }

    public void checkingNameFile(){
        String[] list = file.list();
        String nameFile = arrText[1];
        for (var name: list) {
            if(nameFile.equals(name)){
                writeToFile(name, arrText);
                return;
            }
        }
        writeToFile(nameFile, arrText);

    }

    private void writeToFile(String nameFile, String[] arr) {
        try (FileWriter fileWr = new FileWriter("src/catalog/" + nameFile + ".txt", true)){
            fileWr.write(String.format("<%s> <%s> <%s> <%s> <%s> <%s>\n",
                    arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
