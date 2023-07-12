import java.io.IOException;
import java.util.List;

public class Application {
    private Tree tree;
    private UserInterface ui;
    private FileHandler fileHandler;

    public Application(FileHandler fileHandler) {
        this.tree = null;
        this.ui = null;
        this.fileHandler = fileHandler;
    }

    public void initialize() {
        // Инициализация приложения
        Person rootPerson = new Person("John", "Doe", "01-01-1950", "M");
        this.tree = new Tree(rootPerson);
        this.ui = new UserInterface();
    }

    public void run() {
        initialize();
        ui.display();
    }

    public void processUserInput(String input) {
        // Обработка пользовательского ввода
        Person selectedPerson = ui.getSelectedPerson();
        List<Person> children = tree.getChildren(selectedPerson);
        ui.displayChildren(children);
    }

    public void saveToFile(String fileName) throws IOException {
        fileHandler.saveToFile(tree, fileName);
    }

    public void loadFromFile(String fileName) throws IOException, ClassNotFoundException {
        tree = fileHandler.loadFromFile(fileName);
    }
}
