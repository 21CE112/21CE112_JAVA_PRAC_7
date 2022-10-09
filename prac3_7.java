//This Program is Created Aryaan Rabara 21CE112
//Git hub Link:-https://github.com/21CE112/21CE112_JAVA_PRAC_7.git
/*Personal Loan Eligibility Criteria for Salaried Applicant is as follows: 
Page 11 of 11
Eligible Age Group - 21 years to 60 years
Minimum Net Monthly Income - Rs. 15,000 
Minimum Total Work Experience - 1 year 
Citizenship – Indian
Create a class AccountHolder to store above given information entered by a user. Create 5 
objects of AccountHolder class and store them in an ArrayList. Display names of account 
holders , who are eligible to get a loan based on given criteria.
 */
import java.util.*;

class prac7_3 {
    int age, monthlyIncome, workExperience;
    String name, citizenship;

    prac7_3(int age, int monthlyIncome, int workExperience, String name, String citizenship) {
        this.age = age;
        this.monthlyIncome = monthlyIncome;
        this.workExperience = workExperience;
        this.name = name;
        this.citizenship = citizenship;
    }

    boolean checkEligibility() {
        if ((age >= 21 && age <= 60) && (monthlyIncome >= 15000) && (workExperience >= 1)
                && (citizenship == "Indian")) {
            return true;
        } else {
            return false;
        }
    }
}

public class prac3_7 {
    public static void main(String[] args) {
        //Here we Take some value
        prac7_3 a1 = new prac7_3(19, 11000, 1, "AccountHolder0", "Indian");
        prac7_3 a2 = new prac7_3(26, 1000, 2, "AccountHolder1", "Indian");
        prac7_3 a3 = new prac7_3(38, 50000, 1, "AccountHolder2", "USA");
        prac7_3 a4 = new prac7_3(56, 65000, 1, "AccountHolder3", "Indian");
        prac7_3 a5 = new prac7_3(5, 200000, 1, "AccountHolder4", "Indian");
        //here we use arraylist for adding object
        ArrayList<prac7_3> arrayList = new ArrayList<>();
        arrayList.add(a1);
        arrayList.add(a2);
        arrayList.add(a3);
        arrayList.add(a4);
        arrayList.add(a5);
        for (int i = 0; i < 5; i++) {
            if (arrayList.get(i).checkEligibility()) {
                System.out.println("AccountHolder" + i + " is eligible for personal loan");
            } else {
                System.out.println("AccountHolder" + i + " is not eligible for personal loan");
            }
        }
        System.out.println("This Program is Created Aryaan Rabara 21CE112");
        
    }
}