import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Statement;
import java.util.Scanner;

public class AddBookManually {
    public static void main(String[] args) throws IOException {
        Scanner scannerObject = new Scanner(System.in);
        System.out.println("Veuillez saisir le titre : ");
        String title = scannerObject.nextLine();
        System.out.println("Veuillez saisir le nom de l'auteur : ");
        String author = scannerObject.nextLine();
        System.out.println("Veuillez saisir le nom de l'éditeur : ");
        String publisher = scannerObject.nextLine();
        System.out.println("Veuillez saisir la description : ");
        String synopsys = scannerObject.nextLine();

        Book book1 = new Book(title, author, publisher, synopsys);
        book1.displayInformations();

        System.out.println("Nombre de livres enregistres : " + Book.getBookSavedNumber());
        File outFile = new File("C:/Users/Coleene/Documents/test.txt");
        outFile.getParentFile().mkdirs();

        FileWriter fileWriter = new FileWriter(outFile, true);

        System.out.println("Writer file: " + outFile.getAbsolutePath());
        System.out.println("With encoding: " + fileWriter.getEncoding());

        fileWriter.write(book1.getTitle());
        fileWriter.write("\n");
        fileWriter.write(book1.getAuthor());
        fileWriter.write("\n");
        fileWriter.write(book1.getPublisher());
        fileWriter.write("\n");
        fileWriter.write(book1.getSynopsys());
        fileWriter.write("\n");

        fileWriter.close();

        scannerObject.close();
    }
}
