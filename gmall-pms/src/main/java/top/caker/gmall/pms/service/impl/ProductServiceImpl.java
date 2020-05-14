package top.caker.gmall.pms.service.impl;

import org.springframework.stereotype.Component;
import top.caker.gmall.pms.entity.Product;
import top.caker.gmall.pms.mapper.ProductMapper;
import top.caker.gmall.pms.service.ProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 商品信息 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements ProductService {

}
