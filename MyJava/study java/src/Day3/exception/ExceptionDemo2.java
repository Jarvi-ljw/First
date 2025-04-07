package Day3.exception;
//自定义的编译时异常
public class ExceptionDemo2 extends Exception{
    //重写构造方法
    public ExceptionDemo2(){
        super();
    }
    public ExceptionDemo2(String message){
        super(message);
    }

}
