package org.probe.springdepinjectiontest;

// this works
// import java.util.Collection;
// import java.util.Map;
import java.util.Properties;

public class OneManBand implements Performer {
	public OneManBand() {
		
	}
	
	/*
	 * this works
	public void perform() {
		for (Instrument instrument : instruments) {
			instrument.play();
		}
	}
	*/
	
	/*
	 * this works
	public void perform() {
		for (String key : instruments.keySet()) {
			System.out.print(key + " : ");
			Instrument instrument = instruments.get(key);
			instrument.play();
		}
	}
	*/
	
	public void perform() {
		for (String key : instruments.stringPropertyNames()) {
			System.out.println(key + " : " + instruments.getProperty(key));
		}
	}
	
	// this works
	// private Collection<Instrument> instruments;
	// private Map<String, Instrument> instruments;
	private Properties instruments;
	
	/*
	 * this works
	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}
	*/
	
	/*
	 * this works
	public void setInstruments(Map<String, Instrument> instruments) {
		this.instruments = instruments
	}
	*/
	
	public void setInstruments(Properties instruments) {
		this.instruments = instruments;
	}
}
