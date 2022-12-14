import java.util.*;
import static java.lang.System.out;

public class EmployeeRoster extends Employee {
    static Employee employee = new Employee();
    static Employee.FirstGroup G1 = employee.new FirstGroup();
    static Employee.SecondGroup G2 = employee.new SecondGroup();
    static Employee.ThirdGroup G3 = employee.new ThirdGroup();
    static Employee.FourthGroup G4 = employee.new FourthGroup();
    static ArrayList<String> storeGroup1 = new ArrayList<String>();
    static ArrayList<Integer> storeGroup1_id = new ArrayList<Integer>();
    static ArrayList<String> storeGroup2 = new ArrayList<String>();
    static ArrayList<Integer> storeGroup2_id = new ArrayList<Integer>();
    static ArrayList<String> storeGroup3 = new ArrayList<String>();
    static ArrayList<Integer> storeGroup3_id = new ArrayList<Integer>();
    static ArrayList<String> storeGroup4 = new ArrayList<String>();
    static ArrayList<Integer> storeGroup4_id = new ArrayList<Integer>();
    static ArrayList<String> storeTypesEmployees = new ArrayList<String>();
    String list_types;
    static Random rand = new Random();
    static EmployeeRoster main = new EmployeeRoster();
    static Scanner in = new Scanner(System.in);

    // Constructor
    public EmployeeRoster() {
        String store = "";
        int count = 0;
        storeTypesEmployees.add(G1.name);
        storeTypesEmployees.add(G2.name);
        storeTypesEmployees.add(G3.name);
        storeTypesEmployees.add(G4.name);
        storeTypesEmployees.add("All Employees");
        storeTypesEmployees.add("Other options");
        storeTypesEmployees.add("Exit");

        for (String i : storeTypesEmployees) {
            count++;
            store += String.format("%d. ", count) + i.concat("\n");
        }

        list_types = store;

    }

    public static void main(String[] args) {
        Group1List();
        Group2List();
        Group3List();
        Group4List();
        mainParent: while (true) {

            out.println(String.format("\nTypes of Employees:\n%s\nSelect option: ", main.list_types));
            String inputted = in.nextLine();

            if (isAnumber(inputted)) {
                switch (Integer.parseInt(inputted)) {
                    case 1:
                        out.println("-----Hourly Employees-----\n");
                        out.println(String.format("Total no. of employees: %s", countHourlyEmployee()));
                        out.println(String.format("List of employees: "));
                        displayHourlyEmployee();

                        break;
                    case 4:
                        out.println("-----Piece Worker Employees-----\n");
                        out.println(String.format("Total no. of employees: %s", countPeiceWorkerEmployee()));
                        out.println(String.format("List of employees: "));
                        displayPeiceWorkerEmployee();
                        break;
                    case 2:
                        out.println("-----Commission Employees-----\n");
                        out.println(String.format("Total no. of employees: %s", countCommissionEmployee()));
                        out.println(String.format("List of employees: "));
                        displayCommissionEmployee();
                        break;
                    case 3:
                        out.println("-----Base-Plus Commission Employees-----\n");
                        out.println(String.format("Total no. of employees: %s", countBasePlusCommissionEmployee()));
                        out.println(String.format("List of employees: "));
                        displayBasePlusCommissionEmployee();
                        break;
                    case 5:
                        displayEmployee();
                        break;
                    case 6:
                        out.println("1. Add Employee\n2. Remove employee");
                        String inputted2 = in.nextLine();
                        if (isAnumber(inputted2)) {
                            switch (Integer.parseInt(inputted2)) {
                                case 1:
                                    typeofTransaction("+1");
                                    break;
                                case 2:
                                    typeofTransaction("-1");
                                    break;
                                default:
                                    break;
                            }
                        } else {
                            out.println("Invalid type occurred!");
                        }

                        break;
                    case 7:
                        break mainParent;

                    default:
                        out.println("Incorrect number selected!");
                        break;
                }

            } else {
                out.println("Invalid type occurred!");

            }
        }

    }

