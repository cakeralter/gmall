package top.caker.gmall.ums.service.impl;

import top.caker.gmall.ums.entity.Admin;
import top.caker.gmall.ums.mapper.AdminMapper;
import top.caker.gmall.ums.service.AdminService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Service
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {

}
