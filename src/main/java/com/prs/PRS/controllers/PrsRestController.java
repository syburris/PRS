package com.prs.PRS.controllers;

import org.h2.tools.Server;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.SQLException;

/**
 * Created by stevenburris on 7/17/17.
 */
@RestController
public class PrsRestController {


    Server h2;

//    start the server
    @PostConstruct
    public void init() throws SQLException {
//        init server
        h2 = Server.createWebServer().start();

    }

//    kill the server
    @PreDestroy
    public void destroy() {
        h2.stop();
    }


}
