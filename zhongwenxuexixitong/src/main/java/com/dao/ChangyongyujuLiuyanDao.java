package com.dao;

import com.entity.ChangyongyujuLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ChangyongyujuLiuyanView;

/**
 * 常用语句留言 Dao 接口
 *
 * @author 
 */
public interface ChangyongyujuLiuyanDao extends BaseMapper<ChangyongyujuLiuyanEntity> {

   List<ChangyongyujuLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
