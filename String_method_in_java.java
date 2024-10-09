//strings
class str{
    public static void main(String[] args){
        String s="java progrmming";
        System.out.println(s);
    
        System.out.println(s.length());
        
        System.out.println(s.concat(" language"));
        
        System.out.println(s.compareTo("java"));
        System.out.println(s.compareTo("java progrmming"));
        
        System.out.println(s.compareToIgnoreCase("progrmming"));
        
        System.out.println(s.replace("java","c++"));
        
        System.out.println(s.substring(0,4));
        
        System.out.println(s.equals("java progrmming"));
        
        System.out.println(s.equals("java"));
        
        System.out.println(s.contains("java"));
        System.out.println(s.contains(" "));
        System.out.println(s.contains("inj"));
        
        System.out.println(s.indexOf(" "));
        
        //removes any leading (starting) and trailing (ending) whitespaces from the specified string
        System.out.println(s.trim());
        
        System.out.println(s.toLowerCase());
        
        System.out.println(s.toUpperCase());
        
        double interest = 923.234d;
        // convert double to string
        System.out.println(String.valueOf(interest));
    }
    
}
