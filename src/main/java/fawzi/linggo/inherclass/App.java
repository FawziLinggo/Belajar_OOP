package fawzi.linggo.inherclass;

public class App {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Yamette........");
        Company.Employee employee = company.new Employee();
        employee.setName("Kudasai");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }
}
