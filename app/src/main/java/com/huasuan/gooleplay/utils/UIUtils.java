package com.huasuan.gooleplay.utils;


import android.content.Context;
import android.content.res.Resources;

import com.huasuan.gooleplay.base.BaseApplication;

/**
 * @创建者	 Administrator
 * @创时间 	 2015-11-10 下午2:50:31
 * @描述	     处理和Ui相关的工具类
 *
 * @版本       $Rev: 3 $
 * @更新者     $Author: admin $
 * @更新时间    $Date: 2015-11-10 15:39:51 +0800 (星期二, 10 十一月 2015) $
 * @更新描述    TODO
 */
public class UIUtils {
	/**得到上下文*/
	public static Context getContext() {
		return BaseApplication.getContext();
	}

	/**得到Resource对象*/
	public static Resources getResources() {
		return getContext().getResources();
	}

	/**得到String.xml中的字符*/
	public static String getString(int resId) {
		return getResources().getString(resId);
	}

	/**得到String.xml中的字符数组*/
	public static String[] getStringArr(int resId) {
		return getResources().getStringArray(resId);
	}

	/**得到color.xml中的颜色值*/
	public static int getColor(int resId) {
		return getResources().getColor(resId);
	}

	/**得到应用程序的包名*/
	public static String getPackageName() {
		return getContext().getPackageName();
	}
}
