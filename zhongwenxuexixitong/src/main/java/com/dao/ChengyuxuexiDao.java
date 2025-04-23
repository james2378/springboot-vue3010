package com.dao;

import com.entity.ChengyuxuexiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChengyuxuexiView;

/**
 * 成语学习 Dao 接口
 *
 * @author 
 */
public interface ChengyuxuexiDao extends BaseMapper<ChengyuxuexiEntity> {

   List<ChengyuxuexiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
