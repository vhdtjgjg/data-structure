/**
 * 自定义栈异常
 */
public class StackException extends RuntimeException{

    private String message;

    public StackException() {
        super();
    }

    public StackException(String message) {
        super(message);
    }
}
