package ObjectOrientedProgrammingTask.Task4Reader;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Решил изменить задачу, и сделать список книг, который ученик взял в библиотеке.
 * Работает исключительно сканером.
 *
 * Как работает:
 * takeBook требует количество книг. После этого мы сканируем каждую книгу и добавляем
 * его в список books.
 *
 * returnBook требует количество возвращаемых книг. Если название книги не правильная или
 * же эта книга отсуствует, то сканер потребует ввести снова. После того, как количество
 * правильных введенных книг будет равна количеству возвращаемых, книги удалятся из списка.
 *
 * information показывет состояние объекта.
 */
class Reader {
    private final String name;
    private final int libraryCardNumber;
    private final String phoneNumber;
    private ArrayList<String> books = new ArrayList<String>();

    public Reader(String name, int CardNumber, String phone) {
        this.name = name;
        libraryCardNumber = CardNumber;
        phoneNumber = phone;
    }

    public void takeBook(int numberOfBooks) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название книг: ");
        for (int i = 0; i < numberOfBooks; i++) {
            books.add(in.nextLine());
        }
    }

    public void returnBook(int numbersOfBooks) {
        int c = 0;
        Scanner scanner = new Scanner(System.in);
        while (c != numbersOfBooks) {
            String book = scanner.nextLine();
            if (books.contains(book)) {
                books.remove(book);
                c++;
            } else {
                System.out.println("Такой книги нет!");
            }
        }
    }

    public void information() {
        System.out.println("Name: " + name);
        System.out.println("Library card number: " + libraryCardNumber);
        System.out.println("Phone number: " + phoneNumber);
        System.out.println("Books: " + books);
    }
}
