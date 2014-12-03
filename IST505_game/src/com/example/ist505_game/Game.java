package com.example.ist505_game;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import org.apache.http.client.ClientProtocolException;
import org.json.JSONException;

import com.google.analytics.tracking.android.EasyTracker;
import com.google.analytics.tracking.android.Fields;
import com.google.analytics.tracking.android.GoogleAnalytics;
import com.google.analytics.tracking.android.MapBuilder;
import com.google.analytics.tracking.android.Tracker;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class Game extends Fragment {
	
	// for debug purposes
	private static final String TAG = "SF";
	private GoogleAnalytics myInstance;
	private Tracker tracker;
	SharedPreferences symptomsPreference;
	private static String PREF_SYMP="PatientPhone"; 
	private String Info;

	// server URL to send the symptoms
	public static String PATIENT_API_URL = "http://134.173.236.144/cguchf/PatientSymptoms.aspx";

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		final View rootView = inflater.inflate(R.layout.stress_game,
				container, false);
		// the info textview
		 
		 Button submit = (Button)rootView.findViewById(R.id.button1);
         submit.setOnClickListener(new OnClickListener(){
	        	
	        	
	        	
	        	@Override
	        	public void onClick(View v) {
	        		
	        		final Intent myIntent= new Intent(getActivity().getApplicationContext(),InhaleExhale.class);		

	        		 startActivity(myIntent);
	        	}
	  
		 
         });
	
		
		return rootView;
	}	

}