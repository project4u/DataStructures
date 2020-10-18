package bean;

import java.util.Objects;

public class Employee extends Object{
    private String id;
    private Department department;
    private String name;
    private double salary;

    public Employee(String id, Department department, String name, double salary) {
        this.id = id;
        this.department = department;
        this.name = name;
        this.salary = salary;
        Department.addEmpToDept(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return id.equals(employee.id) &&
                department.equals(employee.department) &&
                name.equals(employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, department, name);
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", department=" + department +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

}
