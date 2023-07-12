import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tree implements Iterable<Person> {
    private Person rootPerson;

    public Person getRootPerson() {
        return rootPerson;
    }

    public void setRootPerson(Person rootPerson) {
        this.rootPerson = rootPerson;
    }

    private List<Person> people;

    public Tree(Person rootPerson) {
        this.rootPerson = rootPerson;
        this.people = new ArrayList<>();
        this.people.add(rootPerson);
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public List<Person> getChildren(Person person) {
        List<Person> children = new ArrayList<>();
        LocalDate personBirthDate = LocalDate.parse((CharSequence) person.getBirthDate());
        for (Person p : people) {
            if (!p.equals(person)) {
                LocalDate pBirthDate = LocalDate.parse((CharSequence) p.getBirthDate());
                if (pBirthDate.isAfter(personBirthDate)) {
                    children.add(p);
                }
            }
        }
        return children;
    }

    @Override
    public Iterator<Person> iterator() {
        return people.iterator();
    }
}
