package customer.management.service;

import customer.management.model.Customer;
import customer.management.model.CustomerType;

import java.util.List;

public interface CustomerTypeService {
    List<CustomerType> findAll();

    CustomerType findById(Long id);

    void save(CustomerType type);

    void remove(Long id);
}
