package com.dao;

import com.entity.ShicixuexiLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShicixuexiLiuyanView;

/**
 * 诗词学习留言 Dao 接口
 *
 * @author 
 */
public interface ShicixuexiLiuyanDao extends BaseMapper<ShicixuexiLiuyanEntity> {

   List<ShicixuexiLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
