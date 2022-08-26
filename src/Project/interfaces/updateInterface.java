package Project.interfaces;

import Project.beanclasses.StudentData;
import Project.exceptionclasses.WrongIdException;

import java.io.BufferedReader;
import java.io.IOException;

public interface updateInterface {
    public StudentData[] updateStudent(StudentData studentData[], int index, BufferedReader bufferedReader) throws IOException, WrongIdException;
}
