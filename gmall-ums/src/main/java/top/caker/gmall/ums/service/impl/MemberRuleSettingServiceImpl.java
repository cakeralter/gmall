package top.caker.gmall.ums.service.impl;

import org.springframework.stereotype.Component;
import top.caker.gmall.ums.entity.MemberRuleSetting;
import top.caker.gmall.ums.mapper.MemberRuleSettingMapper;
import top.caker.gmall.ums.service.MemberRuleSettingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 会员积分成长规则表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class MemberRuleSettingServiceImpl extends ServiceImpl<MemberRuleSettingMapper, MemberRuleSetting> implements MemberRuleSettingService {

}