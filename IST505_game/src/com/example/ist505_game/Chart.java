package com.example.ist505_game;


import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.ExecutionException;

import org.apache.http.client.ClientProtocolException;
import org.json.JSONException;

import com.androidplot.xy.LineAndPointFormatter;
import com.androidplot.xy.PointLabelFormatter;
import com.androidplot.xy.SimpleXYSeries;
import com.androidplot.xy.XYPlot;
import com.androidplot.xy.XYSeries;
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
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;



public class Chart extends Fragment {
	
	private XYPlot plot;
	
	//private ArrayList<PatientData> patientData;
	private long lastTweetsUpdateTime = 0;
	private static final String TAG = "VF";
	private GoogleAnalytics myInstance;
	private Tracker tracker;
	public static String PATIENT_API_URL = "http://134.173.236.144/cguchf/patientvital.aspx";
    
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(R.layout.chart,
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
		
		
		plot = (XYPlot) rootView.findViewById(R.id.mySimpleXYPlot);

        // Create a couple arrays of y-values to plot:
        Number[] series1Numbers = {1, 8, 5, 2, 7, 4};
        Number[] series2Numbers = {4, 6, 3, 8, 2, 10};

        // Turn the above arrays into XYSeries':
        XYSeries series1 = new SimpleXYSeries(
                Arrays.asList(series1Numbers),          // SimpleXYSeries takes a List so turn our array into a List
                SimpleXYSeries.ArrayFormat.Y_VALS_ONLY, // Y_VALS_ONLY means use the element index as the x value
                "Series1");                             // Set the display title of the series

        // same as above
        XYSeries series2 = new SimpleXYSeries(Arrays.asList(series2Numbers), SimpleXYSeries.ArrayFormat.Y_VALS_ONLY, "Series2");

        // Create a formatter to use for drawing a series using LineAndPointRenderer
        // and configure it from xml:
        LineAndPointFormatter series1Format = new LineAndPointFormatter();
        series1Format.setPointLabelFormatter(new PointLabelFormatter());
        series1Format.configure(getActivity(),
                R.xml.line_point_formatter_with_plf1);

        // add a new series' to the xyplot:
        plot.addSeries(series1, series1Format);

        // same as above:
        LineAndPointFormatter series2Format = new LineAndPointFormatter();
        series2Format.setPointLabelFormatter(new PointLabelFormatter());
        series2Format.configure(getActivity(),
                R.xml.line_point_formatter_with_plf2);
        plot.addSeries(series2, series2Format);

        // reduce the number of range labels
        plot.setTicksPerRangeLabel(3);
        plot.getGraphWidget().setDomainLabelOrientation(-45);
		
		

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