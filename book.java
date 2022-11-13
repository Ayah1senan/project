import java.util.ArrayList;
import java.util.Scanner;

public abstract class book {
    static ArrayList<book> booksList = new ArrayList();
    private String name;
    private double price;
    private String author;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    book() {

    }

    static void updatebooks(Scanner scanner) {
        boolean isMenu = true;
        while (isMenu) {
            System.out.println("--- Main Menu ----");
            System.out.println("1 Display all book");
            System.out.println("2 Add Book");
            System.out.println(" 3 Update book");
            System.out.println("4 Delete book");
            System.out.println("5 search book");
            System.out.println("6 Exit");
            System.out.println("enter your choice");

        }
        int choiceNumber1 = scanner.nextInt();
        switch (choiceNumber1) {
            case 1:
                System.out.println("Enter book name : ");
                String bookName = scanner.next();
                book newbook = book.getBookByName(bookName);
                book oldbook = book.getBookByName(bookName);
                if (oldbook == null) {
                    System.out.println("No book with this name!");
                } else {
                    System.out.println("Enter book name");
                    String newname = scanner.next();
                    newbook.setName(newname);
                    if (book.UpdateBook(newbook, oldbook)) {
                        System.out.println("Updated successfully");
                    } else {
                        System.out.println("update failed");
                    }

                }

                break;
            case 2:
                System.out.println("Enter book name");
                String bookname1 = scanner.next();
                book oldbook1 = book.getBookByName(bookname1);
                book newbook1 = book.getBookByName(bookname1);
                if (oldbook1 == null) {
                    System.out.println("No book with this name!");
                } else {
                    System.out.println("Enter book's new author");
                    String newauthor = scanner.next();
                    newbook1.setAuthor(newauthor);
                    if (book.UpdateBook(newbook1, oldbook1)) {
                        System.out.println("Updated successfully");
                    } else {
                        System.out.println("updated failed");
                    }
                    break;

                }


            case 4: {
                isMenu = false;
                break;
            }
            case 5:
                BookTester.exitfromapp();
                break;
        }
    }


    public book(String name, double price, String author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public static void DisplayAllBooks() {

        ArrayList<book> listbook = book.booksList;
        if (listbook.isEmpty()) {
            System.out.println("there is no Data");
        } else {
            for (book b : listbook) {
                System.out.println(b.getName() + "     " + b.getAuthor() + " ");

            }
        }


    }

    public static void addbooks(Scanner scanner) {
        System.out.println("Enter The Count of book  ");
        int countBook = scanner.nextInt();
        if (countBook < 0) {
            System.out.println("Not Valid, the count must be > 0");
        } else {
            for (int i = 0; i < countBook; i++) {
                System.out.println("Enter Book " + (i + 1) + " name");
                String nameBook = scanner.next();
                System.out.println("Enter Book " + (i + 1) + " author");
                String authorBook = scanner.next();
                System.out.println("Enter Book  " + (i + 1) + " price");
                double priceBook = scanner.nextDouble();
                book b = new book() {
                    @Override
                    public void setName(String name) {
                        super.setName(name);
                    }

                    @Override
                    public void setPrice(double price) {
                        super.setPrice(price);
                    }

                    @Override
                    public String getAuthor() {
                        return super.getAuthor();
                    }
                };

                book.booksList.add(b);
            }
        }
    }

    public static book getBookByName(String name) {
        for (book b : booksList) {
            if (b.name.equals(name)) {
                return b;
            }
        }
        return null;

    }

    public static boolean UpdateBook(book newbook, book oldbook) {
        if (booksList.size() > 0) {
            int index = -1;
            for (int i = 0; i < booksList.size(); i++) {
                if (booksList.get(i).getName().equals(oldbook.getName())) {
                    index = i;
                    break;
                }
            }
            if (index != -1) {
                booksList.get(index).setName(newbook.getName());
                booksList.get(index).setAuthor(newbook.getAuthor());
                booksList.get(index).setPrice(newbook.getPrice());
                return true;
            }
        }
        return false;

    }}


//    static boolean deletebook(String scanner) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("enter name book");
//        String bookName = in.next();
//        book b = book.getBookByName(bookName);
//        if(b==null){
//            System.out.println("no book is founded");
//        }
//        else {
//            if(book.deletebook()){
//                System.out.println("deleted successfuly");
//            }
//            else {
//                System.out.println("delete is failed");
//            }
//
//        }
//        if (booksList.isEmpty(b)) {
//            booksList.remove(b);
//            return true;
//        }
//
//
//}}






