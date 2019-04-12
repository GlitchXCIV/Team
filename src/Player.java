public class Player extends Person {

    private String role;
    private int number;

    public Player (String name, String surname, String role, int number) /*costruttore, passiamo anche i valori di Person*/
    {
        super (name, surname);
        this.role= role;
        this.number = number;
    }
    public int getNumber () {
        return number;
    }
    public String getRole () {
        return role;
    }

    @Override
    public String toString () {
        return "Name: " + getName() +
                "\nSurname: " + getSurname() +
                "\nRole: " + getRole() +
                "\nNumber: "+ getNumber();
    }
}