package Day4.recursionDemo;

import java.io.File;

public class FileSearch {
    public static void main(String[] args) throws Exception {
        File dir =new File("E:\\");
        fileSearch(dir,"QQ.exe");
    }


    /**
     * 文件搜素
     */
    public static void fileSearch(File fileDir,String searchFileName) throws Exception {
        //判断当前目录是否为空,是否存在该目录，该目录是否是文件
        if (fileDir==null||!fileDir.exists()||fileDir.isFile()){
            //不搜索
            return ;
        }

        //获取当前目录下的所有一级文件或文件夹对象
        File[] files =fileDir.listFiles();

        //判断该目录下是否存在一级文件对象
        if (files!=null&&files.length>0){

            //遍历所有一级文件对象
            for (File file1:files){
                //如果得到的是文件并且搜索名相同
                if (file1.isFile()){
                    if (file1.getName().contains(searchFileName)){
                        System.out.println("找到目标文件:"+file1.getAbsoluteFile());

                        Runtime r =Runtime.getRuntime();
                        r.exec(file1.getAbsolutePath());
                    }

                }else if (file1.isDirectory()){
                    fileSearch(file1,searchFileName);
                }
            }
        }


    }
}
