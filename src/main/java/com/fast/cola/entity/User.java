package com.fast.cola.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @author WangHuiJie
 * @date 2023/4/26 16:29
 **/
@Data
public class User implements Serializable {
    @TableId
    private String id;

    private String name;
}
