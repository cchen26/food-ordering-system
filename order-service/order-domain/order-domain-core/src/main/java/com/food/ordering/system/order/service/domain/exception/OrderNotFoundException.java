package com.food.ordering.system.order.service.domain.exception;

import com.food.ordering.system.domain.exception.DomainException;

/**
 * @author Chao
 * @version 1.0
 * @email chaochen234@gmail.com
 * @since 2024-12-02
 */

public class OrderNotFoundException extends DomainException {

    public OrderNotFoundException(String message){
        super(message);
    }

    public OrderNotFoundException(String message, Throwable cause){
        super(message, cause);
    }

}
