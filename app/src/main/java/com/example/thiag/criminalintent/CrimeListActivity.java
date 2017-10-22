package com.example.thiag.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by thiag on 19/10/2017.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment(){
        return new CrimeListFragment();
    }
}
