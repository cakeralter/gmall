package top.caker.gmall.ums.service.impl;

import org.springframework.stereotype.Component;
import top.caker.gmall.ums.entity.MemberMemberTagRelation;
import top.caker.gmall.ums.mapper.MemberMemberTagRelationMapper;
import top.caker.gmall.ums.service.MemberMemberTagRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 用户和标签关系表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
public class MemberMemberTagRelationServiceImpl extends ServiceImpl<MemberMemberTagRelationMapper, MemberMemberTagRelation> implements MemberMemberTagRelationService {

}
