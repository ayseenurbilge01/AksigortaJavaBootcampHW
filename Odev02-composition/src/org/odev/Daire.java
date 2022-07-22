package org.odev;

public  class Daire {
	private int no;
	public Bina bin;

	public Daire(int no) 
	{ 
		this.no = no;
	}

	public int getNo() 
	{
		return no;
	}

	public void setNo(int no) 
	{
		this.no = no;
	}

	public Bina binaSoyle() 
	{ 
		return this.bin;
	}
}
