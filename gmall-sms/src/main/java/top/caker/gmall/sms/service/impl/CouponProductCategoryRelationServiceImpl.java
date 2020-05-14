package top.caker.gmall.sms.service.impl;

import org.springframework.stereotype.Component;
import top.caker.gmall.sms.entity.CouponProductCategoryRelation;
import top.caker.gmall.sms.mapper.CouponProductCategoryRelationMapper;
import top.caker.gmall.sms.service.CouponProductCategoryRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 优惠券和产品分类关系表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class CouponProductCategoryRelationServiceImpl extends ServiceImpl<CouponProductCategoryRelationMapper, CouponProductCategoryRelation> implements CouponProductCategoryRelationService {

}
