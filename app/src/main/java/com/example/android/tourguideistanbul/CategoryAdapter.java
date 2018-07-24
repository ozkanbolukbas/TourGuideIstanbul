package com.example.android.tourguideistanbul;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter{

    private Context mContext;

    public CategoryAdapter(Context context, FragmentManager fragmentManager) {
        super(fragmentManager);
        mContext=context;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.category_historical_place);
        } else if (position == 1) {
            return mContext.getString(R.string.category_must_visit);
        } else if (position == 2) {
            return mContext.getString(R.string.category_entertainment);
        }else if (position == 3) {
            return mContext.getString(R.string.category_restaurants);
        } else {
            return mContext.getString(R.string.category_hotels);
        }
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new HistoricalPlacesFragment();
        } else if (position == 1) {
            return new MustVisitFragment();
        } else if (position == 2) {
            return new EntertainmentFragment();
        } else if (position ==3){
            return new RestaurantsFragment();
        }else  {
            return new HotelsFragment();
        }
    }

    @Override
    public int getCount() {
        return 5;
    }
}
