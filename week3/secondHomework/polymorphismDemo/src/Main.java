public class Main {
    public static void main(String[] args) {
        /*EmailLogger emailLogger = new EmailLogger();
        emailLogger.Log("logged to email");*/

        /*BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger()};

        for(BaseLogger logger : loggers) {
            logger.Log("Log message");
        }*/

        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}