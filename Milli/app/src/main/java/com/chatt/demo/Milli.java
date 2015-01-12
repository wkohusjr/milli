package com.chatt.demo;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseUser;
import com.parse.SignUpCallback;

import java.text.ParseException;

/**
 * The Class ChattApp is the Main Application class of this app. The onCreate
 * method of this class initializes the Parse.
 */
public class Milli extends Application
{

	/* (non-Javadoc)
	 * @see android.app.Application#onCreate()
	 */
	@Override
	public void onCreate()
	{
		super.onCreate();
        Parse.initialize(this, "EpyA3x7NBHf9Nr6YRp7AwfgAHv2GAdUjeqyc9XDJ", "vvKUQretFYkf7y2KsiH3Cv2uCuFJMWfDXexmsFIE");

	}
}
