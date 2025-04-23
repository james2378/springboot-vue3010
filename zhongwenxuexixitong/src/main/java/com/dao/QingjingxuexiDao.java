package com.dao;

import com.entity.QingjingxuexiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.QingjingxuexiView;

/**
 * 情景学习 Dao 接口
 *
 * @author 
 */
public interface QingjingxuexiDao extends BaseMapper<QingjingxuexiEntity> {

   List<QingjingxuexiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
