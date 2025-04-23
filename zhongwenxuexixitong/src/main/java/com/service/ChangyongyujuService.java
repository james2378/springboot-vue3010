package com.service;

import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChangyongyujuEntity;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

/**
 * 常用语句 服务类
 */
public interface ChangyongyujuService extends IService<ChangyongyujuEntity> {

    /**
    * @param params 查询参数
    * @return 带分页的查询出来的数据
    */
     PageUtils queryPage(Map<String, Object> params);
}