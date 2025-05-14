class student
{
 String name,sub;
 int id;

  void setname(String stname)
  {
    name=stname;
  }
  void setsub(String subject)
  {
    sub=subject;
  }

  void display()
  {
    System.out.println("Name: "+name);
    System.out.println("id: "+id);
    System.out.println("sub: "+sub);
    System.out.println();

  }
}
public class classobject {

    public static void main(String[] args) {
        student s1=new student();
        student s2=new student();

        s1.setname("tirth");
        s1.id=3;
        s1.setsub("java");
        
        s2.setname("kishan");
        s2.id=2;
        s2.setsub("html");

        s1.display();
        s2.display();
    }
}