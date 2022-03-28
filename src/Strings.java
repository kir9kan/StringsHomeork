import java.util.Locale;
import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String a =scanner.nextLine();
        System.out.println(a.charAt(a.length()-1));
        System.out.println(a.endsWith("!!!"));
        System.out.println(a.startsWith("I Like"));
        System.out.println(a.contains("Java"));
        System.out.println(a.toUpperCase(Locale.ROOT));
        System.out.println(a.toLowerCase(Locale.ROOT));
        System.out.println(a.replace("a","o"));
        System.out.println(a.substring(2,6));
        int index =a.lastIndexOf("Java");
        if(index==-1){
            System.out.println("подстрока Java не найдена");
        }else {
            System.out.println("последнее упоминание про Java в индексе "+ index);
        }
        String b="str";
        String c="strom";
        String[] word=a.split(" ");
        for(int i=0;i<3;i++) {
            if (word[i].length() >= b.length() && word[i].length() <= c.length()) {
                System.out.println("подходящие слова -" + word[i]);
            } else {
                System.out.println(word[i] + " не плодходит");
            }
        }
        String str1="поля";
        String str2="граммота";
        System.out.println("первое слово - "+ str1);
        System.out.println("второе слово - "+ str2);
        String str3=(str1.substring(0,str1.length()/2)+ (str2.substring(str2.length()/2,str2.length())));
        System.out.println("получившееся слово - "+ str3);
        int d = scanner.nextInt();
        int f = scanner.nextInt();
        StringBuilder builder = new StringBuilder();
        builder.append(String.format("%d + %d = %d\n", d, f, d + f));
        builder.append(String.format("%d - %d = %d\n", d, f, d - f));
        builder.append(String.format("%d * %d = %d\n", d, f, d * f));
        System.out.println(builder.toString());
    }
}
