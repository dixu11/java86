package wzorce.solid;

class RepositoryDb implements Repository{

    public void load() {
        System.out.println("Wczytuję dane z bazy danych");
    }

    public void save() {
        System.out.println("Zapisuję dane w bazie danych");
    }

}
