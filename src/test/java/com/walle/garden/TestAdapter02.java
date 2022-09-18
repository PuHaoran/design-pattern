package com.walle.garden;

import com.walle.guide.adapter.Dog02;
import com.walle.guide.adapter.FriendAdapter;
import com.walle.guide.adapter.FriendAdapter02;

/**
 * @author 123
 * @create 2022/9/18 22:06
 */
public class TestAdapter02 {
    public static void main(String[] args) {
        System.out.println("人类：\n你叫什么？");
        Dog02 dog02 = new Dog02();
        FriendAdapter02 personFriend = new FriendAdapter02(dog02);
        System.out.println("喵星人: ");
        personFriend.speak("喵喵喵");
    }
}
