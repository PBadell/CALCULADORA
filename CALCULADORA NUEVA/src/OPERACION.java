import java.util.Scanner;

public class OPERACION {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=0, b=0, res=0;
		float a1=0, b2=0, resu=0;	
		
		String sele=null;
		Scanner tec=new Scanner(System.in);
		System.out.println("SELECCIONE LA OPCION QUE DESEE REALIZAR");
		System.out.println("1: SUMA");
		System.out.println("2: RESTA");
		System.out.println("3: MULTIPLICACION");       
		System.out.println("4: DIVISION");
		
		sele=tec.next();
		switch(sele) {
		
		case "1":
			
			System.out.println("HAZ SELECCIONADO SUMA\n");
			System.out.println("INGRESE EL PRIMER NUMERO");
			a=tec.nextInt();
			System.out.println("INGRESE EL SEGUNDO NUMERO");
			b=tec.nextInt();
			res=a+b;
			System.out.println(a+"+"+b+"="+res);
			break;
			
		
		case "2":
			
			System.out.println("HAZ SELECCIONADO RESTA\n");
			System.out.println("INGRESE EL PRIMER NUMERO");
			a=tec.nextInt();
			System.out.println("INGRESE EL SEGUNDO NUMERO");
			b=tec.nextInt();
			res=a-b;
			System.out.println(a+"-"+b+"="+res);
			break;
			
			
		case "3":
			System.out.println("HAZ SELECCIONADO MULTIPLICACION\n");
			System.out.println("INGRESE EL PRIMER NUMERO");
			a=tec.nextInt();
			System.out.println("INGRESE EL SEGUNDO NUMERO");
			b=tec.nextInt();
			res=a*b;
			System.out.println(a+"*"+b+"="+res);
			break;
			
		
		case "4":
			
			System.out.println("HAZ SELECCIONADO DIVISION\n");
			System.out.println("INGRESE EL PRIMER NUMERO");
			a1=tec.nextFloat();
			System.out.println("INGRESE EL SEGUNDO NUMERO");
			b2=tec.nextFloat();
			resu=a1/b2;
			System.out.println(a1+"/"+b2+"="+resu);
			break;
			
			
		default:
			System.out.println("ERROR; ESA OPCION NO EXISTE");
			
		 }
	}

}
