package Day3.exception;

public class ExceptionDemo1 {
    //认识异常，了解异常的几种种情况
    //1.运行时异常（RuntimeException)，编译时异常(Exception)

    public static void main(String[] args) {
        int [] arr1 ={1,2,3,4,5};
        try {
            System.out.println(arr1[2]);
        }catch (RuntimeException e){
            System.out.println("数组越界了");
            e.printStackTrace();
        }
        try {
            IndexOutOfBoundsException(1);
        } catch (ExceptionDemo2 e) {
            throw new RuntimeException(e);
        }
    }
    public static void IndexOutOfBoundsException(int index) throws ExceptionDemo2 {
        if(index>5){
            throw new ExceptionDemo2("数组越界");//抛出异常
        }else {
            System.out.println("数组没有越界");
        }
    }

}
