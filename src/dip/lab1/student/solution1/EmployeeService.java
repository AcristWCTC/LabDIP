package dip.lab1.student.solution1;

import dip.lab1.student.solution1.Employee;

/**
 * A high-level class that delegates to a polymorphic employee object to do the 
 * work. Many options are presented to get you thinking. But if you read
 * all the comments you will see that only one method and is all that is
 * really needed here. Other programs may need more.
 *
 * @author Jim Lombardo, Instructor
 */
public class EmployeeService {

    public double getCompensation(Employee e) {
        return e.getAnnualWages();
    }
}














