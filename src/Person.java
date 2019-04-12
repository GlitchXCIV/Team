public class Person {
    String name;
    private String surname;
    public Person (String name, String surname) /*costruttore*/
    {
        this.name= name;
        this.surname = surname;
    }
    public String getName () {
        return name;
    }
    public String getSurname () {
        return surname;
    }
}
