package com.walle.guide.chainOfResponsibility;

public class SensitiveFilter implements Filter{
    @Override
    public boolean doFilter(Msg msg) {
        String m = msg.getMsg();
        m = m.replace("hello", "hi");
        msg.setMsg(m);
        return true;
    }
}
