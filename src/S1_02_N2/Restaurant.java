package S1_02_N2;

import java.util.Comparator;
import java.util.Objects;

public class Restaurant implements Comparable<Restaurant>, Comparator<Restaurant>{
    private String name;
    private int punctuation;

    public Restaurant(){};

    public Restaurant(String name, int punctuation) {
        this.name = name;
        this.punctuation = punctuation;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPunctuation() {
        return this.punctuation;
    }

    public void setPunctuation(int punctuation) {
        this.punctuation = punctuation;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return this.punctuation == that.punctuation && this.name.equalsIgnoreCase(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.name, this.punctuation);
    }


    @Override
    public String toString() {
        return "Name: " + this.name + " Punctuation=" + this.punctuation;
    }

    @Override
    public int compareTo(Restaurant o) {
        return this.punctuation - o.getPunctuation();
    }


    @Override
    public int compare(Restaurant o1, Restaurant o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
}
