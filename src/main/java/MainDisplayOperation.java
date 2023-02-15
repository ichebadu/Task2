

import java.io.IOException;
import java.util.Scanner;


public class MainDisplayOperation {

ManagerServices managerServices = new ManagerServices();
CashierService cashierService = new CashierService();
Customers customer = new Customers("milk",123.0,43.0);


    public void mainDisplayMode(){
        System.out.println("*********************Welcome To IchebaduStore*****************");
        System.out.println("********************* Choose Your Mode *****************");
        System.out.println("1. Managers Mode ");
        System.out.println("2. Cashier Mode");
        System.out.println("3. Customers Mode");
        System.out.println("4. Exit Mode");
        System.out.println(" ");
        System.out.println("Enter an option");
    }

    public void operationMode() throws IOException {
        mainDisplayMode();

        Scanner scanEntryMode = new Scanner(System.in);
        int option = scanEntryMode.nextInt();

        switch(option){
            case 1:
                managerServices.operation();
                break;
            case 2:
                cashierService.productAccess();
                break;
            case 3:
                customer.buy(customer);
                break;
            case 4:
                System.exit(1);
            default:
                System.out.println("Invalid Input");
            }
        }
    }
