package S1_02_N3;

public class Person {
    private String name;
    private String surname;
    private String NIF;

    public Person(String name, String surname, String NIF){
        this.name = name;
        this.surname = surname;
        this.NIF = NIF;
    }


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

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String toString(){
        return this.name + " " + this.surname + " NIF: " + this.NIF;
    }

}
