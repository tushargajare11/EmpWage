public class UseCase2 {
    public static void main(String[] args) {

        int is_Full_Time = 1;
        int Emp_Rate_Per_Hour = 20;
        int Emp_Hours = 0;
        int Emp_Wage =0 ;
        double empCheck = Math.floor(Math.random()*10 )% 2;
        if (empCheck == is_Full_Time)

            Emp_Hours=8;
        else
            Emp_Hours=0;
        Emp_Wage = Emp_Hours * Emp_Rate_Per_Hour;
        System.out.println("EmpWage:" + Emp_Wage);


    }

}


