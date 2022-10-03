package com.walle.guide.chainOfResponsibility;

import java.util.ArrayList;
import java.util.List;

public class FilterChain implements Filter{
    List<Filter> filterList = new ArrayList<>();

    public FilterChain add(Filter f) {
        filterList.add(f);
        return this;
    }

    @Override
    public boolean doFilter(Msg msg) {
        for (Filter f: filterList) {
            if (!f.doFilter(msg)) {
                return false;
            }
        }
        return true;
    }
}
