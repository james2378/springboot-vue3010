package com.dao;

import com.entity.QingjingxuexiCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.QingjingxuexiCollectionView;

/**
 * 情景学习收藏 Dao 接口
 *
 * @author 
 */
public interface QingjingxuexiCollectionDao extends BaseMapper<QingjingxuexiCollectionEntity> {

   List<QingjingxuexiCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
