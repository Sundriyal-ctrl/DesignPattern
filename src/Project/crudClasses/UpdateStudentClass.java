package Project.crudClasses;

import Project.beanclasses.StudentData;
import Project.exceptionclasses.WrongIdException;
import Project.interfaces.updateInterface;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

public class UpdateStudentClass implements updateInterface {

    @Override
    public StudentData[] updateStudent(StudentData[] studentData, int index, BufferedReader bufferedReader) throws IOException, WrongIdException {
        if(studentData.length==0 || index<0 || index>=studentData.length)
        {
            throw new WrongIdException();
        }
        System.out.println("====================Before Updated=====================");
        Arrays.stream(studentData).filter(s->s.getId()==index).forEach(System.out::println);
        System.out.println("Enter Field Name Which you want to Update");
        String field=bufferedReader.readLine();
        switch (field)
        {
            case "Name":
                System.out.println("Enter New Name");
                studentData[index].setStudentname(bufferedReader.readLine());
                System.out.println("==================Name Updated Successfully================");
                break;
            case "Class":
                System.out.println("Enter New Class");
                studentData[index].setStudentClass(Integer.parseInt(bufferedReader.readLine()));
                System.out.println("=================Class Updated Succesfully=================");
                break;
            default:
                System.out.println("===============Wrong Field===============");
        }
        System.out.println("====================After Updated=====================");
        Arrays.stream(studentData).filter(s->s.getId()==index).forEach(System.out::println);
        return studentData;
    }
}
