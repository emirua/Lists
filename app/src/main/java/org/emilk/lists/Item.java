package org.emilk.lists;

/**
 * Created by Emilio on 07/07/2015.
 */
public class Item {
    private int mDrawable;
    private String mName;
    private String mDescription;

    public Item(int mDrawable, String mName, String mDescription) {
        this.mDrawable = mDrawable;
        this.mName = mName;
        this.mDescription = mDescription;
    }

    public int getmDrawable() {
        return mDrawable;
    }

    public void setmDrawable(int mDrawable) {
        this.mDrawable = mDrawable;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }
}
