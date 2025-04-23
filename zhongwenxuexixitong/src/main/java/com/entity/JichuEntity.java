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
 * 基础
 *
 * @author 
 * @email
 */
@TableName("jichu")
public class JichuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public JichuEntity() {

	}

	public JichuEntity(T t) {
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
     * 基础编号
     */
    @TableField(value = "jichu_uuid_number")

    private String jichuUuidNumber;


    /**
     * 基础名称
     */
    @TableField(value = "jichu_name")

    private String jichuName;


    /**
     * 基础照片
     */
    @TableField(value = "jichu_photo")

    private String jichuPhoto;


    /**
     * 视频
     */
    @TableField(value = "jichu_video")

    private String jichuVideo;


    /**
     * 相关文件
     */
    @TableField(value = "jichu_file")

    private String jichuFile;


    /**
     * 基础类型
     */
    @TableField(value = "jichu_types")

    private Integer jichuTypes;


    /**
     * 点击次数
     */
    @TableField(value = "jichu_clicknum")

    private Integer jichuClicknum;


    /**
     * 基础详情
     */
    @TableField(value = "jichu_content")

    private String jichuContent;


    /**
     * 是否上架
     */
    @TableField(value = "shangxia_types")

    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    @TableField(value = "jichu_delete")

    private Integer jichuDelete;


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
	 * 设置：基础编号
	 */
    public String getJichuUuidNumber() {
        return jichuUuidNumber;
    }


    /**
	 * 获取：基础编号
	 */

    public void setJichuUuidNumber(String jichuUuidNumber) {
        this.jichuUuidNumber = jichuUuidNumber;
    }
    /**
	 * 设置：基础名称
	 */
    public String getJichuName() {
        return jichuName;
    }


    /**
	 * 获取：基础名称
	 */

    public void setJichuName(String jichuName) {
        this.jichuName = jichuName;
    }
    /**
	 * 设置：基础照片
	 */
    public String getJichuPhoto() {
        return jichuPhoto;
    }


    /**
	 * 获取：基础照片
	 */

    public void setJichuPhoto(String jichuPhoto) {
        this.jichuPhoto = jichuPhoto;
    }
    /**
	 * 设置：视频
	 */
    public String getJichuVideo() {
        return jichuVideo;
    }


    /**
	 * 获取：视频
	 */

    public void setJichuVideo(String jichuVideo) {
        this.jichuVideo = jichuVideo;
    }
    /**
	 * 设置：相关文件
	 */
    public String getJichuFile() {
        return jichuFile;
    }


    /**
	 * 获取：相关文件
	 */

    public void setJichuFile(String jichuFile) {
        this.jichuFile = jichuFile;
    }
    /**
	 * 设置：基础类型
	 */
    public Integer getJichuTypes() {
        return jichuTypes;
    }


    /**
	 * 获取：基础类型
	 */

    public void setJichuTypes(Integer jichuTypes) {
        this.jichuTypes = jichuTypes;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getJichuClicknum() {
        return jichuClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setJichuClicknum(Integer jichuClicknum) {
        this.jichuClicknum = jichuClicknum;
    }
    /**
	 * 设置：基础详情
	 */
    public String getJichuContent() {
        return jichuContent;
    }


    /**
	 * 获取：基础详情
	 */

    public void setJichuContent(String jichuContent) {
        this.jichuContent = jichuContent;
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
    public Integer getJichuDelete() {
        return jichuDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setJichuDelete(Integer jichuDelete) {
        this.jichuDelete = jichuDelete;
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
        return "Jichu{" +
            "id=" + id +
            ", jichuUuidNumber=" + jichuUuidNumber +
            ", jichuName=" + jichuName +
            ", jichuPhoto=" + jichuPhoto +
            ", jichuVideo=" + jichuVideo +
            ", jichuFile=" + jichuFile +
            ", jichuTypes=" + jichuTypes +
            ", jichuClicknum=" + jichuClicknum +
            ", jichuContent=" + jichuContent +
            ", shangxiaTypes=" + shangxiaTypes +
            ", jichuDelete=" + jichuDelete +
            ", createTime=" + createTime +
        "}";
    }
}
