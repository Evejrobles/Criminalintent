package edu.cnm.deepdive.criminalintent;

import java.util.Date;
import java.util.UUID;

public class Crime {

private UUID mID;
private String mTitle;
private Date mDate;
private boolean mSolved;

public Crime() {
  mID = UUID.randomUUID();
  mDate = new Date();


}
  public UUID getID() {
    return mID;

  }

  public String getTitle() {
    return mTitle;
  }

  public void setTitle(String title) {
    mTitle = title;
  }

  public java.util.Date getDate() {
    return mDate;
  }

  public void setDate(java.util.Date date) {
    mDate = date;
  }

  public boolean isSolved() {
    return mSolved;
  }

  public void setSolved(boolean solved) {
    mSolved = solved;
  }


}
