package com.dao;

import com.entity.ChengyuxuexiLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChengyuxuexiLiuyanView;

/**
 * 成语学习留言 Dao 接口
 *
 * @author 
 */
public interface ChengyuxuexiLiuyanDao extends BaseMapper<ChengyuxuexiLiuyanEntity> {

   List<ChengyuxuexiLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
