package com.entity.model;

import com.entity.QingjingxuexiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 情景学习
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class QingjingxuexiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
     * 逻辑删除
     */
    private Integer qingjingxuexiDelete;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：情景学习编号
	 */
    public String getQingjingxuexiUuidNumber() {
        return qingjingxuexiUuidNumber;
    }


    /**
	 * 设置：情景学习编号
	 */
    public void setQingjingxuexiUuidNumber(String qingjingxuexiUuidNumber) {
        this.qingjingxuexiUuidNumber = qingjingxuexiUuidNumber;
    }
    /**
	 * 获取：情景学习名称
	 */
    public String getQingjingxuexiName() {
        return qingjingxuexiName;
    }


    /**
	 * 设置：情景学习名称
	 */
    public void setQingjingxuexiName(String qingjingxuexiName) {
        this.qingjingxuexiName = qingjingxuexiName;
    }
    /**
	 * 获取：情景学习照片
	 */
    public String getQingjingxuexiPhoto() {
        return qingjingxuexiPhoto;
    }


    /**
	 * 设置：情景学习照片
	 */
    public void setQingjingxuexiPhoto(String qingjingxuexiPhoto) {
        this.qingjingxuexiPhoto = qingjingxuexiPhoto;
    }
    /**
	 * 获取：视频
	 */
    public String getQingjingxuexiVideo() {
        return qingjingxuexiVideo;
    }


    /**
	 * 设置：视频
	 */
    public void setQingjingxuexiVideo(String qingjingxuexiVideo) {
        this.qingjingxuexiVideo = qingjingxuexiVideo;
    }
    /**
	 * 获取：相关文件
	 */
    public String getQingjingxuexiFile() {
        return qingjingxuexiFile;
    }


    /**
	 * 设置：相关文件
	 */
    public void setQingjingxuexiFile(String qingjingxuexiFile) {
        this.qingjingxuexiFile = qingjingxuexiFile;
    }
    /**
	 * 获取：情景学习类型
	 */
    public Integer getQingjingxuexiTypes() {
        return qingjingxuexiTypes;
    }


    /**
	 * 设置：情景学习类型
	 */
    public void setQingjingxuexiTypes(Integer qingjingxuexiTypes) {
        this.qingjingxuexiTypes = qingjingxuexiTypes;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getQingjingxuexiClicknum() {
        return qingjingxuexiClicknum;
    }


    /**
	 * 设置：点击次数
	 */
    public void setQingjingxuexiClicknum(Integer qingjingxuexiClicknum) {
        this.qingjingxuexiClicknum = qingjingxuexiClicknum;
    }
    /**
	 * 获取：情景学习详情
	 */
    public String getQingjingxuexiContent() {
        return qingjingxuexiContent;
    }


    /**
	 * 设置：情景学习详情
	 */
    public void setQingjingxuexiContent(String qingjingxuexiContent) {
        this.qingjingxuexiContent = qingjingxuexiContent;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 设置：是否上架
	 */
    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getQingjingxuexiDelete() {
        return qingjingxuexiDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setQingjingxuexiDelete(Integer qingjingxuexiDelete) {
        this.qingjingxuexiDelete = qingjingxuexiDelete;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
