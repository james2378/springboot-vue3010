package com.entity.model;

import com.entity.ChengyuxuexiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 成语学习
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ChengyuxuexiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
     * 逻辑删除
     */
    private Integer chengyuxuexiDelete;


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
	 * 获取：成语学习编号
	 */
    public String getChengyuxuexiUuidNumber() {
        return chengyuxuexiUuidNumber;
    }


    /**
	 * 设置：成语学习编号
	 */
    public void setChengyuxuexiUuidNumber(String chengyuxuexiUuidNumber) {
        this.chengyuxuexiUuidNumber = chengyuxuexiUuidNumber;
    }
    /**
	 * 获取：成语名称
	 */
    public String getChengyuxuexiName() {
        return chengyuxuexiName;
    }


    /**
	 * 设置：成语名称
	 */
    public void setChengyuxuexiName(String chengyuxuexiName) {
        this.chengyuxuexiName = chengyuxuexiName;
    }
    /**
	 * 获取：成语学习照片
	 */
    public String getChengyuxuexiPhoto() {
        return chengyuxuexiPhoto;
    }


    /**
	 * 设置：成语学习照片
	 */
    public void setChengyuxuexiPhoto(String chengyuxuexiPhoto) {
        this.chengyuxuexiPhoto = chengyuxuexiPhoto;
    }
    /**
	 * 获取：视频
	 */
    public String getChengyuxuexiVideo() {
        return chengyuxuexiVideo;
    }


    /**
	 * 设置：视频
	 */
    public void setChengyuxuexiVideo(String chengyuxuexiVideo) {
        this.chengyuxuexiVideo = chengyuxuexiVideo;
    }
    /**
	 * 获取：相关文件
	 */
    public String getChengyuxuexiFile() {
        return chengyuxuexiFile;
    }


    /**
	 * 设置：相关文件
	 */
    public void setChengyuxuexiFile(String chengyuxuexiFile) {
        this.chengyuxuexiFile = chengyuxuexiFile;
    }
    /**
	 * 获取：成语学习类型
	 */
    public Integer getChengyuxuexiTypes() {
        return chengyuxuexiTypes;
    }


    /**
	 * 设置：成语学习类型
	 */
    public void setChengyuxuexiTypes(Integer chengyuxuexiTypes) {
        this.chengyuxuexiTypes = chengyuxuexiTypes;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getChengyuxuexiClicknum() {
        return chengyuxuexiClicknum;
    }


    /**
	 * 设置：点击次数
	 */
    public void setChengyuxuexiClicknum(Integer chengyuxuexiClicknum) {
        this.chengyuxuexiClicknum = chengyuxuexiClicknum;
    }
    /**
	 * 获取：成语学习详情
	 */
    public String getChengyuxuexiContent() {
        return chengyuxuexiContent;
    }


    /**
	 * 设置：成语学习详情
	 */
    public void setChengyuxuexiContent(String chengyuxuexiContent) {
        this.chengyuxuexiContent = chengyuxuexiContent;
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
    public Integer getChengyuxuexiDelete() {
        return chengyuxuexiDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setChengyuxuexiDelete(Integer chengyuxuexiDelete) {
        this.chengyuxuexiDelete = chengyuxuexiDelete;
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
