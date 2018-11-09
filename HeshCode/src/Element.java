
public class Element {
	static String Auther;
	static String Title;
	static int heshAdress;
	static int Numerickeyform;
	public Element(String Auther, String Title, int heshAdress, int Numerickeyform) {
		heshAdress = 0;
		Numerickeyform = heshAdress(Auther);
	}
	
	public static int heshAdress(String key) {
		int hesh;
		hesh = TurntoNumeric(key)%10;
		return hesh;
	}
	
	public static int TurntoNumeric(String key) {
		int num = 0;
		char Str[] = key.toCharArray();
		for(int i=0; i< 3; i++) {
			num=+Str[i]+ num;
		}
		return num;
	}
	public static void main(String[] args) {
		Element El1= new Element("Goran Petrovich", "Atlas Made by Sky", 0, 0);
		System.out.println(Element.Auther + Element.Title, Element.Title);
		
	}
}

