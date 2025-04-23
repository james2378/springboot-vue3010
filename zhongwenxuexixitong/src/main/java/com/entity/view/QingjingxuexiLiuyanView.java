package com.entity.view;

import com.entity.QingjingxuexiLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 情景学习留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("qingjingxuexi_liuyan")
public class QingjingxuexiLiuyanView extends QingjingxuexiLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 qingjingxuexi
			/**
			* 情景学习编号
			*/
			private String qingjingxuexiUuidNumber;
			/**
			* 情景学习名称
			*/
			private String qingjingxuexiName;
			/**
			* 情景学习照片
			*/
			private String qingjingxuexiPhoto;
			/**
			* 视频
			*/
			private String qingjingxuexiVideo;
			/**
			* 相关文件
			*/
			private String qingjingxuexiFile;
			/**
			* 情景学习类型
			*/
			private Integer qingjingxuexiTypes;
				/**
				* 情景学习类型的值
				*/
				private String qingjingxuexiValue;
			/**
			* 点击次数
			*/
			private Integer qingjingxuexiClicknum;
			/**
			* 情景学习详情
			*/
			private String qingjingxuexiContent;
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
			private Integer qingjingxuexiDelete;

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

	public QingjingxuexiLiuyanView() {

	}

	public QingjingxuexiLiuyanView(QingjingxuexiLiuyanEntity qingjingxuexiLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, qingjingxuexiLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}








































				//级联表的get和set qingjingxuexi
					/**
					* 获取： 情景学习编号
					*/
					public String getQingjingxuexiUuidNumber() {
						return qingjingxuexiUuidNumber;
					}
					/**
					* 设置： 情景学习编号
					*/
					public void setQingjingxuexiUuidNumber(String qingjingxuexiUuidNumber) {
						this.qingjingxuexiUuidNumber = qingjingxuexiUuidNumber;
					}
					/**
					* 获取： 情景学习名称
					*/
					public String getQingjingxuexiName() {
						return qingjingxuexiName;
					}
					/**
					* 设置： 情景学习名称
					*/
					public void setQingjingxuexiName(String qingjingxuexiName) {
						this.qingjingxuexiName = qingjingxuexiName;
					}
					/**
					* 获取： 情景学习照片
					*/
					public String getQingjingxuexiPhoto() {
						return qingjingxuexiPhoto;
					}
					/**
					* 设置： 情景学习照片
					*/
					public void setQingjingxuexiPhoto(String qingjingxuexiPhoto) {
						this.qingjingxuexiPhoto = qingjingxuexiPhoto;
					}
					/**
					* 获取： 视频
					*/
					public String getQingjingxuexiVideo() {
						return qingjingxuexiVideo;
					}
					/**
					* 设置： 视频
					*/
					public void setQingjingxuexiVideo(String qingjingxuexiVideo) {
						this.qingjingxuexiVideo = qingjingxuexiVideo;
					}
					/**
					* 获取： 相关文件
					*/
					public String getQingjingxuexiFile() {
						return qingjingxuexiFile;
					}
					/**
					* 设置： 相关文件
					*/
					public void setQingjingxuexiFile(String qingjingxuexiFile) {
						this.qingjingxuexiFile = qingjingxuexiFile;
					}
					/**
					* 获取： 情景学习类型
					*/
					public Integer getQingjingxuexiTypes() {
						return qingjingxuexiTypes;
					}
					/**
					* 设置： 情景学习类型
					*/
					public void setQingjingxuexiTypes(Integer qingjingxuexiTypes) {
						this.qingjingxuexiTypes = qingjingxuexiTypes;
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
					* 获取： 点击次数
					*/
					public Integer getQingjingxuexiClicknum() {
						return qingjingxuexiClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setQingjingxuexiClicknum(Integer qingjingxuexiClicknum) {
						this.qingjingxuexiClicknum = qingjingxuexiClicknum;
					}
					/**
					* 获取： 情景学习详情
					*/
					public String getQingjingxuexiContent() {
						return qingjingxuexiContent;
					}
					/**
					* 设置： 情景学习详情
					*/
					public void setQingjingxuexiContent(String qingjingxuexiContent) {
						this.qingjingxuexiContent = qingjingxuexiContent;
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
					public Integer getQingjingxuexiDelete() {
						return qingjingxuexiDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setQingjingxuexiDelete(Integer qingjingxuexiDelete) {
						this.qingjingxuexiDelete = qingjingxuexiDelete;
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
