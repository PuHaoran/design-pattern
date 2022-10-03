package com.walle.guide.chainOfResponsibility;

public class HtmlFilter implements Filter{
    @Override
    public boolean doFilter(Msg msg) {
        String m = msg.getMsg();
        m = m.replace('<', '[');
        m = m.replace('>', ']');
        msg.setMsg(m);
        return true;
    }
}
