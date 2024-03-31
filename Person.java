 public class Person {
    private String name;
    private double id;

    public Person(String name,double id ) {
        this.name = name;
        this.id=id;
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("person ID:"+id);
    }
    public void displayDate(String dob)
     {
        System.out.println("Dob:"+dob);
     }
    public static void main(String[] args) {
        Person person = new Person("John",101);
        person.display();
        
         
        person.displayDate( "2000-01-01");
         
    }
}
 
