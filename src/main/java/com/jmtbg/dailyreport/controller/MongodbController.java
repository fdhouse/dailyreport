package com.jmtbg.dailyreport.controller;

import com.jmtbg.dailyreport.common.vo.Result;
import com.jmtbg.dailyreport.entity.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.jmtbg.dailyreport.common.constant.ControllerUrls.CLIENT_API_URI;

/**
 * @author sjw
 * @date 2019/1/22
 */

@Api(value = "mongodb示例", tags = "mongodb示例")
@RestController
@RequestMapping(CLIENT_API_URI)
public class MongodbController {

    @Autowired
    private MongoTemplate mongoTemplate;

    @ApiOperation(value = "mongodb")
    @RequestMapping(value = "/mongodb", method = RequestMethod.GET)
    public Result listUser() {
        Query query = Query.query(Criteria.where("age").gte(10));
        List<User> users = this.mongoTemplate.find(query, User.class);
        return Result.genSuccess(users, 1L);
    }


}
