package top.caker.gmall.sms.service.impl;

import org.springframework.stereotype.Component;
import top.caker.gmall.sms.entity.HomeRecommendProduct;
import top.caker.gmall.sms.mapper.HomeRecommendProductMapper;
import top.caker.gmall.sms.service.HomeRecommendProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 人气推荐商品表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class HomeRecommendProductServiceImpl extends ServiceImpl<HomeRecommendProductMapper, HomeRecommendProduct> implements HomeRecommendProductService {

}
