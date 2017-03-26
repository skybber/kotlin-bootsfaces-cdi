package com.web.jsf.beans

import java.io.Serializable
import java.util.ArrayList
import javax.annotation.PostConstruct
import javax.enterprise.context.ApplicationScoped
import javax.faces.application.FacesMessage
import javax.faces.context.FacesContext
import javax.inject.Named

@ApplicationScoped
class PersonRepository : Serializable {

    var personList: MutableList<Person> = ArrayList()

    @PostConstruct
    fun init() {
        personList.add(Person("Hotswap", "Agent", "hotswap.agent@hotswapagent.com"))
    }

    fun save(person: Person): Unit {
        println("Saving user. Email: " + person.email)
        personList.add(person)
        for (p in personList)
            println("User:" + p.firstName)
    }

    fun clearData():Unit{
        personList.clear()
    }

    companion object {
        private val serialVersionUID = 1L
    }

}
