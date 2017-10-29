package org.imooc.bean;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Created by Administrator on 2017/9/9.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Dic {
    private String type;
    private String code;
    private String name;
    private Integer weight;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
