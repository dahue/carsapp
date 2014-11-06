package com.unrc.app;

import org.javalite.activejdbc.Base;
import com.unrc.app.models.*;
import com.unrc.app.App;

import java.util.*;
import com.unrc.app.MustacheTemplateEngine;

import spark.Request;
import spark.Response;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;
import spark.ModelAndView;
import spark.TemplateEngine;
import static spark.Spark.*;
import org.elasticsearch.node.*;
import org.elasticsearch.client.*;

import spark.Session;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.action.search.SearchType;
import org.elasticsearch.index.query.QueryBuilders.*;
import org.elasticsearch.index.query.*;

public class RestrictedAreaController{

    public ModelAndView restrictedArea(){
            Map<String, Object> attributes = new HashMap<>();
            return new ModelAndView(attributes, "restrictedArea.mustache");
    }
}