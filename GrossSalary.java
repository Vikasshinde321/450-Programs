public class GrossSalary {
    
        public static void main(String[] args) {
            double grossSalary = 10000;
            double incomeTax = 1000;
            double providentFund = 800;
            double professionalTax = 500;
            
            double netSalary = grossSalary - (incomeTax + providentFund + professionalTax);
            System.out.println("Net Salary is = " + netSalary);
        }
    }
    
    
