package org.imooc.controller.api;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.imooc.bean.Ad;
import org.imooc.bean.BusinessList;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by Administrator on 2017/9/9.
 */
@RestController
@RequestMapping("/api")
public class ApiController {
    @RequestMapping(value="/homead",method = RequestMethod.GET)
    public List<Ad> homead() throws JsonParseException,JsonMappingException,IOException {
        ObjectMapper mapper = new ObjectMapper();
        String s = "[{\"title\":\"暑假信息\",\"img\":\"https://images.weserv.nl/?url=images2015.cnblogs.com/blog/138012/201610/138012-20161016191639092-2000037796.png\",\"link\":\"http://www.imooc.com/wap/index\"}]";
        return mapper.readValue(s, new TypeReference<List<Ad>>(){});
    }
    @RequestMapping(value="/homelist/{city}/{page}",method = RequestMethod.GET)
    public BusinessList homelist() throws JsonParseException,JsonMappingException,IOException {
        ObjectMapper mapper = new ObjectMapper();
        String s = "{\"hasMore\":true,\"data\":[{\"img\":\"https://images.weserv.nl/?url=images2015.cnblogs.com/blog/138012/201610/138012-20161016201638030-473660627.png\",\"title\":\"汉堡大大\",\"subTitle\":\"叫我汉堡大大，还你多彩口味\",\"price\":\"28\",\"distance\":\"120m\",\"mumber\":\"389\"}]}";
        return mapper.readValue(s,new TypeReference<BusinessList>(){});
    }
    @RequestMapping(value="/submitComment",method=RequestMethod.POST)
    public Map<String,Object> submitComment(){
        Map<String,Object> result = new HashMap<>();
        result.put("error",0);
        result.put("msg","ok");
        return result;
    }
}
