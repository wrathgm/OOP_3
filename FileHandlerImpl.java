import java.io.*;

public class FileHandlerImpl implements FileHandler {
    @Override
    public void saveToFile(Tree tree, String fileName) throws IOException {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(fileName))) {
            outputStream.writeObject(tree);
        }
    }

    @Override
    public Tree loadFromFile(String fileName) throws IOException, ClassNotFoundException {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(fileName))) {
            return (Tree) inputStream.readObject();
        }
    }
}
