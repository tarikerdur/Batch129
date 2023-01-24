package my_practices.advanced_practice.practice11.interface_maas_hesapla;

public class SalaryCalculate implements Tax, RaiseSalary {
    public SalaryCalculate() {
    }

    @Override
    public double extraForYear(int workYear) {
        return workYear * 100;
    }

    @Override
    public double extraForHour(int workHour) {
        if (workHour > 160) {
            return (workHour - 160) * 10;
        } else {
            return 0;
        }
    }


    @Override
    public double tax(int workYear, double grossSalary) {
        if (workYear >= 10) {
            return grossSalary * 0.30;
        } else {
            return grossSalary * 0.20;
        }
    }

    double netSalary(double grossSalary, int workYear, int workHour) {

        return grossSalary + extraForYear(workYear) + extraForHour(workHour) - tax(workYear, grossSalary);

    }
}

