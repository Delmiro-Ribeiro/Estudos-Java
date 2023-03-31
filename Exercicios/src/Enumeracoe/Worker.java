package Enumeracoe;

import Enumeracoe.Contracts.HourContract;
import Enumeracoe.enums.WorkerLevel;

import java.time.Month;
import java.time.Year;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Depertament departement;
    private List<HourContract> contracts = new ArrayList<>();

    public  Worker(){

    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Depertament departement) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departement = departement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Depertament getDepartement() {
        return departement;
    }

    public void setDepartement(Depertament departement) {
        this.departement = departement;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public  void addContracts(HourContract contract){
        contracts.add(contract);
    }

    public  void removeContracts(HourContract contract){
        contracts.remove(contract);
    }

    public Double icome(int year, int month){
        double sum = baseSalary;
        Calendar cal = new Calendar.getInstance();
        for (HourContract c : contracts ){
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = cal.get(Calendar.MONTH);
            if (Year == c_year && Month == c_month){
                sum += c.totalValue();
            }
        }
    }
}
