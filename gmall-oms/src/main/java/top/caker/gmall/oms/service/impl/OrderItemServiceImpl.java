package top.caker.gmall.oms.service.impl;

import org.springframework.stereotype.Component;
import top.caker.gmall.oms.entity.OrderItem;
import top.caker.gmall.oms.mapper.OrderItemMapper;
import top.caker.gmall.oms.service.OrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class OrderItemServiceImpl extends ServiceImpl<OrderItemMapper, OrderItem> implements OrderItemService {

}
