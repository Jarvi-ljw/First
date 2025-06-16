package Day5.executorservicedemo2;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String> {

    @Override
    public String call() throws Exception {
        return Thread.currentThread().getName()+"hello，world！";
    }
}
