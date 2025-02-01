public class Student {

    private String name;
    private long prn;
    private String branch;
    private String batch;
    private double cgpa;

    // Constructor
    public Student(String name, long prn, String branch, String batch, double cgpa) {
        this.name = name;
        this.prn = prn;
        this.branch = branch;
        this.batch = batch;
        this.cgpa = cgpa;
    }

    // Getter and Setter for 'name'
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for 'prn'
    public long getPrn() {
        return prn;
    }

    public void setPrn(int prn) {
        this.prn = prn;
    }

    // Getter and Setter for 'branch'
    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    // Getter and Setter for 'batch'
    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    // Getter and Setter for 'cgpa'
    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    // Display method
    public void display() {
        System.out.println("Name: " + name + "\tPRN: " + prn + "\tBranch: " + branch + "\tBatch: " + batch + "\tCGPA: " + cgpa);
    }
}