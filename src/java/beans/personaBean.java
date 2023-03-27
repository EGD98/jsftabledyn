/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package beans;

import clases.Persona;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author KURUMI
 */
@ManagedBean
@RequestScoped
public class personaBean {

    /**
     * Creates a new instance of personaBean
     */
    private Persona persona = new Persona();
    private static List<Persona> listPerson = new ArrayList<>();

    public personaBean() {
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public List<Persona> getListPerson() {
        return listPerson;
    }

    public void setListPerson(List<Persona> listPerson) {
        this.listPerson = listPerson;
    }

    public void addPerson() {
        this.listPerson.add(this.persona);
    }
public void deletePerson(Persona persona){
    personaBean.listPerson.remove(persona);
    System.out.println("Estoy aqui");
    //listPerson.forEach(x ->System.out.println(x.getApellido() + x.getNombre()+x.getSexo()));
    
}
}
