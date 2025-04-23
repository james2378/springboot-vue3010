package com.entity.view;

import com.entity.ChengyuxuexiLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 成语学习留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("chengyuxuexi_liuyan")
public class ChengyuxuexiLiuyanView extends ChengyuxuexiLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 chengyuxuexi
			/**
			* 成语学习编号
			*/
			private String chengyuxuexiUuidNumber;
			/**
			* 成语名称
			*/
			private String chengyuxuexiName;
			/**
			* 成语学习照片
			*/
			private String chengyuxuexiPhoto;
			/**
			* 视频
			*/
			private String chengyuxuexiVideo;
			/**
			* 相关文件
			*/
			private String chengyuxuexiFile;
			/**
			* 成语学习类型
			*/
			private Integer chengyuxuexiTypes;
				/**
				* 成语学习类型的值
				*/
				private String chengyuxuexiValue;
			/**
			* 点击次数
			*/
			private Integer chengyuxuexiClicknum;
			/**
			* 成语学习详情
			*/
			private String chengyuxuexiContent;
			/**
			* 是否上架
			*/
			private Integer shangxiaTypes;
				/**
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer chengyuxuexiDelete;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;

	public ChengyuxuexiLiuyanView() {

	}

	public ChengyuxuexiLiuyanView(ChengyuxuexiLiuyanEntity chengyuxuexiLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, chengyuxuexiLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
















				//级联表的get和set chengyuxuexi
					/**
					* 获取： 成语学习编号
					*/
					public String getChengyuxuexiUuidNumber() {
						return chengyuxuexiUuidNumber;
					}
					/**
					* 设置： 成语学习编号
					*/
					public void setChengyuxuexiUuidNumber(String chengyuxuexiUuidNumber) {
						this.chengyuxuexiUuidNumber = chengyuxuexiUuidNumber;
					}
					/**
					* 获取： 成语名称
					*/
					public String getChengyuxuexiName() {
						return chengyuxuexiName;
					}
					/**
					* 设置： 成语名称
					*/
					public void setChengyuxuexiName(String chengyuxuexiName) {
						this.chengyuxuexiName = chengyuxuexiName;
					}
					/**
					* 获取： 成语学习照片
					*/
					public String getChengyuxuexiPhoto() {
						return chengyuxuexiPhoto;
					}
					/**
					* 设置： 成语学习照片
					*/
					public void setChengyuxuexiPhoto(String chengyuxuexiPhoto) {
						this.chengyuxuexiPhoto = chengyuxuexiPhoto;
					}
					/**
					* 获取： 视频
					*/
					public String getChengyuxuexiVideo() {
						return chengyuxuexiVideo;
					}
					/**
					* 设置： 视频
					*/
					public void setChengyuxuexiVideo(String chengyuxuexiVideo) {
						this.chengyuxuexiVideo = chengyuxuexiVideo;
					}
					/**
					* 获取： 相关文件
					*/
					public String getChengyuxuexiFile() {
						return chengyuxuexiFile;
					}
					/**
					* 设置： 相关文件
					*/
					public void setChengyuxuexiFile(String chengyuxuexiFile) {
						this.chengyuxuexiFile = chengyuxuexiFile;
					}
					/**
					* 获取： 成语学习类型
					*/
					public Integer getChengyuxuexiTypes() {
						return chengyuxuexiTypes;
					}
					/**
					* 设置： 成语学习类型
					*/
					public void setChengyuxuexiTypes(Integer chengyuxuexiTypes) {
						this.chengyuxuexiTypes = chengyuxuexiTypes;
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
					* 获取： 点击次数
					*/
					public Integer getChengyuxuexiClicknum() {
						return chengyuxuexiClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setChengyuxuexiClicknum(Integer chengyuxuexiClicknum) {
						this.chengyuxuexiClicknum = chengyuxuexiClicknum;
					}
					/**
					* 获取： 成语学习详情
					*/
					public String getChengyuxuexiContent() {
						return chengyuxuexiContent;
					}
					/**
					* 设置： 成语学习详情
					*/
					public void setChengyuxuexiContent(String chengyuxuexiContent) {
						this.chengyuxuexiContent = chengyuxuexiContent;
					}
					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
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
					/**
					* 获取： 逻辑删除
					*/
					public Integer getChengyuxuexiDelete() {
						return chengyuxuexiDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setChengyuxuexiDelete(Integer chengyuxuexiDelete) {
						this.chengyuxuexiDelete = chengyuxuexiDelete;
					}











































				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}



}
