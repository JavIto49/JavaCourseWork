public class StringMethods {
    public static void main(String[] args) {

        String name = "Joseph Villalobos";
        String name2 = "   Joseph Villalobos   ";

        int length = name.length();
        char letter = name.charAt(7);
        int index = name.indexOf("p");
        int lastIndex = name.lastIndexOf("o");
        String upperName = name.toUpperCase();
        String lowerName = name.toLowerCase();

        String trimSpaceName = name2.trim();
        String replaceCharName = name2.replace('o','z');

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(upperName);
        System.out.println(lowerName);

        System.out.println(trimSpaceName);
        System.out.println(replaceCharName);
        System.out.println(name.isEmpty());

        if(name.isEmpty()){
            System.out.println("Empty name!");
        }
        else{
            System.out.println("Hello " + name);
        }

        if(name.contains(" ")){
            System.out.println("Your name contains spaces!");
        }
        else{
            System.out.println("Your name does not contain spaces!");
        }

        if(name.equals("password")){
            System.out.println("Your name cannot be your password");
        }
        else{
            System.out.println("Hello " + name);
        }

        if(name.equalsIgnoreCase("password")){ // Case sensitivity ignored to accurately compare strings
            System.out.println("Your name cannot be your password");
        }
        else{
            System.out.println("Hello " + name);
        }


    }
}
