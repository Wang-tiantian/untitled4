public class Girl extends Person{
    //n=nature
    public String n1 = "任性";
    public String n2 = "嚣张";
    public String n3 = "叛逆";
    public String n4 = "疯狂";
    public String n5 = "嘻嘻哈哈";
    public String n6 = "迷迷糊糊";

    public Girl(String n) {
        super(n);
    }
    public void talk1 () {
        System.out.println("有一个姑娘，她有一些" + n1 + ",她还有一些" + n2 );
    }
    public void talk2 () {
        System.out.println("有一个姑娘，她有一些" + n3 + ",她还有一些" + n4 );
    }
    public void quarrel () {
        System.out.println("没事吵吵小架");
    }
    public void lie () {
        System.out.println("没事说说小谎");
    }
    public void wake () {
        System.out.println("反正醒着也是醒着");
    }
    public void available () {
        System.out.println("反正闲着也是闲着");
    }
    public void play () {
        System.out.println("看到风儿就起浪");
    }
    public void getIntoTrouble () {
        System.out.println("大祸小祸一起闯");
    }
    public void walkAround () {
        System.out.println("还曾山山水水 敢爱敢恨走四方");
    }
}
