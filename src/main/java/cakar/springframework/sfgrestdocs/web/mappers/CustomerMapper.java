package cakar.springframework.sfgrestdocs.web.mappers;

import cakar.springframework.sfgrestdocs.domain.Customer;
import cakar.springframework.sfgrestdocs.web.model.CustomerDto;
import org.mapstruct.Mapper;

/**
 * Created by jt on 2019-05-25.
 */
@Mapper
public interface CustomerMapper {

    Customer customerDtoToCustomer(CustomerDto dto);

    CustomerDto customerToCustomerDto(Customer customer);
}
