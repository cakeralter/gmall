package top.caker.gmall.ums.service.impl;

import org.springframework.stereotype.Component;
import top.caker.gmall.ums.entity.MemberTag;
import top.caker.gmall.ums.mapper.MemberTagMapper;
import top.caker.gmall.ums.service.MemberTagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 用户标签表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class MemberTagServiceImpl extends ServiceImpl<MemberTagMapper, MemberTag> implements MemberTagService {

}
