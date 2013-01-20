package web;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.model.ListDataModel;
import javax.faces.validator.ValidatorException;
import javax.inject.Inject;
import javax.inject.Named;

import service.TankManager;


import domain.Tank;

@SessionScoped
@Named("tankBean")
public class TankFormBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Tank tank = new Tank();

	private ListDataModel<Tank> tanks = new ListDataModel<Tank>();

	@Inject
	private TankManager tm;

	public Tank getTank() {
		return tank;
	}

	public void setTank(Tank tank) {
		this.tank = tank;
	}

	public ListDataModel<Tank> getAllTanks() {
		tanks.setWrappedData(tm.getAllTanks());
		return tanks;
	}

	// Actions
	public String addTank() {
		tm.addTank(tank);
		return "showTanks";
	}

	public String addEdit() {
		tm.editTank(tank);
		return "showTanks";
	}

	public String correctTank() {
		return "addTank";
	}

	public String dataTank() {
		return "dataTank";
	}

	public String dataEdit() {
		return "dataEdit";
	}

	public String editTank() {
		tm.editTank(tank);
		return "addTank";
	}

	public String deleteTank() {
		Tank tankToDelete = tanks.getRowData();
		tm.deleteTank(tankToDelete);
		return null;
	}
	public void uniqueIndeks(FacesContext context, UIComponent component,
			Object value) {
		
		int tank_id = (Integer) value;

		for (Tank tank : tm.getAllTanks()) {
			if (tank.getTank_id() == tank_id) {
				
				FacesMessage message = new FacesMessage(
						"Czołg o takim indeksie juz istnieje");
				message.setSeverity(FacesMessage.SEVERITY_ERROR);
				throw new ValidatorException(message);
			}
		}
	}


}
