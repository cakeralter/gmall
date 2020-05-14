package top.caker.gmall.sms.service.impl;

import org.springframework.stereotype.Component;
import top.caker.gmall.sms.entity.CouponProductRelation;
import top.caker.gmall.sms.mapper.CouponProductRelationMapper;
import top.caker.gmall.sms.service.CouponProductRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 优惠券和产品的关系表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class CouponProductRelationServiceImpl extends ServiceImpl<CouponProductRelationMapper, CouponProductRelation> implements CouponProductRelationService {

}
