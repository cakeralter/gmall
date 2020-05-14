package top.caker.gmall.pms.service.impl;

import org.springframework.stereotype.Component;
import top.caker.gmall.pms.entity.ProductFullReduction;
import top.caker.gmall.pms.mapper.ProductFullReductionMapper;
import top.caker.gmall.pms.service.ProductFullReductionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 产品满减表(只针对同商品) 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class ProductFullReductionServiceImpl extends ServiceImpl<ProductFullReductionMapper, ProductFullReduction> implements ProductFullReductionService {

}
