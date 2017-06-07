package com.wb.util;

public class SystemTip {

	private boolean result; //结果true成功，false失败
	private String tip; //提示消息
	private Object obj; //其他内容
	
	/**
	 * 创建一个成功的消息
	 * @return
	 */
	public static SystemTip createSuccessTip(){
		SystemTip systemTip = new SystemTip();
		systemTip.setResult(true);
		systemTip.setTip(Config.SUCCESS_TIP);
		return systemTip;
	}
	
	/**
	 * 创建一个失败的消息
	 * @param tip
	 * @return
	 */
	public static SystemTip createFailTip(){
		SystemTip systemTip = new SystemTip();
		systemTip.setResult(false);
		systemTip.setTip(Config.FAIL_TIP);
		return systemTip;
	}
	
	/**
	 * 创建一个失败的消息
	 * @param tip
	 * @return
	 */
	public static SystemTip createFailTip(String tip){
		SystemTip systemTip = new SystemTip();
		systemTip.setResult(false);
		systemTip.setTip(tip);
		return systemTip;
	}
	
	public boolean isResult() {
		return result;
	}
	public void setResult(boolean result) {
		this.result = result;
	}
	public String getTip() {
		return tip;
	}
	public void setTip(String tip) {
		this.tip = tip;
	}
	public Object getObj() {
		return obj;
	}
	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	@Override
	public String toString() {
		return "Tip [result=" + result + ", tip=" + tip + ", obj=" + obj + "]";
	}
	
}
