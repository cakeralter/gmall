package top.caker.gmall.ums.service.impl;

import org.springframework.stereotype.Component;
import top.caker.gmall.ums.entity.Role;
import top.caker.gmall.ums.mapper.RoleMapper;
import top.caker.gmall.ums.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 后台用户角色表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
