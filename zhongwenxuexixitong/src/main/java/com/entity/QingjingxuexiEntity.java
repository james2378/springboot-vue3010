package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 情景学习
 *
 * @author 
 * @email
 */
@TableName("qingjingxuexi")
public class QingjingxuexiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public QingjingxuexiEntity() {

	}

	public QingjingxuexiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 情景学习编号
     */
    @TableField(value = "qingjingxuexi_uuid_number")

    private String qingjingxuexiUuidNumber;


    /**
     * 情景学习名称
     */
    @TableField(value = "qingjingxuexi_name")

    private String qingjingxuexiName;


    /**
     * 情景学习照片
     */
    @TableField(value = "qingjingxuexi_photo")

    private String qingjingxuexiPhoto;


    /**
     * 视频
     */
    @TableField(value = "qingjingxuexi_video")

    private String qingjingxuexiVideo;


    /**
     * 相关文件
     */
    @TableField(value = "qingjingxuexi_file")

    private String qingjingxuexiFile;


    /**
     * 情景学习类型
     */
    @TableField(value = "qingjingxuexi_types")

    private Integer qingjingxuexiTypes;


    /**
     * 点击次数
     */
    @TableField(value = "qingjingxuexi_clicknum")

    private Integer qingjingxuexiClicknum;


    /**
     * 情景学习详情
     */
    @TableField(value = "qingjingxuexi_content")

    private String qingjingxuexiContent;


    /**
     * 是否上架
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @TableField(value = "qingjingxuexi_delete")

    private Integer qingjingxuexiDelete;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：情景学习编号
	 */
    public String getQingjingxuexiUuidNumber() {
        return qingjingxuexiUuidNumber;
    }


    /**
	 * 获取：情景学习编号
	 */

    public void setQingjingxuexiUuidNumber(String qingjingxuexiUuidNumber) {
        this.qingjingxuexiUuidNumber = qingjingxuexiUuidNumber;
    }
    /**
	 * 设置：情景学习名称
	 */
    public String getQingjingxuexiName() {
        return qingjingxuexiName;
    }


    /**
	 * 获取：情景学习名称
	 */

    public void setQingjingxuexiName(String qingjingxuexiName) {
        this.qingjingxuexiName = qingjingxuexiName;
    }
    /**
	 * 设置：情景学习照片
	 */
    public String getQingjingxuexiPhoto() {
        return qingjingxuexiPhoto;
    }


    /**
	 * 获取：情景学习照片
	 */

    public void setQingjingxuexiPhoto(String qingjingxuexiPhoto) {
        this.qingjingxuexiPhoto = qingjingxuexiPhoto;
    }
    /**
	 * 设置：视频
	 */
    public String getQingjingxuexiVideo() {
        return qingjingxuexiVideo;
    }


    /**
	 * 获取：视频
	 */

    public void setQingjingxuexiVideo(String qingjingxuexiVideo) {
        this.qingjingxuexiVideo = qingjingxuexiVideo;
    }
    /**
	 * 设置：相关文件
	 */
    public String getQingjingxuexiFile() {
        return qingjingxuexiFile;
    }


    /**
	 * 获取：相关文件
	 */

    public void setQingjingxuexiFile(String qingjingxuexiFile) {
        this.qingjingxuexiFile = qingjingxuexiFile;
    }
    /**
	 * 设置：情景学习类型
	 */
    public Integer getQingjingxuexiTypes() {
        return qingjingxuexiTypes;
    }


    /**
	 * 获取：情景学习类型
	 */

    public void setQingjingxuexiTypes(Integer qingjingxuexiTypes) {
        this.qingjingxuexiTypes = qingjingxuexiTypes;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getQingjingxuexiClicknum() {
        return qingjingxuexiClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setQingjingxuexiClicknum(Integer qingjingxuexiClicknum) {
        this.qingjingxuexiClicknum = qingjingxuexiClicknum;
    }
    /**
	 * 设置：情景学习详情
	 */
    public String getQingjingxuexiContent() {
        return qingjingxuexiContent;
    }


    /**
	 * 获取：情景学习详情
	 */

    public void setQingjingxuexiContent(String qingjingxuexiContent) {
        this.qingjingxuexiContent = qingjingxuexiContent;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getQingjingxuexiDelete() {
        return qingjingxuexiDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setQingjingxuexiDelete(Integer qingjingxuexiDelete) {
        this.qingjingxuexiDelete = qingjingxuexiDelete;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Qingjingxuexi{" +
            "id=" + id +
            ", qingjingxuexiUuidNumber=" + qingjingxuexiUuidNumber +
            ", qingjingxuexiName=" + qingjingxuexiName +
            ", qingjingxuexiPhoto=" + qingjingxuexiPhoto +
            ", qingjingxuexiVideo=" + qingjingxuexiVideo +
            ", qingjingxuexiFile=" + qingjingxuexiFile +
            ", qingjingxuexiTypes=" + qingjingxuexiTypes +
            ", qingjingxuexiClicknum=" + qingjingxuexiClicknum +
            ", qingjingxuexiContent=" + qingjingxuexiContent +
            ", shangxiaTypes=" + shangxiaTypes +
            ", qingjingxuexiDelete=" + qingjingxuexiDelete +
            ", createTime=" + createTime +
        "}";
    }
}
