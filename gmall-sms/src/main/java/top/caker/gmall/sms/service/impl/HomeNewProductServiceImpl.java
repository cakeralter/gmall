package top.caker.gmall.sms.service.impl;

import org.springframework.stereotype.Component;
import top.caker.gmall.sms.entity.HomeNewProduct;
import top.caker.gmall.sms.mapper.HomeNewProductMapper;
import top.caker.gmall.sms.service.HomeNewProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 新鲜好物表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class HomeNewProductServiceImpl extends ServiceImpl<HomeNewProductMapper, HomeNewProduct> implements HomeNewProductService {

}
