import java.util.ArrayList;
import java.util.Scanner;

public class  ManagerServices implements ManagerInterface {

    Scanner input = new Scanner(System.in);

    CashierDataBase cashier =new CashierDataBase();

    public void cashierList (){

    }



    ArrayList<String> employeeList =new ArrayList<>();
    public void displayMenu(){
        System.out.println("1. Hire option");
        System.out.println("2. Fire option");
        System.out.println("3. Exit Managers Mode");

        System.out.println(" ");
        System.out.println("Enter an option");
    }

    public void operation() {
        displayMenu();
        int option = input.nextInt();

        while (true) {
            if (option == 1) {
                hire();
            } else if (option == 2) {
                fire();
            } else if (option == 3) {
                System.out.println("Hiring mode complete!!!");
                break;
            }
            break;
        }

    }

    @Override
    public void hire() {
        System.out.println("************Employee Application Data******");
        System.out.println(" ");
        System.out.println("Enter your name");
        cashier.setName(input.next());
        System.out.println("Enter your age: ");
        cashier.setAge(input.nextInt());
        System.out.println("Enter your sex");
        cashier.setSex(input.next());
        System.out.print("Enter your year(s) of experience: ");
        cashier.setLevelOfExperience(input.nextInt());

        String name = cashier.getName();
        String sex = cashier.getSex();
        int age = cashier.getAge();
        int levelOfExperience = cashier.getLevelOfExperience();

        while (true) {
            if (age >= 20 && age <= 30) {
                System.out.println();

            }
            else {
                System.out.println("You are not within the age limit. Try again next time . thank you");
                break;
            }
            if (levelOfExperience < 2) {
                System.out.println("Not qualified for the job");
                break;

            }
            else if (levelOfExperience >= 2) {
                System.out.println("All criteria met. You are qualified for the job");
                employeeList.add(name);
                System.out.println("Nae of Employees:  " + employeeList);

                break;

            }

        }
        operation();
    }

    @Override
    public void fire() {
        System.out.println("***********Employee contract termination************");
        System.out.println(" ");
        System.out.println("Enter te name of employee contract ot be terminated");
        String  staffTobeSacked = input.next();
        System.out.println("Hi " + staffTobeSacked + " , you have violated the code of this company");

        employeeList.remove(staffTobeSacked);
        System.out.println(" ");
        System.out.println( "Hi " + staffTobeSacked +
                ", from this moment your contract with decagon has been terminate , do have a successfully life");
        System.out.println(employeeList);
        operation();
    }
}
