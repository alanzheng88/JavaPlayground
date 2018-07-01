package com.example.anonclass;

public class AnonClass {

	public static void testAnonClass() {
		testAnonAbstractClass();
		testAnonSubclass();
		testInterfaceAnonClass();
	}
	
	private static abstract class WahAbstract {
		abstract void weep();
	}

	private static void testAnonAbstractClass() {
		WahAbstract w = new WahAbstract() {
			@Override
			void weep() {
				System.out.println("we wee weeping...");
			}
		};
		w.weep();
	}
	
	private static class Wah {
		void weep() {
			System.out.println("weeping...");
		}
	}

	private static void testAnonSubclass() {
		Wah w = new AnonClass.Wah() {
			@Override
			void weep() {
				super.weep();
				System.out.println("weep...");
			}
		};
		w.weep();
	}

	private static void testInterfaceAnonClass() {
		IBlah blah = new IBlah() {
			@Override
			public void print() {
				System.out.println("blahhhhh...");
			}	
		};
		blah.print();
	}
}
