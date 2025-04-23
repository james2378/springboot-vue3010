package com.dao;

import com.entity.JichuLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JichuLiuyanView;

/**
 * 基础留言 Dao 接口
 *
 * @author 
 */
public interface JichuLiuyanDao extends BaseMapper<JichuLiuyanEntity> {

   List<JichuLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
