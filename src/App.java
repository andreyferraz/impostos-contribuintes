import java.util.Locale;
import java.util.Scanner;

import entities.Contributor;
import entities.LegalPerson;
import entities.PhysicalPerson;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Contributor> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            Double annualIncome = sc.nextDouble();
            if (type == 'i') {
                System.out.print("Health expenditures: ");
                Double healthExpenditures = sc.nextDouble();
                list.add(new PhysicalPerson(name, annualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                Integer employeesNumber = sc.nextInt();
                list.add(new LegalPerson(name, annualIncome, employeesNumber));
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("TAXES PAID:");
        for (Contributor c : list) {
            System.out.println(c.getName() + ": $ " + String.format("%.2f", c.taxCalculation()));
        }
        System.out.println();
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", list.stream().mapToDouble(Contributor::taxCalculation).sum()));

        sc.close();
    }
}
