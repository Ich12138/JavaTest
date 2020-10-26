package org.day11.rpc_demo2.entity;

import lombok.*;

/**
 * @Author WangQian
 * @Date 2020/10/26 下午 5:11
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserInfo {
    /**
     * 用户编号
     */
    private Integer userNo;
    /**
     * 姓名
     */
    private String name;
}
