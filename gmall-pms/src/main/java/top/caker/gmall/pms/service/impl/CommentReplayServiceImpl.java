package top.caker.gmall.pms.service.impl;

import org.springframework.stereotype.Component;
import top.caker.gmall.pms.entity.CommentReplay;
import top.caker.gmall.pms.mapper.CommentReplayMapper;
import top.caker.gmall.pms.service.CommentReplayService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 产品评价回复表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class CommentReplayServiceImpl extends ServiceImpl<CommentReplayMapper, CommentReplay> implements CommentReplayService {

}
