package org.imooc.service;

import org.imooc.dto.AdDto;

/**
 * Created by Administrator on 2017/10/25.
 */
public interface AdService {
    /**
     * 新增广告
     * @param adDto
     * @return 是否新增成功：true-成功；false-失败
     */
    boolean add(AdDto adDto);
}
