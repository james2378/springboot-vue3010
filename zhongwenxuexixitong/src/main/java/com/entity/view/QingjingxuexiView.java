package com.entity.view;

import com.entity.QingjingxuexiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 情景学习
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("qingjingxuexi")
public class QingjingxuexiView extends QingjingxuexiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 情景学习类型的值
		*/
		private String qingjingxuexiValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public QingjingxuexiView() {

	}

	public QingjingxuexiView(QingjingxuexiEntity qingjingxuexiEntity) {
		try {
			BeanUtils.copyProperties(this, qingjingxuexiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 情景学习类型的值
			*/
			public String getQingjingxuexiValue() {
				return qingjingxuexiValue;
			}
			/**
			* 设置： 情景学习类型的值
			*/
			public void setQingjingxuexiValue(String qingjingxuexiValue) {
				this.qingjingxuexiValue = qingjingxuexiValue;
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
