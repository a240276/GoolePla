package com.huasuan.gooleplay.factory;

import android.support.v4.app.Fragment;

import com.huasuan.gooleplay.fragment.AppFragment;
import com.huasuan.gooleplay.fragment.CategoryFragment;
import com.huasuan.gooleplay.fragment.GameFragment;
import com.huasuan.gooleplay.fragment.HomeFragment;
import com.huasuan.gooleplay.fragment.HotFragment;
import com.huasuan.gooleplay.fragment.RecommendFragment;
import com.huasuan.gooleplay.fragment.SubjectFragment;



public class FragmentFractory {
	/**
	 <string-array name="main_titles">
	<item>首页</item>
	<item>应用</item>
	<item>游戏</item>
	<item>专题</item>
	<item>推荐</item>
	<item>分类</item>
	<item>排行</item>
	</string-array>
	 */
	public static final int	FRAGMENT_HOME		= 0;
	public static final int	FRAGMENT_APP		= 1;
	public static final int	FRAGMENT_GAME		= 2;
	public static final int	FRAGMENT_SUBJECT	= 3;
	public static final int	FRAGMENT_RECOMMEND	= 4;
	public static final int	FRAGMENT_CATEGORY	= 5;
	public static final int	FRAGMENT_HOT		= 6;

	/**
	 * 生产一个Fragment
	 * @param position  
	 * @return 
	 */
	public static Fragment createFragment(int position) {
		Fragment fragment = null;
		switch (position) {
		case FRAGMENT_HOME:// 首页
			fragment = new HomeFragment();
			break;
		case FRAGMENT_APP:// 应用
			fragment = new AppFragment();
			break;
		case FRAGMENT_GAME:// 游戏
			fragment = new GameFragment();
			break;
		case FRAGMENT_SUBJECT:// 专题
			fragment = new SubjectFragment();
			break;
		case FRAGMENT_RECOMMEND:// 推荐
			fragment = new RecommendFragment();
			break;
		case FRAGMENT_CATEGORY:// 分类
			fragment = new CategoryFragment();
			break;
		case FRAGMENT_HOT:// 排行
			fragment = new HotFragment();
			break;

		default:
			break;
		}

		return fragment;
	}
}
