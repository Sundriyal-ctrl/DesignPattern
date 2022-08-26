package Project.interfaces;

import Project.beanclasses.StudentData;
import Project.exceptionclasses.InvalidClassException;

import java.io.BufferedReader;
import java.io.IOException;

public interface addInterface {
    StudentData[] addStudent(StudentData arr[], int index, BufferedReader input)throws IOException, InvalidClassException;
}
