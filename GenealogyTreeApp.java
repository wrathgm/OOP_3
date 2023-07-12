import java.io.IOException;
import java.io.File;

public class GenealogyTreeApp {
    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandlerImpl();
        Application app = new Application(fileHandler);
        try {
            app.saveToFile("tree.dat"); // Сохранение в файл
            app.loadFromFile("tree.dat"); // Загрузка из файла
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        Person rootPerson = null; // Здесь необходимо задать корневого человека
        Tree tree = new Tree(rootPerson);

        // Пример использования итератора и сортировки
        for (Person person : tree) {
            // Обработка каждого человека
            // ...
        }
    }
}
