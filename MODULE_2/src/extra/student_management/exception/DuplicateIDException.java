package extra.student_management.service.impl;

public class DuplicateIDException extends Exception {
    public DuplicateIDException(String mess){
        super(mess);
    }
}
