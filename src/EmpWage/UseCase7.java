package EmpWage;

public class UseCase7 {



        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;
        public static final int EMP_RATE_PER_HOUR = 20;
        public static final int NUM_OF_WORKING_DAYS = 2;
        public static final int MAX_HRS_IN_MONTH = 10;
        public static int computeEmpwage() {
// Variables
            int emphrs = 0, totalEmpHrs= 0, totalworkingDays = 0;
// Computation
            while (totalEmpHrs <= MAX_HRS_IN_MONTH &&
                    totalworkingDays < NUM_OF_WORKING_DAYS) {
                totalworkingDays++;
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                switch (empCheck){
                    case IS_PART_TIME:
                        emphrs = 4;
                        break;
                    case IS_FULL_TIME:
                        emphrs = 8;
                        break;
                    default:
                        emphrs = 0;
                }
                totalEmpHrs += emphrs;
                System.out.println("Day#: " + totalworkingDays + "EmpHr:"+emphrs);
            }
            int totalEmpwage = totalEmpHrs * EMP_RATE_PER_HOUR;
            System.out.println("Total Emp Wage: " + totalEmpwage);
            return totalEmpwage;
        }
        public static void main(String[] args) {
            computeEmpwage();
        }
    }



