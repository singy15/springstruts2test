package singy.springstruts2test.entities;

public class TCustomer {
    private Long customerId;
    private String name;

    @Override
    public String toString() {
        return String.format("customerId : %d, name : %s", customerId, name);
    }

    public Long getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
