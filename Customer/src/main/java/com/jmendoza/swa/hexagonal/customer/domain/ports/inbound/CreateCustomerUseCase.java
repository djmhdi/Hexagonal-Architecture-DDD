package com.jmendoza.swa.hexagonal.customer.domain.ports.inbound;

import com.jmendoza.swa.hexagonal.customer.common.exception.GlobalException;
import com.jmendoza.swa.hexagonal.customer.common.exception.ParameterNotFoundException;
import com.jmendoza.swa.hexagonal.customer.domain.model.Customer;

public interface CreateCustomerUseCase {
    void createCustomer(Customer customer) throws GlobalException, ParameterNotFoundException;
}