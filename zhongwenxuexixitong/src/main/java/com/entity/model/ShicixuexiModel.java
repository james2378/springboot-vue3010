package com.entity.model;

import com.entity.ShicixuexiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 诗词学习
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShicixuexiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


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
     * 逻辑删除
     */
    private Integer shicixuexiDelete;


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
	 * 获取：诗词学习编号
	 */
    public String getShicixuexiUuidNumber() {
        return shicixuexiUuidNumber;
    }


    /**
	 * 设置：诗词学习编号
	 */
    public void setShicixuexiUuidNumber(String shicixuexiUuidNumber) {
        this.shicixuexiUuidNumber = shicixuexiUuidNumber;
    }
    /**
	 * 获取：成语名称
	 */
    public String getShicixuexiName() {
        return shicixuexiName;
    }


    /**
	 * 设置：成语名称
	 */
    public void setShicixuexiName(String shicixuexiName) {
        this.shicixuexiName = shicixuexiName;
    }
    /**
	 * 获取：诗词学习照片
	 */
    public String getShicixuexiPhoto() {
        return shicixuexiPhoto;
    }


    /**
	 * 设置：诗词学习照片
	 */
    public void setShicixuexiPhoto(String shicixuexiPhoto) {
        this.shicixuexiPhoto = shicixuexiPhoto;
    }
    /**
	 * 获取：视频
	 */
    public String getShicixuexiVideo() {
        return shicixuexiVideo;
    }


    /**
	 * 设置：视频
	 */
    public void setShicixuexiVideo(String shicixuexiVideo) {
        this.shicixuexiVideo = shicixuexiVideo;
    }
    /**
	 * 获取：相关文件
	 */
    public String getShicixuexiFile() {
        return shicixuexiFile;
    }


    /**
	 * 设置：相关文件
	 */
    public void setShicixuexiFile(String shicixuexiFile) {
        this.shicixuexiFile = shicixuexiFile;
    }
    /**
	 * 获取：诗词学习类型
	 */
    public Integer getShicixuexiTypes() {
        return shicixuexiTypes;
    }


    /**
	 * 设置：诗词学习类型
	 */
    public void setShicixuexiTypes(Integer shicixuexiTypes) {
        this.shicixuexiTypes = shicixuexiTypes;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getShicixuexiClicknum() {
        return shicixuexiClicknum;
    }


    /**
	 * 设置：点击次数
	 */
    public void setShicixuexiClicknum(Integer shicixuexiClicknum) {
        this.shicixuexiClicknum = shicixuexiClicknum;
    }
    /**
	 * 获取：诗词学习详情
	 */
    public String getShicixuexiContent() {
        return shicixuexiContent;
    }


    /**
	 * 设置：诗词学习详情
	 */
    public void setShicixuexiContent(String shicixuexiContent) {
        this.shicixuexiContent = shicixuexiContent;
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
    public Integer getShicixuexiDelete() {
        return shicixuexiDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setShicixuexiDelete(Integer shicixuexiDelete) {
        this.shicixuexiDelete = shicixuexiDelete;
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
