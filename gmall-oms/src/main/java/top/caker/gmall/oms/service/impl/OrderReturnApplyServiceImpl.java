package top.caker.gmall.oms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;
import top.caker.gmall.oms.entity.OrderReturnApply;
import top.caker.gmall.oms.mapper.OrderReturnApplyMapper;
import top.caker.gmall.oms.service.OrderReturnApplyService;

/**
 * <p>
 * 订单退货申请 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class OrderReturnApplyServiceImpl extends ServiceImpl<OrderReturnApplyMapper, OrderReturnApply> implements OrderReturnApplyService {

}
