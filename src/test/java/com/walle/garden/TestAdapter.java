package com.walle.garden;

import com.walle.guide.adapter.FriendAdapter;

/**
 * @author 123
 * @create 2022/9/18 20:08
 */
public class TestAdapter {
    public static void main(String[] args) {
        System.out.println("人类：\n你叫什么？");
        FriendAdapter personFriend = new FriendAdapter();
        System.out.println("喵星人: ");
        personFriend.speak("喵喵喵");
    }
}
