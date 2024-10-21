package classwork_26.ait.employee.dao;

import classwork_26.ait.employee.model.Employee;
import classwork_26.ait.employee.model.SalesManeger;

public class CompanyImpl implements Company{

    private Employee[] employees;
    private  int size;

    //capacity -возможное кол-во сотрудников
    public CompanyImpl(int capasity) {
        this.employees = new Employee[capasity];
        this.size = size;
    }

    @Override
    public boolean addEmployee(Employee employee) {
        // bad cases
        if (employee == null){
            return false;
        }
        if (size == employees.length){
            return false;
        }
        if (findEmployee(employee.getId()) != null){
            return false;
        }
        //good case
        employees[size] = employee;// put in array
        size++;
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
                if (employees[i].getId() == id){
                    Employee victim = employees[i];
                    employees[i] = employees[size-1]; // на место жервы ставим ( копируем )последний элемент массива
                    employees[size-1] = null;// последний элемент затрем с помощью  null
                    size--;
                }

        }
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getId() == id){
                return employees[i];
            }
        }
        return null;
    }

    @Override
    public Employee updateEmployee(int id, Employee employee) {
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    @Override
    public void printEmployee() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);

        }

    }

    @Override
    public double totalSalary() {
        double totalSalaray = 0;
        for (int i = 0; i < size; i++) {
            totalSalaray += employees[i].calcSalary();
        }
        return  totalSalaray;
    }

    @Override
    public double totalSales() {
        double totalSales = 0;
        for (int i = 0; i < size; i++) {
            if (employees[i] instanceof SalesManeger){//проверка перед кастингом
                SalesManeger sm = (SalesManeger) employees[i];
                totalSales += sm.getSalesValue();
            }
        }
        return totalSales;
    }

    @Override
    public Employee[] findEmployeeHoursGreaterThan(int hours) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(employees[i].getHours() > hours){ // criteria
                count++;
            }
        }
        Employee[] res = new Employee[count]; // new array for results
        // читаем массив и перекладываем рез-ты в новый
        for (int i = 0, j = 0 ; j < res.length; i++) {
            if(employees[i].getHours() > hours){ // criteria
                res[j++] = employees[i];
            }
        }
        return res;

    }

    @Override
    public Employee[] findEmployeeSalaryRange(double min, double max) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(employees[i].calcSalary() > min && employees[i].calcSalary() < max ){ // criteria
                count++;
            }
        }
        Employee[] res = new Employee[count];
        // читаем массив и перекладываем рез-ты в новый
        for (int i = 0, j = 0 ; j < res.length; i++) {
            if(employees[i].calcSalary() > min && employees[i].calcSalary() < max){ // criteria
                res[j++] = employees[i];
            }
        }
        return res;
    }

    @Override
    public double averageSalary(){
        if (size == 0) {
            return 0;
        }
        return totalSalary() / size;
    }


}
