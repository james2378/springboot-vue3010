package com.entity.view;

import com.entity.ShicixuexiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 诗词学习
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shicixuexi")
public class ShicixuexiView extends ShicixuexiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 诗词学习类型的值
		*/
		private String shicixuexiValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public ShicixuexiView() {

	}

	public ShicixuexiView(ShicixuexiEntity shicixuexiEntity) {
		try {
			BeanUtils.copyProperties(this, shicixuexiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 诗词学习类型的值
			*/
			public String getShicixuexiValue() {
				return shicixuexiValue;
			}
			/**
			* 设置： 诗词学习类型的值
			*/
			public void setShicixuexiValue(String shicixuexiValue) {
				this.shicixuexiValue = shicixuexiValue;
			}
			/**
			* 获取： 是否上架的值
			*/
			public String getShangxiaValue() {
				return shangxiaValue;
			}
			/**
			* 设置： 是否上架的值
			*/
			public void setShangxiaValue(String shangxiaValue) {
				this.shangxiaValue = shangxiaValue;
			}





















}
