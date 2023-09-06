package selenium.practice;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListener implements IRetryAnalyzer {

    private static final int maxCount=3;
    private int retry=0;
    @Override
    public boolean retry(ITestResult iTestResult) {
        if(retry<maxCount){
            retry++;
            return true;
        }
        return false;
    }
}
