package customer.management.repository;

import customer.management.model.CustomerType;
import org.springframework.data.repository.CrudRepository;

public interface CustomerTypeRepository extends CrudRepository<CustomerType, Long> {
}
