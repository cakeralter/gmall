package top.caker.gmall.ums.service.impl;

import org.springframework.stereotype.Component;
import top.caker.gmall.ums.entity.MemberLevel;
import top.caker.gmall.ums.mapper.MemberLevelMapper;
import top.caker.gmall.ums.service.MemberLevelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 会员等级表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class MemberLevelServiceImpl extends ServiceImpl<MemberLevelMapper, MemberLevel> implements MemberLevelService {

}
