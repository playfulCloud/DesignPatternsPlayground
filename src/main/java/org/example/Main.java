package org.example;

import org.example.composite.Chef;
import org.example.composite.KitchenStaff;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // after we created objects then we need to established tree like structure
        Chef execChef = new Chef("Gemma Patron", "Executive Chef");
        Chef headChef = new Chef("Tiksha Century", "Head Chef");
        Chef sousChef1 = new Chef ("Tilly Hope", "Sous Chef");
        Chef sousChef2 = new Chef ("Pat Stringe", "Sous Chef");
        Chef lineChef1 = new Chef ("Seth Arpage", "Line Chef");
        Chef lineChef2 = new Chef ("Diego Salazar", "Line Chef");
        Chef lineChef3 = new Chef ("Cersei Butrix", "Line Chef");
        Chef lineChef4 = new Chef ("Marissa Parth", "Line Chef");
        Chef commisChef1 = new Chef ("Johnny Ferd", "Commis Chef");
        Chef commisChef2 = new Chef("Kay Fleping", "Commis Chef");

        // through each object list there is tree struture that all chef have their bosses
        execChef.add(headChef);

        headChef.add(sousChef1);
        headChef.add(sousChef2);

        sousChef1.add(lineChef1);
        sousChef1.add(lineChef2);
        sousChef1.add(lineChef3);
        sousChef1.add(lineChef4);

        lineChef1.add(commisChef1);
        lineChef1.add(commisChef2);
        lineChef2.add(null);
        lineChef3.add(null);
        lineChef4.add(null);

        commisChef1.add(null);
        commisChef2.add(null);

        System.out.println("\n\nKitchen Staff Management System\n");
        System.out.println(execChef.getDetails());
        List<KitchenStaff> head = execChef.getChefList();
        for (int i=0; i < head.size(); i++) {
            System.out.println("\t" + head.get(i).getDetails());
        }
        List<KitchenStaff> sous = headChef.getChefList();
        for (int i=0; i < sous.size(); i++) {
            System.out.println("\t\t" + sous.get(i).getDetails());
        }
        List<KitchenStaff> line = sousChef1.getChefList();
        for (int i=0; i < line.size(); i++) {
            System.out.println("\t\t\t" + line.get(i).getDetails());
        }
        List<KitchenStaff> commis = lineChef1.getChefList();
        for (int i=0; i < commis.size(); i++) {
            System.out.println("\t\t\t\t" + commis.get(i).getDetails());
        }
    }
}