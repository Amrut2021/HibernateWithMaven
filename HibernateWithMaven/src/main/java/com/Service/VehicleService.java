package com.Service;

import com.Dao.VehicleDao;

public class VehicleService {

	public void InsertData() {
		VehicleDao vd = new VehicleDao();
		vd.InsertData();
	}

	public void UpdateData() {
		VehicleDao vd = new VehicleDao();
		vd.UpdateData();

	}

	public void deleteData() {
		VehicleDao vd = new VehicleDao();
		vd.deleteData();
	}

}
