package satbayev.SIS1;

import java.time.LocalDate;

public class Ticket {
    private int routeNo; //целочисленное значения для обозначения номера маршрута.
    private String pointOfDeparture; // строка, означающая пункт отправления
    private LocalDate departureTime; //время отправки
    private String destination; // строка, означающая пункт назначения
    private LocalDate arrivalTime; // время прибытия
    private double price; // стоимость билета, заданное вещественным значением

    //Конструктор
    public Ticket() {
    }

    public Ticket(int routeNo, String pointOfDeparture, int year1, int mouth1, int day1,
                  String destination, int year2, int mouth2, int day2, double price) {
        this.routeNo = routeNo;
        this.pointOfDeparture = pointOfDeparture;
        this.destination = destination;
        this.price = price;
        departureTime = LocalDate.of(year1, mouth1, day1);
        arrivalTime = LocalDate.of(year2, mouth2, day2);
    }

    public int getRouteNo() {
        return routeNo;
    }

    public void setRouteNo(int routeNo) {
        this.routeNo = routeNo;
    }

    public String getPointOfDeparture() {
        return pointOfDeparture;
    }

    public void setPointOfDeparture(String pointOfDeparture) {
        this.pointOfDeparture = pointOfDeparture;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public LocalDate getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDate departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDate getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDate arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "routeNo=" + routeNo +
                ", pointOfDeparture='" + pointOfDeparture + '\'' +
                ", departureTime=" + departureTime +
                ", destination='" + destination + '\'' +
                ", arrivalTime=" + arrivalTime +
                ", price=" + price +
                '}';
    }
}
