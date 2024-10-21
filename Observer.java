import java.util.ArrayList;
import java.util.List;
interface Observer {
    void update(double salary);
}


class Salary {
    private List<Observer> observers = new ArrayList<>();
    private double salary;

    public void addObserver(Observer observer) {
        observers.add(observer);
    }



    public void setSalary(double salary) {
        this.salary = salary;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update(salary);
        }
    }
}
class ManagerBonus implements Observer {

    public void update(double salary) {
        double bonus = salary * 0.1;
        System.out.println("Manager's bonus updated to: " + bonus);
    }
}

class EmployeeBonus implements Observer {

    public void update(double salary) {
        double bonus = salary * 0.05;
        System.out.println("Employee's bonus updated to: " + bonus);
    }
}
 class ObserverPatternDemo {
    public static void main(String[] args) {
        Salary salary = new Salary();

        Observer managerBonus = new ManagerBonus();
        Observer employeeBonus = new EmployeeBonus();

        salary.addObserver(managerBonus);
        salary.addObserver(employeeBonus);

        System.out.println("Setting salary to 5000");
        salary.setSalary(5000);

        System.out.println("\nSetting salary to 7000");
        salary.setSalary(7000);
    }
}
