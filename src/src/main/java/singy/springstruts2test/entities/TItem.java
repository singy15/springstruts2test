package singy.springstruts2test.entities;

public class TItem {

    private Long itemId;
    private String name;
    private Integer price;

    @Override
    public String toString() {
        return String.format("itemId : %d, name : %s, price : %d", itemId, name, price);
    }

    public Long getItemId() {
        return itemId;
    }
    public void setItemId(Long id) {
        this.itemId = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
}
