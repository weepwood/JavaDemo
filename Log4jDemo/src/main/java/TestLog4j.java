import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

/**
 * @author lanqilu
 * @date Created in 2020/10/04  16:42
 * @description log4j包测试使用
 */
public class TestLog4j {
    private static Logger logger = LogManager.getLogger(TestLog4j.class);

    /**
     * @param args
     */
    public static void main(String[] args) {
        // System.out.println("This is println message.");

        // 记录debug级别的信息  
        logger.debug("This is debug message.");
        // 记录info级别的信息  
        logger.info("This is info message.");
        // 记录error级别的信息  
        logger.error("This is error message.");
    }

}
