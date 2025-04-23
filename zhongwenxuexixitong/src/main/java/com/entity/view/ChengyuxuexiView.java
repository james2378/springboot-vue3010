package com.entity.view;

import com.entity.ChengyuxuexiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 成语学习
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("chengyuxuexi")
public class ChengyuxuexiView extends ChengyuxuexiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 成语学习类型的值
		*/
		private String chengyuxuexiValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public ChengyuxuexiView() {

	}

	public ChengyuxuexiView(ChengyuxuexiEntity chengyuxuexiEntity) {
		try {
			BeanUtils.copyProperties(this, chengyuxuexiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 成语学习类型的值
			*/
			public String getChengyuxuexiValue() {
				return chengyuxuexiValue;
			}
			/**
			* 设置： 成语学习类型的值
			*/
			public void setChengyuxuexiValue(String chengyuxuexiValue) {
				this.chengyuxuexiValue = chengyuxuexiValue;
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
