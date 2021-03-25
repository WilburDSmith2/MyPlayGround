package za.ac.cput.playground;

/**
 *
 * @author Wilbur Smith
 */
public class PlayGround 
{
    private String name, surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public PlayGround(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "PlayGround{" + "name=" + name + ", surname=" + surname + '}';
    }
    
}
