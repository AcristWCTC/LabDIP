package dip.lab1.student.solution1;


/**
 * Just a start and test class for this program.
 *
 * @author jlombardo
 */
public class Startup {

    public static void main(String[] args) {
        /*
         * We'll just use this class for testing our ccde.
         * We'll provide input and get some output...
         */

        //Low-level modules
        Employee e1 = new HourlyEmployee(10.50, 2020);
        Employee e2 = new SalariedEmployee(45000, 1250);
        

        Employee[] employees = {e1, e2};

        EmployeeService e = new EmployeeService();
       
        System.out.println("Employee 1 annual compensation: " +
            e.getCompensation(e1));
        System.out.println("Employee 2 annual compensation: " +
            e.getCompensation(e2));

        
    }

}
