package top.caker.gmall.ums.service.impl;

import org.springframework.stereotype.Component;
import top.caker.gmall.ums.entity.AdminRoleRelation;
import top.caker.gmall.ums.mapper.AdminRoleRelationMapper;
import top.caker.gmall.ums.service.AdminRoleRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 后台用户和角色关系表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class AdminRoleRelationServiceImpl extends ServiceImpl<AdminRoleRelationMapper, AdminRoleRelation> implements AdminRoleRelationService {

}
