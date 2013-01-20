package service;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;

import domain.Tank;

@ApplicationScoped
public class TankManager {

	private List<Tank> TanksDB = new ArrayList<Tank>();

	public void addTank(Tank tank) {
		Tank newTank = new Tank();

		newTank.setTank_id(tank.getTank_id());
		newTank.setVehicleName(tank.getVehicleName());
		newTank.setVehicleCountryOfOrigin(tank.getVehicleCountryOfOrigin());
		newTank.setVehicleClass(tank.getVehicleClass());
		newTank.setAvgArmor(tank.getAvgArmor());
		newTank.setAvgArmorPenetration(tank.getAvgArmorPenetration());
		newTank.setAvgRateOfFire(tank.getAvgRateOfFire());
		newTank.setStockEnginePower(tank.getStockEnginePower());
		newTank.setYearOfProduction(tank.getYearOfProduction());

		TanksDB.add(newTank);
	}

	// Edit person with given index
	public void editTank(Tank tank) {
		for (Tank t : TanksDB) {
			if (tank.getTank_id() == (t.getTank_id())) {
				Tank tankToRemove = t;
				TanksDB.remove(t);
				Tank updatedTank = new Tank();
				if (tank.getVehicleName() == "")
					updatedTank.setVehicleName(tankToRemove.getVehicleName());
				else
					updatedTank.setVehicleName(tank.getVehicleName());

				if (tank.getVehicleCountryOfOrigin() == "")
					updatedTank.setVehicleCountryOfOrigin(tankToRemove
							.getVehicleCountryOfOrigin());
				else
					updatedTank.setVehicleCountryOfOrigin(tank
							.getVehicleCountryOfOrigin());

				if (tank.getVehicleClass() == "")
					updatedTank.setVehicleClass(tankToRemove.getVehicleClass());
				else
					updatedTank.setVehicleClass(tank.getVehicleClass());

				if (tank.getAvgArmor() == 0)
					updatedTank.setAvgArmor(tankToRemove.getAvgArmor());
				else
					updatedTank.setAvgArmor(tank.getAvgArmor());

				if (tank.getAvgArmorPenetration() == 0)
					updatedTank.setAvgArmorPenetration(tankToRemove
							.getAvgArmorPenetration());
				else
					updatedTank.setAvgArmorPenetration(tank
							.getAvgArmorPenetration());
				//
				if (tank.getAvgRateOfFire() == 0)
					updatedTank.setAvgRateOfFire(tankToRemove
							.getAvgRateOfFire());
				else
					updatedTank.setAvgRateOfFire(tank.getAvgRateOfFire());

				if (tank.getStockEnginePower() == 0)
					updatedTank.setStockEnginePower(tankToRemove
							.getStockEnginePower());
				else
					updatedTank.setStockEnginePower(tank.getStockEnginePower());

				if (tank.getYearOfProduction() == 0)
					updatedTank.setYearOfProduction(tankToRemove
							.getYearOfProduction());
				else
					updatedTank.setYearOfProduction(tank.getYearOfProduction());

				updatedTank.setVehicleName(tank.getVehicleName());
				updatedTank.setVehicleClass(tank.getVehicleClass());
				updatedTank.setAvgArmor(tank.getAvgArmor());
				updatedTank.setAvgArmorPenetration(tank
						.getAvgArmorPenetration());
				updatedTank.setAvgRateOfFire(tank.getAvgRateOfFire());
				updatedTank.setStockEnginePower(tank.getStockEnginePower());
				updatedTank.setYearOfProduction(tank.getYearOfProduction());
				break;
			}
		}
	}

	// Removes the person with given index
	public void deleteTank(Tank tank) {
		Tank tankToRemove = null;
		for (Tank t : TanksDB) {
			if (tank.getTank_id() == (t.getTank_id())) {
				tankToRemove = t;
				break;
			}
		}
		if (tankToRemove != null)
			TanksDB.remove(tankToRemove);
	}

	public List<Tank> getAllTanks() {
		return TanksDB;
	}
}
