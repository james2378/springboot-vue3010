package com.entity.vo;

import com.entity.ChangyongyujuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 常用语句
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("changyongyuju")
public class ChangyongyujuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 常用语句编号
     */

    @TableField(value = "changyongyuju_uuid_number")
    private String changyongyujuUuidNumber;


    /**
     * 常用语句名称
     */

    @TableField(value = "changyongyuju_name")
    private String changyongyujuName;


    /**
     * 常用语句照片
     */

    @TableField(value = "changyongyuju_photo")
    private String changyongyujuPhoto;


    /**
     * 视频
     */

    @TableField(value = "changyongyuju_video")
    private String changyongyujuVideo;


    /**
     * 发音
     */

    @TableField(value = "changyongyuju_music")
    private String changyongyujuMusic;


    /**
     * 相关文件
     */

    @TableField(value = "changyongyuju_file")
    private String changyongyujuFile;


    /**
     * 常用语句类型
     */

    @TableField(value = "changyongyuju_types")
    private Integer changyongyujuTypes;


    /**
     * 点击次数
     */

    @TableField(value = "changyongyuju_clicknum")
    private Integer changyongyujuClicknum;


    /**
     * 常用语句详情
     */

    @TableField(value = "changyongyuju_content")
    private String changyongyujuContent;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "changyongyuju_delete")
    private Integer changyongyujuDelete;


    /**
     * 创建时间  show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：常用语句编号
	 */
    public String getChangyongyujuUuidNumber() {
        return changyongyujuUuidNumber;
    }


    /**
	 * 获取：常用语句编号
	 */

    public void setChangyongyujuUuidNumber(String changyongyujuUuidNumber) {
        this.changyongyujuUuidNumber = changyongyujuUuidNumber;
    }
    /**
	 * 设置：常用语句名称
	 */
    public String getChangyongyujuName() {
        return changyongyujuName;
    }


    /**
	 * 获取：常用语句名称
	 */

    public void setChangyongyujuName(String changyongyujuName) {
        this.changyongyujuName = changyongyujuName;
    }
    /**
	 * 设置：常用语句照片
	 */
    public String getChangyongyujuPhoto() {
        return changyongyujuPhoto;
    }


    /**
	 * 获取：常用语句照片
	 */

    public void setChangyongyujuPhoto(String changyongyujuPhoto) {
        this.changyongyujuPhoto = changyongyujuPhoto;
    }
    /**
	 * 设置：视频
	 */
    public String getChangyongyujuVideo() {
        return changyongyujuVideo;
    }


    /**
	 * 获取：视频
	 */

    public void setChangyongyujuVideo(String changyongyujuVideo) {
        this.changyongyujuVideo = changyongyujuVideo;
    }
    /**
	 * 设置：发音
	 */
    public String getChangyongyujuMusic() {
        return changyongyujuMusic;
    }


    /**
	 * 获取：发音
	 */

    public void setChangyongyujuMusic(String changyongyujuMusic) {
        this.changyongyujuMusic = changyongyujuMusic;
    }
    /**
	 * 设置：相关文件
	 */
    public String getChangyongyujuFile() {
        return changyongyujuFile;
    }


    /**
	 * 获取：相关文件
	 */

    public void setChangyongyujuFile(String changyongyujuFile) {
        this.changyongyujuFile = changyongyujuFile;
    }
    /**
	 * 设置：常用语句类型
	 */
    public Integer getChangyongyujuTypes() {
        return changyongyujuTypes;
    }


    /**
	 * 获取：常用语句类型
	 */

    public void setChangyongyujuTypes(Integer changyongyujuTypes) {
        this.changyongyujuTypes = changyongyujuTypes;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getChangyongyujuClicknum() {
        return changyongyujuClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setChangyongyujuClicknum(Integer changyongyujuClicknum) {
        this.changyongyujuClicknum = changyongyujuClicknum;
    }
    /**
	 * 设置：常用语句详情
	 */
    public String getChangyongyujuContent() {
        return changyongyujuContent;
    }


    /**
	 * 获取：常用语句详情
	 */

    public void setChangyongyujuContent(String changyongyujuContent) {
        this.changyongyujuContent = changyongyujuContent;
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
    public Integer getChangyongyujuDelete() {
        return changyongyujuDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setChangyongyujuDelete(Integer changyongyujuDelete) {
        this.changyongyujuDelete = changyongyujuDelete;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
