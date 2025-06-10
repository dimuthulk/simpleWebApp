package lk.dimuthucodes.simpleWebApp.model;


public class Product {
    private int proId;
    private String proName;
    private int proPrice;

    public Product(int proId, String proName, int proPrice) {
        this.proId = proId;
        this.proName = proName;
        this.proPrice = proPrice;
    }

    public int getProId() {
        return proId;
    }

    public void setProId(int proId) {
        this.proId = proId;
    }


    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public int getProPrice() {
        return proPrice;
    }

    public void setProPrice(int proPrice) {
        this.proPrice = proPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proId=" + proId +
                ", proName='" + proName + '\'' +
                ", proPrice=" + proPrice +
                '}';
    }
}
