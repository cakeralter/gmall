package top.caker.gmall.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;
import top.caker.gmall.ums.entity.GrowthChangeHistory;
import top.caker.gmall.ums.mapper.GrowthChangeHistoryMapper;
import top.caker.gmall.ums.service.GrowthChangeHistoryService;

/**
 * <p>
 * 成长值变化历史记录表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class GrowthChangeHistoryServiceImpl extends ServiceImpl<GrowthChangeHistoryMapper, GrowthChangeHistory> implements GrowthChangeHistoryService {

}
