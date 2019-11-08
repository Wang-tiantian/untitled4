class MyException extends Exception {
    public MyException(String mas){
        super(mas);
    }
}
class DefaultException{
    public static void main(String[] args) {
        try {
            int a = 18;
            throw new MyException("不，你猜错了她的年龄");
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("祝这个叫小方的姑娘生日快乐");
        }
    }
}
