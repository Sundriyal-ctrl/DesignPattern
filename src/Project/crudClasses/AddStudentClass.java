package Project.crudClasses;

import Project.beanclasses.StudentData;
import Project.interfaces.addInterface;
import org.omg.CORBA.DynAnyPackage.Invalid;

import java.io.BufferedReader;
import java.io.IOException;
import Project.exceptionclasses.InvalidClassException;
import java.util.Arrays;
import java.util.HashMap;

public class AddStudentClass implements addInterface {

    int indexx=0;
    StudentData copyArray[]={};
    StudentData studentData = new StudentData();
    @Override
    public StudentData[] addStudent(StudentData arr[], int index, BufferedReader input)throws IOException, InvalidClassException {

        studentData.setId(index);
        System.out.println("Enter Name");
        studentData.setStudentname(input.readLine());
        System.out.println("Enter Class");
        int className=Integer.parseInt(input.readLine());
        if(className<1 || className>12 )
        {
            throw new InvalidClassException();
        }else {
            studentData.setStudentClass(className);
            if(index==0)
            {
                arr= new StudentData[1];
                arr[0]=studentData;
            }
            else {
                copyArray= Arrays.copyOf(arr,index+1);
                arr=Arrays.copyOf(copyArray,index+1);
                arr[index]=studentData;
            }
            System.out.println("Student Inserted Successfully..........................");
        }

        return arr;
    }
}