    // stores hourlyEmployees
    public static void Group1List() {
        for (int i = 0; i < G1.empList.length; i++) {
            storeGroup1.add(G1.empList[i]);
            storeGroup1_id.add(G1.idList[i]);
        }
    }

    // stores CommissionEmployees
    public static void Group2List() {
        for (int i = 0; i < G2.empList.length; i++) {
            storeGroup2.add(G2.empList[i]);
            storeGroup2_id.add(G2.idList[i]);
        }
    }

    // stores BasePlusCommissionEmployees
    public static void Group3List() {
        for (int i = 0; i < G3.empList.length; i++) {
            storeGroup3.add(G3.empList[i]);
            storeGroup3_id.add(G3.idList[i]);
        }
    }

    // stores PieceWorkerEmployees
    public static void Group4List() {
        for (int i = 0; i < G4.empList.length; i++) {
            storeGroup4.add(G4.empList[i]);
            storeGroup4_id.add(G4.idList[i]);
        }
    }

    // check if format is numerical
    private static boolean isAnumber(String text) {

        if (text.equals("") || text == null) {
            return false;
        }

        try {
            Double.parseDouble(text);
            return true;
        } catch (NumberFormatException e) {
            e.getMessage();
            e.getCause();
            return false;
        }
    }

    // count hourlyEmployees
    public static int countHourlyEmployee() {
        return storeGroup1.size();
    }

    // count PeiceWorkerEmployee
    public static int countPeiceWorkerEmployee() {
        return storeGroup4.size();
    }

    // count CommissionEmployee
    public static int countCommissionEmployee() {
        return storeGroup2.size();
    }

    // count BasePlusCommissionEmployee
    public static int countBasePlusCommissionEmployee() {
        return storeGroup3.size();
    }

    // displays information for HourlyEmployees
    public static void displayHourlyEmployee() {
        for (int i = 0; i < storeGroup1.size(); i++) {
            out.println((i + 1) + ". " + storeGroup1.get(i));
        }
    }

    // displays information for PeiceWorkerEmployee
    public static void displayPeiceWorkerEmployee() {
        for (int i = 0; i < storeGroup4.size(); i++) {
            out.println((i + 1) + ". " + storeGroup4.get(i));
        }
    }

    // displays information for CommissionEmployee
    public static void displayCommissionEmployee() {
        for (int i = 0; i < storeGroup2.size(); i++) {
            out.println((i + 1) + ". " + storeGroup2.get(i));
        }
    }

    // displays information for BasePlusCommissionEmployee
    public static void displayBasePlusCommissionEmployee() {
        for (int i = 0; i < storeGroup3.size(); i++) {
            out.println((i + 1) + ". " + storeGroup3.get(i));
        }
    }

    public static void displayEmployee() {
        Formatter form = new Formatter();
        form.format("%86s", "-----All Employees-----\n\n");
        form.format("%40s %40s %40s\n", "Employee Id", "Employee Name", "Employee Type");
        for (int i = 0; i < storeGroup1.size(); i++) {
            try {
                form.format("%40s %40s %40s\n", storeGroup1_id.get(i), storeGroup1.get(i), G1.name);
            } catch (Exception e) {
            }
        }
        for (int i = 0; i < storeGroup2.size(); i++) {
            try {
                form.format("%40s %40ss %40s\n", storeGroup2_id.get(i), storeGroup2.get(i), G2.name);
            } catch (Exception e) {

            }

        }
        for (int i = 0; i < storeGroup3.size(); i++) {
            try {
                form.format("%40s %40s %45s\n", storeGroup3_id.get(i), storeGroup3.get(i), G3.name);
            } catch (Exception e) {
            }
        }
        for (int i = 0; i < storeGroup4.size(); i++) {
            try {
                form.format("%40s %40s %40s\n", storeGroup4_id.get(i), storeGroup4.get(i), G4.name);
            } catch (Exception e) {
            }

        }
        out.println(form);

    }

