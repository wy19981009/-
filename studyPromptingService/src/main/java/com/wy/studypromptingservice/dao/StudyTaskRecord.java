package com.wy.studypromptingservice.dao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 打卡记录表
 * @TableName study_task_record
 */
@TableName(value ="study_task_record")
@Data
public class StudyTaskRecord implements Serializable {
    /**
     * 打卡记录ID
     */
    @TableId(type = IdType.AUTO)
    private Long id;

    /**
     * 用户ID
     */
    private Long userId;

    /**
     * 任务ID
     */
    private Long taskId;

    /**
     * 开始打卡时间
     */
    private Date startTime;

    /**
     * 开始打卡图片
     */
    private String startImage;

    /**
     * 结束打卡时间
     */
    private Date endTime;

    /**
     * 结束打卡图片
     */
    private String endImage;

    /**
     * 打卡状态：进行中、已完成
     */
    private Object status;

    /**
     * 创建时间
     */
    private Date createdAt;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}