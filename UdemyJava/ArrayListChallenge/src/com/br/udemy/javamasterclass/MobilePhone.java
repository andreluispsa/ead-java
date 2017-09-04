package com.br.udemy.javamasterclass;

import java.util.ArrayList;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public void MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

    public boolean addContact(Contact newContact) {
        if (findContact(newContact.getName() >= 0)) {
            System.out.println("Contact is already on file.");
            return false;
        }
        myContacts.add(newContact);
        return true;
    }
// 8:36 aula 57
}


