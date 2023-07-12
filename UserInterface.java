import java.util.List;

public class UserInterface {
    private Person selectedPerson;

    public UserInterface() {
        this.selectedPerson = null;
    }

    public void display() {
        // Отображение графического интерфейса пользователя
    }

    public Person getSelectedPerson() {
        return selectedPerson;
    }

    public void displayChildren(List<Person> children) {
        // Отображение детей выбранного человека
    }
}
