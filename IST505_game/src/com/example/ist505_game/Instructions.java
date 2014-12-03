package com.example.ist505_game;


import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

import org.apache.http.client.ClientProtocolException;
import org.json.JSONException;

import com.google.analytics.tracking.android.Fields;
import com.google.analytics.tracking.android.GoogleAnalytics;
import com.google.analytics.tracking.android.Tracker;
import com.google.analytics.tracking.android.EasyTracker;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;



public class Instructions extends Fragment {
	
	
	//private ArrayList<PatientData> patientData;
	private long lastTweetsUpdateTime = 0;
	private static final String TAG = "VF";
	private GoogleAnalytics myInstance;
	private Tracker tracker;
	public static String PATIENT_API_URL = "http://134.173.236.144/cguchf/patientvital.aspx";
    
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.instructions,
				container, false);

		//============ 
		//test if there is internet connection first
		
		boolean checkConntection = new CheckInternetConnection().checkInternetConnection(getActivity());
		
		if (checkConntection == true ) { 
		
		

			
			
		// Initialize a tracker using a Google Analytics property ID.
//		Tracker tracker = GoogleAnalytics.getInstance(getActivity()).getTracker("UA-45989172-1");
//		
//		HashMap<String, String> hitParameters = new HashMap<String, String>();
//		hitParameters.put(Fields.HIT_TYPE, "appview");
//		hitParameters.put(Fields.SCREEN_NAME, "Vitals");
//
//		tracker.send(hitParameters);
		
		//============
		
		
		// cause the fragment to be retained on orientation so we don't need to reload data. 
				this.setRetainInstance(true);
				
				final Context context = getActivity().getApplicationContext();
				SharedPreferences shared = context.getSharedPreferences("PatientPhone",0);
				String phone = (shared.getString("phone", ""));
												
				Thread.setDefaultUncaughtExceptionHandler(new ExceptionHandler(context));

				// auto update code
				
		}

		return rootView;
	}
	
	/**
	 * When orientation changes, we need to report in to the Activity. 
	 */
	@Override
	public void onAttach(Activity activity) {
		//((MainActivity)activity).setTweetsFrag(this);
//		if(patientData != null && patientData.size() > 0) {
//			((MainActivity)activity).setLastPatientUpdateTime(System.currentTimeMillis());
//		}
		super.onAttach(activity);
	}
	
//	public void setPatientData(ArrayList<PatientData> patientData) 
//	{
//		
//		System.out.println("in set patient data fun"+patientData);
//		//this.patientData = patientData;
//		
//		
//	}
//	


	  @Override
	  public void onStart() {
	    super.onStart();
	     // The rest of your onStart() code.
	    EasyTracker.getInstance(getActivity()).activityStart(getActivity());  // Add this method.
	  
	    
	  }

	  @Override
	  public void onStop() {
	    super.onStop();
	     // The rest of your onStop() code.
	    EasyTracker.getInstance(getActivity()).activityStop(getActivity());  // Add this method.
	  }
	
	

}