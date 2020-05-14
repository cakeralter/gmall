package top.caker.gmall.ums.service.impl;

import org.springframework.stereotype.Component;
import top.caker.gmall.ums.entity.IntegrationChangeHistory;
import top.caker.gmall.ums.mapper.IntegrationChangeHistoryMapper;
import top.caker.gmall.ums.service.IntegrationChangeHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 积分变化历史记录表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class IntegrationChangeHistoryServiceImpl extends ServiceImpl<IntegrationChangeHistoryMapper, IntegrationChangeHistory> implements IntegrationChangeHistoryService {

}
