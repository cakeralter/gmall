package top.caker.gmall.pms.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Component;
import top.caker.gmall.pms.entity.Album;
import top.caker.gmall.pms.mapper.AlbumMapper;
import top.caker.gmall.pms.service.AlbumService;

/**
 * <p>
 * 相册表 服务实现类
 * </p>
 *
 * @author Lfy
 * @since 2020-05-12
 */
@Component
@Service
public class AlbumServiceImpl extends ServiceImpl<AlbumMapper, Album> implements AlbumService {

}
