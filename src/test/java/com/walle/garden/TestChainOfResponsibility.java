package com.walle.garden;

import com.walle.guide.chainOfResponsibility.*;

import java.util.ArrayList;
import java.util.List;

public class TestChainOfResponsibility {
    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("hello garden, <p>coding every day.</p>");
        // 过滤器链类1
        FilterChain filterChain = new FilterChain();
        filterChain.add(new HtmlFilter());

        // 过滤器链类2，字符过滤器返回false，组织继续向后传递。
        FilterChain filterChain2 = new FilterChain();
        filterChain2.add(new CharacterFilter()).add(new SensitiveFilter());
        filterChain.add(filterChain2);

        filterChain.doFilter(msg);
        System.out.println(msg);
    }
}
