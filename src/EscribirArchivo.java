import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class EscribirArchivo {

        public static void writeFile(String texto) {
            try {
                FileWriter fileWriter = new FileWriter("usuarios.txt");
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.write(texto);


                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


