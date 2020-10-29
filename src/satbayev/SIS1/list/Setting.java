package satbayev.SIS1.list;

import satbayev.SIS1.Ticket;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Setting {
    public static void process(ArrayList<Ticket> list) {
        try {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                print();
                int menu = scanner.nextInt();
                switch (menu) {
                    case 0 -> System.exit(0);
                    case 1 -> {
                        list.sort(Comparator.comparing(Ticket::getRouteNo));
                        for (Ticket t : list) {
                            System.out.println("Номер автобуса=" + t.getRouteNo());
                        }
                    }
                    case 2 -> {
                        list.sort(Comparator.comparing(Ticket::getPointOfDeparture));
                        for (Ticket t : list) {
                            System.out.println("Номер автобуса=" + t.getRouteNo() + "\t"
                                    + "Пункт отправления=" + t.getPointOfDeparture());
                        }
                    }
                    case 3 -> {
                        list.sort(Comparator.comparing(Ticket::getDestination));
                        for (Ticket t : list) {
                            System.out.println("Номер автобуса=" + t.getRouteNo() + "\t"
                                    + "Пункт прибытия=" + t.getDestination());
                        }
                    }
                    case 4 -> {
                        list.sort(Comparator.comparing(Ticket::getDepartureTime));
                        for (Ticket t : list) {
                            System.out.println("Номер автобуса=" + t.getRouteNo() + "\t"
                                    + "Дата отправления=" + t.getDepartureTime());
                        }
                    }
                    case 5 -> {
                        list.sort(Comparator.comparing(Ticket::getArrivalTime));
                        for (Ticket t : list) {
                            System.out.println("Номер автобуса=" + t.getRouteNo() + "\t"
                                    + "Дата прибытия=" + t.getArrivalTime());
                        }
                    }
                    case 6 -> {
                        list.sort(Comparator.comparing(Ticket::getPrice));
                        for (Ticket t : list) {
                            System.out.println("Номер автобуса=" + t.getRouteNo() + "\t"
                                    + "Цена=" + t.getPrice());
                        }
                    }
                    case 7 -> {
                        for (Ticket t : list) {
                            System.out.println(t);
                        }
                    }
                }
            }
        } catch (InputMismatchException e) {
            System.err.println("Нужно ввести число!");
        } catch (Exception e) {
            System.err.println("Ошибка!");
        } finally {
            System.err.println("завершение!");
        }

    }

    public static void print() {
        System.out.println("Сортировка по: ");
        System.out.println("\tпо номеру маршрута 1");
        System.out.println("\tпо пункту отправления 2");
        System.out.println("\tпо пункту прибытия 3");
        System.out.println("\tпо дате отправления 4");
        System.out.println("\tпо дате прибытия 5");
        System.out.println("\tпо стоимости 6");
        System.out.println("\tвывести список 7");
        System.out.println("\tВЫХОД 0");
    }

    public static void elementPrint(ArrayList<Ticket> list) {
        for (Ticket t : list) {
            System.out.println(t);
        }
    }
}
