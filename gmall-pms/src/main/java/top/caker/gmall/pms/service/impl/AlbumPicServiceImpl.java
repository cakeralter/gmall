package top.caker.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;
import top.caker.gmall.pms.entity.AlbumPic;
import top.caker.gmall.pms.mapper.AlbumPicMapper;
import top.caker.gmall.pms.service.AlbumPicService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * <p>
 * 画册图片表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class AlbumPicServiceImpl extends ServiceImpl<AlbumPicMapper, AlbumPic> implements AlbumPicService {

}
