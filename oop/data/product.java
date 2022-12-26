package oop.data;

public class product {
  public String name;
    public int price;

     public product (String nama, int harga){
        this.name = nama;
        this.price = harga;
    }
    public String toString() {
        return "nama product "+name+", price "+price;
    }

      public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        product product = (product) o;

        if (price != product.price) return false;
        return name != null ? name.equals(product.name) : product.name == null;
    }

    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }
}
