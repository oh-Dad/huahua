package com.huahua.search.controller;

import com.huahua.search.pojo.ArticleEs;
import com.huahua.search.service.SearchService;
import huahua.common.PageResult;
import huahua.common.Result;
import huahua.common.StatusCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: Lenovo
 * \* Date: 2019/4/22
 * \* Time: 14:10
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@RestController
@RequestMapping("/search")
@CrossOrigin
public class SearchController {

    @Autowired
    private SearchService searchService;


    @RequestMapping(value = "/search/{keywords}/{page}/{size}",method = RequestMethod.GET)
    public Result searchArticle(@PathVariable("keywords") String keywords,
                                @PathVariable("page") Integer page,
                                @PathVariable("size") Integer size){
        Page<ArticleEs> list = searchService.searchArticle(keywords,page,size);

        return new Result(true, StatusCode.OK,"查询成功",new PageResult<>(list.getTotalElements(),list.getContent()));
    }

    /**
     * 添加
     */
    @RequestMapping(method = RequestMethod.PUT)
    public Result add(@RequestBody ArticleEs articleEs){
        searchService.add(articleEs);

        return new Result(true,StatusCode.OK,"添加成功");
    }
}
