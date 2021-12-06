public class UseCase6 {
    public  static final int is_Part_Time = 1;
    public  static final int is_Full_Time = 2;
    public  static final int Emp_Rate_Per_Hours = 20;
    public static final int Number_of_Working_Days=2;
    public static final int Max_Hours_In_Month=10;

    public static void main(String[] args) {


        int empHrs=0;
        int totalEmpHours=0;
        int totalWorkingDays=0;

        while(totalEmpHours <=Max_Hours_In_Month && totalWorkingDays < Number_of_Working_Days)
        {
            totalWorkingDays++;
            int empCheck = (int)Math.floor(Math.random()*10)%3;
            switch (empCheck) {
                case is_Part_Time:
                    empHrs=4;
                    break;
                case is_Full_Time:
                    empHrs=8;
                    break;
                default :
                    empHrs=0;
            }
            totalEmpHours += empHrs;
            System.out.println("Day#:"+ totalWorkingDays+"EmpHr:"+empHrs);

        }

        int totalEmpWage = totalEmpHours*Emp_Rate_Per_Hours;
        System.out.println("TotalEmpWagae:"+ totalEmpWage);


    }
}

