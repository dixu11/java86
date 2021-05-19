package wzorce.solid;

class Application { // wysokopoziomowa klasa

    //private RepositoryInFile repositoryInFile = new RepositoryInFile();
    private Repository repository;

    public Application(Repository repository) {
        this.repository = repository;
    }

    public void start(){
        System.out.println("Start aplikacji");
//        repositoryInFile.load();
        repository.load();
    }

    public void exit() {
        System.out.println("Zamknięcie aplikacji");
//        repositoryInFile.save();
        repository.save();
    }


}

class Demo{
    public static void main(String[] args) {
        Repository repository = new RepositoryDb();
        Application application = new Application(repository);
        application.start();
        application.exit();
    }
}
