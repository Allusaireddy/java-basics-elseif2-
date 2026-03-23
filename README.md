 Electricity Bill Calculator (With Slabs & Surcharge)
📌 Problem Statement:
Write a Java program to calculate the monthly electricity bill based on the number of units consumed, applying the following slab rates:
Units Consumed
Rate per Unit
0 - 100
₹1.50
101 - 200
₹2.00
201 - 300
₹3.00
Above 300
₹5.00

If the total bill exceeds ₹1000, apply a 10% surcharge.

If the user is a senior citizen, apply an additional 5% discount on the total.

🧪 Input:
int units = 350;
boolean isSeniorCitizen = true;


🧾 Expected Output:
Base Bill: ₹1250.0
Surcharge: ₹125.0
Discount: ₹68.75
Total Payable: ₹1306.25
