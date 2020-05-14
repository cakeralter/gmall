package top.caker.gmall.ums.service.impl;

import org.springframework.stereotype.Component;
import top.caker.gmall.ums.entity.Permission;
import top.caker.gmall.ums.mapper.PermissionMapper;
import top.caker.gmall.ums.service.PermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 后台用户权限表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {

}
