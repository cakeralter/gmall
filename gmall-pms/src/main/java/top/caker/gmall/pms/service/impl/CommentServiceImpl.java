package top.caker.gmall.pms.service.impl;

import org.springframework.stereotype.Component;
import top.caker.gmall.pms.entity.Comment;
import top.caker.gmall.pms.mapper.CommentMapper;
import top.caker.gmall.pms.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.alibaba.dubbo.config.annotation.Service;

/**
 * <p>
 * 商品评价表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
