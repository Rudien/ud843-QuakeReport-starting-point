package com.example.android.quakereport;

public class Earthquake {

   private double styrke;
   private String sted;
   private long mTimeInMilliseconds;

   /** Website URL of the earthquake */
   private String mUrl;

   public Earthquake (double styrke, String sted, long timeInMilliseconds, String url) {
       this.styrke = styrke;
       this.sted   = sted;
       mTimeInMilliseconds   = timeInMilliseconds;
       mUrl = url;
   }
   public Earthquake() {
   }
   public double getStyrke() {
      return styrke;
   }
   public String getSted() {
      return sted;
   }
   public long getTimeInMilliseconds() {
      return mTimeInMilliseconds;
   }
   public String getUrl() { return mUrl; }
}
