package com.entity.view;

import com.entity.ChangyongyujuEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 常用语句
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("changyongyuju")
public class ChangyongyujuView extends ChangyongyujuEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 常用语句类型的值
		*/
		private String changyongyujuValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public ChangyongyujuView() {

	}

	public ChangyongyujuView(ChangyongyujuEntity changyongyujuEntity) {
		try {
			BeanUtils.copyProperties(this, changyongyujuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 常用语句类型的值
			*/
			public String getChangyongyujuValue() {
				return changyongyujuValue;
			}
			/**
			* 设置： 常用语句类型的值
			*/
			public void setChangyongyujuValue(String changyongyujuValue) {
				this.changyongyujuValue = changyongyujuValue;
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
