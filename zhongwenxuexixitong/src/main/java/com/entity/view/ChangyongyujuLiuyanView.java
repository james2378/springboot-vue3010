package com.entity.view;

import com.entity.ChangyongyujuLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 常用语句留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("changyongyuju_liuyan")
public class ChangyongyujuLiuyanView extends ChangyongyujuLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 changyongyuju
			/**
			* 常用语句编号
			*/
			private String changyongyujuUuidNumber;
			/**
			* 常用语句名称
			*/
			private String changyongyujuName;
			/**
			* 常用语句照片
			*/
			private String changyongyujuPhoto;
			/**
			* 视频
			*/
			private String changyongyujuVideo;
			/**
			* 发音
			*/
			private String changyongyujuMusic;
			/**
			* 相关文件
			*/
			private String changyongyujuFile;
			/**
			* 常用语句类型
			*/
			private Integer changyongyujuTypes;
				/**
				* 常用语句类型的值
				*/
				private String changyongyujuValue;
			/**
			* 点击次数
			*/
			private Integer changyongyujuClicknum;
			/**
			* 常用语句详情
			*/
			private String changyongyujuContent;
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
			private Integer changyongyujuDelete;

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

	public ChangyongyujuLiuyanView() {

	}

	public ChangyongyujuLiuyanView(ChangyongyujuLiuyanEntity changyongyujuLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, changyongyujuLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}







				//级联表的get和set changyongyuju
					/**
					* 获取： 常用语句编号
					*/
					public String getChangyongyujuUuidNumber() {
						return changyongyujuUuidNumber;
					}
					/**
					* 设置： 常用语句编号
					*/
					public void setChangyongyujuUuidNumber(String changyongyujuUuidNumber) {
						this.changyongyujuUuidNumber = changyongyujuUuidNumber;
					}
					/**
					* 获取： 常用语句名称
					*/
					public String getChangyongyujuName() {
						return changyongyujuName;
					}
					/**
					* 设置： 常用语句名称
					*/
					public void setChangyongyujuName(String changyongyujuName) {
						this.changyongyujuName = changyongyujuName;
					}
					/**
					* 获取： 常用语句照片
					*/
					public String getChangyongyujuPhoto() {
						return changyongyujuPhoto;
					}
					/**
					* 设置： 常用语句照片
					*/
					public void setChangyongyujuPhoto(String changyongyujuPhoto) {
						this.changyongyujuPhoto = changyongyujuPhoto;
					}
					/**
					* 获取： 视频
					*/
					public String getChangyongyujuVideo() {
						return changyongyujuVideo;
					}
					/**
					* 设置： 视频
					*/
					public void setChangyongyujuVideo(String changyongyujuVideo) {
						this.changyongyujuVideo = changyongyujuVideo;
					}
					/**
					* 获取： 发音
					*/
					public String getChangyongyujuMusic() {
						return changyongyujuMusic;
					}
					/**
					* 设置： 发音
					*/
					public void setChangyongyujuMusic(String changyongyujuMusic) {
						this.changyongyujuMusic = changyongyujuMusic;
					}
					/**
					* 获取： 相关文件
					*/
					public String getChangyongyujuFile() {
						return changyongyujuFile;
					}
					/**
					* 设置： 相关文件
					*/
					public void setChangyongyujuFile(String changyongyujuFile) {
						this.changyongyujuFile = changyongyujuFile;
					}
					/**
					* 获取： 常用语句类型
					*/
					public Integer getChangyongyujuTypes() {
						return changyongyujuTypes;
					}
					/**
					* 设置： 常用语句类型
					*/
					public void setChangyongyujuTypes(Integer changyongyujuTypes) {
						this.changyongyujuTypes = changyongyujuTypes;
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
					* 获取： 点击次数
					*/
					public Integer getChangyongyujuClicknum() {
						return changyongyujuClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setChangyongyujuClicknum(Integer changyongyujuClicknum) {
						this.changyongyujuClicknum = changyongyujuClicknum;
					}
					/**
					* 获取： 常用语句详情
					*/
					public String getChangyongyujuContent() {
						return changyongyujuContent;
					}
					/**
					* 设置： 常用语句详情
					*/
					public void setChangyongyujuContent(String changyongyujuContent) {
						this.changyongyujuContent = changyongyujuContent;
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
					public Integer getChangyongyujuDelete() {
						return changyongyujuDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setChangyongyujuDelete(Integer changyongyujuDelete) {
						this.changyongyujuDelete = changyongyujuDelete;
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
