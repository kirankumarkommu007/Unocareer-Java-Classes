import java.util.Scanner;

public class SalaryInHand {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the monthly Salary");
        int MonthlySalary = input.nextInt();
        int annualSalary = MonthlySalary * 12;

        System.out.println("Enter the Investment");
        int monthlyInvestment = input.nextInt();

        // Ensure monthlyInvestment does not exceed 100000
        if (monthlyInvestment > 100000)
            monthlyInvestment = 100000;

        int TaxableIncome = annualSalary - monthlyInvestment;
        int tax1 = 0, tax2 = 0, tax3 = 0, Taxliability = 0, incomeAftertax = 0;

        if (TaxableIncome <= 250000) {
            tax1 = 0;
            Taxliability = tax1;
        }

        if (TaxableIncome > 250000 && TaxableIncome <= 500000) {
            tax1 = 0;
            tax2 = (int) (0.05 * (TaxableIncome - 250000));
            Taxliability = tax1 + tax2;
        }

        if (TaxableIncome > 500000 && TaxableIncome <= 1000000) {
            tax1 = 0;
            tax2 = (int) (0.05 * 250000);
            tax3 = (int) (0.20 * (TaxableIncome - 500000));
            Taxliability = tax1 + tax2 + tax3;
        }

        incomeAftertax = annualSalary - Taxliability;
        int permonth = incomeAftertax / 12;

        System.out.println("Annual income is: " + annualSalary);
        System.out.println("Taxable Income is: " + TaxableIncome);
        System.out.println("The Tax paid per year is: " + Taxliability);
        System.out.println("The monthly salary in hand is: " + permonth);
    }
}
