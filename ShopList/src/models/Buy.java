package models;

public class Buy implements Comparable<Buy> {
    private String description;
    private double value;

    public Buy(String description, double value) {
        this.description = description;
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Compra: " +
                "descricao='" + description + '\'' +
                ", value=" + value +
                '}';
    }

    @Override
    public int compareTo(Buy otherBuy) {
        return Double.compare(this.value, otherBuy.value);
    }
}
