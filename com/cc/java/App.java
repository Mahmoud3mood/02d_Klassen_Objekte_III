package com.cc.java;

public class App {
    
    public static void main(String[] args) {
// objekt1
        Cat cat = new Cat("Grizabella", "white", 29);
// Methode
        output(cat.getStringAttributes("#name"));
        output(cat.getStringAttributes("#color"));

        output(cat.getAge());  
        output(cat.getAge()); 
        output(cat.getAge());
        output(cat.getAge()); 
 
        


        output("-------------------------");
// objekt2
Tomcat tomcat = new Tomcat("Alonzo", "grey", 35);
       

        output(tomcat.getStringAttributes("#name"));
        output(tomcat.getStringAttributes("#color"));

        output(tomcat.getAge()); 

    }

    private static void output(String outputStr) {
        System.out.println(outputStr);
    }

}

