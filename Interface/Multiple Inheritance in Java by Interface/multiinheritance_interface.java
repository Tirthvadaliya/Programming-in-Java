interface Printable{  
    void print();  
    }  
    interface Showable{  
    void show();  
    }  
    class multiinheritance_interface implements Printable,Showable{  
    public void print(){System.out.println("Hello");}  
    public void show(){System.out.println("Welcome");}  
      
    public static void main(String args[]){  
    multiinheritance_interface obj = new multiinheritance_interface();  
    obj.print();  
    obj.show();  
     }  
    }