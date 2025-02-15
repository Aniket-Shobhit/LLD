import logProcessor.*;

public class Main {
    public static void main(String[] args) {
        LogProcessor logObject = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logObject.log(LogProcessor.ERROR, "exception happens");
        logObject.log(LogProcessor.DEBUG, "need to debug this");
        logObject.log(LogProcessor.INFO, "just for info");
    }
}

//can be used to design ATM systems ( first check for 500 rupee note, then for 200 rupee note, then 100, then 50 and so on);
//can also be used to design Vending machines ( first fetch cola if user wants that, then check for pepsi and so on );