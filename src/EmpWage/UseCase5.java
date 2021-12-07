package EmpWage;

public class UseCase5 {
        public  static final int is_Part_Time = 1;
        public  static final int is_Full_Time = 2;
        public  static final int Emp_Rate_Per_Hours = 20;
        public static final int Number_of_Working_Days=2;

        public static void main(String[] args) {

            int empHrs=0;
            int empWage=0;
            int totalEmpWage=0;

            for(int day=0; day<Number_of_Working_Days;day++)
            {
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
                empWage=empHrs*Emp_Rate_Per_Hours;
                totalEmpWage += empWage;
                System.out.println("EmpWage"+empWage);
            }
            System.out.println("totalemp wage"+totalEmpWage);

        }
}


