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
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class InhaleExhale extends Fragment {
	
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
   
		final LinearLayout rl1 = (LinearLayout) rootView.findViewById(R.id.rl1);
   	    final LinearLayout rl2 = (LinearLayout) rootView.findViewById(R.id.rl2);
   	    final LinearLayout rl3 = (LinearLayout) rootView.findViewById(R.id.rl3);
   	    final LinearLayout rl4 = (LinearLayout) rootView.findViewById(R.id.rl4);
   	    final LinearLayout rl5 = (LinearLayout) rootView.findViewById(R.id.rl5);
   	    final LinearLayout rl6 = (LinearLayout) rootView.findViewById(R.id.rl6);
   	    final LinearLayout rl7 = (LinearLayout) rootView.findViewById(R.id.rl7);
   	    final LinearLayout rl8 = (LinearLayout) rootView.findViewById(R.id.rl8);


		final Button submit1 = (Button) rootView.findViewById(R.id.button1);
		final TextView submit2 = (TextView) rootView.findViewById(R.id.button2);
		final Button submit3 = (Button) rootView.findViewById(R.id.button3);
		final TextView submit4 = (TextView) rootView.findViewById(R.id.button4);
		final Button submit5 = (Button) rootView.findViewById(R.id.button5);
		final TextView submit6 = (TextView) rootView.findViewById(R.id.button6);
		final Button submit7 = (Button) rootView.findViewById(R.id.button7);
		final TextView submit8 = (TextView) rootView.findViewById(R.id.button8);
		final TextView cycleCount=(TextView) rootView.findViewById(R.id.cycleCount);
        final Handler handler = new Handler();

        
		submit1.setOnClickListener(new View.OnClickListener() {



	        @Override
	        public void onClick(View v) {
//		    if(option==2){ 
		            // doStuff
		    	Log.d("KK","JJJJ");
		    	cycleCount.setText("1 out of 4");
//		          handler.postDelayed(new Runnable() {
//		              @Override
//		              public void run() {
		            	  
		            	  
		            	  handler.postDelayed(new Runnable() {
				              @Override
				              public void run() {
				            	 
				   		       
						          submit1.setText("3");

				              }
				          }, 1000);
		            	  
		            	  handler.postDelayed(new Runnable() {
				              @Override
				              public void run() {
				            	 
				   		       
						          submit1.setText("2");

				              }
				          }, 2000);
		            	  
		            	  
		            	  handler.postDelayed(new Runnable() {
				              @Override
				              public void run() {
				            	 
				   		       
						          submit1.setText("1");
						          
				            	 
				              }
				          }, 3000);
		            	  
		            	  
		            	  
		            	  handler.postDelayed(new Runnable() {
				              @Override
				              public void run() {
				            	 
				            	  rl1.setVisibility(View.GONE);
					   		       
							      submit1.setVisibility(View.GONE);
							      
						          rl2.setVisibility(View.VISIBLE);
							     
							      submit2.setVisibility(View.VISIBLE);

						          

				              }
				          }, 4000);
		            	  
		            	  
		            	  handler.postDelayed(new Runnable() {
				              @Override
				              public void run() {
				            	 
				            	  
				   		       
				            	  submit2.setText("3");

				              }
				          }, 5000);
		            	  
		            	  
		            	  handler.postDelayed(new Runnable() {
				              @Override
				              public void run() {
				            	 
				            	  
				   		       
						          submit2.setText("2");

				              }
				          }, 6000);
		            	  
		            	  
		            	  handler.postDelayed(new Runnable() {
				              @Override
				              public void run() {
				            	 
				   		       
						          submit2.setText("1");
						          
				            	

				              }
				          }, 7000);
		            	  
		            	  handler.postDelayed(new Runnable() {
				              @Override
				              public void run() {
				            	 
				   		       
				            	  rl2.setVisibility(View.GONE);
					   		       
							      submit2.setVisibility(View.GONE);
							      
						          rl3.setVisibility(View.VISIBLE);
							     
							      submit3.setVisibility(View.VISIBLE);
				              }
				          }, 8000);


		    
		   }
		  });
		
		
		

	
		submit3.setOnClickListener(new View.OnClickListener() {

			

	        @Override
	        public void onClick(View v) {

		    	Log.d("KK","JJJJ");
		    	
		    	cycleCount.setText("2 out of 4");
          	  handler.postDelayed(new Runnable() {
	              @Override
	              public void run() {
	            	 
	   		       
			          submit3.setText("3");

	              }
	          }, 1000);
        	  
        	  handler.postDelayed(new Runnable() {
	              @Override
	              public void run() {
	            	 
	   		       
			          submit3.setText("2");

	              }
	          }, 2000);
        	  
        	  
        	  handler.postDelayed(new Runnable() {
	              @Override
	              public void run() {
	            	 
	   		       
			          submit3.setText("1");
			          
	            	 

	              }
	          }, 3000);
		    	
        	  handler.postDelayed(new Runnable() {
	              @Override
	              public void run() {
	            	 
	   		       
	            	  rl3.setVisibility(View.GONE);
		   		       
				      submit3.setVisibility(View.GONE);
				      
			          rl4.setVisibility(View.VISIBLE);
				     
				      submit4.setVisibility(View.VISIBLE);

	              }
	          }, 4000);
		    	
		    	
        	  
        	  handler.postDelayed(new Runnable() {
	              @Override
	              public void run() {
	            	 
	   		       
			          submit4.setText("3");

	              }
	          }, 5000);
        	  
        	  handler.postDelayed(new Runnable() {
	              @Override
	              public void run() {
	            	 
	   		       
			          submit4.setText("2");

	              }
	          }, 6000);
        	  
        	  
        	  handler.postDelayed(new Runnable() {
	              @Override
	              public void run() {
	            	 
	   		       
			          submit4.setText("1");
			          
	            	 
	              }
	          }, 7000);
        	  
        	  
         	  handler.postDelayed(new Runnable() {
	              @Override
	              public void run() {
	            	 
	   		       
	            	  rl4.setVisibility(View.GONE);
		   		       
				      submit4.setVisibility(View.GONE);
				      
			          rl5.setVisibility(View.VISIBLE);
				     
				      submit5.setVisibility(View.VISIBLE);


	              }
	          }, 8000);
		    	
	
		    
		   }
		  });
		
		
		
		
		submit5.setOnClickListener(new View.OnClickListener() {



	        @Override
	        public void onClick(View v) {

		    	Log.d("KK","JJJJ");
		    	cycleCount.setText("3 out of 4");
		    	
          	  handler.postDelayed(new Runnable() {
	              @Override
	              public void run() {
	            	 
	   		       
			          submit5.setText("3");

	              }
	          }, 1000);
        	  
        	  handler.postDelayed(new Runnable() {
	              @Override
	              public void run() {
	            	 
	   		       
			          submit5.setText("2");

	              }
	          }, 2000);
        	  
        	  
        	  handler.postDelayed(new Runnable() {
	              @Override
	              public void run() {
	            	 
	   		       
			          submit5.setText("1");
			          
	            	 

	              }
	          }, 3000);
        	  
        	  handler.postDelayed(new Runnable() {
	              @Override
	              public void run() {
	            	 
	   		       
	            	  rl5.setVisibility(View.GONE);
		   		       
				      submit5.setVisibility(View.GONE);
				      
			          rl6.setVisibility(View.VISIBLE);
				     
				      submit6.setVisibility(View.VISIBLE);
	              }
	          }, 4000);
        	  
        	  
        	  handler.postDelayed(new Runnable() {
	              @Override
	              public void run() {
	            	 
	   		       
			          submit6.setText("3");

	              }
	          }, 5000);
        	  
        	  handler.postDelayed(new Runnable() {
	              @Override
	              public void run() {
	            	 
	   		       
			          submit6.setText("2");

	              }
	          }, 6000);
        	  
        	  
        	  handler.postDelayed(new Runnable() {
	              @Override
	              public void run() {
	            	 
	   		       
			          submit6.setText("1");
			          
	            	

	              }
	          }, 7000);
        	  
        	  handler.postDelayed(new Runnable() {
	              @Override
	              public void run() {
	            	 
	   		       
	            	  rl6.setVisibility(View.GONE);
		   		       
				      submit6.setVisibility(View.GONE);
				      
			          rl7.setVisibility(View.VISIBLE);
				     
				      submit7.setVisibility(View.VISIBLE);

	              }
	          }, 8000);
        	  
        	  
        	  
		    	
		    
		   }
		  });
		
		
		
		
		submit7.setOnClickListener(new View.OnClickListener() {



	        @Override
	        public void onClick(View v) {

		    	Log.d("KK","JJJJ");
		    	cycleCount.setText("4 out of 4");
		    	
          	  handler.postDelayed(new Runnable() {
	              @Override
	              public void run() {
	            	 
	   		       
			          submit7.setText("3");

	              }
	          }, 1000);
        	  
        	  handler.postDelayed(new Runnable() {
	              @Override
	              public void run() {
	            	 
	   		       
			          submit7.setText("2");

	              }
	          }, 2000);
        	  
        	  
        	  handler.postDelayed(new Runnable() {
	              @Override
	              public void run() {
	            	 
	   		       
			          submit7.setText("1");
			          
	            	

	              }
	          }, 3000);
        	  
        	  handler.postDelayed(new Runnable() {
	              @Override
	              public void run() {
	            	 
	            	  rl7.setVisibility(View.GONE);
		   		       
				      submit7.setVisibility(View.GONE);
				      
			          rl8.setVisibility(View.VISIBLE);
				     
				      submit8.setVisibility(View.VISIBLE);
	              }
	          }, 4000);
		    	
        	  handler.postDelayed(new Runnable() {
	              @Override
	              public void run() {
	            	 
	   		       
			          submit8.setText("3");

	              }
	          }, 5000);
        	  
        	  handler.postDelayed(new Runnable() {
	              @Override
	              public void run() {
	            	 
	   		       
			          submit8.setText("2");

	              }
	          }, 6000);
        	  
        	  
        	  handler.postDelayed(new Runnable() {
	              @Override
	              public void run() {
	            	 
	   		       
			          submit8.setText("1");
			          
	            	 
	              }
	          }, 7000);
        	  
        	  handler.postDelayed(new Runnable() {
	              @Override
	              public void run() {
	            	 
	   		       
	            	  rl8.setVisibility(View.GONE);
		   		       
				      submit8.setVisibility(View.GONE);
				      
			          rl1.setVisibility(View.VISIBLE);
			          submit1.setText(R.string.inhale1);

				      submit1.setVisibility(View.VISIBLE);


	              }
	          }, 8000);

        	  CharSequence text = "Good Job!";
      		int duration = Toast.LENGTH_LONG;

      		Toast toast = Toast.makeText(getActivity(), text, duration);
      		toast.show();
      		

		    
		   }
		  });
		
		return rootView;
	}	

}