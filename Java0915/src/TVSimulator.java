public class TVSimulator {

	public static void main(String[] args) {
		TV tv1 = new TV();
		
		TV tv2 = new TV();
		
		tv1.turnOnOFF();
		System.out.println(tv1.isTurnOn);
		
		tv1.changeCH(35);
		System.out.println(tv1.channel);
		
		tv1.turnOnOFF();
		System.out.println(tv1.isTurnOn);
		
		

	}

}
