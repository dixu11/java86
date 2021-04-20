package obiektowe.lists;

class StringBuilderDemo {

    public static void main(String[] args) {

        String text = "";


        /*for (int i = 0; i < 1_000_000; i++) {
            text += "a";
        }

        System.out.println(text);
        System.out.println(text.length());*/

        StringBuilder text2 = new StringBuilder("");
        for (int i = 0; i < 10_000_000; i++) {
            text2.append("a");
        }

        System.out.println(text2);
        System.out.println(text2.length());

    }


}
