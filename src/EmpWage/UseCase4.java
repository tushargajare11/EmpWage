public class UseCase4 {


        public  static final int is_Part_Time = 1;
        public  static final int is_Full_Time = 2;
        public  static final int Emp_Rate_Per_Hours = 20;
        public static void main(String[] args) {

            int Emp_Hours = 0;
            int Emp_Wage = 0;
            int emp_check=(int) Math.floor(Math.random()*10)%3;
            switch (emp_check) {

                case is_Part_Time:
                    Emp_Hours=4;
                    break;

                case is_Full_Time:
                    Emp_Hours=8;
                    break;
                default :
                    Emp_Hours=0;
            }
            Emp_Wage=Emp_Hours*Emp_Rate_Per_Hours;
            System.out.println("employee wage"+Emp_Wage);


        }


}
