package a04LearnOopPro.a07enum.Test;
/*
@author YwQ
@version 1.0
*/

public enum Color {
    RED(23,34,76,"w2"),ORANGE(455,565,67,"we"),YELLOW(212,324,4,"sdf");
private  final int red;
    private  final int GEEN;
    private  final int BLUE;
    private final String DESCRIPTION;

    Color(int red, int GEEN, int BLUE,String des) {
        this.red = red;
        this.GEEN = GEEN;
        this.BLUE = BLUE;
        this.DESCRIPTION=des;
    }

    @Override
    public String toString() {
        return "Color{" +
                "red=" + red +
                ", GEEN=" + GEEN +
                ", BLUE=" + BLUE +
                ", DESCRIPTION='" + DESCRIPTION + '\'' +
                '}';
    }
}
