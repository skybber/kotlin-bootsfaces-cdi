package com.web.jsf.beans

import javax.enterprise.inject.Model
import javax.inject.Named

@Model
@Named("personForm")
class PersonForm {

    var id: Long = 0

    var firstName: String? = null

    var lastName: String? = null

    var email: String? = null

    constructor() {
    }

    constructor(firstName: String?, lastName: String?, email: String?) {
        this.firstName = firstName
        this.lastName = lastName
        this.email = email
    }

    companion object {
        private val serialVersionUID = 1L
    }
}
