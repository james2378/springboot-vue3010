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
 * 成语学习
 *
 * @author 
 * @email
 */
@TableName("chengyuxuexi")
public class ChengyuxuexiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ChengyuxuexiEntity() {

	}

	public ChengyuxuexiEntity(T t) {
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
     * 成语学习编号
     */
    @TableField(value = "chengyuxuexi_uuid_number")

    private String chengyuxuexiUuidNumber;


    /**
     * 成语名称
     */
    @TableField(value = "chengyuxuexi_name")

    private String chengyuxuexiName;


    /**
     * 成语学习照片
     */
    @TableField(value = "chengyuxuexi_photo")

    private String chengyuxuexiPhoto;


    /**
     * 视频
     */
    @TableField(value = "chengyuxuexi_video")

    private String chengyuxuexiVideo;


    /**
     * 相关文件
     */
    @TableField(value = "chengyuxuexi_file")

    private String chengyuxuexiFile;


    /**
     * 成语学习类型
     */
    @TableField(value = "chengyuxuexi_types")

    private Integer chengyuxuexiTypes;


    /**
     * 点击次数
     */
    @TableField(value = "chengyuxuexi_clicknum")

    private Integer chengyuxuexiClicknum;


    /**
     * 成语学习详情
     */
    @TableField(value = "chengyuxuexi_content")

    private String chengyuxuexiContent;


    /**
     * 是否上架
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @TableField(value = "chengyuxuexi_delete")

    private Integer chengyuxuexiDelete;


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
	 * 设置：成语学习编号
	 */
    public String getChengyuxuexiUuidNumber() {
        return chengyuxuexiUuidNumber;
    }


    /**
	 * 获取：成语学习编号
	 */

    public void setChengyuxuexiUuidNumber(String chengyuxuexiUuidNumber) {
        this.chengyuxuexiUuidNumber = chengyuxuexiUuidNumber;
    }
    /**
	 * 设置：成语名称
	 */
    public String getChengyuxuexiName() {
        return chengyuxuexiName;
    }


    /**
	 * 获取：成语名称
	 */

    public void setChengyuxuexiName(String chengyuxuexiName) {
        this.chengyuxuexiName = chengyuxuexiName;
    }
    /**
	 * 设置：成语学习照片
	 */
    public String getChengyuxuexiPhoto() {
        return chengyuxuexiPhoto;
    }


    /**
	 * 获取：成语学习照片
	 */

    public void setChengyuxuexiPhoto(String chengyuxuexiPhoto) {
        this.chengyuxuexiPhoto = chengyuxuexiPhoto;
    }
    /**
	 * 设置：视频
	 */
    public String getChengyuxuexiVideo() {
        return chengyuxuexiVideo;
    }


    /**
	 * 获取：视频
	 */

    public void setChengyuxuexiVideo(String chengyuxuexiVideo) {
        this.chengyuxuexiVideo = chengyuxuexiVideo;
    }
    /**
	 * 设置：相关文件
	 */
    public String getChengyuxuexiFile() {
        return chengyuxuexiFile;
    }


    /**
	 * 获取：相关文件
	 */

    public void setChengyuxuexiFile(String chengyuxuexiFile) {
        this.chengyuxuexiFile = chengyuxuexiFile;
    }
    /**
	 * 设置：成语学习类型
	 */
    public Integer getChengyuxuexiTypes() {
        return chengyuxuexiTypes;
    }


    /**
	 * 获取：成语学习类型
	 */

    public void setChengyuxuexiTypes(Integer chengyuxuexiTypes) {
        this.chengyuxuexiTypes = chengyuxuexiTypes;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getChengyuxuexiClicknum() {
        return chengyuxuexiClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setChengyuxuexiClicknum(Integer chengyuxuexiClicknum) {
        this.chengyuxuexiClicknum = chengyuxuexiClicknum;
    }
    /**
	 * 设置：成语学习详情
	 */
    public String getChengyuxuexiContent() {
        return chengyuxuexiContent;
    }


    /**
	 * 获取：成语学习详情
	 */

    public void setChengyuxuexiContent(String chengyuxuexiContent) {
        this.chengyuxuexiContent = chengyuxuexiContent;
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
    public Integer getChengyuxuexiDelete() {
        return chengyuxuexiDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setChengyuxuexiDelete(Integer chengyuxuexiDelete) {
        this.chengyuxuexiDelete = chengyuxuexiDelete;
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
        return "Chengyuxuexi{" +
            "id=" + id +
            ", chengyuxuexiUuidNumber=" + chengyuxuexiUuidNumber +
            ", chengyuxuexiName=" + chengyuxuexiName +
            ", chengyuxuexiPhoto=" + chengyuxuexiPhoto +
            ", chengyuxuexiVideo=" + chengyuxuexiVideo +
            ", chengyuxuexiFile=" + chengyuxuexiFile +
            ", chengyuxuexiTypes=" + chengyuxuexiTypes +
            ", chengyuxuexiClicknum=" + chengyuxuexiClicknum +
            ", chengyuxuexiContent=" + chengyuxuexiContent +
            ", shangxiaTypes=" + shangxiaTypes +
            ", chengyuxuexiDelete=" + chengyuxuexiDelete +
            ", createTime=" + createTime +
        "}";
    }
}
