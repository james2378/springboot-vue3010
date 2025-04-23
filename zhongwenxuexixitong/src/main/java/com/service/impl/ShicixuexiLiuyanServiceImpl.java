package com.service.impl;

import com.utils.StringUtil;
import org.springframework.stereotype.Service;
import java.lang.reflect.Field;
import java.util.*;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.transaction.annotation.Transactional;
import com.utils.PageUtils;
import com.utils.Query;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import com.dao.ShicixuexiLiuyanDao;
import com.entity.ShicixuexiLiuyanEntity;
import com.service.ShicixuexiLiuyanService;
import com.entity.view.ShicixuexiLiuyanView;

/**
 * 诗词学习留言 服务实现类
 */
@Service("shicixuexiLiuyanService")
@Transactional
public class ShicixuexiLiuyanServiceImpl extends ServiceImpl<ShicixuexiLiuyanDao, ShicixuexiLiuyanEntity> implements ShicixuexiLiuyanService {

    @Override
    public PageUtils queryPage(Map<String,Object> params) {
        if(params != null && (params.get("limit") == null || params.get("page") == null)){
            params.put("page","1");
            params.put("limit","10");
        }
        Page<ShicixuexiLiuyanView> page =new Query<ShicixuexiLiuyanView>(params).getPage();
        page.setRecords(baseMapper.selectListView(page,params));
        return new PageUtils(page);
    }


}
