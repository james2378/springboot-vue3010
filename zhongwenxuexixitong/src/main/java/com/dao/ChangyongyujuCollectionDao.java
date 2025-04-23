package com.dao;

import com.entity.ChangyongyujuCollectionEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChangyongyujuCollectionView;

/**
 * 常用语句收藏 Dao 接口
 *
 * @author 
 */
public interface ChangyongyujuCollectionDao extends BaseMapper<ChangyongyujuCollectionEntity> {

   List<ChangyongyujuCollectionView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
