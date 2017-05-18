
public class Main {
    public static void main(String[]args){

        StringBuffer text = new StringBuffer(" #Лабораторная работа номер 3, нужно убрать все знаки, кроме пропусков и букв)");
        text.deleteCharAt(text.indexOf("#"));
        text.deleteCharAt(text.indexOf(")"));
        text.deleteCharAt(text.indexOf(","));
        text.deleteCharAt(text.indexOf(","));
        text.insert(text.indexOf("о"),text.indexOf("  "));
        System.out.println(text);
    }
}