    // add new employee
    public static void addEmployee(int empID, String empName, String empType) {

        if (empType.equals(G1.name)) {
            storeGroup1.add(empName);
            storeGroup1_id.add(empID);
            displayHourlyEmployee();
        } else if (empType.equals(G2.name)) {
            storeGroup2.add(empName);
            storeGroup2_id.add(empID);
            displayCommissionEmployee();
        } else if (empType.equals(G3.name)) {
            storeGroup3.add(empName);
            storeGroup3_id.add(empID);
            displayBasePlusCommissionEmployee();
        } else if (empType.equals(G4.name)) {
            storeGroup4.add(empName);
            storeGroup4_id.add(empID);
            displayPeiceWorkerEmployee();
        }

    }

    // compute transactions
    public static void computeTransaction(int trans) {
        int emptype = 0;
        switch (trans) {
            case 1:
                displayHourlyEmployee();
                emptype = countHourlyEmployee();
                break;
            case 2:
                displayCommissionEmployee();
                emptype = countCommissionEmployee();
                break;
            case 3:
                displayBasePlusCommissionEmployee();
                emptype = countBasePlusCommissionEmployee();
                break;
            case 4:
                displayPeiceWorkerEmployee();
                emptype = countPeiceWorkerEmployee();
                break;

            default:
                break;
        }

        out.println("\nSelect one: ");
        String inputted5 = in.nextLine();

        if (isAnumber(inputted5) && (Integer.parseInt(inputted5) <= emptype)) {
            int removeIndex = Integer.parseInt(inputted5);

            if (trans == 1) {
                storeGroup1.remove(removeIndex - 1);
                displayHourlyEmployee();

            }
            if (trans == 2) {
                storeGroup2.remove(removeIndex - 1);
                displayCommissionEmployee();

            }
            if (trans == 3) {
                storeGroup3.remove(removeIndex - 1);
                displayBasePlusCommissionEmployee();

            }
            if (trans == 4) {
                storeGroup4.remove(removeIndex - 1);
                displayPeiceWorkerEmployee();

            }

        } else {
            out.println("Invalid type occurred!");
        }

    }

    // type of transactions
    public static void typeofTransaction(String type_transc) {
        String store = "";
        store += "\n1. ".concat(G1.name).concat("\n");
        store += "2. ".concat(G2.name).concat("\n");
        store += "3. ".concat(G3.name).concat("\n");
        store += "4. ".concat(G4.name).concat("\n");
        if (type_transc.equals("+1")) {

            String empName = "";
            int randomNum = rand.nextInt(99999999);
            String empType = "";
            out.println("Name of the employee: ");
            String inputted3 = in.nextLine();
            empName = inputted3;
            out.println(String.format("%s", store));
            out.println("Choose type: ");
            String inputted4 = in.nextLine();
            if (isAnumber(inputted4)) {
                switch (Integer.parseInt(inputted4)) {
                    case 1:
                        empType = G1.name;
                        break;
                    case 2:
                        empType = G2.name;
                        break;
                    case 3:
                        empType = G3.name;
                        break;
                    case 4:
                        empType = G4.name;
                        break;

                    default:
                        break;
                }
            } else {
                out.println("Invalid type occurred!");
            }
            out.println("The new Id of the employee is " + randomNum);
            addEmployee(randomNum, empName, empType);

        } else if (type_transc.equals("-1")) {
            out.println(String.format("%s", store));
            out.println("Choose type: ");
            String inputted4 = in.nextLine();
            if (isAnumber(inputted4)) {
                switch (Integer.parseInt(inputted4)) {
                    case 1:
                        computeTransaction(1);
                        break;
                    case 2:
                        computeTransaction(2);
                        break;
                    case 3:
                        computeTransaction(3);
                        break;
                    case 4:
                        computeTransaction(4);
                        break;

                    default:
                        break;
                }
            }
        }

    }

}
