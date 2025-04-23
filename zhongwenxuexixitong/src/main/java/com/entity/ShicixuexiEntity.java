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
 * 诗词学习
 *
 * @author 
 * @email
 */
@TableName("shicixuexi")
public class ShicixuexiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShicixuexiEntity() {

	}

	public ShicixuexiEntity(T t) {
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
     * 诗词学习编号
     */
    @TableField(value = "shicixuexi_uuid_number")

    private String shicixuexiUuidNumber;


    /**
     * 成语名称
     */
    @TableField(value = "shicixuexi_name")

    private String shicixuexiName;


    /**
     * 诗词学习照片
     */
    @TableField(value = "shicixuexi_photo")

    private String shicixuexiPhoto;


    /**
     * 视频
     */
    @TableField(value = "shicixuexi_video")

    private String shicixuexiVideo;


    /**
     * 相关文件
     */
    @TableField(value = "shicixuexi_file")

    private String shicixuexiFile;


    /**
     * 诗词学习类型
     */
    @TableField(value = "shicixuexi_types")

    private Integer shicixuexiTypes;


    /**
     * 点击次数
     */
    @TableField(value = "shicixuexi_clicknum")

    private Integer shicixuexiClicknum;


    /**
     * 诗词学习详情
     */
    @TableField(value = "shicixuexi_content")

    private String shicixuexiContent;


    /**
     * 是否上架
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @TableField(value = "shicixuexi_delete")

    private Integer shicixuexiDelete;


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
	 * 设置：诗词学习编号
	 */
    public String getShicixuexiUuidNumber() {
        return shicixuexiUuidNumber;
    }


    /**
	 * 获取：诗词学习编号
	 */

    public void setShicixuexiUuidNumber(String shicixuexiUuidNumber) {
        this.shicixuexiUuidNumber = shicixuexiUuidNumber;
    }
    /**
	 * 设置：成语名称
	 */
    public String getShicixuexiName() {
        return shicixuexiName;
    }


    /**
	 * 获取：成语名称
	 */

    public void setShicixuexiName(String shicixuexiName) {
        this.shicixuexiName = shicixuexiName;
    }
    /**
	 * 设置：诗词学习照片
	 */
    public String getShicixuexiPhoto() {
        return shicixuexiPhoto;
    }


    /**
	 * 获取：诗词学习照片
	 */

    public void setShicixuexiPhoto(String shicixuexiPhoto) {
        this.shicixuexiPhoto = shicixuexiPhoto;
    }
    /**
	 * 设置：视频
	 */
    public String getShicixuexiVideo() {
        return shicixuexiVideo;
    }


    /**
	 * 获取：视频
	 */

    public void setShicixuexiVideo(String shicixuexiVideo) {
        this.shicixuexiVideo = shicixuexiVideo;
    }
    /**
	 * 设置：相关文件
	 */
    public String getShicixuexiFile() {
        return shicixuexiFile;
    }


    /**
	 * 获取：相关文件
	 */

    public void setShicixuexiFile(String shicixuexiFile) {
        this.shicixuexiFile = shicixuexiFile;
    }
    /**
	 * 设置：诗词学习类型
	 */
    public Integer getShicixuexiTypes() {
        return shicixuexiTypes;
    }


    /**
	 * 获取：诗词学习类型
	 */

    public void setShicixuexiTypes(Integer shicixuexiTypes) {
        this.shicixuexiTypes = shicixuexiTypes;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getShicixuexiClicknum() {
        return shicixuexiClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setShicixuexiClicknum(Integer shicixuexiClicknum) {
        this.shicixuexiClicknum = shicixuexiClicknum;
    }
    /**
	 * 设置：诗词学习详情
	 */
    public String getShicixuexiContent() {
        return shicixuexiContent;
    }


    /**
	 * 获取：诗词学习详情
	 */

    public void setShicixuexiContent(String shicixuexiContent) {
        this.shicixuexiContent = shicixuexiContent;
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
    public Integer getShicixuexiDelete() {
        return shicixuexiDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setShicixuexiDelete(Integer shicixuexiDelete) {
        this.shicixuexiDelete = shicixuexiDelete;
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
        return "Shicixuexi{" +
            "id=" + id +
            ", shicixuexiUuidNumber=" + shicixuexiUuidNumber +
            ", shicixuexiName=" + shicixuexiName +
            ", shicixuexiPhoto=" + shicixuexiPhoto +
            ", shicixuexiVideo=" + shicixuexiVideo +
            ", shicixuexiFile=" + shicixuexiFile +
            ", shicixuexiTypes=" + shicixuexiTypes +
            ", shicixuexiClicknum=" + shicixuexiClicknum +
            ", shicixuexiContent=" + shicixuexiContent +
            ", shangxiaTypes=" + shangxiaTypes +
            ", shicixuexiDelete=" + shicixuexiDelete +
            ", createTime=" + createTime +
        "}";
    }
}
