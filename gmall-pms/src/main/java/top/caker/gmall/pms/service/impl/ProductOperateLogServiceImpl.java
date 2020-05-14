package top.caker.gmall.pms.service.impl;

import org.springframework.stereotype.Component;
import top.caker.gmall.pms.entity.ProductOperateLog;
import top.caker.gmall.pms.mapper.ProductOperateLogMapper;
import top.caker.gmall.pms.service.ProductOperateLogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class ProductOperateLogServiceImpl extends ServiceImpl<ProductOperateLogMapper, ProductOperateLog> implements ProductOperateLogService {

}
