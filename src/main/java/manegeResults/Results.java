package manegeResults;

public class Results {
    private  int id;
    private String sid;
    private String  name;
    private String eid;
    private String oop;
    private String se;
    private String dbms;
    private String ics;
    private String ossa;
    private String tot;
    private String avg;
    private String gpa;
	
    
    public Results(int id, String sid, String name, String eid, String oop, String se, String dbms, String ics, String ossa, String tot, String avg, String gpa) {
	
		this.id = id;
		this.sid = sid;
		this.name = name;
		this.eid = eid;
		this.oop = oop;
		this.se = se;
		this.dbms = dbms;
		this.ics = ics;
		this.ossa = ossa;
		this.tot = tot;
		this.avg = avg;
		this.gpa = gpa;
	}


	public int getId() {
		return id;
	}


	public String getSid() {
		return sid;
	}


	public String getName() {
		return name;
	}


	public String getEid() {
		return eid;
	}


	public String getOop() {
		return oop;
	}


	public String getSe() {
		return se;
	}


	public String getDbms() {
		return dbms;
	}


	public String getIcs() {
		return ics;
	}


	public String getOssa() {
		return ossa;
	}


	public String getTot() {
		return tot;
	}


	public String getAvg() {
		return avg;
	}


	public String getGpa() {
		return gpa;
	}

    
    
    
}
