package dev.lpa;

import java.util.ArrayList;

public class MobilePhone {

    //field or attribute myNumber
    private String myNumber;
    //arrayList of type Contact
    private ArrayList<Contact> myContacts;


    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact newContact) {
        if (findContact(newContact) == -1) {
            myContacts.add(newContact);
            return true;
        }
        return false;
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (findContact(oldContact) == -1) {
            return false;
        }
        myContacts.add(findContact(oldContact), newContact);
        return true;
    }

    public boolean removeContact(Contact contact) {
        if (findContact(contact) == -1) {
            return false;
        }
        myContacts.remove(findContact(contact));
        return true;
    }

    private int findContact(Contact contact) {
        return findContact(contact.getName());
    }

    private int findContact(String name) {
        //for each contact in myContacts ArrayList check if contact name is equal to name of the contact passed as argument
        for (Contact entry : myContacts) {
            if (entry.getName().equals(name)) {
                return myContacts.indexOf(entry);
            }
        }
        //contact name doesn't exist return -1
        return -1;
    }

    public Contact queryContact(String name) {
        if (findContact(name) == -1) {
            return null;
        }
        return myContacts.get(findContact(name));

    }

    public void printContacts() {
        System.out.println("Contact list:");
        for (Contact entry : myContacts) {
            System.out.println(myContacts.indexOf(entry)+1+". "+ entry.getName()+" -> "+entry.getPhoneNumber());
        }
    }

}
