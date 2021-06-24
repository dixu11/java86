package serialization.csv;

public class CsvDemo {
    public static void main(String[] args) {
        PersonCSVRepository repository = new PersonCSVRepository();
//        Person person = new Person("Jasiek",30);
//        repository.savePerson(person);
        System.out.println(repository.loadPeople2());
    }
}
