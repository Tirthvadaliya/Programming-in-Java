//A string buffer is like a String , but can be modified. At any point in time it contains some particular sequence of characters, but the length and content of the sequence can be changed through certain method calls
public class stringbufferbuilder {

    public static void main(String[] args) {

        StringBuffer sBuffer = new StringBuffer();// default capacity is 16
        System.out.println("The capacity of stringbuffer is :"+sBuffer.capacity());
        
        sBuffer = new StringBuffer(50);//set the capacity to 50
        System.out.println("The capacity of stringbuffer is :"+sBuffer.capacity());
        
        //string buffer capacity is now 16+ length of given string
        sBuffer = new StringBuffer("My StringBuffer");//set the capacity to 50
        System.out.println("The capacity of stringbuffer is :"+sBuffer.capacity());

        System.out.println("String in sBuffer: " + sBuffer);

        
        //StringBuilders are used same as StringBuffer
        StringBuilder sBuilder = new StringBuilder("My StringBuilder");
        System.out.println("String in sBuffer: " + sBuilder);
        
        
        //append string after the string buffer and string builder
        
        sBuffer.append(". Appended with StringBuffer.");
        sBuilder.append(". Appended with StringBuilder.");
        
        System.out.println("String in sBuffer: " + sBuffer);
        System.out.println("String in sBuffer: " + sBuilder);
        
        
        
        sBuffer = new StringBuffer("AABCABBC");
        sBuilder = new StringBuilder("abaabcabac");
        
        
        //insert string in between the old strings
        
        sBuffer.insert(5, "pqrst"); //insert substring at index 5
        sBuilder.insert(3, "XYZ"); //insert substring at index 3;
        
        System.out.println("String in sBuffer: " + sBuffer);
        System.out.println("String in sBuffer: " + sBuilder);
        
        
        //reverse the strings
        
        System.out.println("Reversed StringBuffer: " + sBuffer.reverse());
        System.out.println("Reversed StringBuilder: " + sBuilder.reverse());
        

}
}