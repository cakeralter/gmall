package top.caker.gmall.oms.service.impl;

import org.springframework.stereotype.Component;
import top.caker.gmall.oms.entity.Order;
import top.caker.gmall.oms.mapper.OrderMapper;
import top.caker.gmall.oms.service.OrderService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 订单表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

}
