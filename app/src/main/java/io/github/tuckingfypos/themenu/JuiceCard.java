package io.github.tuckingfypos.themenu;

public class JuiceCard {
    String Name, Brand, Price, Status, Size, Nic, Desc;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getSize() {
        return Size;
    }

    public void setSize(String size) {
        Size = size;
    }

    public String getNic() {
        return Nic;
    }

    public void setNic(String nic) {
        Nic = nic;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public JuiceCard(String name, String brand, String price, String status, String size, String nic, String desc) {
        Name = name;
        Brand = brand;
        Price = price;
        Status = status;
        Size = size;
        Nic = nic;
        Desc = desc;
    }
}
