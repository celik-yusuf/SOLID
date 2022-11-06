package isp;

// ISP = Interface Segregation Principle(Arayüz ayrıştırma prensibi
// More customized interfaces should be created.
// (Daha çok özelleştirilmiş interface oluşturulmalı)

interface Worker
{
    public void takeBreak();
    public void getPaid();
}

interface CoderInterface {
    public void code();
}
interface TesterInterface {
    public void test();
}

class Developer implements Worker, CoderInterface {
    public void takeBreak(){}
    public void getPaid(){}
    public void code(){}
}

class Tester implements Worker, TesterInterface {
    public void takeBreak(){}
    public void getPaid(){}
    public void test(){}
}


public class Main {
    public static void main(String[] args) {

    }
}
