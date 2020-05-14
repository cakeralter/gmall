package top.caker.gmall.sms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;
import top.caker.gmall.sms.entity.Coupon;
import top.caker.gmall.sms.mapper.CouponMapper;
import top.caker.gmall.sms.service.CouponService;

/**
 * <p>
 * 优惠卷表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class CouponServiceImpl extends ServiceImpl<CouponMapper, Coupon> implements CouponService {

}
