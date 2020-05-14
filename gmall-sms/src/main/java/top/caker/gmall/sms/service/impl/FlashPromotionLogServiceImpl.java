package top.caker.gmall.sms.service.impl;

import org.springframework.stereotype.Component;
import top.caker.gmall.sms.entity.FlashPromotionLog;
import top.caker.gmall.sms.mapper.FlashPromotionLogMapper;
import top.caker.gmall.sms.service.FlashPromotionLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 限时购通知记录 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class FlashPromotionLogServiceImpl extends ServiceImpl<FlashPromotionLogMapper, FlashPromotionLog> implements FlashPromotionLogService {

}
