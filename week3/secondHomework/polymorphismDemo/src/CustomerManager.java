public class CustomerManager {

    private BaseLogger baseLogger;

    public CustomerManager(BaseLogger baseLogger) { //constructor new'leyince calisir
        this.baseLogger = baseLogger;
    }

    public void add() {
        System.out.println("Müşteri eklendi.");
        this.baseLogger.log("log message");
    }
}
