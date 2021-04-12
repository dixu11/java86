package powtorki;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class WhileAdvancedUse {
    public static void main(String[] args)  throws FileNotFoundException { // ostrzegam że rzucam 'niebiezpieczny' wyjątek
        //wyświetl wszystkie linijki z pliku
        File file = new File("src/powtorki/petleJava.txt"); //przygotuj ścieżkę pliku (obiekt File)
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine() ){ // czy jest następna linia?
            String lineFromFile = scanner.nextLine(); // skanuj linie
            System.out.println(lineFromFile); // wyświetl linie
        }
    }
}
