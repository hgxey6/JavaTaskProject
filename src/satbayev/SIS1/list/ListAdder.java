package satbayev.SIS1.list;

import satbayev.SIS1.Ticket;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ListAdder {

    public static void elementAdd(List<Ticket> list, int n) {
        for (int i = 0; i < n; i ++) {
            Ticket ticket =  new Ticket();
            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите номер маршрута(int): ");
            int routeNo = scanner.nextInt();// целочисленное значения для обозначения номера маршрута
            ticket.setRouteNo(routeNo);

            System.out.println("пункт отправления(string): ");
            String pointOfDeparture = scanner.next(); //строка, означающая пункт отправления
            ticket.setPointOfDeparture(pointOfDeparture);

            //время отправки
            System.out.println("время отправки(year month day): ");
            int depDay = scanner.nextInt();
            int depMonth = scanner.nextInt();
            int depYear = scanner.nextInt();
            LocalDate departureTime = LocalDate.of(depYear, depMonth, depDay);
            ticket.setDepartureTime(departureTime);


            System.out.println("пункт назначения(string): ");
            String destination = scanner.next(); //строка, означающая пункт назначения
            ticket.setDestination(destination);

            System.out.println("время прибытия(int int int): ");
            int arrDay = scanner.nextInt();
            int arrMonth = scanner.nextInt();
            int arrYear = scanner.nextInt();
            LocalDate arrivalDate = LocalDate.of(depYear, depMonth, depDay);
            ticket.setArrivalTime(departureTime);

            System.out.println("цена(double): ");
            double price = scanner.nextInt(); //стоимость билета, заданное вещественным значением
            ticket.setPrice(price);

            list.add(ticket);
        }
    };
}
