package com.pavlo.gordinates;

public class BoundenWIldCard {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		TwoD[] td = { new TwoD(3, 5), new TwoD(3, 3), new TwoD(5, 3) };
		Cords<TwoD> tbCords = new Cords<>(td);
		Cords<TwoD> cords1 = new Cords<>();
		cords1.showXY(tbCords);
		System.out.println();

		FourD[] fd = { new FourD(1, 2, 3, 4), new FourD(1, 2, 3, 4), new FourD(1, 2, 3, 4), new FourD(1, 2, 3, 4) };
		Cords<FourD> fourDCords = new Cords<>(fd);
		Cords<FourD> cords2 = new Cords<>();
		cords2.showXYZT(fourDCords);
		cords2.showXY(fourDCords);
	}

}
