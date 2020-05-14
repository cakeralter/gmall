package top.caker.gmall.oms.service.impl;

import org.springframework.stereotype.Component;
import top.caker.gmall.oms.entity.CompanyAddress;
import top.caker.gmall.oms.mapper.CompanyAddressMapper;
import top.caker.gmall.oms.service.CompanyAddressService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 公司收发货地址表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class CompanyAddressServiceImpl extends ServiceImpl<CompanyAddressMapper, CompanyAddress> implements CompanyAddressService {

}
