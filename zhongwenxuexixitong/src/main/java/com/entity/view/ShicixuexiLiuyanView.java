package com.entity.view;

import com.entity.ShicixuexiLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 诗词学习留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shicixuexi_liuyan")
public class ShicixuexiLiuyanView extends ShicixuexiLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 shicixuexi
			/**
			* 诗词学习编号
			*/
			private String shicixuexiUuidNumber;
			/**
			* 成语名称
			*/
			private String shicixuexiName;
			/**
			* 诗词学习照片
			*/
			private String shicixuexiPhoto;
			/**
			* 视频
			*/
			private String shicixuexiVideo;
			/**
			* 相关文件
			*/
			private String shicixuexiFile;
			/**
			* 诗词学习类型
			*/
			private Integer shicixuexiTypes;
				/**
				* 诗词学习类型的值
				*/
				private String shicixuexiValue;
			/**
			* 点击次数
			*/
			private Integer shicixuexiClicknum;
			/**
			* 诗词学习详情
			*/
			private String shicixuexiContent;
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
			private Integer shicixuexiDelete;

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

	public ShicixuexiLiuyanView() {

	}

	public ShicixuexiLiuyanView(ShicixuexiLiuyanEntity shicixuexiLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, shicixuexiLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

















































				//级联表的get和set shicixuexi
					/**
					* 获取： 诗词学习编号
					*/
					public String getShicixuexiUuidNumber() {
						return shicixuexiUuidNumber;
					}
					/**
					* 设置： 诗词学习编号
					*/
					public void setShicixuexiUuidNumber(String shicixuexiUuidNumber) {
						this.shicixuexiUuidNumber = shicixuexiUuidNumber;
					}
					/**
					* 获取： 成语名称
					*/
					public String getShicixuexiName() {
						return shicixuexiName;
					}
					/**
					* 设置： 成语名称
					*/
					public void setShicixuexiName(String shicixuexiName) {
						this.shicixuexiName = shicixuexiName;
					}
					/**
					* 获取： 诗词学习照片
					*/
					public String getShicixuexiPhoto() {
						return shicixuexiPhoto;
					}
					/**
					* 设置： 诗词学习照片
					*/
					public void setShicixuexiPhoto(String shicixuexiPhoto) {
						this.shicixuexiPhoto = shicixuexiPhoto;
					}
					/**
					* 获取： 视频
					*/
					public String getShicixuexiVideo() {
						return shicixuexiVideo;
					}
					/**
					* 设置： 视频
					*/
					public void setShicixuexiVideo(String shicixuexiVideo) {
						this.shicixuexiVideo = shicixuexiVideo;
					}
					/**
					* 获取： 相关文件
					*/
					public String getShicixuexiFile() {
						return shicixuexiFile;
					}
					/**
					* 设置： 相关文件
					*/
					public void setShicixuexiFile(String shicixuexiFile) {
						this.shicixuexiFile = shicixuexiFile;
					}
					/**
					* 获取： 诗词学习类型
					*/
					public Integer getShicixuexiTypes() {
						return shicixuexiTypes;
					}
					/**
					* 设置： 诗词学习类型
					*/
					public void setShicixuexiTypes(Integer shicixuexiTypes) {
						this.shicixuexiTypes = shicixuexiTypes;
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
					* 获取： 点击次数
					*/
					public Integer getShicixuexiClicknum() {
						return shicixuexiClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setShicixuexiClicknum(Integer shicixuexiClicknum) {
						this.shicixuexiClicknum = shicixuexiClicknum;
					}
					/**
					* 获取： 诗词学习详情
					*/
					public String getShicixuexiContent() {
						return shicixuexiContent;
					}
					/**
					* 设置： 诗词学习详情
					*/
					public void setShicixuexiContent(String shicixuexiContent) {
						this.shicixuexiContent = shicixuexiContent;
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
					public Integer getShicixuexiDelete() {
						return shicixuexiDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setShicixuexiDelete(Integer shicixuexiDelete) {
						this.shicixuexiDelete = shicixuexiDelete;
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
