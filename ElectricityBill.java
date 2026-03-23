package ElectricityBill;

public class ElectricityBill {
	public static void main(String[] args) {
		int units = 350;
		boolean isSeniorCitizen = true;
		double billAmount = 0;
		// Calculate bill based on units consumed
		if(units <= 100) {
			billAmount = units * 1.5; // For 0 to 100 units
		} else {
			if(units <= 200) {
				billAmount = (100*1.5) + ((units-100)*2); // For 101 to 200 units
			} else {
				if(units <= 300) {
					billAmount = (100*1.5) + (100*2) + ((units-200)*3); // For 201 to 300 units
				} else {
					billAmount = (100*1.5) + (100*2) + (100*3) + ((units-300)*5); // For above 300 units
				}
			}
		}
		
		// Apply surchargeif bill exceeds ₹1000
		double surcharge = 0;
		if(billAmount > 1000) {
			surcharge = billAmount * 0.1; // 10% surcharge
		}
		
		// Apply senior citizen discount if applicable
		double discount = 0;
		if(isSeniorCitizen) {
			discount = (billAmount + surcharge) * 0.05; //5% discount for senior citizens
		}
		
		// Calculate final payable amount
		double totalPayable = billAmount + surcharge - discount;
		
		// Output the results
		System.out.println("Base Bill: ₹"+billAmount);
		System.out.println("Surcharge: ₹"+surcharge);
		System.out.println("Discount: ₹"+discount);
		System.out.println("Total Payable: ₹"+totalPayable);
	}

}
		
