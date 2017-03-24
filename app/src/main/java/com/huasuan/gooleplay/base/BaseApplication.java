package com.huasuan.gooleplay.base;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

/**
 * @创建者	 Administrator
 * @创时间 	 2015-11-10 下午2:38:41
 * @描述	     全局的,单例,共用,常用
 *
 * @版本       $Rev: 3 $
 * @更新者     $Author: admin $
 * @更新时间    $Date: 2015-11-10 15:39:51 +0800 (星期二, 10 十一月 2015) $
 * @更新描述    TODO
 */
public class BaseApplication extends Application {

	private static Context	mContext;			// member
	private static long		mMainThreadId;
	private static Handler	mMainThreadHandler;

	public static Context getContext() {
		return mContext;
	}

	public static long getMainThreadId() {
		return mMainThreadId;
	}

	public static Handler getMainThreadHandler() {
		return mMainThreadHandler;
	}

	@Override
	public void onCreate() {// 程序入口方法

		// 1.上下文
		mContext = getApplicationContext();

		// 2.主线程的Id
		/**
		 * Tid Thread
		 * Pid Process
		 * Uid User
		 */
		mMainThreadId = android.os.Process.myTid();

		// 3.创建一个主线程的handler
		mMainThreadHandler = new Handler();

		super.onCreate();
	}

}
