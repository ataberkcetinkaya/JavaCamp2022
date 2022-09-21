public class Main {
    public static void main(String[] args) {
        char harf = 'E';

        switch (harf) {
            case 'A':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Kalin sesli harf");
                break;
            default: //yukardakiler harici
                System.out.println("İnce sesli harf");
        }
    }
}