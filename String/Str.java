package jjjjj.String;

import java.nio.channels.WritableByteChannel;
import java.util.Scanner;

public class Str {
    public static void main(String[] args) {
        System.out.println("enter string");
    String S= "pooja";
     System.out.println(S.toUpperCase());
   S= "SACHIN";
   System.out.println(S.toLowerCase());
   S="pooja sharma";
   System.out.println(S.length());
   S="      tashu  hi";
   System.out.println(S.trim());
   S="pooja sharma";
   System.out.println(S.substring(4));
   S="pooja sharma";
   System.out.println(S.substring(2,5));
   S="pooja sharma";
   System.out.println(S.replaceFirst("pooja", "tashu"));
   S="pooja sharma";
   System.out.println(S.startsWith("t"));
   S="pooja sharma";
   System.out.println(S.endsWith("f"));
   System.out.println(S.charAt(4));
System.out.println(S.indexOf('s'));
System.out.println(S.equalsIgnoreCase("p"));
System.out.println(S.equals("poo"));
S="   pooja  sharma";
System.out.println(S.indexOf("    "));

    }
}
