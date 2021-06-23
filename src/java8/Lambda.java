package java8;

public class Lambda {
    public static void main(String[] args) {


        //System.out.println(myFunction.doStuff("sdsdfsdfsdf"));
        metodaPrzyjmeMetode(text -> text.substring(0, 3).toLowerCase());
    }

    public static void metodaPrzyjmeMetode(Function function) {
        System.out.println("Wywolam wiele razy Twoja metode:");
        System.out.println(function.doStuff("sdsdfsdfsdf"));
        System.out.println(function.doStuff("sdsdfsdfsdf"));
        System.out.println(function.doStuff("sdsdfsdfsdf"));
        System.out.println(function.doStuff("sdsdfsdfsdf"));
        System.out.println(function.doStuff("sdsdfsdfsdf"));
    }


}

@FunctionalInterface
interface Function {
    String doStuff(String text);
}
