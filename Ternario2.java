public class Ternario2 {
    public static void main(String[] args) {
        System.out.println(checkString("Quest"));
    }

    private static String checkString(String value) {
      
        return value.length() >= 10 ? "Lunghezza maggiore o uguale di 10" : "Lunghezza minore di 10";
    }
}