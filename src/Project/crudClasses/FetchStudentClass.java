package Project.crudClasses;

import Project.beanclasses.StudentData;
import Project.interfaces.fetchInterface;

public class FetchStudentClass implements fetchInterface {


    @Override
    public void fetchStudent(StudentData studentData[]) {
        if(studentData.length==0)
        {
            System.out.println("Empty Database");
        }
        else {
            for (int i = 0; i < studentData.length; i++)
                System.out.println(studentData[i]);
        }
    }
}
