package org.example;

import org.example.composite.Chef;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
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
    }
}