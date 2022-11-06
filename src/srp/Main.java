package srp;

// SRP = Single Responsibility Principle

// Each class or method should have only one responsibility.
//(Her sınıfın veya metodun tek bir sorumluluğu olmalı.)

public class Customer{

    public int id;
    public String name;

    public void CreateCustomer(Customer customer){

        System.out.println("Customer create");
    }
}

public class File{

    public void saveToFile(Customer customer){

        System.out.println("Customer saved to file");
    }
}

public class Main {
    public static void main(String[] args) {


    }
}
