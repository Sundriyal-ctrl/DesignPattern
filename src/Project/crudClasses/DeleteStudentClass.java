package Project.crudClasses;

import Project.beanclasses.StudentData;
import Project.exceptionclasses.WrongIdException;
import Project.interfaces.deleteInterface;

import java.util.Arrays;

public class DeleteStudentClass implements deleteInterface {

    @Override
    public StudentData[] deleteStudent(StudentData studentData[],int index,int maxIndex)throws WrongIdException {
        if(studentData.length==0 || index<0 || index>=studentData.length)
        {
            throw new WrongIdException();
        }
      StudentData studentDataTemp = studentData[index];
      if(index!=maxIndex)
      {
          studentData[index]=studentData[studentData.length-1];
          studentData[studentData.length-1]=studentDataTemp;
          StudentData studentData1=studentData[studentData.length-1];
          for(int i=index;i<maxIndex;i++)
          {
              studentData[i].setId(i);
          }
          int len=studentData.length-1;
          studentData= Arrays.stream(studentData)
                  .filter(student4->student4.getId()!=len).toArray(StudentData[]::new);
          System.out.println("Student Deleted Successfully...............");
      }


      return studentData;
    }
}
