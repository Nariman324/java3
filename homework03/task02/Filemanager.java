package homework03.task02;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Filemanager {

    public StringBuilder readFile(String path) throws IOException {
        StringBuilder text = new StringBuilder();
        try (FileReader reader = new FileReader(new File(path))) {
            while (reader.ready()) {
                text.append((char) reader.read());
            }
        }
        return text;
    }

    public void writeFIle(String path, String text) throws IOException {
        File file = new File(path);
        try (FileWriter writer = new FileWriter(file)) {
            if (!file.exists()) {
                throw new IOException("Файл не найден");
            }
            writer.write(text);
        }
    }

    public void copyFile(String path, String copyPath) throws IOException {
        try (FileReader reader = new FileReader(new File(path));
                FileWriter writer = new FileWriter(new File(copyPath))) {
            while (reader.ready()) {
                writer.write(reader.read());
            }
        }
    }
}
