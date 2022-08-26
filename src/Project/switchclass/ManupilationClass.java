package Project.switchclass;

import Project.beanclasses.StudentData;
import Project.crudClasses.AddStudentClass;
import Project.crudClasses.DeleteStudentClass;
import Project.crudClasses.FetchStudentClass;
import Project.crudClasses.UpdateStudentClass;
import Project.exceptionclasses.InvalidClassException;
import Project.exceptionclasses.WrongIdException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ManupilationClass {
    static int index=0;
    static StudentData[] hashSet ={};
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String condition="start";
    protected void showMenu()
    {
        while(!condition.equals("stop"))
        {
            try {
                System.out.println("1) For Add student\n2) For Fetch Student\n3) For Delete Student\n4) For Exit\n5) For Update");
                int choice = Integer.parseInt(bufferedReader.readLine());
                switch (choice)
                {
                    case 1:
                        hashSet=new AddStudentClass().addStudent(hashSet,index,bufferedReader);
                        index=index+1;
                        break;
                    case 2:
                        new FetchStudentClass().fetchStudent(hashSet);
                        break;
                    case 3:
                        System.out.println(hashSet.length);
                        System.out.println("Enter Student id which you want to delete");

                        int id=Integer.parseInt(bufferedReader.readLine());
                        hashSet=new DeleteStudentClass().deleteStudent(hashSet,id,index);
                        System.out.println(hashSet.length);
                        index-=1;
                        break;
                    case 4:
                        condition="stop";
                        System.out.println("Thanks For Using Our Service");
                        break;
                    case 5:
                        System.out.println("Enter id for Update");
                        id=Integer.parseInt(bufferedReader.readLine());
                        if(id<0 && id>=hashSet.length)
                            throw new WrongIdException();
                        else {
                            hashSet = new UpdateStudentClass().updateStudent(hashSet, id, bufferedReader);
                        }
                        break;
                }
            }catch(IOException | InvalidClassException | NumberFormatException | WrongIdException e)
            {
              System.out.println(e.getMessage());
            }
        }
    }
}
