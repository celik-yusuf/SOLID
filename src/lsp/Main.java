package lsp;

// LSP = Liskov's Substitution Principle
/*
Derived classes must use all the properties of the classes they inherit.
(Türetilmiş sınıflar, miras aldıkları sınıfların tüm özelliklerini kullanmalı.)

*/

abstract class Vehicle {
    public abstract void doors();
}

interface IFlyable{
    public void fly();
}

class Train extends Vehicle  {
    public void doors() {
        //code
    }
}

class Plane extends Vehicle implements IFlyable {
    public void doors() {
        //code
    }
    public void fly() {
        //code
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
