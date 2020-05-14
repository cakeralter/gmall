package top.caker.gmall.pms.service.impl;

import org.springframework.stereotype.Component;
import top.caker.gmall.pms.entity.MemberPrice;
import top.caker.gmall.pms.mapper.MemberPriceMapper;
import top.caker.gmall.pms.service.MemberPriceService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 商品会员价格表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class MemberPriceServiceImpl extends ServiceImpl<MemberPriceMapper, MemberPrice> implements MemberPriceService {

}
