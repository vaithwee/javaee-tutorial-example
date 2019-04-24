package xyz.vatih.execption;

public class SysExecption extends Exception {
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

    public SysExecption(String message) {
        this.message = message;
    }
}
