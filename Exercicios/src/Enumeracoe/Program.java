package Enumeracoe;

import Enumeracoe.Contracts.HourContract;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();

        System.out.print("Enter worker data: ");

        System.out.print("Name: ");
        String workeName = sc.nextLine();

        System.out.print("Level: ");
        String workLevel = sc.nextLine();

        System.out.print("Base salary:  ");
        double baseSalary = sc.nextDouble();

             Worker worker = new Worker(workeName,String.valueOf(workLevel),baseSalary,new Depertament(departmentName));

        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter contract #" + i + " data:");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());
            System.out.print("Value per hour: ");
            double valueperhour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate,valueperhour,hours);
            worker.addContracts(contract);
        }

        System.out.print("");
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.print("Name: " + worker.getName());
        System.out.print("Department: " + worker.getDepartement().getName());
        System.out.print("Income for: " + monthAndYear + ": " + String.format("%.2f",worker.icome(year,month)));


        sc.close();
    }
}
