import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author admin
 * @create 2020-05-17 16:48
 * @desc 异常的处理机制 throws
 **/
public class ExceptionDealThrows {
    public static void main(String[] args) throws IOException {
        read("a.txt");
    }

    public static void read(String path) throws FileNotFoundException, IOException {
        if (!path.equals("a.txt")) {
            //如果不是 a.txt这个文件
            // 我假设 如果不是 a.txt 认为 该文件不存在 是一个错误 也就是异常
            throw new FileNotFoundException("文件不存在");
        }
        if (!path.equals("b.txt")) {
            throw new IOException();
        }
    }
}

