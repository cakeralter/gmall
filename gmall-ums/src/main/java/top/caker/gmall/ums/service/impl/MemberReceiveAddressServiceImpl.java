package top.caker.gmall.ums.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;
import top.caker.gmall.ums.entity.MemberReceiveAddress;
import top.caker.gmall.ums.mapper.MemberReceiveAddressMapper;
import top.caker.gmall.ums.service.MemberReceiveAddressService;

/**
 * <p>
 * 会员收货地址表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class MemberReceiveAddressServiceImpl extends ServiceImpl<MemberReceiveAddressMapper, MemberReceiveAddress> implements MemberReceiveAddressService {

}
