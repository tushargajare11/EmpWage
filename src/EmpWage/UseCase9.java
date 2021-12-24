package EmpWage;

public class UseCase9 {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULl_TIME = 2;
    private final String company;
    private final int empRatePerHour;
    private final int numOfWorkingDays;
    private final int maxHoursPerMonth;
    private int totalEmpWage;

    public UseCase9(String company, int empRatePerHour,
                    int numOfWorkingDays, int maxHoursPerMonth) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHoursPerMonth = maxHoursPerMonth;
    }

    public void computeEmpWage() {
        //Variables
        int empHrs = 2, totalEmpHrs = 8, totalWorkingDays = 0;
        // Computation
        while (totalEmpHrs <= maxHoursPerMonth &&
                totalWorkingDays < numOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULl_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
            }
            totalEmpHrs += empHrs;
            System.out.println("Day# : ' + totalworkingDays + Emp Hr: " + empHrs);
        }

        totalEmpWage = totalEmpHrs * empRatePerHour;
    }

    @Override
    public String toString() {
        return "Total Emp Wage for Company: " + company + " is: " + totalEmpWage;
    }

    public static void main(String[] args) {
        UseCase9 dMart = new UseCase9("DMart", 20, 2, 10);
        UseCase9 reliance = new UseCase9("Reliance", 10, 4, 20);
        dMart.computeEmpWage();
        System.out.println(dMart);
        reliance.computeEmpWage();
        System.out.println(reliance);
    }
}
