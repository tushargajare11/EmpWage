public class UseCase3 {
    public static void main(String[] args) {

        int is_Part_Time = 1;
        int is_Full_Time = 2;
        int Emp_Rate_Per_Hour = 20;
        int Emp_Hours = 0;
        int Emp_Wage = 0;

        double empCheck = Math.floor(Math.random() * 10) % 3;
        if (empCheck == is_Part_Time)
            Emp_Hours = 4;
        else if (empCheck == is_Full_Time)
            Emp_Hours = 8;
        else
            Emp_Hours = 0;
        Emp_Wage = Emp_Hours * Emp_Rate_Per_Hour;
        System.out.println("EmpWage: " + Emp_Wage);

    }

}
