package classwork_16.employee;

import classwork_16.employee.model.Employee;

public class FirmaAppl {

    public static void main(String[] args) {


        Employee e1 = new Employee(1,"N1","Ln1",3000,true);
        Employee e2 = new Employee(2,"N2","Ln2",4000,true);
        Employee e3 = new Employee(3,"N3","Ln3",2900,false);
        Employee e4 = new Employee(4,"N4","Ln4",3400,false);
        Employee e5 = new Employee(5,"N5","Ln5",5000,true);


        System.out.println(e1.displayEmployee());
        System.out.println(e2.displayEmployee());
        System.out.println(e3.displayEmployee());
        System.out.println(e4.displayEmployee());
        System.out.println(e5.displayEmployee());

        double totalSalary = e1.getSalary() + e2.getSalary() + e3.getSalary() + e4.getSalary() +e5.getSalary();
        System.out.println("Total salary = " + totalSalary);

        Employee[] employees = new Employee[5];
        employees[0] = e1;
        employees[1] = e2;
        employees[2] = e3;
        employees[3] = e4;
        employees[4] = e5;

        totalSalary = 0;
        for (int i = 0; i < employees.length ; i++) {
            totalSalary += employees[i].getSalary();

        }

        System.out.println(totalSalary);

        e5.setSalary(6000);
        System.out.println(e5.displayEmployee());

    }
}
