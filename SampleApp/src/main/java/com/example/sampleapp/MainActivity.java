package com.example.sampleapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.example.samplelib2.LibActivity;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		final Intent intent = new Intent(MainActivity.this, LibActivity.class);
		
		startActivity(intent);

	}

}
