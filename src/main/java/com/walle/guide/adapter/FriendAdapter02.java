package com.walle.guide.adapter;

import sun.security.x509.FreshestCRLExtension;

/**
 * @author 123
 * @create 2022/9/18 21:58
 */
public class FriendAdapter02 implements PersonFriend02{
    private Animal02 animal02;

    public FriendAdapter02(Animal02 animal02) {
        this.animal02 = animal02;
    }

    @Override
    public void speak(String sound) {
        if ("喵喵喵".equals(animal02.makeSound(sound))) {
            System.out.println("你好，我是喵喵~~");
        }
    }
}
