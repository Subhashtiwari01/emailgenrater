package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println(" Starting to send our mail");

        MailHandler mailHendlar=new MailHandler();
        mailHendlar.sendMail();
    }
}