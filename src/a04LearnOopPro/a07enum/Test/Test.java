package a04LearnOopPro.a07enum.Test;
/*
@author YwQ
@version 1.0
*/

public class Test{
    public static void main(String[] args) {
        Color []color=Color.values();
        for (int i = 0; i < color.length; i++) {
            System.out.println(color[i]);
        }
    }
}