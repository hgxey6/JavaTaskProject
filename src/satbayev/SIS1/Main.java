package satbayev.SIS1;

import satbayev.SIS1.list.ListAdder;
import satbayev.SIS1.list.Setting;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Ticket> list = new ArrayList<>();

        ListAdder.elementAdd(list, 1);

        Ticket ticket1 = new Ticket(54,
                "Nur-sultan", 2020, 5, 25,
                "Almaty", 2020, 5, 27, 5600);
        Ticket ticket2 = new Ticket(46,
                "Aqtobe", 2020, 9, 9,
                "Almaty", 2020, 9, 14, 15000);
        Ticket ticket3 = new Ticket(12,
                "Kazan", 2020, 12, 12,
                "Moscow", 2020, 12, 17, 24000);
        list.add(ticket1);
        list.add(ticket2);
        list.add(ticket3);

        Setting.process(list);
    }

}

