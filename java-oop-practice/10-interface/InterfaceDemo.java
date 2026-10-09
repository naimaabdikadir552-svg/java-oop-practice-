interface Printable {
    void print();
}

class Report implements Printable {
    @Override
    public void print() {
        System.out.println("Printing student report");
    }
}

class Invoice implements Printable {
    @Override
    public void print() {
        System.out.println("Printing customer invoice");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        // Object-ga Report (sidii hore)
        Printable item1 = new Report();
        item1.print();
        Printable item2 = new Invoice();
        item2.print();
    }
}