package com.example.babybest.movieapp;

import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SettingsActivity extends PreferenceActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction().replace(android.R.id.content,new SettingsFragment()).commit();
    }
    public static class SettingsFragment extends PreferenceFragment{
        @Override
        public void onCreate(final Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.preferences);
        }
    }
}
