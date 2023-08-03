public class CWH_14_string_methods {
    public static void main(String[] args) {
        String name = "Harry";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        String demo = "     Harry      ";
        System.out.println(demo.trim());
        System.out.println(name.substring(2));
        System.out.println(name.substring(2 ,4));
        System.out.println(name.replace('r', 'p'));
        System.out.println(name.replace("rry", "ire"));
        System.out.println(name.startsWith("ha"));
        System.out.println(name.endsWith("ry"));
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf('a'));
        System.out.println(name.indexOf("ry"));
        System.out.println(name.indexOf('A'));
        String nameDemo= "Harryrry";
        System.out.println(nameDemo.indexOf("rry", 3));
        System.out.println(nameDemo.lastIndexOf("ry"));
        System.out.println(nameDemo.lastIndexOf("ry", 4));
        System.out.println(name.equals("harry"));
        System.out.println(name.equalsIgnoreCase("HARRY"));

        System.out.println("this is the example of \" escape \n sequence\tcharacter \\ ");








    }
}
