class Employee {
    String name = "Ali";

    void work() {
        System.out.println(name + " works");
    }
}

class Developer extends Employee {
    void code() {
        System.out.println(name + " writes Java");
    }
}

class Manager extends Employee {
    void manage() {
        System.out.println(name + " manages the team");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        Developer developer = new Developer();
        developer.work();
        developer.code();
        Manager manager = new Manager();
        manager.work();
        manager.manage();
    }
}