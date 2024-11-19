package com.food.ordering.system.domain.valueobject;

import java.util.UUID;

/**
 * @author Chao
 * @version 1.0
 * @email chaochen234@gmail.com
 * @since 2024-11-11
 */

public class RestaurantId  extends BaseId<UUID>{
    public RestaurantId(UUID value) {
        super(value);
    }
}
