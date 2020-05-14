package top.caker.gmall.sms.service.impl;

import org.springframework.stereotype.Component;
import top.caker.gmall.sms.entity.HomeRecommendSubject;
import top.caker.gmall.sms.mapper.HomeRecommendSubjectMapper;
import top.caker.gmall.sms.service.HomeRecommendSubjectService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 首页推荐专题表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class HomeRecommendSubjectServiceImpl extends ServiceImpl<HomeRecommendSubjectMapper, HomeRecommendSubject> implements HomeRecommendSubjectService {

}
