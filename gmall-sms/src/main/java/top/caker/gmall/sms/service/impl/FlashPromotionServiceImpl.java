package top.caker.gmall.sms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;
import top.caker.gmall.sms.entity.FlashPromotion;
import top.caker.gmall.sms.mapper.FlashPromotionMapper;
import top.caker.gmall.sms.service.FlashPromotionService;

/**
 * <p>
 * 限时购表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class FlashPromotionServiceImpl extends ServiceImpl<FlashPromotionMapper, FlashPromotion> implements FlashPromotionService {

}
