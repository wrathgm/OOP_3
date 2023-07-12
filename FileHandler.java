import java.io.IOException;

public interface FileHandler {
    void saveToFile(Tree tree, String fileName) throws IOException;

    Tree loadFromFile(String fileName) throws IOException, ClassNotFoundException;
}
