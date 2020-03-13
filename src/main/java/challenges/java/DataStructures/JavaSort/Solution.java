package challenges.java.DataStructures.JavaSort;

import java.util.*;

class Student{
    private int id;
    private String fname;
    private double cgpa;
    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id &&
                Double.compare(student.cgpa, cgpa) == 0 &&
                Objects.equals(fname, student.fname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fname, cgpa);
    }
}

//Complete the code
public class Solution
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Student> studentList = new ArrayList<>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student st = new Student(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        studentList.sort((student1, student2) ->
                student1.getCgpa()>student2.getCgpa()?-1:
                    student1.getCgpa()==student2.getCgpa()?
                            student1.getFname().compareTo(student2.getFname())
                    :1);

        for(Student st: studentList){
            System.out.println(st.getFname());
        }
    }
}
