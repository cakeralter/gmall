package top.caker.gmall.ums.service.impl;

import org.springframework.stereotype.Component;
import top.caker.gmall.ums.entity.MemberStatisticsInfo;
import top.caker.gmall.ums.mapper.MemberStatisticsInfoMapper;
import top.caker.gmall.ums.service.MemberStatisticsInfoService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 会员统计信息 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class MemberStatisticsInfoServiceImpl extends ServiceImpl<MemberStatisticsInfoMapper, MemberStatisticsInfo> implements MemberStatisticsInfoService {

}
