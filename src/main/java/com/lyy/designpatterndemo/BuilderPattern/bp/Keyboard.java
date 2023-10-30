package com.lyy.designpatterndemo.BuilderPattern.bp;

import lombok.Data;

/**
 * 产品类
 * 要创建的复杂对象
 */

@Data
public class Keyboard {
    /**
     * 键帽
     */
    private String keycap;

    /**
     * 轴体
     */
    private String keyswitch;
}
