package customer.management.service.impl;

import customer.management.model.Customer;
import customer.management.model.CustomerType;
import customer.management.repository.CustomerTypeRepository;
import customer.management.service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CustomerTypeServiceImpl implements CustomerTypeService {
    @Autowired
    private CustomerTypeRepository customerTypeRepository;

    @Override
    public List<CustomerType> findAll() {
        return (List<CustomerType>) customerTypeRepository.findAll();
    }

    @Override
    public CustomerType findById(Long id) {
        Optional<CustomerType> customerTypeOptional = customerTypeRepository.findById(id);
        if (customerTypeOptional.isPresent()){
            return customerTypeOptional.get();
        }
        throw new RuntimeException("not found type of customer with id is:  " + id);
    }

    @Override
    public void save(CustomerType type) {
        customerTypeRepository.save(type);
    }

    @Override
    public void remove(Long id) {
        customerTypeRepository.deleteById(id);
    }
}
