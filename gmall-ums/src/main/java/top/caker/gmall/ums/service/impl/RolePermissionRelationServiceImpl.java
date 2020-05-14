package top.caker.gmall.ums.service.impl;

import org.springframework.stereotype.Component;
import top.caker.gmall.ums.entity.RolePermissionRelation;
import top.caker.gmall.ums.mapper.RolePermissionRelationMapper;
import top.caker.gmall.ums.service.RolePermissionRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 后台用户角色和权限关系表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class RolePermissionRelationServiceImpl extends ServiceImpl<RolePermissionRelationMapper, RolePermissionRelation> implements RolePermissionRelationService {

}
