package top.caker.gmall.oms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;
import top.caker.gmall.oms.entity.OrderReturnReason;
import top.caker.gmall.oms.mapper.OrderReturnReasonMapper;
import top.caker.gmall.oms.service.OrderReturnReasonService;

/**
 * <p>
 * 退货原因表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class OrderReturnReasonServiceImpl extends ServiceImpl<OrderReturnReasonMapper, OrderReturnReason> implements OrderReturnReasonService {

}
