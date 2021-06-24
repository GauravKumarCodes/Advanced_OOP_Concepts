import java.io.*;

public class Task {
    public static void main(String[] ar) {
        Task t = new Task();
        Database d = t.readCSV("./resources/iris.data");
    }
    public Database readCSV(String filename) {
        String contents = "";


        try {
            InputStream in = new BufferedInputStream(new FileInputStream(filename));
            byte[] buffer = new byte[1024];
            int lengthRead;
                 while ((lengthRead = in.read(buffer)) > 0) {
                     contents = contents + buffer.toString();
                 }
            in.close();

        } catch (FileNotFoundException e){
            e.printStackTrace();

            System.exit(-1);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        return new Database(contents);//new instance, create object
    }
}
