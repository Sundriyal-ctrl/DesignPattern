package Project.exceptionclasses;

public class InvalidClassException extends Exception {
    public InvalidClassException()
    {
        super();

    }

    public String getMessage()
    {
        return "Invalid Class Exception Class less Than 1 or greater 12";
    }


}
