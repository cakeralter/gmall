package top.caker.gmall.sms.service.impl;

import org.springframework.stereotype.Component;
import top.caker.gmall.sms.entity.FlashPromotionProductRelation;
import top.caker.gmall.sms.mapper.FlashPromotionProductRelationMapper;
import top.caker.gmall.sms.service.FlashPromotionProductRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 商品限时购与商品关系表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class FlashPromotionProductRelationServiceImpl extends ServiceImpl<FlashPromotionProductRelationMapper, FlashPromotionProductRelation> implements FlashPromotionProductRelationService {

}
