package com.web.jsf.beans

import java.io.Serializable
import javax.enterprise.context.SessionScoped
import javax.faces.application.FacesMessage
import javax.faces.context.FacesContext
import javax.inject.Inject
import javax.inject.Named

@Named
@SessionScoped
class PersonController : Serializable {

    @Inject
    lateinit var personRepository: PersonRepository

    @Inject
    lateinit var personForm: PersonForm

    fun savePerson() {
        personRepository.save(Person(personForm.firstName, personForm.lastName, personForm.email))
    }

    fun getPersonList() : List<Person> {
       return personRepository.personList
    }

    companion object {
        private val serialVersionUID = 1L
    }

}
