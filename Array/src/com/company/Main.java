package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone= new MobilePhone("123 456 9645");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();

        while (!quit) {
            System.out.println("\nEnter action: (6 to show available actions)");
            int action= scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("\nShutting down.....");
                    quit=true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }

        }
    }
    private static void queryContact(){
        System.out.println("Enter existing contact name");
        String existingName=scanner.nextLine();
        Contact existingRecord=mobilePhone.queryContact(existingName);
        if(existingRecord==null){
            System.out.println("Contact not found");
            return;

        }

        System.out.println("Name: "+existingRecord.getName()+"  Phone number: "+existingRecord.getPhoneNumber());

    }
    private static void removeContact(){
        System.out.println("Enter existing contact name");
        String existingName=scanner.nextLine();
        Contact existingRecord=mobilePhone.queryContact(existingName);
        if(existingRecord==null){
            System.out.println("Contact not found");
            return;

        }

        if(mobilePhone.removeContact(existingRecord))
            System.out.println("Successfully removed record");
        else
            System.out.println("Error removing record");

    }


    private static void updateContact(){
        System.out.println("Enter existing contact name");
        String existingName=scanner.nextLine();
        Contact existingRecord=mobilePhone.queryContact(existingName);
        if(existingRecord==null){
            System.out.println("Contact not found");
            return;

        }
        System.out.println("Enter new contact name:");
        String newContactName=scanner.nextLine();
        System.out.println("Enter new contact number:");
        String newContactNumber=scanner.nextLine();
        Contact newContact=Contact.createContact(newContactName,newContactNumber);
        if(mobilePhone.updateContact(existingRecord,newContact))
            System.out.println("Successfully updated record");
        else
            System.out.println("Error updating record");

    }

    private static void addContact(){
        System.out.println("Enter new contact name:");
        String name=scanner.nextLine();
        System.out.println("Enter phone number:");
        String phone=scanner.nextLine();
        Contact newContact=Contact.createContact(name,phone);
        if(mobilePhone.addNewContact(newContact))
            System.out.println("New contact added: name = "+name+" , phone = "+phone);
        else
            System.out.println("Cannot add, "+ name+" already on file");

    }

    private static void startPhone(){
        System.out.println("Starting phone......");
    }
    private static void printActions(){
        System.out.println("\nAvailable actions:\npress");
        System.out.println("0 - to shutdown\n"+
                "1 - to printcontacts\n"+
                "2 - to add a new contact\n"+
                "3 - to update an existing contact\n"+
                "4 - to remove an existing contact\n"+
                "5 - to query an existing contact is exist\n"+
                "6 - to print a list of available options\n");
        System.out.println("Choose your actions:");
    }













        /*
    int[] myIntegers=getIntegers(5);
        printArray(myIntegers);
        minValue(myIntegers);
        printArray(minValue(myIntegers));
    }

    public static int[] getIntegers(int capacity){

        int[] array=new int[capacity];
        System.out.println("Enter "+capacity+" integer values:\r");
        for(int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){

        for(int i=0;i<array.length;i++){
            System.out.println("Element "+i+" contents"+array[i]);
        }
    }

    public static int[] minValue(int[] array){

        int[] minValue= new  int [array.length];
        int temp=0;
        boolean flag=true;
        while(flag){
            flag=false;
            for(int i=0;i<minValue.length-1;i++){

                if(minValue[i]>minValue[i+1]){
                    temp=minValue[i];
                    minValue[i]=minValue[i+1];
                    minValue[i+1]=temp;
                }
                flag=true;
            }
        }
         return minValue;



        */
    }



