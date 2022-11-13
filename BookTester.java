import java.util.ArrayList;
import java.util.Scanner;
public class BookTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("--- Main Menu ----");
            System.out.println("1 Display all book");
            System.out.println("2 Add Book");
            System.out.println(" 3 Update book");
            System.out.println("4 Delete book");
            System.out.println("5 search book");
            System.out.println("6 Exit");
            System.out.println("enter your choice");
            int choiceNumber = scanner.nextInt();
            switch (choiceNumber) {
                case 1:
                    book.DisplayAllBooks();


                    break;
                case 2:
                    book.addbooks(scanner);
                    break;

                case 3:
                    book.updatebooks(scanner);
                    break;



                case 4:
                  // book.deletebook(scanner);
                    break;


                case 5:



            }

    }}


    public static void exitfromapp () {
        System.exit(0);}}












