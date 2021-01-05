package day43_Inheritance.restaurant;

import java.util.ArrayList;
import java.util.Arrays;

public class Restaurant {

    public static boolean hasKitchen;
    public static boolean hasCashier;


    public String owner;
    public ArrayList<Server> servers;
    public ArrayList<Chef> chefs;


    public Restaurant(String owner) {
        this.owner = owner;
        servers = new ArrayList<>();
        chefs = new ArrayList<>();
    }

    static {
        hasKitchen = true;
        hasCashier = true;
    }

    public void hireServer(Server server) {
        servers.add(server);
    }

    public void hireServer(Server[] servers) {
        this.servers.addAll(Arrays.asList(servers));// hire all servers at once

//        for(Server each : servers ){  // hire each server one by one
//            hireServer(each);
//        }
    }

    public void hireChef(Chef chef) {// hire one chef
        chefs.add(chef);
    }

    public void hireChef(Chef[] chefs) {// hire all chefs at once
        this.chefs.addAll(Arrays.asList(chefs));
    }

    public void terminateEmployee(String ID) {
        servers.removeIf(p -> p.ID.equals(ID));
        chefs.removeIf(p -> p.ID.equals(ID));
    }


    public String toString() {
        return
                "Owner: " + owner +
                        ", Total Number of the Employee: " + (servers.size() + chefs.size()) +
                        "/n servers: " + servers.size() +
                        "/n chefs: " + chefs.size();
    }
}
