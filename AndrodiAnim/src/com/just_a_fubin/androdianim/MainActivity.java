package com.just_a_fubin.androdianim;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class MainActivity extends Activity implements AnimationListener{
	
	Animation fade_in;
	TextView fade_in_view;
	
	Animation fade_out;
	TextView fade_out_view;
	
	Animation zoom_in;
	TextView zoom_in_view;
	
	Animation zoom_out;
	TextView zoom_out_view;
	
	Animation slide_up;
	TextView slide_up_view;
	
	Animation slide_down;
	TextView slide_down_view;

	Animation move;
	TextView move_view;

	Animation rotate;
	TextView rotate_view;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		fade_in = AnimationUtils.loadAnimation(this, R.anim.fade_in);
		fade_in_view = (TextView)findViewById(R.id.fade_in_view);

		fade_out = AnimationUtils.loadAnimation(this, R.anim.fade_out);
		fade_out_view = (TextView)findViewById(R.id.fade_out_view);

		zoom_in = AnimationUtils.loadAnimation(this, R.anim.zoom_in);
		zoom_in_view = (TextView)findViewById(R.id.zoom_in_view);
		zoom_in.setAnimationListener(this);//用监听实现动画结束停留在最后一帧
		
		zoom_out = AnimationUtils.loadAnimation(this, R.anim.zoom_out);
		zoom_out_view = (TextView)findViewById(R.id.zoom_out_view);
		zoom_out.setAnimationListener(this);//用监听实现动画结束停留在最后一帧
		
		slide_up = AnimationUtils.loadAnimation(this, R.anim.slide_up);
		slide_up_view = (TextView)findViewById(R.id.slide_up_view);

		slide_down = AnimationUtils.loadAnimation(this, R.anim.slide_down);
		slide_down_view = (TextView)findViewById(R.id.slide_down_view);
		
		move = AnimationUtils.loadAnimation(this, R.anim.move);
		move_view = (TextView)findViewById(R.id.move_view);

		rotate = AnimationUtils.loadAnimation(this, R.anim.rotate);
		rotate_view = (TextView)findViewById(R.id.rotate_view);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		switch (item.getItemId()) {
		case R.id.action_fade_in:
			fade_in_view.startAnimation(fade_in);
			break;
		case R.id.action_fade_out:
			fade_out_view.startAnimation(fade_out);
			break;
		case R.id.action_zoom_in:
			zoom_in_view.startAnimation(zoom_in);
			break;
		case R.id.action_zoom_out:
			zoom_out_view.startAnimation(zoom_out);
			break;
		case R.id.action_slide_up:
			slide_up_view.startAnimation(slide_up);
			break;
		case R.id.action_slide_down:
			slide_down_view.startAnimation(slide_down);
			break;
		case R.id.action_move:
			move_view.startAnimation(move);
			break;
		case R.id.action_rotate:
			rotate_view.startAnimation(rotate);
			break;
		}
		
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onAnimationEnd(Animation arg0) {
		// TODO Auto-generated method stub
		//动画结束
		arg0.setFillAfter(true);
	}

	@Override
	public void onAnimationRepeat(Animation arg0) {
		// TODO Auto-generated method stub
		//动画重复
	}

	@Override
	public void onAnimationStart(Animation arg0) {
		// TODO Auto-generated method stub
		//动画开始
	}
}
