package com.entity;


import java.util.Date;


public class PeakDates {


	
        private int PeakDateID;
       
        private Date PeakDate;
        
     

		public PeakDates() {
			super();
		}

		public PeakDates( Date peakDate) {
			super();
			
			PeakDate = peakDate;
			
		}

		public PeakDates(int peakDateID,  Date peakDate) {
			super();
			PeakDateID = peakDateID;
			
			PeakDate = peakDate;
		}

		public int getPeakDateID() {
			return PeakDateID;
		}

		public void setPeakDateID(int peakDateID) {
			PeakDateID = peakDateID;
		}

		

		public Date getPeakDate() {
			return PeakDate;
		}

		public void setPeakDate(Date peakDateFrom) {
			PeakDate = peakDateFrom;
		}

	

	
	
}
