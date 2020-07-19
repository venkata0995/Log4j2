package Beta;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
public class Demo2
{
    private static Logger log= (Logger) LogManager.getLogger(Demo2.class.getName());
    public static void main(String args[])
    {

        log.info("I am logging");
        log.debug("I am debugging");
        log.error("log error");
        log.fatal("fatal error");

    }

}