package wzorce.solid;

class RepositoryInFile implements Repository {

    public void load() {
        System.out.println("Wczytuję dane z dysku");
    }

    public void save() {
        System.out.println("Zapisuję dane na dysku");
    }

}
