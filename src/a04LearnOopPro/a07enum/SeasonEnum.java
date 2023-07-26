package a04LearnOopPro.a07enum;
/*
@author YwQ
@version 1.0
*/
//继承接口
public enum SeasonEnum implements  A{
    //实例会自动添加 private static final
//以下是未被简化的内内容
  //  public static final SeaSonEnum SPRING =new SPRING("","");
    //多个对象用逗号隔开
    SPRING("春天","春风又绿江南岸"),
    SUMMER("夏天","映日荷花别样红"),
    AUTUMN("秋天","秋水共长天一色"),
    WINTER("冬天","窗含西岭千秋雪");

    private final String seasonName;
    private final String seasonDesc;

    //私有化构造器
    private SeasonEnum(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }
    //公开的gettersetter
    public String getSeasonName() {
        return seasonName;
    }
    public String getSeasonDesc() {
        return seasonDesc;
    }

    //继承接口就要完成接口的方法


    @Override
    public void show() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        //Enum 方法
        //1 toString(在下定义
        System.out.println(SeasonEnum.AUTUMN.toString());
        //2 name
        System.out.println(SeasonEnum.AUTUMN.name());
        System.out.println(SeasonEnum.SPRING.name());
        //3 values
        SeasonEnum[] values =SeasonEnum.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);//调用了tostring
        }
        //4 valuesof()
        String obj ="DINNER";
        //如果枚举类中没有objName名称的对象则报错
//        SeasonEnum objName= SeasonEnum.valueOf(obj);
//        System.out.println(objName);

        //5 ordinal
        System.out.println(SeasonEnum.SPRING.ordinal());
        System.out.println(WINTER.ordinal());

        //接口方法
        SPRING.show();
    }
//Enum方法
    @Override
    public String toString() {
        return "SeasonEnum{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }


    }

    //jiekou
interface  A{
    public void show();
    }

