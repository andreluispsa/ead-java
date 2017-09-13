package com.udemy.java;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> placesToVisit = new LinkedList<String>();
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");

        printList(placesToVisit);

        //add another place to index position 1
        placesToVisit.add(1, "Alice Springs");

        printList(placesToVisit);

        //remove index position 4
        placesToVisit.remove(4);

        printList(placesToVisit);

        LinkedList<String> orderedPlacesToVisit = new LinkedList<String>();

        addInOrder(orderedPlacesToVisit, "Sydney");
        addInOrder(orderedPlacesToVisit, "Melbourne");
        addInOrder(orderedPlacesToVisit, "Brisbane");
        addInOrder(orderedPlacesToVisit, "Perth");
        addInOrder(orderedPlacesToVisit, "Canberra");
        addInOrder(orderedPlacesToVisit, "Adelaide");
        addInOrder(orderedPlacesToVisit, "Darwin");

        printList(orderedPlacesToVisit);

        addInOrder(orderedPlacesToVisit, "Alice Springs");

        printList(orderedPlacesToVisit);

        addInOrder(orderedPlacesToVisit, "Adelaide");

        printList(orderedPlacesToVisit);

    }
    private static void printList(LinkedList<String> linkedList) {

        // Iterator which control the iteration of the linkedList
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("==================================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {

        //this is a setup to ListIterator, but it doesn't access the first item. You need to use next() to go to the first item.
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            // compares the
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0 ) {
                //they are equal, do not add
                System.out.println("New city " + newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0) {
                //new city should appear before this one
                //Brisbane --> Adelaide
                //have to get back because "next" was used before
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else if (comparison < 0) {
                //move on next city
            }
        }

        stringListIterator.add(newCity);
        return true;
    }
}


//aula 66, tempo 6min:12s