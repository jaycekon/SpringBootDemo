package com.Jaycekon.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * Created by weijie_huang on 2017/9/7.
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class User extends BaseEntity {
    private String username;
    private String idCard;
    private String phone;
    private String password;
}
