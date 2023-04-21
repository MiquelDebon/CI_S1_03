package S1_02_N2Lambdas;

import java.util.Objects;

public class Restaurant2 {
    private String name;
    private int punctuation;

    public Restaurant2(){};

    public Restaurant2(String name, int punctuation) {
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
        Restaurant2 that = (Restaurant2) o;
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

}
