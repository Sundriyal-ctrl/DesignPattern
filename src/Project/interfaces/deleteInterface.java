package Project.interfaces;

import Project.beanclasses.StudentData;
import Project.exceptionclasses.WrongIdException;

public interface deleteInterface {
    public StudentData[] deleteStudent(StudentData studentData[],int index,int maxIndex) throws WrongIdException;

}
