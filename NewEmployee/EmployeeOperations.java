package NewEmployee;

import java.util.Scanner;

public class EmployeeOperations {
   static Employee foundObj;
        public static Employee getEmployeeByName(Employee arr[]){
            Scanner sc =new Scanner(System.in);
            String reqEmployee=sc.nextLine();
            for (Employee obj:arr) {
//                System.out.println(reqEmployee);
                if (obj.getName().equals(reqEmployee)){
                     foundObj=obj;
                     break;
                }
                else {
                    foundObj=null;
                }

            }
            return foundObj;
        }
    public static void main(String[] args) {
        Employee arr[] = new Employee[5];
        arr[0]=new Employee("aunny",20,10000.00,"Java");
        arr[1]=new Employee("bunny",23,40000.00,"Python");
        arr[2]=new Employee("cunny",18,50000.00,"C");
        arr[3]=new Employee("dunny",28,60000.00,"C++");
        arr[4]=new Employee("eunny",25,550000.00,"HTML");

        System.out.println(getEmployeeByName(arr));;

    }
}
