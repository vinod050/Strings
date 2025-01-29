public class Strings {
    public static void main(String[] args) {
        String a ="Hello, World!";
       System.out.println(a.charAt(7));
       System.out.println(a.indexOf("H"));
        String b = Character.toString(a.charAt(2));
        
        String c = Character.toString(a.charAt(4));
        


        System.out.println(b.toUpperCase());
        System.out.println(c.toUpperCase());
    }
    
}
