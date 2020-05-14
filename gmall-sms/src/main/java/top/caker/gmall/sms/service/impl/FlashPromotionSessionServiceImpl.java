package top.caker.gmall.sms.service.impl;

import org.springframework.stereotype.Component;
import top.caker.gmall.sms.entity.FlashPromotionSession;
import top.caker.gmall.sms.mapper.FlashPromotionSessionMapper;
import top.caker.gmall.sms.service.FlashPromotionSessionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 限时购场次表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class FlashPromotionSessionServiceImpl extends ServiceImpl<FlashPromotionSessionMapper, FlashPromotionSession> implements FlashPromotionSessionService {

}
