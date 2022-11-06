package ocp;

// OCP = Open Closed Principle
// Classes should be closed to change but open to development.
// (Sınıflar değişikliğe kapalı ancak gelişime açık olmalıdır.)

abstract class File{

    public abstract void saveToFile();
}

class TxtFile extends File{

    //ovveride
    public void saveToFile(){

        System.out.println("Saved to Txt File ");
    }
}

class XlsFile extends File{

    //ovveride
    public void saveToFile(){

        System.out.println("Saved to Xls File");
    }
}

public class Main {
    public static void main(String[] args) {

    }

}
