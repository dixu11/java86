package edu.podstawy;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Zad15 {

    public static void main(String[] args) {
        String text = "Ala lubi koty, ale nie jest przez nie lubiana";


        Pattern compile = Pattern.compile("(Ala).+");
        Matcher matcher = compile.matcher(text);
        matcher.matches();
        System.out.println(matcher.group(0));

    }


}
