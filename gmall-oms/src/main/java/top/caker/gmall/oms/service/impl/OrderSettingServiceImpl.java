package top.caker.gmall.oms.service.impl;

import org.springframework.stereotype.Component;
import top.caker.gmall.oms.entity.OrderSetting;
import top.caker.gmall.oms.mapper.OrderSettingMapper;
import top.caker.gmall.oms.service.OrderSettingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 订单设置表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class OrderSettingServiceImpl extends ServiceImpl<OrderSettingMapper, OrderSetting> implements OrderSettingService {

}
