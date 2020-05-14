package top.caker.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;
import top.caker.gmall.pms.entity.FeightTemplate;
import top.caker.gmall.pms.mapper.FeightTemplateMapper;
import top.caker.gmall.pms.service.FeightTemplateService;

/**
 * <p>
 * 运费模版 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class FeightTemplateServiceImpl extends ServiceImpl<FeightTemplateMapper, FeightTemplate> implements FeightTemplateService {

}
