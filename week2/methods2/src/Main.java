public class Main {
    public static void main(String[] args) {
        String message = "Something";
        String newMessage = city();
        System.out.println(newMessage);

        System.out.println(sum());
        System.out.println(secondSum(5,7));

        System.out.println(thirdSum(2,3,5,6));
    }

    public static void add() { //void >> do something and stop, returns nothing!!!
        System.out.println("Added");
    }

    public static void delete() {
        System.out.println("Deleted");
    }

    public static void update() {
        System.out.println("Updated");
    }


    public static int sum() { //int instead of void means that will return us an integer value
        return 5;
    }
    public static int secondSum(int num1, int num2) { //int instead of void means that will return us an integer value
        return num1 + num2;
    }
    public static String city() { //String instead of void means that will return us a String value
        return "Brussels";
    }

    //VARIABLE ARGUMENTS
    public static int thirdSum(int... nums) { //3 dots is variable args >> can be send unlimited numbers (works like an int array)
        int add = 0;
        for(int num:nums) {
            add = add + num;
        }
        return add;
    }

}