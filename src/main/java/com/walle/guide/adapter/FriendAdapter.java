package com.walle.guide.adapter;

/**
 * 实现一个喵朋友适配器与我们沟通
 * @author 123
 * @create 2022/9/18 20:04
 */
public class FriendAdapter extends Cat implements PersonFriend {

    @Override
    public void speak(String sound) {
        if ("喵喵喵".equals(makeSound(sound))) {
            System.out.println("你好，我是喵喵~~");
        }
    }
}
