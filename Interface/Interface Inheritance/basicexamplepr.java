    interface Printable{  
    void print();  
    }  
    interface Showable extends Printable{  
    void show();  
    }  
    class basicexamplepr implements Showable{  
    public void print(){System.out.println("Hello");}  
    public void show(){System.out.println("Welcome");}  
      
    public static void main(String args[]){  
    basicexamplepr obj = new basicexamplepr();  
    obj.print();  
    obj.show();  
     }  
    }  