package top.caker.gmall.ums.service.impl;

import org.springframework.stereotype.Component;
import top.caker.gmall.ums.entity.IntegrationConsumeSetting;
import top.caker.gmall.ums.mapper.IntegrationConsumeSettingMapper;
import top.caker.gmall.ums.service.IntegrationConsumeSettingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 积分消费设置 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class IntegrationConsumeSettingServiceImpl extends ServiceImpl<IntegrationConsumeSettingMapper, IntegrationConsumeSetting> implements IntegrationConsumeSettingService {

}
