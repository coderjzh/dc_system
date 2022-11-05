package com.java.dc_system.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Author: zjt
 * @Date: 2022-11-05 21:00
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transfer {
    //
    private Integer transferId;
    //
    private String name;
    //
    private String diCard;
    //
    private String tel;
    //
    private String password;
    //
    private Date registerTime;
}
