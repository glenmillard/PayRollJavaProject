/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payrollsystem;

/**
 *
 * @author Glen Millard
 */
public class Fulltime extends Employee {
    private double salary;
    private double overtime;
    
        public FullTime(int id, String name, double sal, double hourAndHalf, Vehicle vehicle)
        {
            super (id, name, vehicle);
            this.overtime = hourAndHalf;
            this.salary = sal;
        }
    
    public double calculatePay(){
        System.out.println("Full time employee.");
        return (this.getSalary() + this.getOvertime());
        
    }

//    @Override
//    public double calculatePay() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @return the overtime
     */
    public double getOvertime() {
        return overtime;
    }

    /**
     * @param overtime the overtime to set
     */
    public void setOvertime(double overtime) {
        this.overtime = overtime;
    }
    }
    