package com.entity.view;

import com.entity.JichuLiuyanEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 基础留言
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("jichu_liuyan")
public class JichuLiuyanView extends JichuLiuyanEntity implements Serializable {
    private static final long serialVersionUID = 1L;




		//级联表 jichu
			/**
			* 基础编号
			*/
			private String jichuUuidNumber;
			/**
			* 基础名称
			*/
			private String jichuName;
			/**
			* 基础照片
			*/
			private String jichuPhoto;
			/**
			* 视频
			*/
			private String jichuVideo;
			/**
			* 相关文件
			*/
			private String jichuFile;
			/**
			* 基础类型
			*/
			private Integer jichuTypes;
				/**
				* 基础类型的值
				*/
				private String jichuValue;
			/**
			* 点击次数
			*/
			private Integer jichuClicknum;
			/**
			* 基础详情
			*/
			private String jichuContent;
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
			private Integer jichuDelete;

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

	public JichuLiuyanView() {

	}

	public JichuLiuyanView(JichuLiuyanEntity jichuLiuyanEntity) {
		try {
			BeanUtils.copyProperties(this, jichuLiuyanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}































				//级联表的get和set jichu
					/**
					* 获取： 基础编号
					*/
					public String getJichuUuidNumber() {
						return jichuUuidNumber;
					}
					/**
					* 设置： 基础编号
					*/
					public void setJichuUuidNumber(String jichuUuidNumber) {
						this.jichuUuidNumber = jichuUuidNumber;
					}
					/**
					* 获取： 基础名称
					*/
					public String getJichuName() {
						return jichuName;
					}
					/**
					* 设置： 基础名称
					*/
					public void setJichuName(String jichuName) {
						this.jichuName = jichuName;
					}
					/**
					* 获取： 基础照片
					*/
					public String getJichuPhoto() {
						return jichuPhoto;
					}
					/**
					* 设置： 基础照片
					*/
					public void setJichuPhoto(String jichuPhoto) {
						this.jichuPhoto = jichuPhoto;
					}
					/**
					* 获取： 视频
					*/
					public String getJichuVideo() {
						return jichuVideo;
					}
					/**
					* 设置： 视频
					*/
					public void setJichuVideo(String jichuVideo) {
						this.jichuVideo = jichuVideo;
					}
					/**
					* 获取： 相关文件
					*/
					public String getJichuFile() {
						return jichuFile;
					}
					/**
					* 设置： 相关文件
					*/
					public void setJichuFile(String jichuFile) {
						this.jichuFile = jichuFile;
					}
					/**
					* 获取： 基础类型
					*/
					public Integer getJichuTypes() {
						return jichuTypes;
					}
					/**
					* 设置： 基础类型
					*/
					public void setJichuTypes(Integer jichuTypes) {
						this.jichuTypes = jichuTypes;
					}


						/**
						* 获取： 基础类型的值
						*/
						public String getJichuValue() {
							return jichuValue;
						}
						/**
						* 设置： 基础类型的值
						*/
						public void setJichuValue(String jichuValue) {
							this.jichuValue = jichuValue;
						}
					/**
					* 获取： 点击次数
					*/
					public Integer getJichuClicknum() {
						return jichuClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setJichuClicknum(Integer jichuClicknum) {
						this.jichuClicknum = jichuClicknum;
					}
					/**
					* 获取： 基础详情
					*/
					public String getJichuContent() {
						return jichuContent;
					}
					/**
					* 设置： 基础详情
					*/
					public void setJichuContent(String jichuContent) {
						this.jichuContent = jichuContent;
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
					public Integer getJichuDelete() {
						return jichuDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setJichuDelete(Integer jichuDelete) {
						this.jichuDelete = jichuDelete;
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
