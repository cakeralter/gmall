package top.caker.gmall.pms.service.impl;

import org.springframework.stereotype.Component;
import top.caker.gmall.pms.entity.ProductAttributeCategory;
import top.caker.gmall.pms.mapper.ProductAttributeCategoryMapper;
import top.caker.gmall.pms.service.ProductAttributeCategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 产品属性分类表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class ProductAttributeCategoryServiceImpl extends ServiceImpl<ProductAttributeCategoryMapper, ProductAttributeCategory> implements ProductAttributeCategoryService {

}
