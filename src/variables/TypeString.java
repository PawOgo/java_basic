package variables;

public class TypeString {
    public static void main(String[] args) {

        String text = "Dowolny napis 1 1.124";
        System.out.println("name = " + text);
        System.out.println( "Pierwszy znak napisu: " + text.charAt(0));
        System.out.println( "Trzeci znak napisu: " + text.charAt(3));
        System.out.println( "Ostatni znak napisu: " + text.charAt(text.length() - 1));

        System.out.println("y znajduje sie na indekcie: " + text.indexOf('y'));
        System.out.println("napis znajduje sie na indekcie: " + text.indexOf("napis"));

        System.out.println("Długość napisu w zmiennej: " + text.length());

//        Jak wydobyć i zapisać w nowej zmiennje słowo napi z zmiennej text
        String napis = text.substring(8,13);
        System.out.println(napis);

        String cite = "Być albo nie być!";
        String updateCite = cite.replaceAll( "ć", "c");
        System.out.println("Zamieniony text: " + updateCite);

        String name1 = "Ala";
        String name2 = "ala";
        System.out.println(name1.equals(name2));
        System.out.println(name1.length() >= name2.length());
        
    }
}
