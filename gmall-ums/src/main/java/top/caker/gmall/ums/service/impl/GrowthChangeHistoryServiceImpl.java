package top.caker.gmall.ums.service.impl;

import org.springframework.stereotype.Component;
import top.caker.gmall.ums.entity.GrowthChangeHistory;
import top.caker.gmall.ums.mapper.GrowthChangeHistoryMapper;
import top.caker.gmall.ums.service.GrowthChangeHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;

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
