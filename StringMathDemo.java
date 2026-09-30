public class stringMathDemo
{
    public static void main(String[]args)
    {
        String str1="Patil";
        String str2="Harshada";
        String str3=str1.concat(" "+str2);
        System.out.println("Concatenation:"+ str3);
        System.out.println(" length of str1:"+str1.length());
        System.out.println("Character of index 1:"+str1.charAt(1));
        System.out.println("substringof str2(0-3):"+str2.substring(0,3));
        System.out.println("Equals?  str1 and str2:"+str1.equals(str2));
        System.out.println("Uppercase str1:"+str1.toUpperCase());
        double a=16.0;
        double b=3.7;
        System.out.println("square rootroof a;"+Math.sqrt(a));
        System.out.println("a raised to b;"+Math.pow(a,b));
        System.out.println("Mix of a and b;"+Math.max(a,b));
        System.out.println("min of a and b;"+Math.min(a,b));
        System.out.println("Random number(20-1);"+(10+Math.random()*(20-1)));
        System.out.println("Ceil of b;"+Math.ceil(b));
        System.out.println("Floor of b;"+Math.floor(b));
        System.out.println("Round of b;"+Math.round(b));
    }
}