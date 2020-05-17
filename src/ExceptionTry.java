import java.io.File;
import java.io.IOException;

/**
 * @author admin
 * @create 2020-05-17 16:50
 * @desc 异常的处理机制Try
 **/
public class ExceptionTry {
    public static void main(String args[]){
        File file = new File("测试编译时异常");
        //编译时异常 编译器强制报错
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //关闭流等操作
        }
    }
}
