package Project.exceptionclasses;

public class WrongIdException extends Exception {
    public WrongIdException()
    {
        super();
    }
    public WrongIdException(String message)
    {
        super(message);
    }
    public String getMessage()
    {
        return "Invalid Id,Id not Available";
    }
}
