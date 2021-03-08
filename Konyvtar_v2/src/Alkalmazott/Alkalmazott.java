package Alkalmazott;

public class Alkalmazott {
	private String Name;
	private int Pay;
	
	public Alkalmazott(String Name, int Pay) {
		this.Name = Name;
		this.Pay = Pay;
	}
	
	public Alkalmazott(String Name) {
		this(Name, 250000);
	}
	
	public Alkalmazott() {
		this(" - ");
	}
	
	public void IncPay(int Amount) {
		Pay += Amount;
	}
	
	@Override
	public String toString() {
		return Name + " " + Pay +"ft";
	}

	public void SetName(String Name) {
		this.Name = Name;
	}

	public String GettName() {
		return Name;
	}

	public void SetPay(int Pay) {
		this.Pay = Pay;
	}

	public double Tax() {
		return (double) Pay * 0.16;
	}

	public int GetPay() {
		return Pay;
	}

	public boolean GetFizetesHatarok(int also, int felso) {
		if (this.Pay > felso || this.Pay < also) {
			return false;
		} else
			return true;
	}

	public boolean NagyobbFizetes(Alkalmazott Ember) {
		if (Ember.Pay > Pay)
			return true;
		else
			return false;
	}

}
