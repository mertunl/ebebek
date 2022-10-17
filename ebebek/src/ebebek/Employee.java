package ebebek;



public class Employee {
	
	
	String name= "mert";
	double salary=12000;
	int workHours=50;
	int hireYear=2010;
	
	
public void Employee( String name1,double salary1,int workHours1,int hireYear1){
	this.name=name1;
	this.salary=salary1;
	this.workHours=workHours1;
	this.hireYear=hireYear1;
}
	
public double tax() {
	double vergi = 0;
	if(salary>1000) {
		vergi=salary * 0.03;
		
	}
	return vergi;
	

}
public double bonus() {
	double bonus1=0;
	double mesai;
	if(workHours>40) {
		mesai=workHours-40;
		bonus1=mesai*30;
		
	}
	return bonus1;
}

public double raiseSalary() {
	double maasArtisi;
	int currentYear=2021;
	double sumMaas;
	if(currentYear-hireYear<10) {
		sumMaas= salary*1.05;
		
	}
	else if(currentYear-hireYear<20 && currentYear-hireYear>9 ) {
		sumMaas=salary*1.1;
	}
	
	else {
		sumMaas=salary*1.15;
	}
	
	maasArtisi=sumMaas-salary;
	return maasArtisi;
	
}

public String toString() {
	return " Isim: "+name+"\n Maas: "+salary+"\n Haftalik calisma saati: "+workHours+"\n Ise giris yili: "+hireYear+"\n Vergi: "+ tax()+"\n Bonus:"+ bonus()+"\n Maas Artisi: "+raiseSalary()+"\n Vergi+bonus Maas: "+(salary-tax()+bonus())+"\n Toplam Maas: "+ (salary-tax()+bonus()+raiseSalary()) ;
}



public static void main(String[] args) {
		Employee employee= new Employee();
		
		
		employee.bonus();
		employee.raiseSalary();
		employee.tax();
		String employeeStr= employee.toString();
		System.out.println(employeeStr);
		
		
	}


}
