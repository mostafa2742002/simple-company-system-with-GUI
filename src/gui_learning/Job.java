
package gui_learning;
import java.io.*;


public class Job implements Serializable{
     private double salary;
    private String nimeofjop;

    public Job(double salary, String nimeofjop) {
        this.salary = salary;
        this.nimeofjop = nimeofjop;
    }
    
    public boolean equals(Job job)
    {
        if(this.salary == job.salary && this.nimeofjop.equals(job.nimeofjop))
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
    
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getNimeofjop() {
        return nimeofjop;
    }

    public void setNimeofjop(String nimeofjop) {
        this.nimeofjop = nimeofjop;
    }
}
