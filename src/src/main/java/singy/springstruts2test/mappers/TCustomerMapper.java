package singy.springstruts2test.mappers;

import java.util.List;

import singy.springstruts2test.entities.TCustomer;


public interface TCustomerMapper {
    List<TCustomer> selectAll();
}
