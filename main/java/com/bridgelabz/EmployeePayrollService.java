package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class EmployeePayrollService {
    private List<EmployeePayrollData> employPayrollDataList;

    public EmployeePayrollService() {                                //default constructor
    }

    public EmployeePayrollService(ArrayList<EmployeePayrollData> employPayrollDataList) {       //parameterized constructor
        this.employPayrollDataList =employPayrollDataList;
    }
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        ArrayList<EmployeePayrollData> employPayrollDataList = new ArrayList<>();
        EmployeePayrollService  employPayrollService = new EmployeePayrollService(employPayrollDataList);
        employPayrollService.readEmployPayrollData(sc1);
        employPayrollService.writeEmployPayrollData();
    }
    //    create write method to print data back to console
    private void writeEmployPayrollData(){
//        print the employee data stored in employPayrollDataList
        System.out.println("Writing EmployPayrollData: " + employPayrollDataList);
    }

    //    method to read the input from user through console
    private void readEmployPayrollData(Scanner sc1){
        System.out.println("Enter your name: ");
        String name = sc1.nextLine();
        System.out.println("Enter your Id: ");
        int id = sc1.nextInt();
        System.out.println("Enter your salary: ");
        double salary = sc1.nextDouble();
        EmployeePayrollData empData = new EmployeePayrollData(id, salary, name);
//    adding all employee data to the arraylist
        employPayrollDataList.add(empData);
    }
}
