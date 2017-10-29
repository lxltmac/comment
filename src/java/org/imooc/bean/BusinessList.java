package org.imooc.bean;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * Created by Administrator on 2017/10/22.
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusinessList {
    private boolean hasMore;
    private List<Business> data;

    public boolean isHasMore() {
        return hasMore;
    }

    public void setHasMore(boolean hasMore) {
        this.hasMore = hasMore;
    }

    public List<Business> getData() {
        return data;
    }

    public void setData(List<Business> data) {
        this.data = data;
    }
}
