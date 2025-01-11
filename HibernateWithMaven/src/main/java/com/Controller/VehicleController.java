package com.Controller;

import com.Service.VehicleService;

public class VehicleController {

	public static void main(String[] args) {

		VehicleService vs = new VehicleService();
//			vs.InsertData();
//			vs.UpdateData();
			vs.deleteData();
	}

}
