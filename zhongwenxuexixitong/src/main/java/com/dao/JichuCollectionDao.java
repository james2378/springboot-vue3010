package com.dao;

import com.entity.JichuCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.JichuCollectionView;

/**
 * 基础收藏 Dao 接口
 *
 * @author 
 */
public interface JichuCollectionDao extends BaseMapper<JichuCollectionEntity> {

   List<JichuCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
