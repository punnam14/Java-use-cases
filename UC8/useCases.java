package Assignment8;

public class useCases {
    int empCheck = (int) (Math.random() * 2);
    int isPresent = 1;
    int isAbsent = 0;
    int isPartTime = 2;
    int empRatePerHr = 8;
    int empPartTimeRatePerHr = 4;
    int empHrs = 20;
    int maxHrinMonth = 100;
    int empDailyWage;

    public void check() {
        if(empCheck == isPresent){
            System.out.println("Employee is Present");
        } else if (empCheck == isAbsent) {
            System.out.println("Employee is Absent");
        }
    }

    public int wage(){
        if(empCheck == isPresent){
            empDailyWage = empRatePerHr * empHrs;
            System.out.println("Employee is present and employee wage is: " +empDailyWage);
        }else if(empCheck == isPartTime){
            empDailyWage = empRatePerHr * empPartTimeRatePerHr;
            System.out.println("Employee is part time and employee wage is: " +empDailyWage);
        }else if(empCheck == isAbsent){
            empDailyWage = 0;
            System.out.println("Employee is absent and employee wage is: " +empDailyWage);
        }
        return empDailyWage;
    }

    public void month(){
        for(int i = 0; i < 21; i++){
            empCheck = (int) (Math.random() * 2);
            wage();
            empDailyWage += empDailyWage;
        }
        System.out.println("Salary for the month is: " +empDailyWage);
    }

    public void condition() {
        int numWorkingDays=20;
        int wagePerHour = 20;
        int totalsalary=0;
        int totalEmpHr=0;
        int totalWorkingDay=0;
        int empHr=0;

        while (totalEmpHr < maxHrinMonth && totalWorkingDay < numWorkingDays ) {
            totalWorkingDay++;
            int empCheck = (int) (Math.random()*3);
            switch(empCheck) {
                case 0:
                    empHr = 0;
                    break;
                case 1:
                    empHr = 8;
                    break;
                case 2:
                    empHr = 4;
                    break;
            }
            totalEmpHr += empHr ;
        }
        totalsalary = totalEmpHr * wagePerHour;
        System.out.println( "Total number of working days in a month is:  " +totalWorkingDay );
        System.out.println( "Total employee hour in a month  is:  " +totalEmpHr );
        System.out.println( "The total Monthly Salary of the Employee is:  " +totalsalary );

    }
}


