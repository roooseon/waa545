package com.corejsf;

import java.util.List;
import java.util.Map;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class UserBean {
	@Inject
	UserRepo userRepo;

	@Inject
	User user;

	public User getUser() {
		return user;
	}
	
	// invoked first on Process Validations by value change listener
	// then overridden on Update Model
	public void setUser(User user) {
		this.user = user;
	}

	public void add() {
		userRepo.addUser(user);
	}
	
	public String showView() {
		return null;
	}
	// Fired in Process Validations Phase
	public void findLastName(ActionEvent e){
		FacesContext context = FacesContext.getCurrentInstance();
		
		Map<String, String> params = context.getExternalContext().getRequestParameterMap();
		String firstname =  params.get("form:firstname");


		List<User> userList = userRepo.getUserList();
		for(int i=0; i<userList.size();i++){
			if(userList.get(i).getFirstName().equals(firstname)){
				user.setLastName(userList.get(i).getLastName());
			}
		}
	}
}
