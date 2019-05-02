package xyz.vaith.mapper;

import xyz.vaith.domain.Order;

public interface OrderMapper {
    Order selectOrderByUserId(Integer id);
    Order selectOrderByOrderId(Integer id);
}
