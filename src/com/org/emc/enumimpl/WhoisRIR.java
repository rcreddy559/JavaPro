package com.org.emc.enumimpl;

public enum WhoisRIR {
	 	ARIN("whois.arin.net"),
	    RIPE("whois.ripe.net"),
	    APNIC("whois.apnic.net"),
	    AFRINIC("whois.afrinic.net"),
	    LACNIC("whois.lacnic.net"),
	    JPNIC("whois.nic.ad.jp"),
	    KRNIC("whois.nic.or.kr"),
	    CNNIC("ipwhois.cnnic.cn"),
	    UNKNOWN("");
	
		private String url;
		WhoisRIR(String nameUrl){
			this.url = nameUrl;
		}
		
		public String getUrl() {
			return url;
		}
}
