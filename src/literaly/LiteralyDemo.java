package literaly;

class LiteralyDemo {


    public static void main(String[] args) {

        System.out.println("Abcd");  // wyświetlam łańcuch znaków - literał String
       // System.out.println("abcdefg12345   34456");

        System.out.println("123");
        System.out.println(123); // wyświetlam liczbę całkowitą - literł Inteeger (int)

        System.out.println(123 + 900);  // wyrażenie operujące na 2 liczbach całkowitych -> wynik będzie w int
        System.out.println(123 + "900abc"); // wyrażenie które operuje na int oraz String -> wynik będzie w String
       // System.out.println(5 * "10"); // operator * nie może zostać zastosowany dla literałów String
        System.out.println(6/3); // wyrażenie rozwiązywane do typu int
        System.out.println(6D/4); // operacja na literałach zmiennoprzecinkowych -> double
        System.out.println(6.0/4); // 6.0 lub 6D lub 6.  -> double!
        System.out.println(3.14*7);

        System.out.println();  // boolean :  true false
        System.out.println(true); // literał boolean
        System.out.println(false); // literał boolean
        System.out.println(7>3);  // wyrażenie dla znaków > < == != , >= , <= -> wynik będzie literałem boolean

        System.out.println('g');  // literał char -> pojedynczy znak
        System.out.println('g' + "odzina");
        System.out.println('g' + 77); // ASCII

    }

}
