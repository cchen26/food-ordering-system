package com.food.ordering.system.domain.valueobject;

import java.util.UUID;

/**
 * @author Chao
 * @version 1.0
 * @email chaochen234@gmail.com
 * @since 2024-11-11
 */

public class OrderId extends BaseId<UUID>{
    public OrderId(UUID value){
        super(value);
    }
}
