package com.company.Louay;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("Arab African International Bank");

        bank.addBranch("Nasr City");

        bank.addCustomer("Nasr City", "Ali", 5000.0);
        bank.addCustomer("Nasr City", "Kareem", 10000.0);
        bank.addCustomer("Nasr City", "Tarek", 15000.0);

        bank.addBranch("Giza");
        bank.addCustomer("Giza", "Moustafa", 12000.0);

        bank.addCustomerTransaction("Nasr City", "Ali", 20000.0);
        bank.addCustomerTransaction("Nasr City", "Ali", 50000.0);
        bank.addCustomerTransaction("Nasr City", "Kareem", 20000.0);

        bank.listCustomers("Nasr City", true);
        bank.listCustomers("Giza", true);


    }
}