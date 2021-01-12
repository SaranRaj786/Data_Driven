package day1_4;

public class StateDetails extends LanguageInfo {

public void northIndia() {
	System.out.println("Vadakans");
}

public void southIndia()
{
	System.out.println("Tamilan");
}
public static void main(String [] args) {
	LanguageInfo L =new StateDetails();
	StateDetails D =new StateDetails();
	D.northIndia();
	D.southIndia();
	L.tamilLanguage();
	L.englishLanguage();
	L.hindiLanguge();
}
}
