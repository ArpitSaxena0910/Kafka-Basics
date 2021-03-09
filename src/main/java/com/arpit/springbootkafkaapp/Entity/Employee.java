package com.arpit.springbootkafkaapp.Entity;

public class Employee {

    private long empId;
    private String firstName;
    private String lastName;

    public long getEmpId() {
        return empId;
    }

    public void setEmpId(long empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString(){
        return "Employee details are EmpId=" + empId + ", FirstName=" + firstName + ", LastName=" + lastName;
    }
}
