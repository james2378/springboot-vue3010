package com.dao;

import com.entity.QingjingxuexiLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.QingjingxuexiLiuyanView;

/**
 * 情景学习留言 Dao 接口
 *
 * @author 
 */
public interface QingjingxuexiLiuyanDao extends BaseMapper<QingjingxuexiLiuyanEntity> {

   List<QingjingxuexiLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
