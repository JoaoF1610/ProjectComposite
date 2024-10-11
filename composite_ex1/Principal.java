package composite_ex1;

import composite_ex1.composite.EmployeeComposite;
import composite_ex1.composite.EmployeeLeaf;

public class Principal {
    public static void main(String[] args) {
        EmployeeComposite CEO = new EmployeeComposite("Rich", "CEO");

        EmployeeComposite managerSales = new EmployeeComposite("João", "Sales");
        EmployeeComposite managerMarketing = new EmployeeComposite("Maria", "Sales");
        CEO.add(managerSales);
        CEO.add(managerMarketing);

        EmployeeLeaf emp1 = new EmployeeLeaf("Jose", "Sales");
        EmployeeLeaf emp2 = new EmployeeLeaf("Pedro", "Sales");
        managerSales.add(emp1);
        managerSales.add(emp2);

        EmployeeLeaf emp3 = new EmployeeLeaf("Huguinho", "Marketing");
        EmployeeLeaf emp4 = new EmployeeLeaf("Zezinho", "Marketing");
        managerMarketing.add(emp3);
        managerMarketing.add(emp4);

        CEO.showDetails();
        System.out.println("Count subordinates: " + CEO.getSubodinateCount());
        System.out.println("Count employees: " + CEO.getEmployeeCount());
        
    }
}
