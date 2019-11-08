public class Story extends Girl {
    public Story(String n, int a) {
        super(n);
    }

    public static void main(String[] args) {
        Girl girl = new Girl("小方");
        String n = "小方";


        girl.talk1();
        girl.talk2();
        System.out.println("这个姑娘是谁呀");
        System.out.println("这个姑娘叫" + n);
        girl.setAge("十九");
        String a1 = (String)girl.getAge();
        System.out.println("今年" + a1 + "岁啦 ");
        girl.quarrel();
        girl.wake();
        girl.available();


        girl.talk1();
        girl.talk2();
        System.out.println("这个姑娘是谁呀");
        System.out.println("这个姑娘叫" + n );
        girl.setAge(19);
        int a2 = (Integer)girl.getAge();
        System.out.println("今年" + a2 + "岁啦 ");
        girl.play();
        girl.getIntoTrouble();
        girl.walkAround();


        girl.talk1();
        girl.talk2();
        System.out.println("这个姑娘是谁呀");
        System.out.println("这个姑娘叫" +  n );
    }
}