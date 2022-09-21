public class Main {
    public static void main(String[] args) {
        String message = "Bugün hava çok güzel";
        System.out.println(message);

        /*System.out.println("Eleman sayisi: " + message.length());
        System.out.println("5. eleman: " + message.charAt(4));
        System.out.println(message.concat(" Yaşasın!")); //sonuna ekler
        System.out.println(message.startsWith("B"));
        System.out.println(message.endsWith("."));

        char[] karakterler = new char[5];
        message.getChars(0, 5, karakterler, 0); //getChars'i, yukaridaki charsArray'e atiyorum
        System.out.println(karakterler);

        System.out.println(message.indexOf("g"));
        System.out.println(message.lastIndexOf("g")); //aramaya sagdan baslar*/

        System.out.println(message.replace(' ', '-'));
        System.out.println(message.substring(2)); //2. index'ten itibaren yaziyi alacak
        System.out.println(message.substring(2, 4));

        for(String kelime : message.split(" ")) { //bosluklara gore split edip for ile gezerek cumleyi alt alta yazdiriyorum
            System.out.println(kelime);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim()); //basinda ve sonunda bosluklar varsa onlari kirpar.
    }
}