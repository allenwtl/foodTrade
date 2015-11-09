package org.foodTrade.server.common.util;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

/**
 * 线程池管理类
 */
public class ThreadPoolManager {
	private static ThreadPoolManager threadPoolManager = new ThreadPoolManager();
	private ExecutorService executorService;	
	private ExecutorService executorServiceTwo;   
	
	private ThreadPoolManager(){
		int cpuCount = Runtime.getRuntime().availableProcessors();
		executorService = Executors.newFixedThreadPool(cpuCount*2);	//IO密集型	
		executorServiceTwo = Executors.newFixedThreadPool(cpuCount+1);
//		executorService = Executors.newFixedThreadPool(cpuCount+1);	//cpu密集型	
	}
	
	public static synchronized ThreadPoolManager getInstance(){
		return threadPoolManager;
	}
	
	public void execute(Runnable runnable){
		executorService.execute(runnable);
	}
	
	/**
	 * 外部服务接口启用线程执行（时间较长任务且不需要返回结果的接口），
	 */
	public void executeService(FutureTask<?> task){
	    executorServiceTwo.submit(task);
    }
}
