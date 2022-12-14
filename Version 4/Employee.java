public abstract class Employee {

    // compute salary from hourly employees
    public abstract String computeSalary();
    
   
    
    // HourlyEmployees
    public class FirstGroup {
        String name = "Hourly Employees";
        String[] empList = { "Joshua Algadipe", "Janrae Fagaragan",
                "Jan Nino Baoc", "Mark Joseph Molina", "Juspher Balangyao" };

        int[] idList = { 21103808, 323456743, 12343276, 98345623, 23467865 };

        double[] TotalhoursList = { 23, 20, 20, 19, 23 };
        double[] rateList = { 200, 200, 200, 200, 200 };
    }

    // CommisionEmployees
    public class SecondGroup {
        String name = "Commision Employees";
        String[] empList = { "Joseph Tan", "Jovie Bendijo",
                "Albert Cruz", "Rafael Mae Sanchez", "Rodrigo Martinez" };

        int[] idList = { 21103103, 123256743, 12345271, 10345023, 23487965 };

        double[] TotalSalesList = { 10499, 32870, 123457, 9700, 53200 };
    }

    // BasePlusCommisionEmployees
    public class ThirdGroup {
        String name = "Base Plus Commision Employees";
        String[] empList = { "Mary grace Galan", "Mikey Ferrer",
                "Jhon Vincent Arnaiz", "Lady ann Lebosada", "Christian Lance" };

        int[] idList = { 21123113, 421256743, 15345275, 70245023, 13487565 };

        double[] TotalSalesList = { 13499, 42870, 113457, 10700, 5200 };
    }

    // PieceWorkerEmployee
    public class FourthGroup {
        String name = "PieceWorker Employees";
        String[] empList = { "Jei ann Bayer", "Cristopher Lawrence",
                "Joseph Menoza", "Caspher Mae Ann", "Jaymar Sta.Ana" };

        int[] idList = { 21026113, 401252713, 05325215, 50246013, 12437515 };
        double[] totalPiecesFinished = { 240, 120, 87, 45, 101 };
    }

    public static void main(String[] args) throws Exception {
        // 
    }

}

