package bean;

import java.util.*;

public class Department {
    private String deptId;
    private String deptName;
    private String headName;
    private static Map<String, ArrayList<Employee>> deptEmp=new HashMap<>();

    public static Map<String, ArrayList<Employee>> getDeptEmp() {
        return deptEmp;
    }

    public static void setDeptEmp(Map<String, ArrayList<Employee>> deptEmp) {
        Department.deptEmp = deptEmp;
    }

    public Department(String deptId, String deptName, String headName) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.headName = headName;
        deptEmp.put(deptId,new ArrayList<>());
    }

    public static void addEmpToDept(Employee e) {
        ArrayList<Employee> al=deptEmp.get(e.getDepartment().getDeptId());
        al.add(e);
        deptEmp.put(e.getDepartment().getDeptId(),al);
    }

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getHeadName() {
        return headName;
    }

    public void setHeadName(String headName) {
        this.headName = headName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Department)) return false;
        Department that = (Department) o;
        return deptId.equals(that.deptId) &&
                deptName.equals(that.deptName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(deptId, deptName);
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId='" + deptId + '\'' +
                ", deptName='" + deptName + '\'' +
                ", headName='" + headName + '\'' +
                '}';
    }

}
