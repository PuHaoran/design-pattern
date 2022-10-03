package com.walle.guide.chainOfResponsibility;

public class CharacterFilter implements Filter{
    @Override
    public boolean doFilter(Msg msg) {
        String m = msg.getMsg();
        m = m.replace('.', '!');
        msg.setMsg(m);
        return false;
    }
}
