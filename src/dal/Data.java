package dal;

import bean.Department;
import bean.Employee;

public class Data {
    public static void init(){
        Department d1=new Department("101","Developer","Chaitanaya");
        Department d2=new Department("102","Tester","Rahul");
        Department d3=new Department("103","System Architet","Guru");

        Employee e1=new Employee("1",d1,"Ram",10000.0d);
        Employee e2=new Employee("2",d1,"Rajesh",120000.0d);
        Employee e3=new Employee("3",d2,"ritesh",5000.0d);
        Employee e4=new Employee("4",d3,"Raju",20000.0d);
        Employee e5=new Employee("5",d3,"Raj",1000.0d);
        Employee e6=new Employee("6",d3,"Kaju",35000.0d);

    }
}
