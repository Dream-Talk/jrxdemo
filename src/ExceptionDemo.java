import java.io.File;

/**
 * @author admin
 * @create 2020-05-17 16:42
 * @desc 演示编译时异常
 **/
public class ExceptionDemo {
      public static void main(String args[]){
          File file = new File("测试编译时异常");
          //编译时异常 编译器强制报错
//          file.createNewFile();
      }
}
