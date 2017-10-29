package org.imooc.bean;

import com.fasterxml.jackson.annotation.JsonInclude;


/**
 * Created by Administrator on 2017/9/9.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Ad {
    private Long id;
    private String title;
    private String imgFileName;
    private String link;
    private Long weight;
//    private String img;
//
//    public String getImg() {
//        return img;
//    }
//
//    public void setImg(String img) {
//        this.img = img;
//    }

    public Long getWeight() {
        return weight;
    }

    public void setWeight(Long weight) {
        this.weight = weight;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getImgFileName() {
        return imgFileName;
    }

    public void setImgFileName(String imgFileName) {
        this.imgFileName = imgFileName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}