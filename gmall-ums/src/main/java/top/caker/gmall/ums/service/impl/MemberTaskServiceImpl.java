package top.caker.gmall.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;
import top.caker.gmall.ums.entity.MemberTask;
import top.caker.gmall.ums.mapper.MemberTaskMapper;
import top.caker.gmall.ums.service.MemberTaskService;

/**
 * <p>
 * 会员任务表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class MemberTaskServiceImpl extends ServiceImpl<MemberTaskMapper, MemberTask> implements MemberTaskService {

}
