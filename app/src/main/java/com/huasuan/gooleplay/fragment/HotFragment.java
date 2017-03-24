package com.itheima.googleplay_14.fragment;

import com.itheima.googleplay_14.utils.UIUtils;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * @创建者	 Administrator
 * @创时间 	 2015-11-10 下午4:46:00
 * @描述	     TODO
 *
 * @版本       $Rev: 6 $
 * @更新者     $Author: admin $
 * @更新时间    $Date: 2015-11-10 16:52:17 +0800 (星期二, 10 十一月 2015) $
 * @更新描述    TODO
 */
public class HotFragment extends Fragment {

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		TextView tv = new TextView(UIUtils.getContext());
		tv.setGravity(Gravity.CENTER);
		tv.setText(this.getClass().getSimpleName());
		return tv;
	}

}
