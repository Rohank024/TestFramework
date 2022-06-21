package generic;


	

import org.testng.ITestContext;
	import org.testng.ITestListener;
	import org.testng.ITestResult;
	import org.testng.Reporter;

	public class CustomListner extends BaseTest implements ITestListener{

		@Override
		public void onTestStart(ITestResult result) {
			Reporter.log("Test has been started",true);

		}

		@Override
		public void onTestSuccess(ITestResult result) {
			Reporter.log("Test is successfully executed",true);
		}

		@Override
		public void onTestFailure(ITestResult result) {

			String methodName = result.getMethod().getMethodName();
			Reporter.log("test"+methodName+" is failed The screenshot is taken",true);
		    failed(methodName);
		}

		@Override
		public void onTestSkipped(ITestResult result) {
			String methodName = result.getMethod().getMethodName();
			Reporter.log("test"+methodName+" is skipped",true);
		}

		@Override
		public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

		}

		@Override
		public void onTestFailedWithTimeout(ITestResult result) {

		}

		@Override
		public void onStart(ITestContext context) {

		}

		@Override
		public void onFinish(ITestContext context) {

			Reporter.log("test execution has been finished",true);
		}

	}
