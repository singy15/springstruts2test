package singy.springstruts2test.entities;

public class TSale {
    private Long saleId;
    private Long itemId;
    private Integer amount;
    private Long customerId;
    private String customerName;

    private TCustomer customerInfo;

    @Override
    public String toString() {
        return String.format("saleId : %d, itemId : %d, amount : %d, customerId : %d, customerInfo : %s", saleId, itemId, amount, customerId, customerInfo);
    }

    public TCustomer getCustomerInfo() {
        return customerInfo;
    }
    public void setCustomerInfo(TCustomer customerInfo) {
        this.customerInfo = customerInfo;
    }
    public Long getSaleId() {
        return saleId;
    }
    public void setSaleId(Long saleId) {
        this.saleId = saleId;
    }
    public Long getItemId() {
        return itemId;
    }
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }
    public Integer getAmount() {
        return amount;
    }
    public void setAmount(Integer amount) {
        this.amount = amount;
    }
    public Long getCustomerId() {
        return customerId;
    }
    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
}
